package net.gameknite.molten_netherite.item;

import net.gameknite.molten_netherite.MoltenNetherite;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
         DeferredRegister.create(ForgeRegistries.ITEMS, MoltenNetherite.MOD_ID);

    public static final RegistryObject<Item> CRYSTAL_SHARD = ITEMS.register("crystal_shard",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRAGONS_BLADE = ITEMS.register("dragons_blade",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRAGON_CRYSTAL = ITEMS.register("dragon_crystal",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
