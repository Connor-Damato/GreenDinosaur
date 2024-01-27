package net.SUNYPolyGDC.Green_Dinosaur_Mod.item;

import net.SUNYPolyGDC.Green_Dinosaur_Mod.GreenDinosaurMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.SUNYPolyGDC.Green_Dinosaur_Mod.block.ModBlocks;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GreenDinosaurMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> GREEN_DINO_TAB =
            CREATIVE_MODE_TABS.register("green_dino_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.EXAMPLE_ITEM.get()))
                    .title(Component.translatable("creativetab.green_dino_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.EXAMPLE_ITEM.get());

                        pOutput.accept(ModBlocks.EXAMPLE_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
