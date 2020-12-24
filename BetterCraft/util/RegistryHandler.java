package com.blastarrowcz.BetterCraft.util;

import com.blastarrowcz.BetterCraft.BetterCraft;
import com.blastarrowcz.BetterCraft.armor.ModArmorMaterial;
import com.blastarrowcz.BetterCraft.blocks.*;
import com.blastarrowcz.BetterCraft.items.ItemBase;
import com.blastarrowcz.BetterCraft.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BetterCraft.MOD_ID);
    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BetterCraft.MOD_ID);

    public static void init()
    {

        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }


    //items
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", ItemBase::new);
    public static final RegistryObject<Item> STEEL_GRIT = ITEMS.register("steel_grit", ItemBase::new);
    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", ItemBase::new);
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", ItemBase::new);
    public static final RegistryObject<Item> STEEL_GEAR = ITEMS.register("steel_gear", ItemBase::new);

    //blocks
    public static final RegistryObject<Block> STEEL_BLOCK = BLOCKS.register("steel_block", SteelBlock::new);
    public static final RegistryObject<Block> ALLOY_FURNACE = BLOCKS.register("alloy_furnace", AlloyFurnace::new);
    public static final RegistryObject<Block> CRAFTER = BLOCKS.register("crafter", Crafter::new);
    public static final RegistryObject<Block> COPPER_ORE = BLOCKS.register("copper_ore", Ore::new);
    public static final RegistryObject<Block> TIN_ORE = BLOCKS.register("tin_ore", Ore::new);

    //tools
    public static final RegistryObject<SwordItem> STEEL_SWORD = ITEMS.register("steel_sword", () -> new SwordItem(ModItemTier.STEEL, 3, -2.4f, new Item.Properties().group(BetterCraft.TAB)));
    public static final RegistryObject<PickaxeItem> STEEL_PICKAXE = ITEMS.register("steel_pickaxe", () -> new PickaxeItem(ModItemTier.STEEL, 1, -2.8f, new Item.Properties().group(BetterCraft.TAB)));
    public static final RegistryObject<AxeItem> STEEL_AXE = ITEMS.register("steel_axe", () -> new AxeItem(ModItemTier.STEEL, 4, -3.2f, new Item.Properties().group(BetterCraft.TAB)));
    public static final RegistryObject<ShovelItem> STEEL_SHOVEL = ITEMS.register("steel_shovel", () -> new ShovelItem(ModItemTier.STEEL, 0, -2.4f, new Item.Properties().group(BetterCraft.TAB)));
    public static final RegistryObject<HoeItem> STEEL_HOE = ITEMS.register("steel_hoe", () -> new HoeItem(ModItemTier.STEEL, 0, -1.0f, new Item.Properties().group(BetterCraft.TAB)));
    public static final RegistryObject<SwordItem> COPPER_SWORD = ITEMS.register("copper_sword", () -> new SwordItem(ModItemTier.COPPER, 3, -2.4f, new Item.Properties().group(BetterCraft.TAB)));
    public static final RegistryObject<PickaxeItem> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", () -> new PickaxeItem(ModItemTier.COPPER, 1, -2.8f, new Item.Properties().group(BetterCraft.TAB)));
    public static final RegistryObject<AxeItem> COPPER_AXE = ITEMS.register("copper_axe", () -> new AxeItem(ModItemTier.COPPER, 4, -3.2f, new Item.Properties().group(BetterCraft.TAB)));
    public static final RegistryObject<ShovelItem> COPPER_SHOVEL = ITEMS.register("copper_shovel", () -> new ShovelItem(ModItemTier.COPPER, 0, -2.4f, new Item.Properties().group(BetterCraft.TAB)));
    public static final RegistryObject<HoeItem> COPPER_HOE = ITEMS.register("copper_hoe", () -> new HoeItem(ModItemTier.COPPER, 0, -1.0f, new Item.Properties().group(BetterCraft.TAB)));
    public static final RegistryObject<SwordItem> TIN_SWORD = ITEMS.register("tin_sword", () -> new SwordItem(ModItemTier.TIN, 3, -2.4f, new Item.Properties().group(BetterCraft.TAB)));
    public static final RegistryObject<PickaxeItem> TIN_PICKAXE = ITEMS.register("tin_pickaxe", () -> new PickaxeItem(ModItemTier.TIN, 1, -2.8f, new Item.Properties().group(BetterCraft.TAB)));
    public static final RegistryObject<AxeItem> TIN_AXE = ITEMS.register("tin_axe", () -> new AxeItem(ModItemTier.TIN, 4, -3.2f, new Item.Properties().group(BetterCraft.TAB)));
    public static final RegistryObject<ShovelItem> TIN_SHOVEL = ITEMS.register("tin_shovel", () -> new ShovelItem(ModItemTier.TIN, 0, -2.4f, new Item.Properties().group(BetterCraft.TAB)));
    public static final RegistryObject<HoeItem> TIN_HOE = ITEMS.register("tin_hoe", () -> new HoeItem(ModItemTier.TIN, 0, -1.0f, new Item.Properties().group(BetterCraft.TAB)));


    //armor
    public static final RegistryObject<ArmorItem> STEEL_HELMET = ITEMS.register("steel_helmet", ()-> new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlotType.HEAD, new Item.Properties().group(BetterCraft.TAB)));
    public static final RegistryObject<ArmorItem> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate", ()-> new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlotType.CHEST, new Item.Properties().group(BetterCraft.TAB)));
    public static final RegistryObject<ArmorItem> STEEL_LEGGINGS = ITEMS.register("steel_leggings", ()-> new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlotType.LEGS, new Item.Properties().group(BetterCraft.TAB)));
    public static final RegistryObject<ArmorItem> STEEL_BOOTS = ITEMS.register("steel_boots", ()-> new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlotType.FEET, new Item.Properties().group(BetterCraft.TAB)));



    //block items
    public static final RegistryObject<Item> STEEL_BLOCK_ITEM = ITEMS.register("steel_block", () -> new BlockItemBase(STEEL_BLOCK.get()));
    public static final RegistryObject<Item> ALLOY_FURNACE_ITEM = ITEMS.register("alloy_furnace", () -> new BlockItemBase(ALLOY_FURNACE.get()));
    public static final RegistryObject<Item> CRAFTER_ITEM = ITEMS.register("crafter", () -> new BlockItemBase(CRAFTER.get()));
    public static final RegistryObject<Item> COPPER_ORE_ITEM = ITEMS.register("copper_ore", () -> new BlockItemBase(COPPER_ORE.get()));
    public static final RegistryObject<Item> TIN_ORE_ITEM = ITEMS.register("tin_ore", () -> new BlockItemBase(TIN_ORE.get()));


}
