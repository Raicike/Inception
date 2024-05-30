package com.InceptionWork.inception.registry;

import com.InceptionWork.inception.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = Reference.MODID)
public class RegistryHandler {
    public static final List<Block> BLOCKS = new ArrayList<>();
    public static final List<Item> ITEMS = new ArrayList<>();

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(BLOCKS.toArray(new Block[0]));
    }

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        for(Block block : BLOCKS) {
            registerModel(Item.getItemFromBlock(block));
        }
    }

    public static void registerModel(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
