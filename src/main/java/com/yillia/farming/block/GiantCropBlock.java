package com.yillia.farming.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.BlockState;

public class GiantCropBlock extends BushBlock {

    public GiantCropBlock(Properties properties) {
        super(properties);
    }

    public boolean canSurvive(BlockState state, LevelReader levelReader, BlockPos pos) {
        return levelReader.getBlockState(pos.below()).is(Blocks.FARMLAND)
                || levelReader.getBlockState(pos.below()).getBlock() instanceof GiantCropBlock;
    }
}
