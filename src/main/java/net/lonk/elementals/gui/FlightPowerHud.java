package net.lonk.elementals.gui;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.lonk.elementals.event.ModEvents;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.RenderTickCounter;

public class FlightPowerHud implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        // Register HUD render callback
        HudRenderCallback.EVENT.register(FlightPowerHud::renderFlightPower);
    }

    private static void renderFlightPower(DrawContext context, RenderTickCounter tickCounter) {
        MinecraftClient client = MinecraftClient.getInstance();

        // Only render if player exists and is wearing ethereal armor
        if (client.player == null || !ModEvents.isWearingFullEtherealArmor(client.player)) {
            return;
        }

        // Don't show HUD in creative mode
        if (client.player.isCreative()) {
            return;
        }

        int flightPower = ModEvents.getFlightPower();
        int maxFlightPower = ModEvents.getMaxFlightPower();

        // Check if flight is currently active
        boolean canFly = client.player.getAbilities().allowFlying;

        // Determine text color - only colorize when flying
        int color;
        if (!canFly) {
            // Gray when not flying
            color = 0xFF808080;
        } else if (flightPower <= 250) {
            color = 0xFFFF0000; // Red - critical
        } else if (flightPower <= 500) {
            color = 0xFFFFFF00; // Yellow - low
        } else {
            color = 0xFF00FF00; // Green - good
        }

        // Format the text
        String text = "Flight Power: " + flightPower + " / " + maxFlightPower;

        // Get screen dimensions
        int screenWidth = client.getWindow().getScaledWidth();
        int screenHeight = client.getWindow().getScaledHeight();

        // Calculate position (centered horizontally, above hotbar)
        int textWidth = client.textRenderer.getWidth(text);
        int x = (screenWidth - textWidth) / 2;
        int y = screenHeight - 65;

        // Draw the text with shadow for better visibility
        context.drawTextWithShadow(client.textRenderer, text, x, y, color);
    }
}

