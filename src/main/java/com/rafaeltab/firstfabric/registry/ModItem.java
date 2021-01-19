package com.rafaeltab.firstfabric.registry;

import com.rafaeltab.firstfabric.FirstMod;
import com.rafaeltab.firstfabric.registry.items.ObsidianDustModItem;
import com.rafaeltab.firstfabric.registry.items.ObsidianIngotModItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public abstract class ModItem {
    // Looking for a block? I put them inside the ModBlock classes :)
    public static void registerItems(){
        new ObsidianDustModItem();
        new ObsidianIngotModItem();
    }

    protected void registerItem(Item item, String path){
        Registry.register(Registry.ITEM, new Identifier(FirstMod.MOD_ID, path), item);
    }
}
