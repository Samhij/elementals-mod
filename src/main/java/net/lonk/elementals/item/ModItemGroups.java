package net.lonk.elementals.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.lonk.elementals.ElementalsMod;
import net.lonk.elementals.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup FIRE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(ElementalsMod.MOD_ID, "fire_items"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("creativetab.fire_items"))
                    .icon(() -> new ItemStack(ModItems.RUBY))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.IGNITED_RUBY);
                        entries.add(ModItems.STAR_FRAGMENT);
                        entries.add(ModItems.FIRE_STAR);

                        entries.add(ModItems.RUBY_SWORD);
                        entries.add(ModItems.RUBY_PICKAXE);
                        entries.add(ModItems.RUBY_SHOVEL);
                        entries.add(ModItems.RUBY_AXE);
                        entries.add(ModItems.RUBY_HOE);

                        entries.add(ModItems.RUBY_HELMET);
                        entries.add(ModItems.RUBY_CHESTPLATE);
                        entries.add(ModItems.RUBY_LEGGINGS);
                        entries.add(ModItems.RUBY_BOOTS);

                        entries.add(ModItems.IGNITED_RUBY_SWORD);
                        entries.add(ModItems.IGNITED_RUBY_PICKAXE);
                        entries.add(ModItems.IGNITED_RUBY_SHOVEL);
                        entries.add(ModItems.IGNITED_RUBY_AXE);
                        entries.add(ModItems.IGNITED_RUBY_HOE);

                        entries.add(ModItems.IGNITED_RUBY_HELMET);
                        entries.add(ModItems.IGNITED_RUBY_CHESTPLATE);
                        entries.add(ModItems.IGNITED_RUBY_LEGGINGS);
                        entries.add(ModItems.IGNITED_RUBY_BOOTS);

                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.RUBY_BLOCK);
                    }).build());

    public static final ItemGroup SAPPHIRE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(ElementalsMod.MOD_ID, "water_items"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("creativetab.water_items"))
                    .icon(() -> new ItemStack(ModItems.SAPPHIRE))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.SAPPHIRE);
                        entries.add(ModItems.DRIPPING_WET_SAPPHIRE);
                        entries.add(ModItems.TIDEBOUND_RELIC);
                        entries.add(ModItems.WATER_SHELL);

                        entries.add(ModItems.SAPPHIRE_SWORD);
                        entries.add(ModItems.SAPPHIRE_PICKAXE);
                        entries.add(ModItems.SAPPHIRE_SHOVEL);
                        entries.add(ModItems.SAPPHIRE_AXE);
                        entries.add(ModItems.SAPPHIRE_HOE);

                        entries.add(ModItems.SAPPHIRE_HELMET);
                        entries.add(ModItems.SAPPHIRE_CHESTPLATE);
                        entries.add(ModItems.SAPPHIRE_LEGGINGS);
                        entries.add(ModItems.SAPPHIRE_BOOTS);

                        entries.add(ModItems.DRIPPING_WET_SWORD);
                        entries.add(ModItems.DRIPPING_WET_PICKAXE);
                        entries.add(ModItems.DRIPPING_WET_SHOVEL);
                        entries.add(ModItems.DRIPPING_WET_AXE);
                        entries.add(ModItems.DRIPPING_WET_HOE);

                        entries.add(ModItems.DRIPPING_WET_HELMET);
                        entries.add(ModItems.DRIPPING_WET_CHESTPLATE);
                        entries.add(ModItems.DRIPPING_WET_LEGGINGS);
                        entries.add(ModItems.DRIPPING_WET_BOOTS);

                        entries.add(ModBlocks.SAPPHIRE_ORE);
                        entries.add(ModBlocks.SAPPHIRE_BLOCK);
                    }).build());

    public static final ItemGroup EARTH_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(ElementalsMod.MOD_ID, "earth_items"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("creativetab.earth_items"))
                    .icon(() -> new ItemStack(ModItems.ADAMANTINE_INGOT))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ADAMANTINE_INGOT);
                        entries.add(ModItems.FORTIFIED_ADAMANTINE_INGOT);
                        entries.add(ModItems.ADAMANT);
                        entries.add(ModItems.BEDROCK_CATALYST);

                        entries.add(ModItems.ADAMANTINE_SWORD);
                        entries.add(ModItems.ADAMANTINE_PICKAXE);
                        entries.add(ModItems.ADAMANTINE_SHOVEL);
                        entries.add(ModItems.ADAMANTINE_AXE);
                        entries.add(ModItems.ADAMANTINE_HOE);

                        entries.add(ModItems.ADAMANTINE_HELMET);
                        entries.add(ModItems.ADAMANTINE_CHESTPLATE);
                        entries.add(ModItems.ADAMANTINE_LEGGINGS);
                        entries.add(ModItems.ADAMANTINE_BOOTS);

                        entries.add(ModItems.FORTIFIED_ADAMANTINE_SWORD);
                        entries.add(ModItems.FORTIFIED_ADAMANTINE_PICKAXE);
                        entries.add(ModItems.FORTIFIED_ADAMANTINE_SHOVEL);
                        entries.add(ModItems.FORTIFIED_ADAMANTINE_AXE);
                        entries.add(ModItems.FORTIFIED_ADAMANTINE_HOE);

                        entries.add(ModItems.FORTIFIED_ADAMANTINE_HELMET);
                        entries.add(ModItems.FORTIFIED_ADAMANTINE_CHESTPLATE);
                        entries.add(ModItems.FORTIFIED_ADAMANTINE_LEGGINGS);
                        entries.add(ModItems.FORTIFIED_ADAMANTINE_BOOTS);

                        entries.add(ModBlocks.ADAMANT_ORE);
                        entries.add(ModBlocks.ADAMANTINE_BLOCK);
                    }).build());

    public static final ItemGroup AIR_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(ElementalsMod.MOD_ID, "air_items"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("creativetab.air_items"))
                    .icon(() -> new ItemStack(ModItems.AEROLITE))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.AEROLITE);
                        entries.add(ModItems.ETHEREAL_AEROLITE);
                        entries.add(ModItems.END_CORE);

                        entries.add(ModItems.AEROLITE_SWORD);
                        entries.add(ModItems.AEROLITE_PICKAXE);
                        entries.add(ModItems.AEROLITE_SHOVEL);
                        entries.add(ModItems.AEROLITE_AXE);
                        entries.add(ModItems.AEROLITE_HOE);

                        entries.add(ModItems.AEROLITE_HELMET);
                        entries.add(ModItems.AEROLITE_CHESTPLATE);
                        entries.add(ModItems.AEROLITE_LEGGINGS);
                        entries.add(ModItems.AEROLITE_BOOTS);

                        entries.add(ModItems.ETHEREAL_SWORD);
                        entries.add(ModItems.ETHEREAL_PICKAXE);
                        entries.add(ModItems.ETHEREAL_SHOVEL);
                        entries.add(ModItems.ETHEREAL_AXE);
                        entries.add(ModItems.ETHEREAL_HOE);

                        entries.add(ModItems.ETHEREAL_HELMET);
                        entries.add(ModItems.ETHEREAL_CHESTPLATE);
                        entries.add(ModItems.ETHEREAL_LEGGINGS);
                        entries.add(ModItems.ETHEREAL_BOOTS);

                        entries.add(ModBlocks.AEROLITE_ORE);
                        entries.add(ModBlocks.AEROLITE_BLOCK);
                    }).build());

    public static void register() {
        ElementalsMod.LOGGER.info("Registering Item Groups for " + ElementalsMod.MOD_ID);
    }
}
