package com.yillia.farming.register;


import com.yillia.farming.YilliaFarming;
import com.yillia.farming.block.*;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister
            .create(ForgeRegistries.BLOCKS, YilliaFarming.MOD_ID);

    //crop block
    public static final RegistryObject<Block> CABBAGE = BLOCKS.register("cabbage", () -> new CabbageBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noOcclusion()));
    public static final RegistryObject<Block> CORN = BLOCKS.register("corn", () -> new CabbageBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noOcclusion()));
    public static final RegistryObject<Block> CUCUMBERS = BLOCKS.register("cucumbers", () -> new CucumberBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noCollission()));
    public static final RegistryObject<Block> EGGPLANT = BLOCKS.register("eggplants", () -> new EggplantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> RICE = BLOCKS.register("rice", () -> new RiceBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> TOMATOES = BLOCKS.register("tomatoes", () -> new TomatoBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

    //giant crop drop block
    public static final RegistryObject<Block> GIANT_CARROT = BLOCKS.register("giant_carrot", () -> new Block(Block.Properties.of(Material.PLANT).sound(SoundType.CROP).strength(1f)));
    public static final RegistryObject<Block> GIANT_POTATO = BLOCKS.register("giant_potato", () -> new Block(Block.Properties.copy(GIANT_CARROT.get())));
    public static final RegistryObject<Block> GIANT_BEETROOT = BLOCKS.register("giant_beetroot", () -> new Block(BlockBehaviour.Properties.copy(GIANT_CARROT.get())));
    public static final RegistryObject<Block> GIANT_CABBAGE = BLOCKS.register("giant_cabbage", () -> new Block(BlockBehaviour.Properties.copy(GIANT_CARROT.get())));
    public static final RegistryObject<Block> GIANT_TOMATO = BLOCKS.register("giant_tomato", () -> new Block(BlockBehaviour.Properties.copy(GIANT_CARROT.get())));
    public static final RegistryObject<Block> GIANT_CUCUMBER = BLOCKS.register("giant_cucumber", () -> new Block(BlockBehaviour.Properties.copy(GIANT_CARROT.get())));
    public static final RegistryObject<Block> GIANT_EGGPLANT = BLOCKS.register("giant_eggplant", () -> new Block(BlockBehaviour.Properties.copy(GIANT_CARROT.get())));

    //giant crop block
    public static final RegistryObject<GiantCropBlock> GIANT_CARROT_CROP = BLOCKS.register("giant_carrot_crop", () -> new GiantCropBlock(BlockBehaviour.Properties.of(Material.PLANT).sound(SoundType.CROP).strength(1.0F)));
    public static final RegistryObject<GiantCropBlock> GIANT_CARROT_LEAVES = BLOCKS.register("giant_carrot_leaves", () -> new GiantCropBlock(Block.Properties.of(Material.PLANT).sound(SoundType.CROP).noCollission().instabreak()));
    public static final RegistryObject<GiantCropBlock> GIANT_POTATO_CROP = BLOCKS.register("giant_potato_crop", () -> new GiantCropBlock(BlockBehaviour.Properties.copy(ModBlocks.GIANT_CARROT_CROP.get())));
    public static final RegistryObject<GiantCropBlock> GIANT_POTATO_LEAVES = BLOCKS.register("giant_potato_leaves", () -> new GiantCropBlock(BlockBehaviour.Properties.copy(ModBlocks.GIANT_CARROT_LEAVES.get())));
    public static final RegistryObject<GiantCropBlock> GIANT_CABBAGE_CROP = BLOCKS.register("giant_cabbage_crop", () -> new GiantCropBlock(BlockBehaviour.Properties.copy(ModBlocks.GIANT_CARROT_CROP.get())));
    public static final RegistryObject<GiantCropBlock> GIANT_BEETROOT_CROP = BLOCKS.register("giant_beetroot_crop", () -> new GiantCropBlock(BlockBehaviour.Properties.copy(ModBlocks.GIANT_CARROT_CROP.get())));
    public static final RegistryObject<GiantCropBlock> GIANT_BEETROOT_LEAVES = BLOCKS.register("giant_beetroot_leaves", () -> new GiantCropBlock(BlockBehaviour.Properties.copy(ModBlocks.GIANT_CARROT_LEAVES.get())));
    public static final RegistryObject<GiantCropBlock> GIANT_TOMATO_CROP = BLOCKS.register("giant_tomato_crop", () -> new GiantCropBlock(BlockBehaviour.Properties.copy(ModBlocks.GIANT_CARROT_CROP.get())));
    public static final RegistryObject<GiantCropBlock> GIANT_TOMATO_LEAVES = BLOCKS.register("giant_tomato_leaves", () -> new GiantCropBlock(BlockBehaviour.Properties.copy(ModBlocks.GIANT_CARROT_LEAVES.get())));
    public static final RegistryObject<GiantCropBlock> GIANT_CUCUMBER_CROP = BLOCKS.register("giant_cucumber_crop", () -> new GiantCropBlock(BlockBehaviour.Properties.copy(ModBlocks.GIANT_CARROT_CROP.get())));
    public static final RegistryObject<GiantCropBlock> GIANT_CUCUMBER_LEAVES = BLOCKS.register("giant_cucumber_leaves", () -> new GiantCropBlock(BlockBehaviour.Properties.copy(ModBlocks.GIANT_CARROT_LEAVES.get())));
    public static final RegistryObject<GiantCropBlock> GIANT_EGGPLANT_CROP = BLOCKS.register("giant_eggplant_crop", () -> new GiantCropBlock(BlockBehaviour.Properties.copy(ModBlocks.GIANT_CARROT_CROP.get())));
    public static final RegistryObject<GiantCropBlock> GIANT_EGGPLANT_LEAVES = BLOCKS.register("giant_eggplant_leaves", () -> new GiantCropBlock(BlockBehaviour.Properties.copy(ModBlocks.GIANT_CARROT_LEAVES.get())));

    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
    }

    public static void setRenderType(FMLClientSetupEvent event) {
        //blocks model
        ItemBlockRenderTypes.setRenderLayer(CUCUMBERS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(TOMATOES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(CABBAGE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(RICE.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(EGGPLANT.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(GIANT_CARROT.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(GIANT_POTATO.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(GIANT_CABBAGE.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(GIANT_BEETROOT.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(GIANT_TOMATO.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(GIANT_CUCUMBER.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(GIANT_EGGPLANT.get(), RenderType.solid());

        ItemBlockRenderTypes.setRenderLayer(GIANT_CARROT_CROP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GIANT_CARROT_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GIANT_POTATO_CROP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GIANT_POTATO_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GIANT_CABBAGE_CROP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GIANT_BEETROOT_CROP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GIANT_BEETROOT_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GIANT_TOMATO_CROP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GIANT_TOMATO_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GIANT_CUCUMBER_CROP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GIANT_CUCUMBER_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GIANT_EGGPLANT_CROP.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(GIANT_EGGPLANT_LEAVES.get(), RenderType.cutout());

    }
}
