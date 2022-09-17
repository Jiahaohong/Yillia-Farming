package com.yillia.farming.datagen;

import com.yillia.farming.YilliaFarming;
import com.yillia.farming.register.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.function.Function;

public class ModBlockStateProvider extends BlockStateProvider {
    public static final String BLOCK_FOLDER = "block/";

    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, YilliaFarming.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        crossCropBlock(ModBlocks.CABBAGE.get(), "cabbage_stage");
        cropBlock(ModBlocks.CORN.get(), "corn_stage");
        crossCropBlock(ModBlocks.CUCUMBERS.get(), "cucumbers_stage");
        crossCropBlock(ModBlocks.EGGPLANT.get(), "eggplants_stage");
        cropBlock(ModBlocks.RICE.get(), "rice_stage");
        crossCropBlock(ModBlocks.TOMATOES.get(), "tomatoes_stage");

//
//        sideBottomDownBlock(ModBlocks.GIANT_CARROT.get(), "giant_carrot", "giant_carrot");
//        sideBottomDownBlock(ModBlocks.GIANT_POTATO.get(), "giant_potato", "giant_potato");
//        sideBottomDownBlock(ModBlocks.GIANT_BEETROOT.get(), "giant_beetroot", "giant_beetroot");
//        sideBottomDownBlock(ModBlocks.GIANT_CABBAGE.get(), "giant_cabbage", "giant_cabbage");
//        sideBottomDownBlock(ModBlocks.GIANT_TOMATO.get(), "giant_tomato", "giant_tomato");
//        sideBottomDownBlock(ModBlocks.GIANT_CUCUMBER.get(), "giant_cucumber", "giant_cucumber");
//        sideBottomDownBlock(ModBlocks.GIANT_EGGPLANT.get(), "giant_eggplant", "giant_eggplant");
    }

    public void cropBlock(Block block, String name) {
        cropBlock(block, name, name);
    }

    public void cropBlock(Block block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> cropStates(state, block, modelName, textureName);
        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] cropStates(BlockState state, Block block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((CropBlock)block).getAgeProperty()),
                new ResourceLocation(YilliaFarming.MOD_ID, BLOCK_FOLDER + textureName + state.getValue(((CropBlock)block).getAgeProperty()))));
        return models;
    }

    public void crossCropBlock(Block block, String name) {
        crossCropBlock(block, name, name);
    }

    public void crossCropBlock(Block block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> crossCropStates(state, block, modelName, textureName);
        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] crossCropStates(BlockState state, Block block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().cross(modelName + state.getValue(((CropBlock)block).getAgeProperty()),
                new ResourceLocation(YilliaFarming.MOD_ID, BLOCK_FOLDER + textureName + state.getValue(((CropBlock)block).getAgeProperty()))));
        return models;
    }

    public void sideBottomDownBlock(Block block, String name) {
        sideBottomDownBlock(block, name, name);
    }

    public void sideBottomDownBlock(Block block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> sideBottomDownStates(state, block, modelName, textureName);
        getVariantBuilder(block).forAllStates(function);
    }

    public ConfiguredModel[] sideBottomDownStates(BlockState state, Block block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().cubeBottomTop(modelName,
                new ResourceLocation(YilliaFarming.MOD_ID, BLOCK_FOLDER + textureName + "_side"),
                new ResourceLocation(YilliaFarming.MOD_ID, BLOCK_FOLDER + textureName + "_bottom"),
                new ResourceLocation(YilliaFarming.MOD_ID, BLOCK_FOLDER + textureName + "_top")));
        return models;
    }



}
