package net.lonk.elementals.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.lonk.elementals.item.ModItems;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup provider) {
        getOrCreateTagBuilder(ItemTags.BEACON_PAYMENT_ITEMS)
                .add(ModItems.RUBY)
                .add(ModItems.IGNITED_RUBY);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.RUBY_SWORD);

        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.RUBY_PICKAXE);

        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.RUBY_SHOVEL);

        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.RUBY_AXE);

        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.RUBY_HOE);

        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR);
        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR);
        getOrCreateTagBuilder(ItemTags.LEG_ARMOR);
        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR);
    }
}
