package net.gameknite.molten_netherite.item;

import net.gameknite.molten_netherite.MoltenNetherite;
import net.gameknite.molten_netherite.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoltenNetherite.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CRYSTAL_TAB = CREATIVE_MODE_TABS.register("crystal_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DRAGON_CRYSTAL.get()))
                    .title(Component.translatable("creativetab.molten_netherite.crystal_items_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.CRYSTAL_SHARD.get());
                        output.accept(ModItems.DRAGON_CRYSTAL.get());
                        output.accept(ModItems.DRAGONS_BLADE.get());
                    })

                    .build());

    public static final RegistryObject<CreativeModeTab> CRYSTAL_BLOCKS_TAB = CREATIVE_MODE_TABS.register("crystal_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.CRYSTAL_ORE.get()))
                    .withTabsBefore(CRYSTAL_TAB.getId())
                    .title(Component.translatable("creativetab.molten_netherite.crystal_blocks_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.CRYSTAL_ORE.get());
                    })

                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
