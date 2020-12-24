package com.blastarrowcz.BetterCraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class SteelBlock extends Block {

    public SteelBlock() {
        super(Block.Properties.create(Material.IRON)
            .hardnessAndResistance(6.0f, 40.0f)
            .sound(SoundType.METAL)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .setRequiresTool()
        );
    }
}
