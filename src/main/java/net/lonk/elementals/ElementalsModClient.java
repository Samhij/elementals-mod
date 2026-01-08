package net.lonk.elementals;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class ElementalsModClient implements ClientModInitializer {
    public static KeyBinding FLIGHT_KEY;

    @Override
    public void onInitializeClient() {
        FLIGHT_KEY = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.elementals.flight",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_G,
                "category.elementals.general"
        ));
    }
}
