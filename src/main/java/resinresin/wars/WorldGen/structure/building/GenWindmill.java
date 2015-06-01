package resinresin.wars.WorldGen.structure.building;

import net.minecraft.entity.player.EntityPlayer;
import resinresin.wars.WorldGen.resinresinLoader;

public class GenWindmill {

	public GenWindmill(EntityPlayer player, int i, int j, int k) {
		resinresinLoader windmill = new resinresinLoader("windmill.resinresin");

		windmill.generate(player.worldObj, i - 6, j - 1, k - 8, false);
		windmill.generate(player.worldObj, i - 6, j - 1, k - 8, false);

		player.worldObj.setBlock(i + 0, j - 0, k - 0, 0, 2, 2);
	}

}