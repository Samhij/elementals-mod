package net.lonk.elementals.item;

import net.lonk.elementals.ElementalsMod;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {
    //region Ruby

    public static final RegistryEntry<ArmorMaterial> RUBY_ARMOR_MATERIAL = registerArmorMaterial("ruby",
            () -> new ArmorMaterial(
                    Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                        map.put(ArmorItem.Type.BOOTS, 2);
                        map.put(ArmorItem.Type.LEGGINGS, 5);
                        map.put(ArmorItem.Type.CHESTPLATE, 6);
                        map.put(ArmorItem.Type.HELMET, 2);
                        map.put(ArmorItem.Type.BODY, 5);
                    }),
                    16,
                    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                    () -> Ingredient.ofItems(ModItems.RUBY),
                    List.of(new ArmorMaterial.Layer(Identifier.of(ElementalsMod.MOD_ID, "ruby"))),
                    4.0f,
                    0.0f
            ));

    //endregion

    //region Ignited Ruby

    public static final RegistryEntry<ArmorMaterial> IGNITED_RUBY_ARMOR_MATERIAL = registerArmorMaterial("ignited_ruby",
            () -> new ArmorMaterial(
                    Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                        map.put(ArmorItem.Type.BOOTS, 3);
                        map.put(ArmorItem.Type.LEGGINGS, 6);
                        map.put(ArmorItem.Type.CHESTPLATE, 7);
                        map.put(ArmorItem.Type.HELMET, 3);
                        map.put(ArmorItem.Type.BODY, 6);
                    }),
                    20,
                    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                    () -> Ingredient.ofItems(ModItems.IGNITED_RUBY),
                    List.of(new ArmorMaterial.Layer(Identifier.of(ElementalsMod.MOD_ID, "ignited_ruby"))),
                    5.0f,
                    0.0f
            ));

    //endregion

    //region Sapphire

    public static final RegistryEntry<ArmorMaterial> SAPPHIRE_ARMOR_MATERIAL = registerArmorMaterial("sapphire",
            () -> new ArmorMaterial(
                    Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                        map.put(ArmorItem.Type.BOOTS, 2);
                        map.put(ArmorItem.Type.LEGGINGS, 5);
                        map.put(ArmorItem.Type.CHESTPLATE, 6);
                        map.put(ArmorItem.Type.HELMET, 2);
                        map.put(ArmorItem.Type.BODY, 6);
                    }),
                    14,
                    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                    () -> Ingredient.ofItems(ModItems.SAPPHIRE),
                    List.of(new ArmorMaterial.Layer(Identifier.of(ElementalsMod.MOD_ID, "sapphire"))),
                    4.0f,
                    0.0f
            ));

    //endregion

    //region Drippin' Wet

    public static final RegistryEntry<ArmorMaterial> DRIPPING_WET_ARMOR_MATERIAL = registerArmorMaterial("dripping_wet",
            () -> new ArmorMaterial(
                    Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                        map.put(ArmorItem.Type.BOOTS, 3);
                        map.put(ArmorItem.Type.LEGGINGS, 6);
                        map.put(ArmorItem.Type.CHESTPLATE, 7);
                        map.put(ArmorItem.Type.HELMET, 3);
                        map.put(ArmorItem.Type.BODY, 6);
                    }),
                    18,
                    SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
                    () -> Ingredient.ofItems(ModItems.SAPPHIRE),
                    List.of(new ArmorMaterial.Layer(Identifier.of(ElementalsMod.MOD_ID, "dripping_wet"))),
                    5.0f,
                    0.0f
            ));

    //endregion

    //region Adamantine

    public static final RegistryEntry<ArmorMaterial> ADAMANTINE_ARMOR_MATERIAL = registerArmorMaterial("adamantine",
            () -> new ArmorMaterial(
                    Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                        map.put(ArmorItem.Type.BOOTS, 4);
                        map.put(ArmorItem.Type.LEGGINGS, 7);
                        map.put(ArmorItem.Type.CHESTPLATE, 8);
                        map.put(ArmorItem.Type.HELMET, 4);
                        map.put(ArmorItem.Type.BODY, 7);
                    }),
                    15,
                    SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
                    () -> Ingredient.ofItems(ModItems.ADAMANTINE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(ElementalsMod.MOD_ID, "adamantine"))),
                    6.0f,
                    0.0f
            ));

    //endregion

    //region Fortified Adamantine

    public static final RegistryEntry<ArmorMaterial> FORTIFIED_ADAMANTINE_ARMOR_MATERIAL = registerArmorMaterial("fortified_adamantine",
            () -> new ArmorMaterial(
                    Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                        map.put(ArmorItem.Type.BOOTS, 5);
                        map.put(ArmorItem.Type.LEGGINGS, 7);
                        map.put(ArmorItem.Type.CHESTPLATE, 9);
                        map.put(ArmorItem.Type.HELMET, 4);
                        map.put(ArmorItem.Type.BODY, 8);
                    }),
                    12,
                    SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
                    () -> Ingredient.ofItems(ModItems.FORTIFIED_ADAMANTINE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(ElementalsMod.MOD_ID, "fortified_adamantine"))),
                    7.0f,
                    0.1f
            ));

    //endregion

    //region Aerolite

    public static final RegistryEntry<ArmorMaterial> AEROLITE_ARMOR_MATERIAL = registerArmorMaterial("aerolite",
            () -> new ArmorMaterial(
                    Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                        map.put(ArmorItem.Type.BOOTS, 4);
                        map.put(ArmorItem.Type.LEGGINGS, 7);
                        map.put(ArmorItem.Type.CHESTPLATE, 8);
                        map.put(ArmorItem.Type.HELMET, 4);
                        map.put(ArmorItem.Type.BODY, 12);
                    }),
                    20,
                    SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
                    () -> Ingredient.ofItems(ModItems.ADAMANTINE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(ElementalsMod.MOD_ID, "aerolite"))),
                    7.0f,
                    0.1f
            ));

    //endregion

    //region Ethereal

    public static final RegistryEntry<ArmorMaterial> ETHEREAL_ARMOR_MATERIAL = registerArmorMaterial("ethereal",
            () -> new ArmorMaterial(
                    Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                        map.put(ArmorItem.Type.BOOTS, 5);
                        map.put(ArmorItem.Type.LEGGINGS, 8);
                        map.put(ArmorItem.Type.CHESTPLATE, 9);
                        map.put(ArmorItem.Type.HELMET, 5);
                        map.put(ArmorItem.Type.BODY, 15);
                    }),
                    25,
                    SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
                    () -> Ingredient.ofItems(ModItems.ADAMANTINE_INGOT),
                    List.of(new ArmorMaterial.Layer(Identifier.of(ElementalsMod.MOD_ID, "ethereal"))),
                    8.0f,
                    0.2f
            ));

    //endregion

    private static RegistryEntry<ArmorMaterial> registerArmorMaterial(String name, Supplier<ArmorMaterial> material) {
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(ElementalsMod.MOD_ID, name), material.get());
    }
}
