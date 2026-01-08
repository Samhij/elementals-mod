package net.lonk.elementals.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.lonk.elementals.item.ModItems;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
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
                .add(ModItems.IGNITED_RUBY)
                .add(ModItems.SAPPHIRE)
                .add(ModItems.DRIPPING_WET_SAPPHIRE)
                .add(ModItems.ADAMANTINE_INGOT)
                .add(ModItems.FORTIFIED_ADAMANTINE_INGOT)
                .add(ModItems.AEROLITE)
                .add(ModItems.ETHEREAL_AEROLITE)
        ;

        //region Tools

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.RUBY_SWORD)
                .add(ModItems.IGNITED_RUBY_SWORD)
                .add(ModItems.SAPPHIRE_SWORD)
                .add(ModItems.ADAMANTINE_SWORD)
                .add(ModItems.FORTIFIED_ADAMANTINE_SWORD)
                .add(ModItems.AEROLITE_SWORD)
                .add(ModItems.ETHEREAL_SWORD)
        ;

        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.RUBY_PICKAXE)
                .add(ModItems.IGNITED_RUBY_PICKAXE)
                .add(ModItems.SAPPHIRE_PICKAXE)
                .add(ModItems.ADAMANTINE_PICKAXE)
                .add(ModItems.FORTIFIED_ADAMANTINE_PICKAXE)
                .add(ModItems.AEROLITE_PICKAXE)
                .add(ModItems.ETHEREAL_PICKAXE)
        ;

        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.RUBY_SHOVEL)
                .add(ModItems.IGNITED_RUBY_SHOVEL)
                .add(ModItems.SAPPHIRE_SHOVEL)
                .add(ModItems.ADAMANTINE_SHOVEL)
                .add(ModItems.FORTIFIED_ADAMANTINE_SHOVEL)
                .add(ModItems.AEROLITE_SHOVEL)
                .add(ModItems.ETHEREAL_SHOVEL)
        ;

        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.RUBY_AXE)
                .add(ModItems.IGNITED_RUBY_AXE)
                .add(ModItems.SAPPHIRE_AXE)
                .add(ModItems.ADAMANTINE_AXE)
                .add(ModItems.FORTIFIED_ADAMANTINE_AXE)
                .add(ModItems.AEROLITE_AXE)
                .add(ModItems.ETHEREAL_AXE)
        ;

        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.RUBY_HOE)
                .add(ModItems.IGNITED_RUBY_HOE)
                .add(ModItems.SAPPHIRE_HOE)
                .add(ModItems.ADAMANTINE_HOE)
                .add(ModItems.FORTIFIED_ADAMANTINE_HOE)
                .add(ModItems.AEROLITE_HOE)
                .add(ModItems.ETHEREAL_HOE)
        ;

        //endregion

        //region Armor

        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR)
                .add(ModItems.RUBY_HELMET)
                .add(ModItems.IGNITED_RUBY_HELMET)
                .add(ModItems.SAPPHIRE_HELMET)
                .add(ModItems.DRIPPING_WET_HELMET)
                .add(ModItems.ADAMANTINE_HELMET)
                .add(ModItems.FORTIFIED_ADAMANTINE_HELMET)
                .add(ModItems.AEROLITE_HELMET)
                .add(ModItems.ETHEREAL_HELMET)
        ;

        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR)
                .add(ModItems.RUBY_CHESTPLATE)
                .add(ModItems.IGNITED_RUBY_CHESTPLATE)
                .add(ModItems.SAPPHIRE_CHESTPLATE)
                .add(ModItems.DRIPPING_WET_CHESTPLATE)
                .add(ModItems.ADAMANTINE_CHESTPLATE)
                .add(ModItems.FORTIFIED_ADAMANTINE_CHESTPLATE)
                .add(ModItems.AEROLITE_CHESTPLATE)
                .add(ModItems.ETHEREAL_CHESTPLATE)
        ;

        getOrCreateTagBuilder(ItemTags.LEG_ARMOR)
                .add(ModItems.RUBY_LEGGINGS)
                .add(ModItems.IGNITED_RUBY_LEGGINGS)
                .add(ModItems.SAPPHIRE_LEGGINGS)
                .add(ModItems.DRIPPING_WET_LEGGINGS)
                .add(ModItems.ADAMANTINE_LEGGINGS)
                .add(ModItems.FORTIFIED_ADAMANTINE_LEGGINGS)
                .add(ModItems.AEROLITE_LEGGINGS)
                .add(ModItems.ETHEREAL_LEGGINGS)
        ;

        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR)
                .add(ModItems.RUBY_BOOTS)
                .add(ModItems.IGNITED_RUBY_BOOTS)
                .add(ModItems.SAPPHIRE_BOOTS)
                .add(ModItems.DRIPPING_WET_BOOTS)
                .add(ModItems.ADAMANTINE_BOOTS)
                .add(ModItems.FORTIFIED_ADAMANTINE_BOOTS)
                .add(ModItems.AEROLITE_BOOTS)
                .add(ModItems.ETHEREAL_BOOTS)
        ;

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .addTag(ItemTags.HEAD_ARMOR)
                .addTag(ItemTags.CHEST_ARMOR)
                .addTag(ItemTags.LEG_ARMOR)
                .addTag(ItemTags.FOOT_ARMOR)
        ;

        //endregion
    }
}
