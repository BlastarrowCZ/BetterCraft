package com.blastarrowcz.BetterCraft.util;

import com.blastarrowcz.BetterCraft.BetterCraft;
import com.blastarrowcz.BetterCraft.client.render.SlimeyRenderer;
import com.blastarrowcz.BetterCraft.init.ModEntityTypes;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = BetterCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event ) {
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.SLIMEY.get(), SlimeyRenderer::new);
    }
}
