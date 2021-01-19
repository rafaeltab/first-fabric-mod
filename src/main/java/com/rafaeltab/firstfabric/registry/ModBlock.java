package com.rafaeltab.firstfabric.registry;

import com.rafaeltab.firstfabric.FirstMod;
import com.rafaeltab.firstfabric.registry.blocks.ObsidianBricksModBlock;
import com.rafaeltab.firstfabric.registry.items.ObsidianIngotModItem;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public abstract class ModBlock  {
    public static void registerBlocks(){
        new ObsidianBricksModBlock();
    }

    protected void registerBlock(Block block, BlockItem blockItem, String path){
        Registry.register(Registry.BLOCK, new Identifier(FirstMod.MOD_ID, path), block);
        Registry.register(Registry.ITEM, new Identifier(FirstMod.MOD_ID, path), blockItem);
    }
}