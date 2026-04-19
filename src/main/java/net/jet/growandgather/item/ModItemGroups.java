package net.jet.growandgather.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.jet.growandgather.CobblemonGrowAndGather;
import net.jet.growandgather.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup GROW_AND_GATHER_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(CobblemonGrowAndGather.MOD_ID, "grow_and_gather_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.VEGGIE_DIRT))
                    .displayName(Text.translatable("itemgroup.growandgather.grow_and_gather_items"))
                    .entries((displayContext, entries) -> {
                      entries.add(ModBlocks.VEGGIE_DIRT);
                      entries.add(ModItems.JETIAN_ROCKS);
                      entries.add(ModItems.CARVED_UNGULATE);
                      entries.add(ModBlocks.JETIAN_STONE);
                      entries.add(ModBlocks.JETIAN_STONE_BRICKS);
                      entries.add(ModBlocks.CHISELED_JETIAN_STONE_BRICKS);
                      entries.add(ModBlocks.SMOOTH_JETIAN_STONE);
                      entries.add(ModBlocks.BANAAN_PLANKS);
                      entries.add(ModBlocks.REGALIZ_PLANKS);
                      entries.add(ModBlocks.ZARZAMORA_PLANKS);
                      entries.add(ModBlocks.MOCHIWOOD_PLANKS);


                    }).build());


    public static void registerItemGroups() {
        CobblemonGrowAndGather.LOGGER.info("Registering Item Groups for " + CobblemonGrowAndGather.MOD_ID);
    }

}
