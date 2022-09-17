package com.yillia.farming.register;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties CABBAGE = vegetable(3).build();
    public static final FoodProperties CUCUMBER = vegetable(2).build();
    public static final FoodProperties EGGPLANT = vegetable(1).build();
    public static final FoodProperties TOMATO = vegetable(1).build();
    public static final FoodProperties CORN = vegetable(2).build();

    private static FoodProperties.Builder vegetable(int p_150384_) {
        return (new FoodProperties.Builder()).nutrition(p_150384_).saturationMod(0.6F);
    }
}
