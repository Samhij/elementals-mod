package net.lonk.elementals.item;

import net.lonk.elementals.ElementalsMod;
import net.minecraft.component.DataComponentTypes;
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
import net.minecraft.world.item.*;

public class ModItems {
    public static final Item RUBY = registerItem("ruby",
            new Item(new Item.Settings()));

    public static final Item IGNITED_RUBY = registerItem("ignited_ruby",
            new Item(new Item.Settings().rarity(Rarity.UNCOMMON).fireproof().component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true)));

    public static final Item STAR_FRAGMENT = registerItem("star_fragment",
            new Item(new Item.Settings().rarity(Rarity.UNCOMMON).component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true)));

    public static final Item FIRE_STAR = registerItem("fire_star",
            new Item(new Item.Settings().fireproof().component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true)));

    public static final Item RUBY_SWORD = registerItem("ruby_sword",
            new SwordItem(ModToolTiers.RUBY, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolTiers.RUBY, 3, -2.4f))));

    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe",
            new PickaxeItem(ModToolTiers.RUBY, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolTiers.RUBY, 1.0f, -2.8f))));

    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel",
            new ShovelItem(ModToolTiers.RUBY, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolTiers.RUBY, 1.5f, -3.0f))));

    public static final Item RUBY_AXE = registerItem("ruby_axe",
            new AxeItem(ModToolTiers.RUBY, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolTiers.RUBY, 6.0f, -3.2f))));

    public static final Item RUBY_HOE = registerItem("ruby_hoe",
            new HoeItem(ModToolTiers.RUBY, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolTiers.RUBY, 0.0f, -3.0f))));

    public static final Item RUBY_HELMET = registerItem("ruby_helmet",
            new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(16))));

    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate",
            new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(16))));

    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings",
            new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(16))));

    public static final Item RUBY_BOOTS = registerItem("ruby_boots",
            new ArmorItem(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(16))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ElementalsMod.MOD_ID, name), item);
    }

    public static void register() {
        ElementalsMod.LOGGER.info("Registering Items for " + ElementalsMod.MOD_ID);
    }
}
