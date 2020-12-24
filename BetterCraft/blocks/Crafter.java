package com.blastarrowcz.BetterCraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class Crafter extends Block {

    public Crafter() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(0.0f, 0.0f)
                .sound(SoundType.WOOD)
                .harvestLevel(0)
                .harvestTool(ToolType.AXE)
                .setRequiresTool()
        );
    }
}