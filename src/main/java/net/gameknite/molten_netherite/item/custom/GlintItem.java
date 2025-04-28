package net.gameknite.molten_netherite.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class GlintItem extends Item {
    public GlintItem(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return true; // Always has the glint
    }
}
