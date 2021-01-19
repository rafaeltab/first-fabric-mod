package com.rafaeltab.firstfabric;

import com.rafaeltab.firstfabric.registry.ModBlock;
import com.rafaeltab.firstfabric.registry.ModItem;
import net.fabricmc.api.ModInitializer;

public class FirstMod implements ModInitializer {

    public static final String MOD_ID = "rafaeltabfirst";

    @Override
    public void onInitialize() {
        ModItem.registerItems();
        ModBlock.registerBlocks();
    }
}
