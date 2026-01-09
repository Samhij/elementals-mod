package net.lonk.elementals.event;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.lonk.elementals.ElementalsModClient;
import net.lonk.elementals.item.ModItems;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;

public class ModEvents {
    // region Fields

    private static final int MAX_FLIGHT_POWER = 1000;
    private static int flightPower = MAX_FLIGHT_POWER;
    private static long lastFlightPowerUpdateTime = 0;
    private static final int FLIGHT_POWER_UPDATE_INTERVAL = 50; // milliseconds

    private static long lastKeyPressTime = 0;
    private static final int COOLDOWN = 300;

    private static boolean isFlying;

    // endregion

    // region Event Registration

    public static void register() {
        // Register server-side tick event for enchantments
        ServerTickEvents.END_SERVER_TICK.register(server -> {
            server.getPlayerManager().getPlayerList().forEach(ModEvents::onServerPlayerTick);
        });

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (client.player != null) {
                onPlayerTick(client.player);
            }
        });
    }

    // endregion

    // region Helper Methods

    private static void toggleFlight(PlayerEntity player) {
        // Don't toggle flight for creative mode players
        if (player.isCreative() || player.isSpectator()) {
            return;
        }

        isFlying = player.getAbilities().allowFlying;

        if (!player.getAbilities().allowFlying) {
            player.getAbilities().allowFlying = true;
            player.getAbilities().flying = true;
            isFlying = true;
        } else {
            player.getAbilities().allowFlying = false;
            player.getAbilities().flying = false;
            isFlying = false;
        }
        player.sendAbilitiesUpdate();
    }

    private static void updateFlightPower(PlayerEntity player, World level) {
        long currentTime = System.currentTimeMillis();

        if (currentTime - lastFlightPowerUpdateTime < FLIGHT_POWER_UPDATE_INTERVAL) {
            return;
        }

        lastFlightPowerUpdateTime = currentTime;

        // In creative mode, don't touch flight power at all
        if (player.isCreative()) {
            return;
        }

        // In the End, regenerate quickly and flying costs nothing
        if (level.getRegistryKey() == World.END) {
            if (flightPower < MAX_FLIGHT_POWER) {
                flightPower = Math.min(MAX_FLIGHT_POWER, flightPower + 10); // Fast regen in End
            }
            return; // No flight power consumption in the End
        }

        // On ground: regenerate flight power
        if (player.isOnGround()) {
            if (flightPower < MAX_FLIGHT_POWER) {
                flightPower = Math.min(MAX_FLIGHT_POWER, flightPower + 2);
            }
        } else if (isFlying) {
            // In air and flying: consume flight power
            flightPower = Math.max(0, flightPower - 1);

            // Force landing if out of power
            if (flightPower <= 0) {
                player.getAbilities().allowFlying = false;
                player.getAbilities().flying = false;
                isFlying = false;
                player.sendAbilitiesUpdate();
                player.playSound(SoundEvents.BLOCK_NOTE_BLOCK_BASS.value(), 1f, 1f);
            }
        }
    }

    public static int getFlightPower() {
        return flightPower;
    }

    public static int getMaxFlightPower() {
        return MAX_FLIGHT_POWER;
    }

    // endregion

    // region Server Player Tick Handler

    public static void onServerPlayerTick(net.minecraft.server.network.ServerPlayerEntity player) {
        PlayerInventory inventory = player.getInventory();
        World level = player.getWorld();

        // region End Dimension Logic

        if (level.getRegistryKey() == World.END) {
            for (ItemStack stack : inventory.main) {
                if (stack.isOf(ModItems.ETHEREAL_SWORD) || stack.isOf(ModItems.ETHEREAL_AXE)
                        || stack.isOf(ModItems.ETHEREAL_SHOVEL) || stack.isOf(ModItems.ETHEREAL_PICKAXE)
                        || stack.isOf(ModItems.ETHEREAL_HOE)) {
                    stack.addEnchantment(Enchantments.UNBREAKING, 3);
                    stack.addEnchantment(Enchantments.MENDING, 1);
                }


                if (stack.isOf(ModItems.ETHEREAL_SWORD)) {
                    stack.addEnchantment(Enchantments.SHARPNESS, 5);
                    stack.addEnchantment(Enchantments.KNOCKBACK, 2);
                }
                if (stack.isOf(ModItems.ETHEREAL_PICKAXE)) {
                    stack.addEnchantment(Enchantments.EFFICIENCY, 5);
                    stack.addEnchantment(Enchantments.FORTUNE, 3);
                }
            }

            if (isWearingFullEtherealArmor(player)) {
                // Enchant armor when wearing full ethereal set in the End
                // Use getArmorStack to get direct references, not copies
                ItemStack helmet = player.getInventory().getArmorStack(3);
                ItemStack chestplate = player.getInventory().getArmorStack(2);
                ItemStack leggings = player.getInventory().getArmorStack(1);
                ItemStack boots = player.getInventory().getArmorStack(0);

                if (helmet.getItem() == ModItems.ETHEREAL_HELMET) {
                    helmet.addEnchantment(Enchantments.PROTECTION, 4);
                    helmet.addEnchantment(Enchantments.UNBREAKING, 3);
                    helmet.addEnchantment(Enchantments.MENDING, 1);
                }
                if (chestplate.getItem() == ModItems.ETHEREAL_CHESTPLATE) {
                    chestplate.addEnchantment(Enchantments.PROTECTION, 4);
                    chestplate.addEnchantment(Enchantments.UNBREAKING, 3);
                    chestplate.addEnchantment(Enchantments.MENDING, 1);
                }
                if (leggings.getItem() == ModItems.ETHEREAL_LEGGINGS) {
                    leggings.addEnchantment(Enchantments.PROTECTION, 4);
                    leggings.addEnchantment(Enchantments.UNBREAKING, 3);
                    leggings.addEnchantment(Enchantments.MENDING, 1);
                }
                if (boots.getItem() == ModItems.ETHEREAL_BOOTS) {
                    boots.addEnchantment(Enchantments.PROTECTION, 4);
                    boots.addEnchantment(Enchantments.UNBREAKING, 3);
                    boots.addEnchantment(Enchantments.MENDING, 1);
                    boots.addEnchantment(Enchantments.FEATHER_FALLING, 100);
                }
            }
        } else {

            // endregion

            // region Non-End Dimension Logic

            if (isWearingFullEtherealArmor(player)) {
                for (ItemStack stack : inventory.armor) {
                    if (stack.hasEnchantments()) stack.getEnchantments().clear();
                }
            }

            for (ItemStack stack : inventory.main) {
                if (stack.isOf(ModItems.ETHEREAL_SWORD) || stack.isOf(ModItems.ETHEREAL_AXE)
                        || stack.isOf(ModItems.ETHEREAL_SHOVEL) || stack.isOf(ModItems.ETHEREAL_PICKAXE)
                        || stack.isOf(ModItems.ETHEREAL_HOE)) {
                    if (stack.hasEnchantments()) {
                        stack.getEnchantments().clear();
                    }
                }
            }
        }

        // endregion

        // region Nether Dimension Logic

        if (level.getRegistryKey() == World.NETHER) {
            for (ItemStack stack : inventory.main) {
                if (stack.isOf(ModItems.IGNITED_RUBY_SWORD) || stack.isOf(ModItems.IGNITED_RUBY_PICKAXE)
                        || stack.isOf(ModItems.IGNITED_RUBY_AXE) || stack.isOf(ModItems.IGNITED_RUBY_SHOVEL)) {
                    stack.addEnchantment(Enchantments.UNBREAKING, 3);
                    stack.addEnchantment(Enchantments.MENDING, 1);
                    stack.addEnchantment(Enchantments.FIRE_ASPECT, 2);
                }
                if (stack.isOf(ModItems.IGNITED_RUBY_PICKAXE)) {
                    stack.addEnchantment(Enchantments.EFFICIENCY, 5);
                    stack.addEnchantment(Enchantments.FORTUNE, 3);
                }
                if (stack.isOf(ModItems.IGNITED_RUBY_SWORD)) {
                    stack.addEnchantment(Enchantments.SHARPNESS, 5);
                }
            }

            if (isWearingFullIgnitedArmor(player)) {
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 5, 0, true, false, false));

                for (ItemStack stack : inventory.armor) {
                    if (stack.getItem() == ModItems.IGNITED_RUBY_HELMET) {
                        stack.addEnchantment(Enchantments.PROTECTION, 3);
                        stack.addEnchantment(Enchantments.UNBREAKING, 3);
                        stack.addEnchantment(Enchantments.MENDING, 1);
                    }
                    if (stack.getItem() == ModItems.IGNITED_RUBY_CHESTPLATE) {
                        stack.addEnchantment(Enchantments.PROTECTION, 3);
                        stack.addEnchantment(Enchantments.UNBREAKING, 3);
                        stack.addEnchantment(Enchantments.MENDING, 1);
                    }
                    if (stack.getItem() == ModItems.IGNITED_RUBY_LEGGINGS) {
                        stack.addEnchantment(Enchantments.PROTECTION, 3);
                        stack.addEnchantment(Enchantments.UNBREAKING, 3);
                        stack.addEnchantment(Enchantments.MENDING, 1);
                    }
                    if (stack.getItem() == ModItems.IGNITED_RUBY_BOOTS) {
                        stack.addEnchantment(Enchantments.PROTECTION, 3);
                        stack.addEnchantment(Enchantments.UNBREAKING, 3);
                        stack.addEnchantment(Enchantments.MENDING, 1);
                        stack.addEnchantment(Enchantments.SOUL_SPEED, 3);
                    }
                }
            }
        } else {

            // endregion

            // region Non-Nether Dimension Logic

            if (isWearingFullIgnitedArmor(player)) {
                player.removeStatusEffect(StatusEffects.FIRE_RESISTANCE);
            }

            for (ItemStack stack : inventory.main) {
                if (stack.isOf(ModItems.IGNITED_RUBY_SWORD) || stack.isOf(ModItems.IGNITED_RUBY_PICKAXE)
                        || stack.isOf(ModItems.IGNITED_RUBY_AXE) || stack.isOf(ModItems.IGNITED_RUBY_SHOVEL)
                        || stack.isOf(ModItems.IGNITED_RUBY_HELMET) || stack.isOf(ModItems.IGNITED_RUBY_CHESTPLATE)
                        || stack.isOf(ModItems.IGNITED_RUBY_LEGGINGS) || stack.isOf(ModItems.IGNITED_RUBY_BOOTS) && stack.hasEnchantments()) {
                    stack.getEnchantments().clear();
                }
            }

            for (ItemStack stack : inventory.armor) {
                if ((stack.isOf(ModItems.IGNITED_RUBY_HELMET) || stack.isOf(ModItems.IGNITED_RUBY_CHESTPLATE)
                        || stack.isOf(ModItems.IGNITED_RUBY_LEGGINGS) || stack.isOf(ModItems.IGNITED_RUBY_BOOTS)) && stack.hasEnchantments()) {
                    stack.getEnchantments().clear();
                }
            }
        }

        // endregion

        // region Water-Based Logic (Overworld)

        if (player.isTouchingWaterOrRain() && level.getRegistryKey() == World.OVERWORLD) {
            for (ItemStack stack : inventory.main) {
                if (stack.isOf(ModItems.DRIPPING_WET_SWORD) || stack.isOf(ModItems.DRIPPING_WET_PICKAXE)
                        || stack.isOf(ModItems.DRIPPING_WET_AXE) || stack.isOf(ModItems.DRIPPING_WET_SHOVEL)) {
                    stack.addEnchantment(Enchantments.MENDING, 1);
                    stack.addEnchantment(Enchantments.UNBREAKING, 3);
                }
                if (stack.isOf(ModItems.DRIPPING_WET_PICKAXE)) {
                    stack.addEnchantment(Enchantments.EFFICIENCY, 5);
                    stack.addEnchantment(Enchantments.FORTUNE, 3);
                }
                if (stack.isOf(ModItems.DRIPPING_WET_SWORD)) {
                    stack.addEnchantment(Enchantments.SHARPNESS, 4);
                }
            }

            if (isWearingFullDrippingWetArmor(player)) {
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 5, 0, true, false, false));
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 5, 0, true, false, false));

                for (ItemStack stack : inventory.main) {
                    if (stack.isOf(Items.TRIDENT)) {
                        stack.addEnchantment(Enchantments.RIPTIDE, 3);
                        stack.addEnchantment(Enchantments.UNBREAKING, 3);
                        stack.addEnchantment(Enchantments.MENDING, 1);
                    }
                }

                for (ItemStack stack : inventory.armor) {
                    if (stack.getItem() == ModItems.DRIPPING_WET_HELMET) {
                        stack.addEnchantment(Enchantments.AQUA_AFFINITY, 1);
                        stack.addEnchantment(Enchantments.PROTECTION, 2);
                        stack.addEnchantment(Enchantments.UNBREAKING, 3);
                    }
                    if (stack.getItem() == ModItems.DRIPPING_WET_CHESTPLATE) {
                        stack.addEnchantment(Enchantments.PROTECTION, 2);
                        stack.addEnchantment(Enchantments.UNBREAKING, 3);
                    }
                    if (stack.getItem() == ModItems.DRIPPING_WET_LEGGINGS) {
                        stack.addEnchantment(Enchantments.PROTECTION, 2);
                        stack.addEnchantment(Enchantments.UNBREAKING, 3);
                    }
                    if (stack.getItem() == ModItems.DRIPPING_WET_BOOTS) {
                        stack.addEnchantment(Enchantments.PROTECTION, 2);
                        stack.addEnchantment(Enchantments.FEATHER_FALLING, 3);
                        stack.addEnchantment(Enchantments.DEPTH_STRIDER, 3);
                        stack.addEnchantment(Enchantments.UNBREAKING, 3);
                    }
                }
            } else {
                for (ItemStack stack : inventory.armor) {
                    if ((stack.isOf(ModItems.DRIPPING_WET_HELMET) || stack.isOf(ModItems.DRIPPING_WET_CHESTPLATE)
                            || stack.isOf(ModItems.DRIPPING_WET_LEGGINGS) || stack.isOf(ModItems.DRIPPING_WET_BOOTS)) && stack.hasEnchantments()) {
                        stack.getEnchantments().clear();
                    }
                }
                for (ItemStack stack : inventory.main) {
                    if (stack.isOf(Items.TRIDENT) || stack.isOf(ModItems.DRIPPING_WET_HELMET) || stack.isOf(ModItems.DRIPPING_WET_CHESTPLATE)
                            || stack.isOf(ModItems.DRIPPING_WET_LEGGINGS) || stack.isOf(ModItems.DRIPPING_WET_BOOTS) && stack.hasEnchantments()) {
                        stack.getEnchantments().clear();
                    }
                }
            }
        } else {

            // endregion

            // region Non-Water Logic

            for (ItemStack stack : inventory.main) {
                if (stack.isOf(ModItems.DRIPPING_WET_SWORD) || stack.isOf(ModItems.DRIPPING_WET_PICKAXE)
                        || stack.isOf(ModItems.DRIPPING_WET_AXE) || stack.isOf(ModItems.DRIPPING_WET_SHOVEL) && stack.hasEnchantments()) {
                    stack.getEnchantments().clear();
                }
            }
            if (isWearingFullDrippingWetArmor(player)) {
                player.removeStatusEffect(StatusEffects.NIGHT_VISION);
                player.removeStatusEffect(StatusEffects.WATER_BREATHING);

                for (ItemStack stack : inventory.armor) {
                    stack.getEnchantments().clear();
                }

                for (ItemStack stack : inventory.main) {
                    if (stack.isOf(Items.TRIDENT)) {
                        stack.getEnchantments().clear();
                    }
                }
            }
        }

        // endregion

        // region Underground Logic (Cave Detection, Overworld)

        if (!level.isSkyVisible(player.getBlockPos()) || player.getY() < 50 && level.getRegistryKey() == World.OVERWORLD) {
            for (ItemStack stack : inventory.main) {
                if (stack.isOf(ModItems.FORTIFIED_ADAMANTINE_SWORD) || stack.isOf(ModItems.FORTIFIED_ADAMANTINE_PICKAXE)
                        || stack.isOf(ModItems.FORTIFIED_ADAMANTINE_AXE) || stack.isOf(ModItems.FORTIFIED_ADAMANTINE_SHOVEL)) {
                    stack.addEnchantment(Enchantments.MENDING, 1);
                    stack.addEnchantment(Enchantments.UNBREAKING, 3);
                }
                if (stack.isOf(ModItems.FORTIFIED_ADAMANTINE_PICKAXE)) {
                    stack.addEnchantment(Enchantments.EFFICIENCY, 5);
                    stack.addEnchantment(Enchantments.FORTUNE, 3);
                }
                if (stack.isOf(ModItems.FORTIFIED_ADAMANTINE_SWORD)) {
                    stack.addEnchantment(Enchantments.SHARPNESS, 4);
                }
            }

            if (isWearingFullAdamantineArmor(player)) {
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 5, 0, true, false, false));

                for (ItemStack stack : inventory.armor) {
                    if (stack.getItem() == ModItems.FORTIFIED_ADAMANTINE_HELMET) {
                        stack.addEnchantment(Enchantments.PROTECTION, 3);
                        stack.addEnchantment(Enchantments.UNBREAKING, 3);
                        stack.addEnchantment(Enchantments.MENDING, 1);
                    }
                    if (stack.getItem() == ModItems.FORTIFIED_ADAMANTINE_CHESTPLATE) {
                        stack.addEnchantment(Enchantments.PROTECTION, 3);
                        stack.addEnchantment(Enchantments.UNBREAKING, 3);
                        stack.addEnchantment(Enchantments.MENDING, 1);
                    }
                    if (stack.getItem() == ModItems.FORTIFIED_ADAMANTINE_LEGGINGS) {
                        stack.addEnchantment(Enchantments.PROTECTION, 3);
                        stack.addEnchantment(Enchantments.UNBREAKING, 3);
                        stack.addEnchantment(Enchantments.MENDING, 1);
                    }
                    if (stack.getItem() == ModItems.FORTIFIED_ADAMANTINE_BOOTS) {
                        stack.addEnchantment(Enchantments.PROTECTION, 3);
                        stack.addEnchantment(Enchantments.FEATHER_FALLING, 3);
                        stack.addEnchantment(Enchantments.UNBREAKING, 3);
                        stack.addEnchantment(Enchantments.MENDING, 1);
                    }
                }
            }
        }

        // endregion

        // region Non-Underground Logic

        else {
            if (isWearingFullAdamantineArmor(player)) {
                player.removeStatusEffect(StatusEffects.NIGHT_VISION);
            }

            for (ItemStack stack : inventory.main) {
                if (stack.isOf(ModItems.FORTIFIED_ADAMANTINE_SWORD) || stack.isOf(ModItems.FORTIFIED_ADAMANTINE_PICKAXE)
                        || stack.isOf(ModItems.FORTIFIED_ADAMANTINE_AXE) || stack.isOf(ModItems.FORTIFIED_ADAMANTINE_SHOVEL)
                        || stack.isOf(ModItems.FORTIFIED_ADAMANTINE_HELMET) || stack.isOf(ModItems.FORTIFIED_ADAMANTINE_CHESTPLATE)
                        || stack.isOf(ModItems.FORTIFIED_ADAMANTINE_LEGGINGS) || stack.isOf(ModItems.FORTIFIED_ADAMANTINE_BOOTS) && stack.hasEnchantments()) {
                    stack.getEnchantments().clear();
                }
            }
            for (ItemStack stack : inventory.armor) {
                if (isWearingFullAdamantineArmor(player) && (stack.isOf(ModItems.FORTIFIED_ADAMANTINE_HELMET)
                        || stack.isOf(ModItems.FORTIFIED_ADAMANTINE_CHESTPLATE)
                        || stack.isOf(ModItems.FORTIFIED_ADAMANTINE_LEGGINGS)
                        || stack.isOf(ModItems.FORTIFIED_ADAMANTINE_BOOTS))) {
                    stack.getEnchantments().clear();
                }
            }
        }

        // endregion
    }

    // endregion

    // region Client Player Tick Handler

    private static void onPlayerTick(PlayerEntity player) {
        // Client-side only: handles flight power and HUD
        World level = player.getWorld();

        if (level.getRegistryKey() == World.END) {
            if (isWearingFullEtherealArmor(player)) {
                // In the End, update flight power (fast regen, no cost)
                updateFlightPower(player, level);

                // Handle flight toggle
                if (ElementalsModClient.FLIGHT_KEY.isPressed()) {
                    long currentTime = System.currentTimeMillis();

                    if (currentTime - lastKeyPressTime > COOLDOWN) {
                        toggleFlight(player);
                        lastKeyPressTime = currentTime;
                    }
                }
            }
        } else {
            if (ElementalsModClient.FLIGHT_KEY.isPressed()) {
                long currentTime = System.currentTimeMillis();

                if (currentTime - lastKeyPressTime > COOLDOWN) {
                    // Only allow enabling flight if we have flight power
                    if (!player.getAbilities().allowFlying && flightPower > 0) {
                        toggleFlight(player);
                        lastKeyPressTime = currentTime;
                    } else if (player.getAbilities().allowFlying) {
                        // Can always disable flight
                        toggleFlight(player);
                        lastKeyPressTime = currentTime;
                    }
                }
            }

            // Update flight power
            updateFlightPower(player, level);
        }
    }

    // endregion

    // region Armor Check Methods

    private static boolean isWearingFullIgnitedArmor(PlayerEntity player) {
        ItemStack head = player.getInventory().getArmorStack(3);
        ItemStack chest = player.getInventory().getArmorStack(2);
        ItemStack legs = player.getInventory().getArmorStack(1);
        ItemStack feet = player.getInventory().getArmorStack(0);

        return !head.isEmpty() && head.getItem() == ModItems.IGNITED_RUBY_HELMET &&
                !chest.isEmpty() && chest.getItem() == ModItems.IGNITED_RUBY_CHESTPLATE &&
                !legs.isEmpty() && legs.getItem() == ModItems.IGNITED_RUBY_LEGGINGS &&
                !feet.isEmpty() && feet.getItem() == ModItems.IGNITED_RUBY_BOOTS;
    }

    private static boolean isWearingFullDrippingWetArmor(PlayerEntity player) {
        ItemStack head = player.getInventory().getArmorStack(3);
        ItemStack chest = player.getInventory().getArmorStack(2);
        ItemStack legs = player.getInventory().getArmorStack(1);
        ItemStack feet = player.getInventory().getArmorStack(0);

        return !head.isEmpty() && head.getItem() == ModItems.DRIPPING_WET_HELMET &&
                !chest.isEmpty() && chest.getItem() == ModItems.DRIPPING_WET_CHESTPLATE &&
                !legs.isEmpty() && legs.getItem() == ModItems.DRIPPING_WET_LEGGINGS &&
                !feet.isEmpty() && feet.getItem() == ModItems.DRIPPING_WET_BOOTS;
    }

    private static boolean isWearingFullAdamantineArmor(PlayerEntity player) {
        ItemStack head = player.getInventory().getArmorStack(3);
        ItemStack chest = player.getInventory().getArmorStack(2);
        ItemStack legs = player.getInventory().getArmorStack(1);
        ItemStack feet = player.getInventory().getArmorStack(0);

        return !head.isEmpty() && head.getItem() == ModItems.FORTIFIED_ADAMANTINE_HELMET &&
                !chest.isEmpty() && chest.getItem() == ModItems.FORTIFIED_ADAMANTINE_CHESTPLATE &&
                !legs.isEmpty() && legs.getItem() == ModItems.FORTIFIED_ADAMANTINE_LEGGINGS &&
                !feet.isEmpty() && feet.getItem() == ModItems.FORTIFIED_ADAMANTINE_BOOTS;
    }

    public static boolean isWearingFullEtherealArmor (PlayerEntity player) {
        ItemStack head = player.getInventory().getArmorStack(3);
        ItemStack chest = player.getInventory().getArmorStack(2);
        ItemStack legs = player.getInventory().getArmorStack(1);
        ItemStack feet = player.getInventory().getArmorStack(0);

        return !head.isEmpty() && head.getItem() == ModItems.ETHEREAL_HELMET &&
                !chest.isEmpty() && chest.getItem() == ModItems.ETHEREAL_CHESTPLATE &&
                !legs.isEmpty() && legs.getItem() == ModItems.ETHEREAL_LEGGINGS &&
                !feet.isEmpty() && feet.getItem() == ModItems.ETHEREAL_BOOTS;
    }

    // endregion
}
