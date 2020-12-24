package com.blastarrowcz.BetterCraft.events;

import com.blastarrowcz.BetterCraft.BetterCraft;
import com.blastarrowcz.BetterCraft.blocks.Crafter;
import net.minecraft.block.*;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.rmi.activation.Activatable;

@Mod.EventBusSubscriber(modid = BetterCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ModClientEvents {}