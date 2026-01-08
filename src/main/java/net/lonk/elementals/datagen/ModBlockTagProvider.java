package net.lonk.elementals.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.lonk.elementals.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup provider) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.SAPPHIRE_ORE)
                .add(ModBlocks.SAPPHIRE_BLOCK)
                .add(ModBlocks.ADAMANT_ORE)
                .add(ModBlocks.ADAMANTINE_BLOCK)
                .add(ModBlocks.AEROLITE_ORE)
                .add(ModBlocks.AEROLITE_BLOCK)
        ;

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.SAPPHIRE_ORE)
                .add(ModBlocks.SAPPHIRE_BLOCK)
        ;

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.ADAMANT_ORE)
                .add(ModBlocks.ADAMANTINE_BLOCK)
                .add(ModBlocks.AEROLITE_ORE)
                .add(ModBlocks.AEROLITE_BLOCK)
        ;

        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.SAPPHIRE_BLOCK)
                .add(ModBlocks.ADAMANTINE_BLOCK)
                .add(ModBlocks.AEROLITE_BLOCK)
        ;
    }
}
