package com.blastarrowcz.BetterCraft.client.render;

import com.blastarrowcz.BetterCraft.BetterCraft;
import com.blastarrowcz.BetterCraft.client.model.SlimeyModel;
import com.blastarrowcz.BetterCraft.entities.SlimeyEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class SlimeyRenderer extends MobRenderer<SlimeyEntity, SlimeyModel<SlimeyEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(BetterCraft.MOD_ID, "textures/entity/slimey.png");

    public SlimeyRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new com.blastarrowcz.BetterCraft.client.model.SlimeyModel<>(), 0.7f);
    }

    @Override
    public ResourceLocation getEntityTexture(SlimeyEntity entity) {
        return TEXTURE;
    }
}