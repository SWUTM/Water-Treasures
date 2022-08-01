
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.swutm.watertreasures.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.swutm.watertreasures.item.WaterWoodBowlItem;
import net.swutm.watertreasures.item.WaterWoodBowl2Item;
import net.swutm.watertreasures.item.WaterWoodBowl1Item;
import net.swutm.watertreasures.item.FastWaterIronBowlItem;
import net.swutm.watertreasures.watertreasures;

public class WaterTreasuresModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, watertreasures.MOD_ID);
	public static final RegistryObject<Item> WATER_WOOD_BOWL = REGISTRY.register("water_wood_bowl", () -> new WaterWoodBowlItem());
	public static final RegistryObject<Item> WATER_WOOD_BOWL_1 = REGISTRY.register("water_wood_bowl_1", () -> new WaterWoodBowl1Item());
	public static final RegistryObject<Item> WATER_WOOD_BOWL_2 = REGISTRY.register("water_wood_bowl_2", () -> new WaterWoodBowl2Item());
	public static final RegistryObject<Item> FAST_WATER_IRON_BOWL = REGISTRY.register("fast_water_iron_bowl", () -> new FastWaterIronBowlItem());
}
