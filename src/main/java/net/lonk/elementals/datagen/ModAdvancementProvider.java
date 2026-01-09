package net.lonk.elementals.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.lonk.elementals.item.ModItems;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModAdvancementProvider extends FabricAdvancementProvider {
    public ModAdvancementProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateAdvancement(Consumer<Advancement> consumer) {
        // Advancement that triggers when you obtain an Ignited Ruby Hoe
        Advancement ignitedRubyHoe = Advancement.Builder.create()
                .display(
                        ModItems.IGNITED_RUBY_HOE,
                        Text.translatable("advancements.elementals.ignited_ruby_hoe.title"),
                        Text.translatable("advancements.elementals.ignited_ruby_hoe.description"),
                        Identifier.of("minecraft", "textures/gui/advancements/backgrounds/stone.png"),
                        AdvancementFrame.CHALLENGE,
                        true,
                        true,
                        false
                )
                .criterion("ignited_ruby_hoe", InventoryChangedCriterion.Conditions.items(ModItems.IGNITED_RUBY_HOE))
                .build(consumer, "elementals/ignited_ruby_hoe");
    }
}
