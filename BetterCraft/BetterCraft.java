package com.blastarrowcz.BetterCraft;

import com.blastarrowcz.BetterCraft.entities.SlimeyEntity;
import com.blastarrowcz.BetterCraft.init.ModEntityTypes;
import com.blastarrowcz.BetterCraft.util.RegistryHandler;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("bettercraft")
public class BetterCraft
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "bettercraft";

    public BetterCraft() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        ModEntityTypes.ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        DeferredWorkQueue.runLater(()-> {
            GlobalEntityTypeAttributes.put(ModEntityTypes.SLIMEY.get(), SlimeyEntity.setCustomAttributes().create());
        });
    }

    private void doClientStuff(final FMLClientSetupEvent event) { }

    public static final ItemGroup TAB = new ItemGroup("bettercraft") {

        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.STEEL_INGOT.get());
        }
    };
}
