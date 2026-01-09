package net.lonk.elementals.item;

import com.google.common.base.Suppliers;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    RUBY(2, 600, 6.0f, 3.0f, 16, () -> Ingredient.ofItems(ModItems.RUBY)),
    IGNITED_RUBY(3, 1300, 7.0f, 4.0f, 20, () -> Ingredient.ofItems(ModItems.IGNITED_RUBY)),

    SAPPHIRE(2, 300, 6.0f, 2.0f, 14, () -> Ingredient.ofItems(ModItems.SAPPHIRE)),
    DRIPPING_WET(2, 1200, 7.0f, 3.0f, 18, () -> Ingredient.ofItems(ModItems.DRIPPING_WET_SAPPHIRE)),

    ADAMANTINE(3, 1750, 7.0f, 3.0f, 15, () -> Ingredient.ofItems(ModItems.ADAMANTINE_INGOT)),
    FORTIFIED_ADAMANTINE(3, 2500, 7.0f, 4.0f, 12, () -> Ingredient.ofItems(ModItems.FORTIFIED_ADAMANTINE_INGOT)),

    AEROLITE(4, 3000, 8.0f, 4.0f, 20, () -> Ingredient.ofItems(ModItems.AEROLITE)),
    ETHEREAL(4, 4000, 9.0f, 5.0f, 25, () -> Ingredient.ofItems(ModItems.ETHEREAL_AEROLITE));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
