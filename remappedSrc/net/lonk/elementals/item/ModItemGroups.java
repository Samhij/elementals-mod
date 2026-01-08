package net.lonk.elementals.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.lonk.elementals.ElementalsMod;
import net.lonk.elementals.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup FIRE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(ElementalsMod.MOD_ID, "fire_items"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("creativetab.fire_items"))
                    .icon(() -> new ItemStack(ModItems.RUBY))
                    .entries((itemDisplayParameters, output) -> {
                        output.add(ModItems.RUBY);
                        output.add(ModItems.IGNITED_RUBY);

                        output.add(ModItems.RUBY_SWORD);
                        output.add(ModItems.RUBY_PICKAXE);
                        output.add(ModItems.RUBY_SHOVEL);
                        output.add(ModItems.RUBY_AXE);
                        output.add(ModItems.RUBY_HOE);

                        output.add(ModItems.STAR_FRAGMENT);
                        output.add(ModItems.FIRE_STAR);

                        output.add(ModBlocks.RUBY_ORE);
                        output.add(ModBlocks.RUBY_BLOCK);
                    }).build());

    public static void register() {
        ElementalsMod.LOGGER.info("Registering Item Groups for " + ElementalsMod.MOD_ID);
    }
}
