package com.rafaeltab.firstfabric.registry.blocks;

import com.rafaeltab.firstfabric.registry.ModBlock;
import com.rafaeltab.firstfabric.registry.itemgroups.GeneralModItemGroup;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.registry.Registry;

public class ObsidianBricksModBlock extends ModBlock {

    public static final Block BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL)
            .breakByTool(FabricToolTags.PICKAXES,3)
            .requiresTool()
            .strength(10.0f,100.0f)
            .sounds(BlockSoundGroup.METAL)
    );

    private static final BlockItem BLOCK_ITEM = new BlockItem(BLOCK, new Item
                    .Settings()
                    .group(GeneralModItemGroup.GetItemGroup()));

    public ObsidianBricksModBlock(){
        super.registerBlock(BLOCK, BLOCK_ITEM, "obsidian_bricks");
    }
}