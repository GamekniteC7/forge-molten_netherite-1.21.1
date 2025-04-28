package net.gameknite.molten_netherite.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties CRYSTALLIZED_GOLDEN_APPLE = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(1.2F)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 200, 3), 1.0F)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 6000, 1), 1.0F)
            .effect(new MobEffectInstance(MobEffects.ABSORPTION, 2400, 3), 1.0F)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2400, 1), 1.0F)
            .alwaysEdible()
            .build();
}
