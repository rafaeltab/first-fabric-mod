package com.rafaeltab.firstfabric.registry.itemgroups;

import com.rafaeltab.firstfabric.exceptions.ItemGroupNotBuildException;
import com.rafaeltab.firstfabric.registry.ModItemGroup;
import com.rafaeltab.firstfabric.registry.items.ObsidianIngotModItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class GeneralModItemGroup extends ModItemGroup {
    private static ItemGroup ITEM_GROUP;

    public GeneralModItemGroup(){
        ITEM_GROUP = super.buildGroup(() -> {
            return new ItemStack(ObsidianIngotModItem.ITEM);
        }, "general");
    }

    /** builds the item groups if not build yet! */
    public static ItemGroup GetItemGroup() {
        if(ITEM_GROUP == null){
            ModItemGroup.buildGroups();

            if(ITEM_GROUP == null){
                throw new ItemGroupNotBuildException("General Item Group is not being build by ModItemGroup. Please add our constructor to the buildGroups method");
            }
        }

        return ITEM_GROUP;
    }
}