package resinresin.wars.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import resinresin.wars.tileentities.TileEntityClassSelect;

public class ContainerClassSelect extends Container {

	protected TileEntityClassSelect tileEntity;

	public ContainerClassSelect(InventoryPlayer inventoryPlayer, TileEntityClassSelect te) {
		tileEntity = te;

	}

	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return tileEntity.isUseableByPlayer(player);
	}

}