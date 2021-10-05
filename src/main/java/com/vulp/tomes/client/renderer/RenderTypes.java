package com.vulp.tomes.client.renderer;

import net.minecraft.client.renderer.RenderState;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.vertex.VertexFormat;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class RenderTypes extends RenderType {

    public RenderTypes(String nameIn, VertexFormat formatIn, int drawModeIn, int bufferSizeIn, boolean useDelegateIn, boolean needsSortingIn, Runnable setupTaskIn, Runnable clearTaskIn) {
        super(nameIn, formatIn, drawModeIn, bufferSizeIn, useDelegateIn, needsSortingIn, setupTaskIn, clearTaskIn);
    }

    public static RenderType getSpectral(ResourceLocation locationIn, boolean outlineIn) {
        RenderState.TextureState renderstate$texturestate = new RenderState.TextureState(locationIn, false, false);
        return makeType("spectral", DefaultVertexFormats.ENTITY, 7, 256, false, true, RenderType.State.getBuilder().texture(renderstate$texturestate).transparency(TRANSLUCENT_TRANSPARENCY).writeMask(COLOR_DEPTH_WRITE).fog(BLACK_FOG).alpha(RenderState.HALF_ALPHA).cull(CULL_DISABLED).overlay(OVERLAY_ENABLED).build(outlineIn));
    }

}
