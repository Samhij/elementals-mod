package net.lonk.elementals.item;

import com.google.common.base.Suppliers;
import net.lonk.elementals.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.TagKey;
import java.util.function.Supplier;

public enum ModToolTiers implements ToolMaterial {
    RUBY(ModTags.Blocks.INCORRECT_FOR_RUBY_TOOL, 600, 6.0f, 3.0f, 16, () -> Ingredient.ofItems(ModItems.RUBY));

    private final TagKey<Block> incorrectBlocksForDrops;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final Supplier<Ingredient> repairIngredient;

    ModToolTiers(TagKey<Block> inverseTag, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.incorrectBlocksForDrops = inverseTag;
        this.uses = itemDurability;
        this.speed = miningSpeed;
        this.damage = attackDamage;
        this.enchantmentValue = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    @Override
    public int getDurability() {
        return this.uses;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.speed;
    }

    @Override
    public float getAttackDamage() {
        return damage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.incorrectBlocksForDrops;
    }

    @Override
    public int getEnchantability() {
        return this.enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
