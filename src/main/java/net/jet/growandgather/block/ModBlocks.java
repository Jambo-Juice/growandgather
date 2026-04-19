package net.jet.growandgather.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.jet.growandgather.CobblemonGrowAndGather;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    // Jetia Stone
    public static final Block JETIAN_STONE = registerBlock("jetian_stone",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block JETIAN_STONE_BRICKS = registerBlock("jetian_stone_bricks",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block SMOOTH_JETIAN_STONE = registerBlock("smooth_jetian_stone",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block CHISELED_JETIAN_STONE_BRICKS = registerBlock("chiseled_jetian_stone_bricks",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    // Wood Planks
    public static final Block MOCHIWOOD_PLANKS = registerBlock("mochiwood_planks",
            new Block(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));
    public static final Block REGALIZ_PLANKS = registerBlock("regaliz_planks",
            new Block(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));
    public static final Block BANAAN_PLANKS = registerBlock("banaan_planks",
            new Block(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));
    public static final Block ZARZAMORA_PLANKS = registerBlock("zarzamora_planks",
            new Block(AbstractBlock.Settings.create().strength(2f).sounds(BlockSoundGroup.WOOD)));
    // General Decor
    public static final Block VEGGIE_DIRT = registerBlock("veggie_dirt",
            new Block(AbstractBlock.Settings.create().strength(1f).sounds(BlockSoundGroup.MUD)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(CobblemonGrowAndGather.MOD_ID, name), block);

    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(CobblemonGrowAndGather.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        CobblemonGrowAndGather.LOGGER.info("Registering Mod Blocks for " + CobblemonGrowAndGather.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(ModBlocks.JETIAN_STONE);
            entries.add(ModBlocks.VEGGIE_DIRT);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.SMOOTH_JETIAN_STONE);
            entries.add(ModBlocks.JETIAN_STONE_BRICKS);
            entries.add(ModBlocks.CHISELED_JETIAN_STONE_BRICKS);
            entries.add(ModBlocks.BANAAN_PLANKS);
            entries.add(ModBlocks.ZARZAMORA_PLANKS);
            entries.add(ModBlocks.REGALIZ_PLANKS);
            entries.add(ModBlocks.MOCHIWOOD_PLANKS);

        });
    }

}
