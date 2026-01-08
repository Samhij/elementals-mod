package net.lonk.elementals.item;

import com.google.common.base.Suppliers;
import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    RUBY(BlockTags.INCORRECT_FOR_IRON_TOOL, 600, 6.0f, 3.0f, 16, () -> Ingredient.ofItems(ModItems.RUBY)),
    IGNITED_RUBY(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1300, 7.0f, 4.0f, 20, () -> Ingredient.ofItems(ModItems.IGNITED_RUBY)),

    SAPPHIRE(BlockTags.INCORRECT_FOR_IRON_TOOL, 300, 6.0f, 2.0f, 14, () -> Ingredient.ofItems(ModItems.SAPPHIRE)),
    DRIPPING_WET(BlockTags.INCORRECT_FOR_IRON_TOOL, 1200, 7.0f, 3.0f, 18, () -> Ingredient.ofItems(ModItems.DRIPPING_WET_SAPPHIRE)),

    ADAMANTINE(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1750, 7.0f, 3.0f, 15, () -> Ingredient.ofItems(ModItems.RUBY)),
    FORTIFIED_ADAMANTINE(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2500, 7.0f, 4.0f, 12, () -> Ingredient.ofItems(ModItems.IGNITED_RUBY)),

    AEROLITE(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 3000, 8.0f, 4.0f, 20, () -> Ingredient.ofItems(ModItems.RUBY)),
    ETHEREAL(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 4000, 9.0f, 5.0f, 25, () -> Ingredient.ofItems(ModItems.IGNITED_RUBY)),

    ;

    private final TagKey<Block> incorrectBlocksForDrops;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterials(TagKey<Block> inverseTag, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
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
