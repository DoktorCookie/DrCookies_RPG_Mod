package net.drcookie.dr_cookie_rpg_mod.item;

import net.drcookie.dr_cookie_rpg_mod.DrCookieRpgMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS , DrCookieRpgMod.MOD_ID);

    public static final RegistryObject<Item> SWAMPIRONRAW = ITEMS.register("swampironraw",
            () -> new Item(new Item.Properties()));

    public  static  final  RegistryObject<Item> SWAMP_IRON_INGOT = ITEMS.register("swamp_iron_ingot",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){

        ITEMS.register(eventBus);
    }
}
