package net.lonk.elementals.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.lonk.elementals.block.ModBlocks;
import net.lonk.elementals.item.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.*;
import net.minecraft.recipe.book.RecipeCategory;
import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        //region Smelting & Blasting

        offerSmelting(exporter, List.of(ModBlocks.RUBY_ORE), RecipeCategory.MISC, ModItems.RUBY, 0.25f, 200, "ruby");
        offerBlasting(exporter, List.of(ModBlocks.RUBY_ORE), RecipeCategory.MISC, ModItems.RUBY, 0.25f, 100, "ruby");

        offerSmelting(exporter, List.of(ModBlocks.SAPPHIRE_ORE), RecipeCategory.MISC, ModItems.SAPPHIRE, 0.25f, 200, "sapphire");
        offerBlasting(exporter, List.of(ModBlocks.SAPPHIRE_ORE), RecipeCategory.MISC, ModItems.SAPPHIRE, 0.25f, 100, "sapphire");

        offerSmelting(exporter, List.of(ModItems.ADAMANT, ModBlocks.ADAMANT_ORE), RecipeCategory.MISC, ModItems.ADAMANTINE_INGOT, 0.25f, 200, "adamantine");
        offerBlasting(exporter, List.of(ModItems.ADAMANT, ModBlocks.ADAMANT_ORE), RecipeCategory.MISC, ModItems.ADAMANTINE_INGOT, 0.25f, 100, "adamantine");

        offerSmelting(exporter, List.of(ModBlocks.AEROLITE_ORE), RecipeCategory.MISC, ModItems.AEROLITE, 0.25f, 200, "aerolite");
        offerBlasting(exporter, List.of(ModBlocks.AEROLITE_ORE), RecipeCategory.MISC, ModItems.AEROLITE, 0.25f, 100, "aerolite");

        //endregion


        //region Ruby Items

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RUBY, RecipeCategory.MISC, ModBlocks.RUBY_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STAR_FRAGMENT, 8)
                .pattern("RRR")
                .pattern("RNR")
                .pattern("RRR")
                .input('R', ModItems.RUBY)
                .input('N', Items.NETHER_STAR)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.FIRE_STAR)
                .input(ModItems.STAR_FRAGMENT, 8)
                .criterion(hasItem(ModItems.STAR_FRAGMENT), conditionsFromItem(ModItems.STAR_FRAGMENT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IGNITED_RUBY, 8)
                .pattern("RRR")
                .pattern("RSR")
                .pattern("RRR")
                .input('R', ModItems.RUBY)
                .input('S', ModItems.STAR_FRAGMENT)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter);

        //endregion

        //region Ruby Tools & Armor

        offerSwordRecipe(exporter, ModItems.RUBY_SWORD, ModItems.RUBY);
        offerPickaxeRecipe(exporter, ModItems.RUBY_PICKAXE, ModItems.RUBY);
        offerShovelRecipe(exporter, ModItems.RUBY_SHOVEL, ModItems.RUBY);
        offerAxeRecipe(exporter, ModItems.RUBY_AXE, ModItems.RUBY);
        offerHoeRecipe(exporter, ModItems.RUBY_HOE, ModItems.RUBY);

        offerHelmetRecipe(exporter, ModItems.RUBY_HELMET, ModItems.RUBY);
        offerChestplateRecipe(exporter, ModItems.RUBY_CHESTPLATE, ModItems.RUBY);
        offerLeggingsRecipe(exporter, ModItems.RUBY_LEGGINGS, ModItems.RUBY);
        offerBootsRecipe(exporter, ModItems.RUBY_BOOTS, ModItems.RUBY);

        //endregion

        //region Ignited Ruby Tools & Armor

        offerSwordRecipe(exporter, ModItems.IGNITED_RUBY_SWORD, ModItems.IGNITED_RUBY);
        offerPickaxeRecipe(exporter, ModItems.IGNITED_RUBY_PICKAXE, ModItems.IGNITED_RUBY);
        offerShovelRecipe(exporter, ModItems.IGNITED_RUBY_SHOVEL, ModItems.IGNITED_RUBY);
        offerAxeRecipe(exporter, ModItems.IGNITED_RUBY_AXE, ModItems.IGNITED_RUBY);
        offerHoeRecipe(exporter, ModItems.IGNITED_RUBY_HOE, ModItems.IGNITED_RUBY);

        offerHelmetRecipe(exporter, ModItems.IGNITED_RUBY_HELMET, ModItems.IGNITED_RUBY);
        offerChestplateRecipe(exporter, ModItems.IGNITED_RUBY_CHESTPLATE, ModItems.IGNITED_RUBY);
        offerLeggingsRecipe(exporter, ModItems.IGNITED_RUBY_LEGGINGS, ModItems.IGNITED_RUBY);
        offerBootsRecipe(exporter, ModItems.IGNITED_RUBY_BOOTS, ModItems.IGNITED_RUBY);

        //endregion


        //region Sapphire Items

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.SAPPHIRE, RecipeCategory.MISC, ModBlocks.SAPPHIRE_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TIDEBOUND_RELIC, 8)
                .pattern("SPS")
                .pattern("SNS")
                .pattern("SPS")
                .input('S', ModItems.SAPPHIRE)
                .input('P', Blocks.PRISMARINE)
                .input('N', Items.NAUTILUS_SHELL)
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WATER_SHELL)
                .input(ModItems.TIDEBOUND_RELIC, 8)
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DRIPPING_WET_SAPPHIRE, 8)
                .pattern("SSS")
                .pattern("STS")
                .pattern("SSS")
                .input('S', ModItems.SAPPHIRE)
                .input('T', ModItems.TIDEBOUND_RELIC)
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                .offerTo(exporter);

        //endregion

        //region Sapphire Tools & Armor

        offerSwordRecipe(exporter, ModItems.SAPPHIRE_SWORD, ModItems.SAPPHIRE);
        offerPickaxeRecipe(exporter, ModItems.SAPPHIRE_PICKAXE, ModItems.SAPPHIRE);
        offerShovelRecipe(exporter, ModItems.SAPPHIRE_SHOVEL, ModItems.SAPPHIRE);
        offerAxeRecipe(exporter, ModItems.SAPPHIRE_AXE, ModItems.SAPPHIRE);
        offerHoeRecipe(exporter, ModItems.SAPPHIRE_HOE, ModItems.SAPPHIRE);

        offerHelmetRecipe(exporter, ModItems.SAPPHIRE_HELMET, ModItems.SAPPHIRE);
        offerChestplateRecipe(exporter, ModItems.SAPPHIRE_CHESTPLATE, ModItems.SAPPHIRE);
        offerLeggingsRecipe(exporter, ModItems.SAPPHIRE_LEGGINGS, ModItems.SAPPHIRE);
        offerBootsRecipe(exporter, ModItems.SAPPHIRE_BOOTS, ModItems.SAPPHIRE);

        //endregion

        //region Drippin' Wet Tools & Armor

        offerSwordRecipe(exporter, ModItems.DRIPPING_WET_SWORD, ModItems.DRIPPING_WET_SAPPHIRE);
        offerPickaxeRecipe(exporter, ModItems.DRIPPING_WET_PICKAXE, ModItems.DRIPPING_WET_SAPPHIRE);
        offerShovelRecipe(exporter, ModItems.DRIPPING_WET_SHOVEL, ModItems.DRIPPING_WET_SAPPHIRE);
        offerAxeRecipe(exporter, ModItems.DRIPPING_WET_AXE, ModItems.DRIPPING_WET_SAPPHIRE);
        offerHoeRecipe(exporter, ModItems.DRIPPING_WET_HOE, ModItems.DRIPPING_WET_SAPPHIRE);

        offerHelmetRecipe(exporter, ModItems.DRIPPING_WET_HELMET, ModItems.DRIPPING_WET_SAPPHIRE);
        offerChestplateRecipe(exporter, ModItems.DRIPPING_WET_CHESTPLATE, ModItems.DRIPPING_WET_SAPPHIRE);
        offerLeggingsRecipe(exporter, ModItems.DRIPPING_WET_LEGGINGS, ModItems.DRIPPING_WET_SAPPHIRE);
        offerBootsRecipe(exporter, ModItems.DRIPPING_WET_BOOTS, ModItems.DRIPPING_WET_SAPPHIRE);

        //endregion


        //region Adamantine Items

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.ADAMANTINE_INGOT, RecipeCategory.MISC, ModBlocks.ADAMANTINE_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BEDROCK_CATALYST, 8)
                .pattern("OAO")
                .pattern("ACA")
                .pattern("OAO")
                .input('A', ModItems.ADAMANTINE_INGOT)
                .input('O', Blocks.OBSIDIAN)
                .input('C', Blocks.CRYING_OBSIDIAN)
                .criterion(hasItem(ModItems.ADAMANTINE_INGOT), conditionsFromItem(ModItems.ADAMANTINE_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.FORTIFIED_ADAMANTINE_INGOT, 8)
                .pattern("AAA")
                .pattern("ABA")
                .pattern("AAA")
                .input('A', ModItems.ADAMANTINE_INGOT)
                .input('B', ModItems.BEDROCK_CATALYST)
                .criterion(hasItem(ModItems.ADAMANTINE_INGOT), conditionsFromItem(ModItems.ADAMANTINE_INGOT))
                .offerTo(exporter);

        //endregion

        //region Adamantine Tools & Armor

        offerSwordRecipe(exporter, ModItems.ADAMANTINE_SWORD, ModItems.ADAMANTINE_INGOT);
        offerPickaxeRecipe(exporter, ModItems.ADAMANTINE_PICKAXE, ModItems.ADAMANTINE_INGOT);
        offerShovelRecipe(exporter, ModItems.ADAMANTINE_SHOVEL, ModItems.ADAMANTINE_INGOT);
        offerAxeRecipe(exporter, ModItems.ADAMANTINE_AXE, ModItems.ADAMANTINE_INGOT);
        offerHoeRecipe(exporter, ModItems.ADAMANTINE_HOE, ModItems.ADAMANTINE_INGOT);

        offerHelmetRecipe(exporter, ModItems.ADAMANTINE_HELMET, ModItems.ADAMANTINE_INGOT);
        offerChestplateRecipe(exporter, ModItems.ADAMANTINE_CHESTPLATE, ModItems.ADAMANTINE_INGOT);
        offerLeggingsRecipe(exporter, ModItems.ADAMANTINE_LEGGINGS, ModItems.ADAMANTINE_INGOT);
        offerBootsRecipe(exporter, ModItems.ADAMANTINE_BOOTS, ModItems.ADAMANTINE_INGOT);

        //endregion

        //region Fortified Adamantine Tools & Armor

        offerSwordRecipe(exporter, ModItems.FORTIFIED_ADAMANTINE_SWORD, ModItems.FORTIFIED_ADAMANTINE_INGOT);
        offerPickaxeRecipe(exporter, ModItems.FORTIFIED_ADAMANTINE_PICKAXE, ModItems.FORTIFIED_ADAMANTINE_INGOT);
        offerShovelRecipe(exporter, ModItems.FORTIFIED_ADAMANTINE_SHOVEL, ModItems.FORTIFIED_ADAMANTINE_INGOT);
        offerAxeRecipe(exporter, ModItems.FORTIFIED_ADAMANTINE_AXE, ModItems.FORTIFIED_ADAMANTINE_INGOT);
        offerHoeRecipe(exporter, ModItems.FORTIFIED_ADAMANTINE_HOE, ModItems.FORTIFIED_ADAMANTINE_INGOT);

        offerHelmetRecipe(exporter, ModItems.FORTIFIED_ADAMANTINE_HELMET, ModItems.FORTIFIED_ADAMANTINE_INGOT);
        offerChestplateRecipe(exporter, ModItems.FORTIFIED_ADAMANTINE_CHESTPLATE, ModItems.FORTIFIED_ADAMANTINE_INGOT);
        offerLeggingsRecipe(exporter, ModItems.FORTIFIED_ADAMANTINE_LEGGINGS, ModItems.FORTIFIED_ADAMANTINE_INGOT);
        offerBootsRecipe(exporter, ModItems.FORTIFIED_ADAMANTINE_BOOTS, ModItems.FORTIFIED_ADAMANTINE_INGOT);

        //endregion


        //region Aerolite Items

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.AEROLITE, RecipeCategory.MISC, ModBlocks.AEROLITE_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.END_CORE)
                .pattern("ADA")
                .pattern("DED")
                .pattern("ADA")
                .input('A', ModBlocks.AEROLITE_BLOCK)
                .input('D', Items.DRAGON_BREATH)
                .input('E', Blocks.DRAGON_HEAD)
                .criterion(hasItem(ModItems.AEROLITE), conditionsFromItem(ModItems.AEROLITE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ETHEREAL_AEROLITE)
                .pattern("AOA")
                .pattern("OXO")
                .pattern("AOA")
                .input('A', ModBlocks.AEROLITE_BLOCK)
                .input('O', Blocks.CHORUS_FLOWER)
                .input('X', ModItems.END_CORE)
                .criterion(hasItem(ModItems.AEROLITE), conditionsFromItem(ModItems.AEROLITE))
                .offerTo(exporter);

        //endregion

        //region Aerolite Tools & Armor

        offerSwordRecipe(exporter, ModItems.AEROLITE_SWORD, ModItems.AEROLITE);
        offerPickaxeRecipe(exporter, ModItems.AEROLITE_PICKAXE, ModItems.AEROLITE);
        offerShovelRecipe(exporter, ModItems.AEROLITE_SHOVEL, ModItems.AEROLITE);
        offerAxeRecipe(exporter, ModItems.AEROLITE_AXE, ModItems.AEROLITE);
        offerHoeRecipe(exporter, ModItems.AEROLITE_HOE, ModItems.AEROLITE);

        offerHelmetRecipe(exporter, ModItems.AEROLITE_HELMET, ModItems.AEROLITE);
        offerChestplateRecipe(exporter, ModItems.AEROLITE_CHESTPLATE, ModItems.AEROLITE);
        offerLeggingsRecipe(exporter, ModItems.AEROLITE_LEGGINGS, ModItems.AEROLITE);
        offerBootsRecipe(exporter, ModItems.AEROLITE_BOOTS, ModItems.AEROLITE);

        //endregion

        //region Ethereal Tools & Armor

        offerSwordRecipe(exporter, ModItems.ETHEREAL_SWORD, ModItems.ETHEREAL_AEROLITE);
        offerPickaxeRecipe(exporter, ModItems.ETHEREAL_PICKAXE, ModItems.ETHEREAL_AEROLITE);
        offerShovelRecipe(exporter, ModItems.ETHEREAL_SHOVEL, ModItems.ETHEREAL_AEROLITE);
        offerAxeRecipe(exporter, ModItems.ETHEREAL_AXE, ModItems.ETHEREAL_AEROLITE);
        offerHoeRecipe(exporter, ModItems.ETHEREAL_HOE, ModItems.ETHEREAL_AEROLITE);

        offerHelmetRecipe(exporter, ModItems.ETHEREAL_HELMET, ModItems.ETHEREAL_AEROLITE);
        offerChestplateRecipe(exporter, ModItems.ETHEREAL_CHESTPLATE, ModItems.ETHEREAL_AEROLITE);
        offerLeggingsRecipe(exporter, ModItems.ETHEREAL_LEGGINGS, ModItems.ETHEREAL_AEROLITE);
        offerBootsRecipe(exporter, ModItems.ETHEREAL_BOOTS, ModItems.ETHEREAL_AEROLITE);

        //endregion
    }

    //region Tool Helper Methods

    private static void offerSwordRecipe(Consumer<RecipeJsonProvider> exporter, Item swordItem, ItemConvertible ingredient) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, swordItem)
                .pattern(" R ")
                .pattern(" R ")
                .pattern(" S ")
                .input('R', ingredient)
                .input('S', Items.STICK)
                .criterion(hasItem(ingredient), conditionsFromItem(ingredient))
                .offerTo(exporter);
    }

    private static void offerPickaxeRecipe(Consumer<RecipeJsonProvider> exporter, Item pickaxeItem, ItemConvertible ingredient) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, pickaxeItem)
                .pattern("RRR")
                .pattern(" S ")
                .pattern(" S ")
                .input('R', ingredient)
                .input('S', Items.STICK)
                .criterion(hasItem(ingredient), conditionsFromItem(ingredient))
                .offerTo(exporter);
    }

    private static void offerShovelRecipe(Consumer<RecipeJsonProvider> exporter, Item shovelItem, ItemConvertible ingredient) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, shovelItem)
                .pattern(" R ")
                .pattern(" S ")
                .pattern(" S ")
                .input('R', ingredient)
                .input('S', Items.STICK)
                .criterion(hasItem(ingredient), conditionsFromItem(ingredient))
                .offerTo(exporter);
    }

    private static void offerAxeRecipe(Consumer<RecipeJsonProvider> exporter, Item axeItem, ItemConvertible ingredient) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, axeItem)
                .pattern("RR ")
                .pattern("RS ")
                .pattern(" S ")
                .input('R', ingredient)
                .input('S', Items.STICK)
                .criterion(hasItem(ingredient), conditionsFromItem(ingredient))
                .offerTo(exporter);
    }

    private static void offerHoeRecipe(Consumer<RecipeJsonProvider> exporter, Item hoeItem, ItemConvertible ingredient) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, hoeItem)
                .pattern("RR ")
                .pattern(" S ")
                .pattern(" S ")
                .input('R', ingredient)
                .input('S', Items.STICK)
                .criterion(hasItem(ingredient), conditionsFromItem(ingredient))
                .offerTo(exporter);
    }

    //endregion

    //region Armor Helper Methods

    private static void offerHelmetRecipe(Consumer<RecipeJsonProvider> exporter, Item helmetItem, ItemConvertible ingredient) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, helmetItem)
                .pattern("RRR")
                .pattern("R R")
                .input('R', ingredient)
                .criterion(hasItem(ingredient), conditionsFromItem(ingredient))
                .offerTo(exporter);
    }

    private static void offerChestplateRecipe(Consumer<RecipeJsonProvider> exporter, Item chestplateItem, ItemConvertible ingredient) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, chestplateItem)
                .pattern("R R")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ingredient)
                .criterion(hasItem(ingredient), conditionsFromItem(ingredient))
                .offerTo(exporter);
    }

    private static void offerLeggingsRecipe(Consumer<RecipeJsonProvider> exporter, Item leggingsItem, ItemConvertible ingredient) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, leggingsItem)
                .pattern("RRR")
                .pattern("R R")
                .pattern("R R")
                .input('R', ingredient)
                .criterion(hasItem(ingredient), conditionsFromItem(ingredient))
                .offerTo(exporter);
    }

    private static void offerBootsRecipe(Consumer<RecipeJsonProvider> exporter, Item bootsItem, ItemConvertible ingredient) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, bootsItem)
                .pattern("R R")
                .pattern("R R")
                .input('R', ingredient)
                .criterion(hasItem(ingredient), conditionsFromItem(ingredient))
                .offerTo(exporter);
    }


    //endregion
}
