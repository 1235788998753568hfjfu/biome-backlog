package com.minecraftabnormals.biome_vote_losers.client.render;

import com.minecraftabnormals.biome_vote_losers.BiomeVoteLosers;
import com.minecraftabnormals.biome_vote_losers.client.ModModelLayers;
import com.minecraftabnormals.biome_vote_losers.client.model.TumbleweedModel;
import com.minecraftabnormals.biome_vote_losers.world.level.entity.Tumbleweed;
import com.mojang.blaze3d.vertex.PoseStack;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;

public class TumbleweedRender extends EntityRenderer<Tumbleweed> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(BiomeVoteLosers.MODID, "textures/entity/tumbleweed.png");

    protected final TumbleweedModel model;

    public TumbleweedRender(EntityRendererProvider.Context context) {
        super(context);

        this.shadowRadius = 0.2F;
        this.model = new TumbleweedModel(context.bakeLayer(ModModelLayers.TUMBLEWEED));
    }

    @Override
    public void render(Tumbleweed tumbleweed, float yaw, float alpha, PoseStack stack, MultiBufferSource bufferSource, int light) {
        stack.pushPose();

        this.model.setupAnim(tumbleweed, 0.0F, 0.0F, 0, -tumbleweed.getWindDirection(), tumbleweed.getRoll());
        final var consumer = bufferSource.getBuffer(this.model.renderType(this.getTextureLocation(tumbleweed)));
        this.model.renderToBuffer(stack, consumer, light, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);

        stack.popPose();

        super.render(tumbleweed, yaw, alpha, stack, bufferSource, light);
    }

    @Override
    public ResourceLocation getTextureLocation(Tumbleweed p_114482_) {
        return TEXTURE;
    }
}
