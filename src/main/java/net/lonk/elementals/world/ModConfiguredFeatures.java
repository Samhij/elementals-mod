package net.lonk.elementals.world;

import net.lonk.elementals.ElementalsMod;
import net.lonk.elementals.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> RUBY_ORE_KEY = registerKey("ruby_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SAPPHIRE_ORE_KEY = registerKey("sapphire_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ADAMANT_ORE_KEY = registerKey("adamant_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> AEROLITE_ORE_KEY = registerKey("aerolite_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest netherReplaceables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);
        RuleTest iceReplaceables = new TagMatchRuleTest(BlockTags.ICE);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest endReplaceables = new BlockMatchRuleTest(Blocks.END_STONE);

        List<OreFeatureConfig.Target> netherOres = List.of(
                OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.RUBY_ORE.getDefaultState())
        );

        List<OreFeatureConfig.Target> iceOres = List.of(
                OreFeatureConfig.createTarget(iceReplaceables, ModBlocks.SAPPHIRE_ORE.getDefaultState())
        );

        List<OreFeatureConfig.Target> overworldOres = List.of(
                OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.ADAMANT_ORE.getDefaultState())
        );

        List<OreFeatureConfig.Target> endOres = List.of(
                OreFeatureConfig.createTarget(endReplaceables, ModBlocks.AEROLITE_ORE.getDefaultState())
        );

        register(context, RUBY_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherOres, 6));
        register(context, SAPPHIRE_ORE_KEY, Feature.ORE, new OreFeatureConfig(iceOres, 8));
        register(context, ADAMANT_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldOres, 6));
        register(context, AEROLITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(endOres, 4));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(ElementalsMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context, RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
