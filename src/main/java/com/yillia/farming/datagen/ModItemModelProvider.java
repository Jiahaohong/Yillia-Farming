package com.yillia.farming.datagen;

import com.yillia.farming.YilliaFarming;
import com.yillia.farming.register.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, YilliaFarming.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        cropItem(ModItems.CABBAGE.get());
        cropItem(ModItems.CABBAGE_SEEDS.get());

        cropItem(ModItems.CUCUMBER.get());
        cropItem(ModItems.CUCUMBER_SEEDS.get());

        cropItem(ModItems.EGGPLANT.get());
        cropItem(ModItems.EGGPLANT_SEEDS.get());

        cropItem(ModItems.RICE.get());
        cropItem(ModItems.RICE_SEEDS.get());

        cropItem(ModItems.TOMATO.get());
        cropItem(ModItems.TOMATO_SEEDS.get());

        //giant crop drop item
        cropItem(ModItems.GIANT_CARROT.get());
        cropItem(ModItems.GIANT_POTATO.get());
        cropItem(ModItems.GIANT_BEETROOT.get());
        cropItem(ModItems.GIANT_CABBAGE.get());
        cropItem(ModItems.GIANT_TOMATO.get());
        cropItem(ModItems.GIANT_CUCUMBER.get());
        cropItem(ModItems.GIANT_EGGPLANT.get());
    }


    private ItemModelBuilder originalItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated"))
                .texture("layer0", new ResourceLocation("minecraft", "item/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder simpleItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated"))
                .texture("layer0", new ResourceLocation(YilliaFarming.MOD_ID, "item/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder blockItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation(YilliaFarming.MOD_ID, "block/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder cropItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated"))
                .texture("layer0", new ResourceLocation(YilliaFarming.MOD_ID, "item/crop/" + item.getRegistryName().getPath()));
    }
}
