package com.yillia.farming.register;

import com.yillia.farming.YilliaFarming;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import javax.imageio.spi.RegisterableService;

public class ModItems {
    public static final CreativeModeTab FARMING_TAB = new CreativeModeTab(YilliaFarming.MOD_ID) {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(Items.CARROT);
        }
    };

    public static final DeferredRegister<Item> ITEMS = DeferredRegister
            .create(ForgeRegistries.ITEMS, YilliaFarming.MOD_ID);

    //crop item
    public static final RegistryObject<Item> CABBAGE = ITEMS.register("cabbage", () -> new Item(new Item.Properties().tab(ModItems.FARMING_TAB).food(ModFoods.CABBAGE)));
    public static final RegistryObject<Item> CABBAGE_SEEDS = ITEMS.register("cabbage_seeds", () -> new ItemNameBlockItem(ModBlocks.CABBAGE.get(), new Item.Properties().tab(ModItems.FARMING_TAB)));
    public static final RegistryObject<Item> CORN = ITEMS.register("corn", () -> new Item(new Item.Properties()))
    public static final RegistryObject<Item> CUCUMBER = ITEMS.register("cucumber", () -> new Item(new Item.Properties().tab(ModItems.FARMING_TAB).food(ModFoods.CUCUMBER)));
    public static final RegistryObject<Item> CUCUMBER_SEEDS = ITEMS.register("cucumber_seeds", () -> new ItemNameBlockItem(ModBlocks.CUCUMBERS.get(), new Item.Properties().tab(ModItems.FARMING_TAB)));
    public static final RegistryObject<Item> EGGPLANT = ITEMS.register("eggplant", () -> new Item(new Item.Properties().tab(ModItems.FARMING_TAB).food(ModFoods.EGGPLANT)));
    public static final RegistryObject<Item> EGGPLANT_SEEDS = ITEMS.register("eggplant_seeds", () -> new ItemNameBlockItem(ModBlocks.EGGPLANT.get(), new Item.Properties().tab(ModItems.FARMING_TAB)));
    public static final RegistryObject<Item> RICE = ITEMS.register("rice", () -> new Item(new Item.Properties().tab(ModItems.FARMING_TAB)));
    public static final RegistryObject<Item> RICE_SEEDS = ITEMS.register("rice_seeds", () -> new ItemNameBlockItem(ModBlocks.RICE.get(), new Item.Properties().tab(ModItems.FARMING_TAB)));
    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato", () -> new Item(new Item.Properties().tab(ModItems.FARMING_TAB).food(ModFoods.TOMATO)));
    public static final RegistryObject<Item> TOMATO_SEEDS = ITEMS.register("tomato_seeds", () -> new ItemNameBlockItem(ModBlocks.TOMATOES.get(), new Item.Properties().tab(ModItems.FARMING_TAB)));

    //giant crop item
    public static final RegistryObject<Item> GIANT_CARROT = ITEMS.register("giant_carrot", () -> new ItemNameBlockItem(ModBlocks.GIANT_CARROT.get(), new Item.Properties().tab(ModItems.FARMING_TAB)));
    public static final RegistryObject<Item> GIANT_POTATO = ITEMS.register("giant_potato", () -> new ItemNameBlockItem(ModBlocks.GIANT_POTATO.get(), new Item.Properties().tab(ModItems.FARMING_TAB)));
    public static final RegistryObject<Item> GIANT_BEETROOT = ITEMS.register("giant_beetroot", () -> new ItemNameBlockItem(ModBlocks.GIANT_BEETROOT.get(), new Item.Properties().tab(ModItems.FARMING_TAB)));
    public static final RegistryObject<Item> GIANT_CABBAGE = ITEMS.register("giant_cabbage", () -> new ItemNameBlockItem(ModBlocks.GIANT_CABBAGE.get(), new Item.Properties().tab(ModItems.FARMING_TAB)));
    public static final RegistryObject<Item> GIANT_TOMATO = ITEMS.register("giant_tomato", () -> new ItemNameBlockItem(ModBlocks.GIANT_TOMATO.get(), new Item.Properties().tab(ModItems.FARMING_TAB)));
    public static final RegistryObject<Item> GIANT_CUCUMBER = ITEMS.register("giant_cucumber", () -> new ItemNameBlockItem(ModBlocks.GIANT_CUCUMBER.get(), new Item.Properties().tab(ModItems.FARMING_TAB)));
    public static final RegistryObject<Item> GIANT_EGGPLANT = ITEMS.register("giant_eggplant", () -> new ItemNameBlockItem(ModBlocks.GIANT_EGGPLANT.get(), new Item.Properties().tab(ModItems.FARMING_TAB)));



    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
