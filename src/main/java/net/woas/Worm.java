package net.woas;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.world.World;

public class Worm extends SheepEntity {

    public Worm(EntityType<? extends SheepEntity> entityType, World world) {
        super(entityType, world);
    }

}