package net.lonk.elementals.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.lonk.elementals.block.ModBlocks;
import net.lonk.elementals.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockModelGenerators) {
        blockModelGenerators.registerSimpleCubeAll(ModBlocks.RUBY_ORE);
        blockModelGenerators.registerSimpleCubeAll(ModBlocks.RUBY_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerators) {
        itemModelGenerators.register(ModItems.RUBY, Models.GENERATED);
        itemModelGenerators.register(ModItems.IGNITED_RUBY, Models.GENERATED);

        itemModelGenerators.register(ModItems.RUBY_SWORD, Models.HANDHELD);
        itemModelGenerators.register(ModItems.RUBY_PICKAXE, Models.HANDHELD);
        itemModelGenerators.register(ModItems.RUBY_SHOVEL, Models.HANDHELD);
        itemModelGenerators.register(ModItems.RUBY_AXE, Models.HANDHELD);
        itemModelGenerators.register(ModItems.RUBY_HOE, Models.HANDHELD);

        itemModelGenerators.register(ModItems.STAR_FRAGMENT, Models.GENERATED);
        itemModelGenerators.register(ModItems.FIRE_STAR, Models.GENERATED);
    }
}
