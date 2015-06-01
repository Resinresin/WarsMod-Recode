package resinresin.wars.Items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import resinresin.wars.Warsmod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemNaturalGem extends Item {
	public ItemNaturalGem() {
		super();
		this.setCreativeTab(Warsmod.tabWarsItems);

	}

	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack) {
		return true;
	}

}
