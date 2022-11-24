
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.test.item.Wood_log_armorArmorItem;
import net.mcreator.test.item.ThornreethhelmItem;
import net.mcreator.test.item.Raw_potato_armorArmorItem;
import net.mcreator.test.item.LuminisonmnuggetrawItem;
import net.mcreator.test.item.LuminisomSwordItem;
import net.mcreator.test.item.LuminisomShovelItem;
import net.mcreator.test.item.LuminisomPickaxeItem;
import net.mcreator.test.item.LuminisomIngotItem;
import net.mcreator.test.item.LuminisomHoeItem;
import net.mcreator.test.item.LuminisomAxeItem;
import net.mcreator.test.item.LuminisomArmorItem;
import net.mcreator.test.item.Leafy_armorArmorItem;
import net.mcreator.test.item.ImprovisedcakeItem;
import net.mcreator.test.item.Drip_armorArmorItem;
import net.mcreator.test.item.CookedimprovisedcakeItem;
import net.mcreator.test.item.Cooked_potato_armor_legacyArmorItem;
import net.mcreator.test.item.Cobble_stone_armorArmorItem;
import net.mcreator.test.TestMod;

public class TestModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MODID);
	public static final RegistryObject<Item> BATTERYTEST = block(TestModBlocks.BATTERYTEST, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> COOKEDIMPROVISEDCAKE = REGISTRY.register("cookedimprovisedcake", () -> new CookedimprovisedcakeItem());
	public static final RegistryObject<Item> IMPROVISEDCAKE = REGISTRY.register("improvisedcake", () -> new ImprovisedcakeItem());
	public static final RegistryObject<Item> LUMINISOM_INGOT = REGISTRY.register("luminisom_ingot", () -> new LuminisomIngotItem());
	public static final RegistryObject<Item> LUMINISONMNUGGETRAW = REGISTRY.register("luminisonmnuggetraw", () -> new LuminisonmnuggetrawItem());
	public static final RegistryObject<Item> THORNREETHHELM_HELMET = REGISTRY.register("thornreethhelm_helmet",
			() -> new ThornreethhelmItem.Helmet());
	public static final RegistryObject<Item> LUMINISOM_ARMOR_HELMET = REGISTRY.register("luminisom_armor_helmet",
			() -> new LuminisomArmorItem.Helmet());
	public static final RegistryObject<Item> LUMINISOM_ARMOR_CHESTPLATE = REGISTRY.register("luminisom_armor_chestplate",
			() -> new LuminisomArmorItem.Chestplate());
	public static final RegistryObject<Item> LUMINISOM_ARMOR_LEGGINGS = REGISTRY.register("luminisom_armor_leggings",
			() -> new LuminisomArmorItem.Leggings());
	public static final RegistryObject<Item> LUMINISOM_ARMOR_BOOTS = REGISTRY.register("luminisom_armor_boots", () -> new LuminisomArmorItem.Boots());
	public static final RegistryObject<Item> COOKED_POTATO_ARMOR_LEGACY_ARMOR_HELMET = REGISTRY.register("cooked_potato_armor_legacy_armor_helmet",
			() -> new Cooked_potato_armor_legacyArmorItem.Helmet());
	public static final RegistryObject<Item> COOKED_POTATO_ARMOR_LEGACY_ARMOR_CHESTPLATE = REGISTRY
			.register("cooked_potato_armor_legacy_armor_chestplate", () -> new Cooked_potato_armor_legacyArmorItem.Chestplate());
	public static final RegistryObject<Item> COOKED_POTATO_ARMOR_LEGACY_ARMOR_LEGGINGS = REGISTRY
			.register("cooked_potato_armor_legacy_armor_leggings", () -> new Cooked_potato_armor_legacyArmorItem.Leggings());
	public static final RegistryObject<Item> COOKED_POTATO_ARMOR_LEGACY_ARMOR_BOOTS = REGISTRY.register("cooked_potato_armor_legacy_armor_boots",
			() -> new Cooked_potato_armor_legacyArmorItem.Boots());
	public static final RegistryObject<Item> LEAFY_ARMOR_ARMOR_HELMET = REGISTRY.register("leafy_armor_armor_helmet",
			() -> new Leafy_armorArmorItem.Helmet());
	public static final RegistryObject<Item> LEAFY_ARMOR_ARMOR_CHESTPLATE = REGISTRY.register("leafy_armor_armor_chestplate",
			() -> new Leafy_armorArmorItem.Chestplate());
	public static final RegistryObject<Item> LEAFY_ARMOR_ARMOR_LEGGINGS = REGISTRY.register("leafy_armor_armor_leggings",
			() -> new Leafy_armorArmorItem.Leggings());
	public static final RegistryObject<Item> LEAFY_ARMOR_ARMOR_BOOTS = REGISTRY.register("leafy_armor_armor_boots",
			() -> new Leafy_armorArmorItem.Boots());
	public static final RegistryObject<Item> DRIP_ARMOR_ARMOR_HELMET = REGISTRY.register("drip_armor_armor_helmet",
			() -> new Drip_armorArmorItem.Helmet());
	public static final RegistryObject<Item> DRIP_ARMOR_ARMOR_CHESTPLATE = REGISTRY.register("drip_armor_armor_chestplate",
			() -> new Drip_armorArmorItem.Chestplate());
	public static final RegistryObject<Item> DRIP_ARMOR_ARMOR_LEGGINGS = REGISTRY.register("drip_armor_armor_leggings",
			() -> new Drip_armorArmorItem.Leggings());
	public static final RegistryObject<Item> DRIP_ARMOR_ARMOR_BOOTS = REGISTRY.register("drip_armor_armor_boots",
			() -> new Drip_armorArmorItem.Boots());
	public static final RegistryObject<Item> WOOD_LOG_ARMOR_ARMOR_HELMET = REGISTRY.register("wood_log_armor_armor_helmet",
			() -> new Wood_log_armorArmorItem.Helmet());
	public static final RegistryObject<Item> WOOD_LOG_ARMOR_ARMOR_CHESTPLATE = REGISTRY.register("wood_log_armor_armor_chestplate",
			() -> new Wood_log_armorArmorItem.Chestplate());
	public static final RegistryObject<Item> WOOD_LOG_ARMOR_ARMOR_LEGGINGS = REGISTRY.register("wood_log_armor_armor_leggings",
			() -> new Wood_log_armorArmorItem.Leggings());
	public static final RegistryObject<Item> WOOD_LOG_ARMOR_ARMOR_BOOTS = REGISTRY.register("wood_log_armor_armor_boots",
			() -> new Wood_log_armorArmorItem.Boots());
	public static final RegistryObject<Item> RAW_POTATO_ARMOR_ARMOR_HELMET = REGISTRY.register("raw_potato_armor_armor_helmet",
			() -> new Raw_potato_armorArmorItem.Helmet());
	public static final RegistryObject<Item> RAW_POTATO_ARMOR_ARMOR_CHESTPLATE = REGISTRY.register("raw_potato_armor_armor_chestplate",
			() -> new Raw_potato_armorArmorItem.Chestplate());
	public static final RegistryObject<Item> RAW_POTATO_ARMOR_ARMOR_LEGGINGS = REGISTRY.register("raw_potato_armor_armor_leggings",
			() -> new Raw_potato_armorArmorItem.Leggings());
	public static final RegistryObject<Item> RAW_POTATO_ARMOR_ARMOR_BOOTS = REGISTRY.register("raw_potato_armor_armor_boots",
			() -> new Raw_potato_armorArmorItem.Boots());
	public static final RegistryObject<Item> LUMINISOM_SWORD = REGISTRY.register("luminisom_sword", () -> new LuminisomSwordItem());
	public static final RegistryObject<Item> LUMINISOM_BLOCK = block(TestModBlocks.LUMINISOM_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> LUMINISOM_ORE = block(TestModBlocks.LUMINISOM_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> LUMINISOM_AXE = REGISTRY.register("luminisom_axe", () -> new LuminisomAxeItem());
	public static final RegistryObject<Item> LUMINISOM_PICKAXE = REGISTRY.register("luminisom_pickaxe", () -> new LuminisomPickaxeItem());
	public static final RegistryObject<Item> LUMINISOM_HOE = REGISTRY.register("luminisom_hoe", () -> new LuminisomHoeItem());
	public static final RegistryObject<Item> LUMINISOM_SHOVEL = REGISTRY.register("luminisom_shovel", () -> new LuminisomShovelItem());
	public static final RegistryObject<Item> COBBLE_STONE_ARMOR_ARMOR_HELMET = REGISTRY.register("cobble_stone_armor_armor_helmet",
			() -> new Cobble_stone_armorArmorItem.Helmet());
	public static final RegistryObject<Item> COBBLE_STONE_ARMOR_ARMOR_CHESTPLATE = REGISTRY.register("cobble_stone_armor_armor_chestplate",
			() -> new Cobble_stone_armorArmorItem.Chestplate());
	public static final RegistryObject<Item> COBBLE_STONE_ARMOR_ARMOR_LEGGINGS = REGISTRY.register("cobble_stone_armor_armor_leggings",
			() -> new Cobble_stone_armorArmorItem.Leggings());
	public static final RegistryObject<Item> COBBLE_STONE_ARMOR_ARMOR_BOOTS = REGISTRY.register("cobble_stone_armor_armor_boots",
			() -> new Cobble_stone_armorArmorItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
