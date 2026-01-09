package net.lonk.elementals.item;

import net.lonk.elementals.ElementalsMod;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
    //region Ruby Items

    public static final Item RUBY = registerItem("ruby",
            new Item(new Item.Settings()));

    public static final Item IGNITED_RUBY = registerItem("ignited_ruby",
            new Item(new Item.Settings().fireproof()));

    public static final Item STAR_FRAGMENT = registerItem("star_fragment",
            new Item(new Item.Settings()));

    public static final Item FIRE_STAR = registerItem("fire_star",
            new Item(new Item.Settings().fireproof()));

    //endregion

    //region Ruby Tools

    public static final Item RUBY_SWORD = registerItem("ruby_sword",
            new SwordItem(ModToolMaterials.RUBY, 3, -2.4f, new Item.Settings()));

    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe",
            new PickaxeItem(ModToolMaterials.RUBY, 1, -2.8f, new Item.Settings()));

    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel",
            new ShovelItem(ModToolMaterials.RUBY, 1.5f, -3.0f, new Item.Settings()));

    public static final Item RUBY_AXE = registerItem("ruby_axe",
            new AxeItem(ModToolMaterials.RUBY, 6.0f, -3.2f, new Item.Settings()));

    public static final Item RUBY_HOE = registerItem("ruby_hoe",
            new HoeItem(ModToolMaterials.RUBY, 0, -3.0f, new Item.Settings()));

    //endregion

    //region Ruby Armor

    public static final Item RUBY_HELMET = registerItem("ruby_helmet",
            new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.HELMET, new Item.Settings()));

    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate",
            new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, new Item.Settings()));

    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings",
            new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, new Item.Settings()));

    public static final Item RUBY_BOOTS = registerItem("ruby_boots",
            new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.BOOTS, new Item.Settings()));

    //endregion

    //region Ignited Ruby Tools

    public static final Item IGNITED_RUBY_SWORD = registerItem("ignited_ruby_sword",
            new SwordItem(ModToolMaterials.IGNITED_RUBY, 3, -2.4f, new Item.Settings().fireproof()));

    public static final Item IGNITED_RUBY_PICKAXE = registerItem("ignited_ruby_pickaxe",
            new PickaxeItem(ModToolMaterials.IGNITED_RUBY, 1, -2.8f, new Item.Settings().fireproof()));

    public static final Item IGNITED_RUBY_SHOVEL = registerItem("ignited_ruby_shovel",
            new ShovelItem(ModToolMaterials.IGNITED_RUBY, 1.5f, -3.0f, new Item.Settings().fireproof()));

    public static final Item IGNITED_RUBY_AXE = registerItem("ignited_ruby_axe",
            new AxeItem(ModToolMaterials.IGNITED_RUBY, 6.0f, -3.2f, new Item.Settings().fireproof()));

    public static final Item IGNITED_RUBY_HOE = registerItem("ignited_ruby_hoe",
            new HoeItem(ModToolMaterials.IGNITED_RUBY, 0, -3.0f, new Item.Settings().fireproof()));

    //endregion

    //region Ignited Ruby Armor

    public static final Item IGNITED_RUBY_HELMET = registerItem("ignited_ruby_helmet",
            new ArmorItem(ModArmorMaterials.IGNITED_RUBY, ArmorItem.Type.HELMET, new Item.Settings().fireproof()));

    public static final Item IGNITED_RUBY_CHESTPLATE = registerItem("ignited_ruby_chestplate",
            new ArmorItem(ModArmorMaterials.IGNITED_RUBY, ArmorItem.Type.CHESTPLATE, new Item.Settings().fireproof()));

    public static final Item IGNITED_RUBY_LEGGINGS = registerItem("ignited_ruby_leggings",
            new ArmorItem(ModArmorMaterials.IGNITED_RUBY, ArmorItem.Type.LEGGINGS, new Item.Settings().fireproof()));

    public static final Item IGNITED_RUBY_BOOTS = registerItem("ignited_ruby_boots",
            new ArmorItem(ModArmorMaterials.IGNITED_RUBY, ArmorItem.Type.BOOTS, new Item.Settings().fireproof()));

    //endregion


    //region Sapphire Items

    public static final Item SAPPHIRE = registerItem("sapphire",
            new Item(new Item.Settings()));

    public static final Item DRIPPING_WET_SAPPHIRE = registerItem("dripping_wet_sapphire",
            new Item(new Item.Settings()));

    public static final Item TIDEBOUND_RELIC = registerItem("tidebound_relic",
            new Item(new Item.Settings()));

    public static final Item WATER_SHELL = registerItem("water_shell",
            new Item(new Item.Settings()));

    //endregion

    //region Sapphire Tools

    public static final Item SAPPHIRE_SWORD = registerItem("sapphire_sword",
            new SwordItem(ModToolMaterials.SAPPHIRE, 3, -2.4f, new Item.Settings()));

    public static final Item SAPPHIRE_PICKAXE = registerItem("sapphire_pickaxe",
            new PickaxeItem(ModToolMaterials.SAPPHIRE, 1, -2.8f, new Item.Settings()));

    public static final Item SAPPHIRE_SHOVEL = registerItem("sapphire_shovel",
            new ShovelItem(ModToolMaterials.SAPPHIRE, 1.5f, -3.0f, new Item.Settings()));

    public static final Item SAPPHIRE_AXE = registerItem("sapphire_axe",
            new AxeItem(ModToolMaterials.SAPPHIRE, 6.0f, -3.2f, new Item.Settings()));

    public static final Item SAPPHIRE_HOE = registerItem("sapphire_hoe",
            new HoeItem(ModToolMaterials.SAPPHIRE, 0, -3.0f, new Item.Settings()));

    //endregion

    //region Sapphire Armor

    public static final Item SAPPHIRE_HELMET = registerItem("sapphire_helmet",
            new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.HELMET, new Item.Settings()));

    public static final Item SAPPHIRE_CHESTPLATE = registerItem("sapphire_chestplate",
            new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.CHESTPLATE, new Item.Settings()));

    public static final Item SAPPHIRE_LEGGINGS = registerItem("sapphire_leggings",
            new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.LEGGINGS, new Item.Settings()));

    public static final Item SAPPHIRE_BOOTS = registerItem("sapphire_boots",
            new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.BOOTS, new Item.Settings()));

    //endregion

    //region Drippin' Wet Tools

    public static final Item DRIPPING_WET_SWORD = registerItem("dripping_wet_sword",
            new SwordItem(ModToolMaterials.DRIPPING_WET, 3, -2.4f, new Item.Settings()));

    public static final Item DRIPPING_WET_PICKAXE = registerItem("dripping_wet_pickaxe",
            new PickaxeItem(ModToolMaterials.DRIPPING_WET, 1, -2.8f, new Item.Settings()));

    public static final Item DRIPPING_WET_SHOVEL = registerItem("dripping_wet_shovel",
            new ShovelItem(ModToolMaterials.DRIPPING_WET, 1.5f, -3.0f, new Item.Settings()));

    public static final Item DRIPPING_WET_AXE = registerItem("dripping_wet_axe",
            new AxeItem(ModToolMaterials.DRIPPING_WET, 6.0f, -3.2f, new Item.Settings()));

    public static final Item DRIPPING_WET_HOE = registerItem("dripping_wet_hoe",
            new HoeItem(ModToolMaterials.DRIPPING_WET, 0, -3.0f, new Item.Settings()));

    //endregion

    //region Drippin' Wet Armor

    public static final Item DRIPPING_WET_HELMET = registerItem("dripping_wet_helmet",
            new ArmorItem(ModArmorMaterials.DRIPPING_WET, ArmorItem.Type.HELMET, new Item.Settings()));

    public static final Item DRIPPING_WET_CHESTPLATE = registerItem("dripping_wet_chestplate",
            new ArmorItem(ModArmorMaterials.DRIPPING_WET, ArmorItem.Type.CHESTPLATE, new Item.Settings()));

    public static final Item DRIPPING_WET_LEGGINGS = registerItem("dripping_wet_leggings",
            new ArmorItem(ModArmorMaterials.DRIPPING_WET, ArmorItem.Type.LEGGINGS, new Item.Settings()));

    public static final Item DRIPPING_WET_BOOTS = registerItem("dripping_wet_boots",
            new ArmorItem(ModArmorMaterials.DRIPPING_WET, ArmorItem.Type.BOOTS, new Item.Settings()));

    //endregion


    //region Adamantine Items

    public static final Item ADAMANTINE_INGOT = registerItem("adamantine_ingot",
            new Item(new Item.Settings()));

    public static final Item FORTIFIED_ADAMANTINE_INGOT = registerItem("fortified_adamantine_ingot",
            new Item(new Item.Settings()));

    public static final Item ADAMANT = registerItem("adamant",
            new Item(new Item.Settings()));

    public static final Item BEDROCK_CATALYST = registerItem("bedrock_catalyst",
            new Item(new Item.Settings()));

    //endregion

    //region Adamantine Tools

    public static final Item ADAMANTINE_SWORD = registerItem("adamantine_sword",
            new SwordItem(ModToolMaterials.ADAMANTINE, 3, -2.4f, new Item.Settings()));

    public static final Item ADAMANTINE_PICKAXE = registerItem("adamantine_pickaxe",
            new PickaxeItem(ModToolMaterials.ADAMANTINE, 1, -2.8f, new Item.Settings()));

    public static final Item ADAMANTINE_SHOVEL = registerItem("adamantine_shovel",
            new ShovelItem(ModToolMaterials.ADAMANTINE, 1.5f, -3.0f, new Item.Settings()));

    public static final Item ADAMANTINE_AXE = registerItem("adamantine_axe",
            new AxeItem(ModToolMaterials.ADAMANTINE, 6.0f, -3.2f, new Item.Settings()));

    public static final Item ADAMANTINE_HOE = registerItem("adamantine_hoe",
            new HoeItem(ModToolMaterials.ADAMANTINE, 0, -3.0f, new Item.Settings()));

    //endregion

    //region Adamantine Armor

    public static final Item ADAMANTINE_HELMET = registerItem("adamantine_helmet",
            new ArmorItem(ModArmorMaterials.ADAMANTINE, ArmorItem.Type.HELMET, new Item.Settings()));

    public static final Item ADAMANTINE_CHESTPLATE = registerItem("adamantine_chestplate",
            new ArmorItem(ModArmorMaterials.ADAMANTINE, ArmorItem.Type.CHESTPLATE, new Item.Settings()));

    public static final Item ADAMANTINE_LEGGINGS = registerItem("adamantine_leggings",
            new ArmorItem(ModArmorMaterials.ADAMANTINE, ArmorItem.Type.LEGGINGS, new Item.Settings()));

    public static final Item ADAMANTINE_BOOTS = registerItem("adamantine_boots",
            new ArmorItem(ModArmorMaterials.ADAMANTINE, ArmorItem.Type.BOOTS, new Item.Settings()));

    //endregion

    //region Fortified Adamantine Tools

    public static final Item FORTIFIED_ADAMANTINE_SWORD = registerItem("fortified_adamantine_sword",
            new SwordItem(ModToolMaterials.FORTIFIED_ADAMANTINE, 3, -2.4f, new Item.Settings()));

    public static final Item FORTIFIED_ADAMANTINE_PICKAXE = registerItem("fortified_adamantine_pickaxe",
            new PickaxeItem(ModToolMaterials.FORTIFIED_ADAMANTINE, 1, -2.8f, new Item.Settings()));

    public static final Item FORTIFIED_ADAMANTINE_SHOVEL = registerItem("fortified_adamantine_shovel",
            new ShovelItem(ModToolMaterials.FORTIFIED_ADAMANTINE, 1.5f, -3.0f, new Item.Settings()));

    public static final Item FORTIFIED_ADAMANTINE_AXE = registerItem("fortified_adamantine_axe",
            new AxeItem(ModToolMaterials.FORTIFIED_ADAMANTINE, 6.0f, -3.2f, new Item.Settings()));

    public static final Item FORTIFIED_ADAMANTINE_HOE = registerItem("fortified_adamantine_hoe",
            new HoeItem(ModToolMaterials.FORTIFIED_ADAMANTINE, 0, -3.0f, new Item.Settings()));

    //endregion

    //region Fortified Adamantine Armor

    public static final Item FORTIFIED_ADAMANTINE_HELMET = registerItem("fortified_adamantine_helmet",
            new ArmorItem(ModArmorMaterials.FORTIFIED_ADAMANTINE, ArmorItem.Type.HELMET, new Item.Settings()));

    public static final Item FORTIFIED_ADAMANTINE_CHESTPLATE = registerItem("fortified_adamantine_chestplate",
            new ArmorItem(ModArmorMaterials.FORTIFIED_ADAMANTINE, ArmorItem.Type.CHESTPLATE, new Item.Settings()));

    public static final Item FORTIFIED_ADAMANTINE_LEGGINGS = registerItem("fortified_adamantine_leggings",
            new ArmorItem(ModArmorMaterials.FORTIFIED_ADAMANTINE, ArmorItem.Type.LEGGINGS, new Item.Settings()));

    public static final Item FORTIFIED_ADAMANTINE_BOOTS = registerItem("fortified_adamantine_boots",
            new ArmorItem(ModArmorMaterials.FORTIFIED_ADAMANTINE, ArmorItem.Type.BOOTS, new Item.Settings()));

    //endregion


    //region Aerolite Items

    public static final Item AEROLITE = registerItem("aerolite",
            new Item(new Item.Settings().rarity(Rarity.UNCOMMON)));

    public static final Item ETHEREAL_AEROLITE = registerItem("ethereal_aerolite",
            new Item(new Item.Settings().rarity(Rarity.RARE)));

    public static final Item END_CORE = registerItem("end_core",
            new Item(new Item.Settings().rarity(Rarity.RARE)));

    //endregion

    //region Aerolite Tools

    public static final Item AEROLITE_SWORD = registerItem("aerolite_sword",
            new SwordItem(ModToolMaterials.AEROLITE, 3, -2.4f, new Item.Settings()));

    public static final Item AEROLITE_PICKAXE = registerItem("aerolite_pickaxe",
            new PickaxeItem(ModToolMaterials.AEROLITE, 1, -2.8f, new Item.Settings()));

    public static final Item AEROLITE_SHOVEL = registerItem("aerolite_shovel",
            new ShovelItem(ModToolMaterials.AEROLITE, 1.5f, -3.0f, new Item.Settings()));

    public static final Item AEROLITE_AXE = registerItem("aerolite_axe",
            new AxeItem(ModToolMaterials.AEROLITE, 6.0f, -3.2f, new Item.Settings()));

    public static final Item AEROLITE_HOE = registerItem("aerolite_hoe",
            new HoeItem(ModToolMaterials.AEROLITE, 0, -3.0f, new Item.Settings()));

    //endregion

    //region Aerolite Armor

    public static final Item AEROLITE_HELMET = registerItem("aerolite_helmet",
            new ArmorItem(ModArmorMaterials.AEROLITE, ArmorItem.Type.HELMET, new Item.Settings()));

    public static final Item AEROLITE_CHESTPLATE = registerItem("aerolite_chestplate",
            new ArmorItem(ModArmorMaterials.AEROLITE, ArmorItem.Type.CHESTPLATE, new Item.Settings()));

    public static final Item AEROLITE_LEGGINGS = registerItem("aerolite_leggings",
            new ArmorItem(ModArmorMaterials.AEROLITE, ArmorItem.Type.LEGGINGS, new Item.Settings()));

    public static final Item AEROLITE_BOOTS = registerItem("aerolite_boots",
            new ArmorItem(ModArmorMaterials.AEROLITE, ArmorItem.Type.BOOTS, new Item.Settings()));

    //endregion

    //region Ethereal Tools

    public static final Item ETHEREAL_SWORD = registerItem("ethereal_sword",
            new SwordItem(ModToolMaterials.ETHEREAL, 3, -2.4f, new Item.Settings()));

    public static final Item ETHEREAL_PICKAXE = registerItem("ethereal_pickaxe",
            new PickaxeItem(ModToolMaterials.ETHEREAL, 1, -2.8f, new Item.Settings()));

    public static final Item ETHEREAL_SHOVEL = registerItem("ethereal_shovel",
            new ShovelItem(ModToolMaterials.ETHEREAL, 1.5f, -3.0f, new Item.Settings()));

    public static final Item ETHEREAL_AXE = registerItem("ethereal_axe",
            new AxeItem(ModToolMaterials.ETHEREAL, 6.0f, -3.2f, new Item.Settings()));

    public static final Item ETHEREAL_HOE = registerItem("ethereal_hoe",
            new HoeItem(ModToolMaterials.ETHEREAL, 0, -3.0f, new Item.Settings()));

    //endregion

    //region Ethereal Armor

    public static final Item ETHEREAL_HELMET = registerItem("ethereal_helmet",
            new ArmorItem(ModArmorMaterials.ETHEREAL, ArmorItem.Type.HELMET, new Item.Settings()));

    public static final Item ETHEREAL_CHESTPLATE = registerItem("ethereal_chestplate",
            new ArmorItem(ModArmorMaterials.ETHEREAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()));

    public static final Item ETHEREAL_LEGGINGS = registerItem("ethereal_leggings",
            new ArmorItem(ModArmorMaterials.ETHEREAL, ArmorItem.Type.LEGGINGS, new Item.Settings()));

    public static final Item ETHEREAL_BOOTS = registerItem("ethereal_boots",
            new ArmorItem(ModArmorMaterials.ETHEREAL, ArmorItem.Type.BOOTS, new Item.Settings()));

    //endregion


    //region Helper Methods
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ElementalsMod.MOD_ID, name), item);
    }

    public static void register() {
        ElementalsMod.LOGGER.info("Registering Items for " + ElementalsMod.MOD_ID);
    }
    //endregion
}
