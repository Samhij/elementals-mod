package net.lonk.elementals.block;

import net.lonk.elementals.ElementalsMod;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    //region Ruby

    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.copy(Blocks.NETHER_GOLD_ORE)));

    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK)));

    //endregion

    //region Sapphire

    public static final Block SAPPHIRE_ORE = registerBlock("sapphire_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.create().sounds(BlockSoundGroup.GLASS).strength(3f).slipperiness(0.98f).requiresTool()));

    public static final Block SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            new Block(AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK)));

    //endregion

    //region Adamantine

    public static final Block ADAMANT_ORE = registerBlock("adamant_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_DIAMOND_ORE)));

    public static final Block ADAMANTINE_BLOCK = registerBlock("adamantine_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK)));

    //endregion

    //region Aerolite

    public static final Block AEROLITE_ORE = registerBlock("aerolite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.create().mapColor(MapColor.PALE_YELLOW).strength(5.5f, 20f).requiresTool()));

    public static final Block AEROLITE_BLOCK = registerBlock("aerolite_block",
            new Block(AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK)));

    //endregion

    //region Helper Methods

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(ElementalsMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(ElementalsMod.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }

    public static void register() {
        ElementalsMod.LOGGER.info("Registering Blocks for " + ElementalsMod.MOD_ID);
    }

    //endregion
}
