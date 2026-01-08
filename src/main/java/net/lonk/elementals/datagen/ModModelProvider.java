package net.lonk.elementals.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.lonk.elementals.block.ModBlocks;
import net.lonk.elementals.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockModelGenerator) {
        blockModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_ORE);
        blockModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_BLOCK);

        blockModelGenerator.registerSimpleCubeAll(ModBlocks.SAPPHIRE_ORE);
        blockModelGenerator.registerSimpleCubeAll(ModBlocks.SAPPHIRE_BLOCK);

        blockModelGenerator.registerSimpleCubeAll(ModBlocks.ADAMANT_ORE);
        blockModelGenerator.registerSimpleCubeAll(ModBlocks.ADAMANTINE_BLOCK);

        blockModelGenerator.registerSimpleCubeAll(ModBlocks.AEROLITE_ORE);
        blockModelGenerator.registerSimpleCubeAll(ModBlocks.AEROLITE_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        //region Ruby Items

        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.IGNITED_RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.STAR_FRAGMENT, Models.GENERATED);
        itemModelGenerator.register(ModItems.FIRE_STAR, Models.GENERATED);

        //endregion

        //region Ruby Tools & Armor

        itemModelGenerator.register(ModItems.RUBY_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.RUBY_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.RUBY_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.RUBY_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.RUBY_BOOTS);

        //endregion &

        //region Ignited Ruby Tools & Armor

        itemModelGenerator.register(ModItems.IGNITED_RUBY_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IGNITED_RUBY_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IGNITED_RUBY_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IGNITED_RUBY_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IGNITED_RUBY_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.IGNITED_RUBY_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.IGNITED_RUBY_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.IGNITED_RUBY_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.IGNITED_RUBY_BOOTS);

        //endregion

        //region Sapphire Items

        itemModelGenerator.register(ModItems.SAPPHIRE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DRIPPING_WET_SAPPHIRE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TIDEBOUND_RELIC, Models.GENERATED);
        itemModelGenerator.register(ModItems.WATER_SHELL, Models.GENERATED);

        //endregion

        //region Sapphire Tools & Armor

        itemModelGenerator.register(ModItems.SAPPHIRE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.SAPPHIRE_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.SAPPHIRE_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.SAPPHIRE_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.SAPPHIRE_BOOTS);

        //endregion

        //region Drippin' Wet Tools & Armor

        itemModelGenerator.register(ModItems.DRIPPING_WET_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DRIPPING_WET_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DRIPPING_WET_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DRIPPING_WET_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DRIPPING_WET_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.DRIPPING_WET_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.DRIPPING_WET_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.DRIPPING_WET_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.DRIPPING_WET_BOOTS);


        //endregion

        //region Adamantine Items

        itemModelGenerator.register(ModItems.ADAMANTINE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.FORTIFIED_ADAMANTINE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ADAMANT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BEDROCK_CATALYST, Models.GENERATED);

        //endregion

        //region Adamantine Tools & Armor

        itemModelGenerator.register(ModItems.ADAMANTINE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADAMANTINE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADAMANTINE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADAMANTINE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADAMANTINE_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.ADAMANTINE_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ADAMANTINE_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ADAMANTINE_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ADAMANTINE_BOOTS);

        //endregion

        //region Fortified Adamantine Tools & Armor

        itemModelGenerator.register(ModItems.FORTIFIED_ADAMANTINE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FORTIFIED_ADAMANTINE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FORTIFIED_ADAMANTINE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FORTIFIED_ADAMANTINE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FORTIFIED_ADAMANTINE_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.FORTIFIED_ADAMANTINE_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.FORTIFIED_ADAMANTINE_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.FORTIFIED_ADAMANTINE_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.FORTIFIED_ADAMANTINE_BOOTS);

        //endregion

        //region Aerolite Items

        itemModelGenerator.register(ModItems.AEROLITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ETHEREAL_AEROLITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.END_CORE, Models.GENERATED);

        //endregion

        //region Aerolite Tools & Armor

        itemModelGenerator.register(ModItems.AEROLITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AEROLITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AEROLITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AEROLITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AEROLITE_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.AEROLITE_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.AEROLITE_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.AEROLITE_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.AEROLITE_BOOTS);

        //endregion

        //region Ethereal Tools & Armor

        itemModelGenerator.register(ModItems.ETHEREAL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ETHEREAL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ETHEREAL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ETHEREAL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ETHEREAL_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.ETHEREAL_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ETHEREAL_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ETHEREAL_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ETHEREAL_BOOTS);

        //endregion
    }
}
