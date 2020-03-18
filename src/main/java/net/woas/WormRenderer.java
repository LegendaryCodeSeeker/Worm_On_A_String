package net.woas;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.SheepEntityModel;
import net.minecraft.util.Identifier;

public class WormRenderer extends MobEntityRenderer<WormRenderer, SheepEntityModel<Worm>> {

    public WormRenderer(EntityRenderDispatcher renderManager) {
        super(renderManager, new SheepEntityModel<>(), 1);
    }

    @Override
    public Identifier getTexture(WormRenderer entity) {
        return null;
    }

}