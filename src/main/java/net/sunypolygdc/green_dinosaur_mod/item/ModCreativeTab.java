package net.sunypolygdc.green_dinosaur_mod.item;

import net.sunypolygdc.green_dinosaur_mod.GreenDinosaurMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.sunypolygdc.green_dinosaur_mod.block.ModBlocks;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GreenDinosaurMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> GREEN_DINO_TAB =
            CREATIVE_MODE_TABS.register("green_dino_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.EXAMPLE_ITEM.get()))
                    .title(Component.translatable("creativetab.green_dino_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        // Fruits
                        pOutput.accept(ModItems.DINO_FRUIT.get());
                        pOutput.accept(ModItems.BLUE_FRUIT.get());

                        // Armors
                        pOutput.accept(ModItems.COPPER_DINO_ARMOR.get());
                        pOutput.accept(ModItems.IRON_DINO_ARMOR.get());
                        pOutput.accept(ModItems.GOLD_DINO_ARMOR.get());
                        pOutput.accept(ModItems.DIAMOND_DINO_ARMOR.get());
                        pOutput.accept(ModItems.NETHERITE_DINO_ARMOR.get());
                        pOutput.accept(ModItems.CREATIVE_DINO_ARMOR.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
