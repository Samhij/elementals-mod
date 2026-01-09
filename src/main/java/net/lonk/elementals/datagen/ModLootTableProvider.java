package net.lonk.elementals.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.lonk.elementals.block.ModBlocks;
import net.lonk.elementals.item.ModItems;
import net.minecraft.registry.RegistryWrapper;
import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.RUBY_BLOCK);
        addDrop(ModBlocks.SAPPHIRE_BLOCK);
        addDrop(ModBlocks.ADAMANTINE_BLOCK);
        addDrop(ModBlocks.AEROLITE_BLOCK);

        this.addDrop(ModBlocks.RUBY_ORE, block -> oreDrops(ModBlocks.RUBY_ORE, ModItems.RUBY));
        this.addDrop(ModBlocks.SAPPHIRE_ORE, block -> oreDrops(ModBlocks.SAPPHIRE_ORE, ModItems.SAPPHIRE));
        this.addDrop(ModBlocks.ADAMANT_ORE, block -> oreDrops(ModBlocks.ADAMANT_ORE, ModItems.ADAMANT));
        this.addDrop(ModBlocks.AEROLITE_ORE, block -> oreDrops(ModBlocks.AEROLITE_ORE, ModItems.AEROLITE));
    }
}
