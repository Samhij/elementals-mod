package net.lonk.elementals.item;

import net.lonk.elementals.ElementalsMod;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    RUBY("ruby", 15, new int[]{2, 5, 6, 2}, 16, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0F, 0.0F, () -> Ingredient.ofItems(ModItems.RUBY)),
    IGNITED_RUBY("ignited_ruby", 20, new int[]{3, 6, 7, 3}, 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 5.0F, 0.0F, () -> Ingredient.ofItems(ModItems.IGNITED_RUBY)),
    SAPPHIRE("sapphire", 14, new int[]{2, 5, 6, 2}, 14, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0F, 0.0F, () -> Ingredient.ofItems(ModItems.SAPPHIRE)),
    DRIPPING_WET("dripping_wet", 18, new int[]{3, 6, 7, 3}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 5.0F, 0.0F, () -> Ingredient.ofItems(ModItems.DRIPPING_WET_SAPPHIRE)),
    ADAMANTINE("adamantine", 15, new int[]{4, 7, 8, 4}, 15, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 6.0F, 0.0F, () -> Ingredient.ofItems(ModItems.ADAMANTINE_INGOT)),
    FORTIFIED_ADAMANTINE("fortified_adamantine", 12, new int[]{5, 7, 9, 4}, 12, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 7.0F, 0.1F, () -> Ingredient.ofItems(ModItems.FORTIFIED_ADAMANTINE_INGOT)),
    AEROLITE("aerolite", 20, new int[]{4, 7, 8, 4}, 20, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 7.0F, 0.1F, () -> Ingredient.ofItems(ModItems.AEROLITE)),
    ETHEREAL("ethereal", 25, new int[]{5, 8, 9, 5}, 25, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 8.0F, 0.2F, () -> Ingredient.ofItems(ModItems.ETHEREAL_AEROLITE));

    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.getEquipmentSlot().getEntitySlotId()] * this.durabilityMultiplier;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return this.protectionAmounts[type.getEquipmentSlot().getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return Identifier.of(ElementalsMod.MOD_ID, this.name).toString();
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
