package com.yillia.farming;

import com.mojang.logging.LogUtils;
import com.yillia.farming.register.ModBlocks;
import com.yillia.farming.register.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(YilliaFarming.MOD_ID)
public class YilliaFarming {
    public static final String MOD_ID = "yillia_farming";
    private static final Logger LOGGER = LogUtils.getLogger();

    public YilliaFarming() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.register(bus);
        ModItems.register(bus);

        bus.addListener(ModBlocks::setRenderType);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
