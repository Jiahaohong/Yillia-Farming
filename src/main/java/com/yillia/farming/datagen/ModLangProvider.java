package com.yillia.farming.datagen;

import com.yillia.farming.YilliaFarming;
import com.yillia.farming.register.ModBlocks;
import com.yillia.farming.register.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLangProvider {
    public static class EN_US extends LanguageProvider {
        public EN_US(DataGenerator gen) {
            super(gen, YilliaFarming.MOD_ID, "en_us");
        }

        @Override
        protected void addTranslations() {
            //crop item
            add(ModItems.CABBAGE.get(), "Cabbage");
            add(ModItems.CABBAGE_SEEDS.get(), "Cabbage Seed");

            add(ModItems.CORN.get(), "Corn");
            add(ModItems.CORN_SEEDS.get(), "Corn Seed");

            add(ModItems.CUCUMBER.get(), "Cucumber");
            add(ModItems.CUCUMBER_SEEDS.get(), "Cucumber Seed");

            add(ModItems.EGGPLANT.get(), "Eggplant");
            add(ModItems.EGGPLANT_SEEDS.get(), "Eggplant Seeds");

            add(ModItems.RICE.get(), "Rice");
            add(ModItems.RICE_SEEDS.get(), "Rice Seeds");

            add(ModItems.TOMATO.get(), "Tomato");
            add(ModItems.TOMATO_SEEDS.get(), "Tomato Seed");

            //giant crop drop item
            add(ModItems.GIANT_CARROT.get(), "Giant Carrot");
            add(ModBlocks.GIANT_CARROT.get(), "Giant Carrot");

            add(ModItems.GIANT_POTATO.get(), "Giant Potato");
            add(ModBlocks.GIANT_POTATO.get(), "Giant Potato");

            add(ModItems.GIANT_BEETROOT.get(), "Giant Beetroot");
            add(ModBlocks.GIANT_BEETROOT.get(), "Giant Beetroot");

            add(ModItems.GIANT_CABBAGE.get(), "Giant Cabbage");
            add(ModBlocks.GIANT_CABBAGE.get(), "Giant Cabbage");

            add(ModItems.GIANT_TOMATO.get(), "Giant Tomato");
            add(ModBlocks.GIANT_TOMATO.get(), "Giant Tomato");

            add(ModItems.GIANT_CUCUMBER.get(), "Giant Cucumber");
            add(ModBlocks.GIANT_CUCUMBER.get(), "Giant Cucumber");

            add(ModItems.GIANT_EGGPLANT.get(), "Giant Eggplant");
            add(ModBlocks.GIANT_EGGPLANT.get(), "Giant Eggplant");

            add(ModItems.FARMING_TAB.getDisplayName().getString(), "Yillia's Farming");
        }
    }

    public static class ZH_CN extends LanguageProvider {
        public ZH_CN(DataGenerator gen) {
            super(gen, YilliaFarming.MOD_ID, "zh_cn");
        }

        @Override
        protected void addTranslations() {
            //crop
            add(ModItems.CABBAGE.get(), "卷心菜");
            add(ModItems.CABBAGE_SEEDS.get(), "卷心菜种子");

            add(ModItems.CORN.get(), "玉米");
            add(ModItems.CORN_SEEDS.get(), "玉米种子");

            add(ModItems.CUCUMBER.get(), "黄瓜");
            add(ModItems.CUCUMBER_SEEDS.get(), "黄瓜种子");

            add(ModItems.EGGPLANT.get(), "茄子");
            add(ModItems.EGGPLANT_SEEDS.get(), "茄子种子");

            add(ModItems.RICE.get(), "水稻");
            add(ModItems.RICE_SEEDS.get(), "水稻种子");

            add(ModItems.TOMATO.get(), "番茄");
            add(ModItems.TOMATO_SEEDS.get(), "番茄种子");

            //giant crop drop item
            add(ModItems.GIANT_CARROT.get(), "巨型胡萝卜");
            add(ModBlocks.GIANT_CARROT.get(), "巨型胡萝卜");

            add(ModItems.GIANT_POTATO.get(), "巨型土豆");
            add(ModBlocks.GIANT_POTATO.get(), "巨型土豆");

            add(ModItems.GIANT_BEETROOT.get(), "巨型甜菜根");
            add(ModBlocks.GIANT_BEETROOT.get(), "巨型甜菜根");

            add(ModItems.GIANT_CABBAGE.get(), "巨型卷心菜");
            add(ModBlocks.GIANT_CABBAGE.get(), "巨型卷心菜");

            add(ModItems.GIANT_TOMATO.get(), "巨型番茄");
            add(ModBlocks.GIANT_TOMATO.get(), "巨型番茄");

            add(ModItems.GIANT_CUCUMBER.get(), "巨型黄瓜");
            add(ModBlocks.GIANT_CUCUMBER.get(), "巨型黄瓜");

            add(ModItems.GIANT_EGGPLANT.get(), "巨型茄子");
            add(ModBlocks.GIANT_EGGPLANT.get(), "巨型茄子");

            add(ModItems.FARMING_TAB.getDisplayName().getString(), "伊丽娅的农业");
        }
    }

}
