package net.jet.growandgather.item;

import net.jet.growandgather.CobblemonGrowAndGather;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item JETIA_ROCKS =registerItem("jetia_rocks", new Item(new Item.Settings()));




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CobblemonGrowAndGather.MOD_ID, name), item);
    }

    public static void registerModItems() {
           CobblemonGrowAndGather.LOGGER.info("Registering Mod Items for " + CobblemonGrowAndGather.MOD_ID);

    }
}
