
package net.swutm.watertreasures.item;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.UseOnContext;
import net.swutm.watertreasures.procedures.WaterWoodBowl1RightclickedOnBlockProcedure;

public class WaterWoodBowl1Item extends Item {
	public WaterWoodBowl1Item() {
		super(new Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		WaterWoodBowl1RightclickedOnBlockProcedure.execute(context.getPlayer());
		return retval;
	}
}
