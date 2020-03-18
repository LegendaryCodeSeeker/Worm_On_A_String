package net.woas;

import net.fabricmc.fabric.api.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityCategory;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Initer {
    
    public static EntityType<Worm> Worm;

    public static void init() {
        Worm = Registry.register( Registry.ENTITY_TYPE,new Identifier("woas", "worm"),FabricEntityTypeBuilder.create(EntityCategory.AMBIENT, Worm::new).size(EntityDimensions.changing(0.25f, 0.25f)).build());
    }
}