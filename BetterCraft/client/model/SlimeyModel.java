package com.blastarrowcz.BetterCraft.client.model;
import com.blastarrowcz.BetterCraft.entities.SlimeyEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.QuadrupedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class SlimeyModel<T extends SlimeyEntity> extends EntityModel<T> {
        private final ModelRenderer body;

        public SlimeyModel() {
            textureWidth = 16;
            textureHeight = 16;

            body = new ModelRenderer(this);
            body.setRotationPoint(0.0F, 22.0F, 0.0F);
            body.setTextureOffset(0, 0).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
      }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.body.rotateAngleX = ((float)Math.PI / 2F);
  }


    @Override
        public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
            body.render(matrixStack, buffer, packedLight, packedOverlay);

        }

        public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
            modelRenderer.rotateAngleX = x;
            modelRenderer.rotateAngleY = y;
            modelRenderer.rotateAngleZ = z;
        }
}
