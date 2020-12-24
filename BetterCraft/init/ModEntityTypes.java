package com.blastarrowcz.BetterCraft.init;

import com.blastarrowcz.BetterCraft.BetterCraft;
import com.blastarrowcz.BetterCraft.entities.SlimeyEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, BetterCraft.MOD_ID);

//types
    public static final RegistryObject<EntityType<SlimeyEntity>> SLIMEY = ENTITY_TYPES.register("slimey", ()-> EntityType.Builder.create(SlimeyEntity::new, EntityClassification.CREATURE)
        .size(0.25f, 0.25f)
        .build(new ResourceLocation(BetterCraft.MOD_ID, "slimey").toString()));
}
