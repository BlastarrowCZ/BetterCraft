package com.blastarrowcz.BetterCraft.blocks;

import com.blastarrowcz.BetterCraft.BetterCraft;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(BetterCraft.TAB));
    }
}
