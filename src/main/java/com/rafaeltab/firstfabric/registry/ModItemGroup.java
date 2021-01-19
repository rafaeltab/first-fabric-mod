package com.rafaeltab.firstfabric.registry;

import com.rafaeltab.firstfabric.FirstMod;
import com.rafaeltab.firstfabric.registry.itemgroups.GeneralModItemGroup;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import java.util.function.Supplier;

public abstract class ModItemGroup {
    public static void buildGroups(){
        new GeneralModItemGroup();
    }

    protected ItemGroup buildGroup(Supplier<ItemStack> itemStack, String path){
        return FabricItemGroupBuilder.build(new Identifier(FirstMod.MOD_ID, path), itemStack);
    }
}