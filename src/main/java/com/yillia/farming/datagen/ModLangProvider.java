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
            add(ModItems.CABBAGE.get(), "?????????");
            add(ModItems.CABBAGE_SEEDS.get(), "???????????????");

            add(ModItems.CORN.get(), "??????");
            add(ModItems.CORN_SEEDS.get(), "????????????");

            add(ModItems.CUCUMBER.get(), "??????");
            add(ModItems.CUCUMBER_SEEDS.get(), "????????????");

            add(ModItems.EGGPLANT.get(), "??????");
            add(ModItems.EGGPLANT_SEEDS.get(), "????????????");

            add(ModItems.RICE.get(), "??????");
            add(ModItems.RICE_SEEDS.get(), "????????????");

            add(ModItems.TOMATO.get(), "??????");
            add(ModItems.TOMATO_SEEDS.get(), "????????????");

            //giant crop drop item
            add(ModItems.GIANT_CARROT.get(), "???????????????");
            add(ModBlocks.GIANT_CARROT.get(), "???????????????");

            add(ModItems.GIANT_POTATO.get(), "????????????");
            add(ModBlocks.GIANT_POTATO.get(), "????????????");

            add(ModItems.GIANT_BEETROOT.get(), "???????????????");
            add(ModBlocks.GIANT_BEETROOT.get(), "???????????????");

            add(ModItems.GIANT_CABBAGE.get(), "???????????????");
            add(ModBlocks.GIANT_CABBAGE.get(), "???????????????");

            add(ModItems.GIANT_TOMATO.get(), "????????????");
            add(ModBlocks.GIANT_TOMATO.get(), "????????????");

            add(ModItems.GIANT_CUCUMBER.get(), "????????????");
            add(ModBlocks.GIANT_CUCUMBER.get(), "????????????");

            add(ModItems.GIANT_EGGPLANT.get(), "????????????");
            add(ModBlocks.GIANT_EGGPLANT.get(), "????????????");

            add(ModItems.FARMING_TAB.getDisplayName().getString(), "??????????????????");
        }
    }

}
