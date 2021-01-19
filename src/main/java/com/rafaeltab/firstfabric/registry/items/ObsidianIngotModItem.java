package com.rafaeltab.firstfabric.registry.items;

import com.rafaeltab.firstfabric.registry.ModItem;
import com.rafaeltab.firstfabric.registry.itemgroups.GeneralModItemGroup;
import net.minecraft.item.Item;

public class ObsidianIngotModItem extends ModItem {

    public static final Item ITEM = new Item(new Item.Settings().group(GeneralModItemGroup.GetItemGroup()));

    public ObsidianIngotModItem(){
        super.registerItem(ITEM, "obsidian_ingot");
    }
}