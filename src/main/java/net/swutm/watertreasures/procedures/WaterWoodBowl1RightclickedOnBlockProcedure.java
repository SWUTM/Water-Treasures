package net.swutm.watertreasures.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.ItemHandlerHelper;
import net.swutm.watertreasures.init.WaterTreasuresModItems;

public class WaterWoodBowl1RightclickedOnBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.getItem() == WaterTreasuresModItems.WATER_WOOD_BOWL_1.get()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(WaterTreasuresModItems.WATER_WOOD_BOWL_1.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
						_player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(WaterTreasuresModItems.WATER_WOOD_BOWL_2.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
	}
}
