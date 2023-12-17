package net.drcookie.dr_cookie_rpg_mod.item;

import net.drcookie.dr_cookie_rpg_mod.DrCookieRpgMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DrCookieRpgMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> DCRPG_RESOURCES_TAB = CREATIVE_MODE_TABS.register("dcrpg_resources_tab",
            () -> CreativeModeTab.builder().icon( () -> new ItemStack(ModItems.SWAMP_IRON_INGOT.get()))

                    .title(Component.translatable("creativetab.dcrpg_resources_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.SWAMPIRONRAW.get());
                        pOutput.accept(ModItems.SWAMP_IRON_INGOT.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {

        CREATIVE_MODE_TABS.register(eventBus);

    }

}
