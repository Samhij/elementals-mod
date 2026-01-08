package net.lonk.elementals;

import net.fabricmc.api.ModInitializer;
import net.lonk.elementals.block.ModBlocks;
import net.lonk.elementals.item.ModItemGroups;
import net.lonk.elementals.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ElementalsMod implements ModInitializer {
    public static final String MOD_ID = "elementals";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItemGroups.register();

        ModItems.register();
        ModBlocks.register();
    }
}
