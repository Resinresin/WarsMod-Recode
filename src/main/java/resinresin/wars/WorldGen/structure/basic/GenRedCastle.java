package resinresin.wars.WorldGen.structure.basic;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import resinresin.wars.Warsmod;
import resinresin.wars.WorldGen.resinresinLoader;
import resinresin.wars.registry.WarsBlocks;

public class GenRedCastle {

	resinresinLoader castleFloor = new resinresinLoader("castleFloor.resinresin");
	resinresinLoader castleBase = new resinresinLoader("castleBase.resinresin");
	resinresinLoader castleCor = new resinresinLoader("castleCor.resinresin");
	resinresinLoader castleStorage = new resinresinLoader("castleStorage.resinresin");
	resinresinLoader castleTop = new resinresinLoader("castleTop.resinresin");

	@SuppressWarnings("unused")
	public GenRedCastle(EntityPlayer player, int i, int j, int k) {

		int cloth = Block.cloth.blockID;
		int lava = Block.lavaStill.blockID;

		castleFloor.generate(player.worldObj, i - 10, j - 4, k - 10, true);
		castleTop.generate(player.worldObj, i - 13, j + 0, k - 13, true);
		Warsmod.generateBlock(player.worldObj, i + 0, j - 0, k + 0, Blocks.air);
		castleBase.generate(player.worldObj, i - 14, j - 14, k - 10, true);

		Warsmod.generateBlock(player.worldObj, i - 4, j + 13, k - 11, cloth, 14, 2);
		Warsmod.generateBlock(player.worldObj, i + 15, j + 13, k - 11, cloth, 14, 2);

		Warsmod.generateBlock(player.worldObj, i + 12, j + 15, k - 8, cloth, 14, 2);
		Warsmod.generateBlock(player.worldObj, i - 7, j + 15, k - 8, cloth, 14, 2);

		Warsmod.generateBlock(player.worldObj, i + 15, j + 13, k + 7, cloth, 14, 2);
		Warsmod.generateBlock(player.worldObj, i - 4, j + 13, k + 7, cloth, 14, 2);

		Warsmod.generateBlock(player.worldObj, i + 12, j + 15, k + 10, cloth, 14, 2);
		Warsmod.generateBlock(player.worldObj, i - 7, j + 15, k + 10, cloth, 14, 2);

		Warsmod.generateBlock(player.worldObj, i - 5, j - 12, k + 9, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 12, k + 8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 12, k + 7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 12, k + 6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 12, k + 5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 12, k + 4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 12, k + 3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 12, k + 2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 12, k + 1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 12, k + 0, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 12, k + -1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 12, k + -2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 12, k + -3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 12, k + -4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 12, k + -5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 12, k + -6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 12, k + -7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 12, k + -8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 12, k + -9, Blocks.air);

		Warsmod.generateBlock(player.worldObj, i - 4, j - 12, k + 9, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 12, k + 8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 12, k + 7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 12, k + 6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 12, k + 5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 12, k + 4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 12, k + 3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 12, k + 2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 12, k + 1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 12, k + 0, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 12, k + -1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 12, k + -2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 12, k + -3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 12, k + -4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 12, k + -5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 12, k + -6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 12, k + -7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 12, k + -8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 12, k + -9, Blocks.air);

		Warsmod.generateBlock(player.worldObj, i - 3, j - 12, k + 9, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 12, k + 8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 12, k + 7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 12, k + 6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 12, k + 5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 12, k + 4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 12, k + 3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 12, k + 2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 12, k + 1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 12, k + 0, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 12, k + -1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 12, k + -2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 12, k + -3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 12, k + -4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 12, k + -5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 12, k + -6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 12, k + -7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 12, k + -8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 12, k + -9, Blocks.air);

		Warsmod.generateBlock(player.worldObj, i - 2, j - 12, k + 9, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 12, k + 8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 12, k + 7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 12, k + 6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 12, k + 5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 12, k + 4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 12, k + 3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 12, k + 2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 12, k + 1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 12, k + 0, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 12, k + -1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 12, k + -2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 12, k + -3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 12, k + -4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 12, k + -5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 12, k + -6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 12, k + -7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 12, k + -8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 12, k + -9, Blocks.air);

		Warsmod.generateBlock(player.worldObj, i - 1, j - 12, k + 9, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 12, k + 8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 12, k + 7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 12, k + 6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 12, k + 5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 12, k + 4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 12, k + 3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 12, k + 2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 12, k + 1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 12, k + 0, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 12, k + -1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 12, k + -2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 12, k + -3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 12, k + -4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 12, k + -5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 12, k + -6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 12, k + -7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 12, k + -8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 12, k + -9, Blocks.air);

		Warsmod.generateBlock(player.worldObj, i - 0, j - 12, k + 9, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 12, k + 8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 12, k + 7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 12, k + 6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 12, k + 5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 12, k + 4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 12, k + 3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 12, k + 2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 12, k + 1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 12, k + 0, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 12, k + -1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 12, k + -2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 12, k + -3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 12, k + -4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 12, k + -5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 12, k + -6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 12, k + -7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 12, k + -8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 12, k + -9, Blocks.air);

		// /////////////

		Warsmod.generateBlock(player.worldObj, i - 5, j - 13, k + 9, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 13, k + 8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 13, k + 7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 13, k + 6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 13, k + 5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 13, k + 4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 13, k + 3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 13, k + 2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 13, k + 1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 13, k + 0, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 13, k + -1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 13, k + -2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 13, k + -3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 13, k + -4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 13, k + -5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 13, k + -6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 13, k + -7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 13, k + -8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 13, k + -9, Blocks.air);

		Warsmod.generateBlock(player.worldObj, i - 4, j - 13, k + 9, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 13, k + 8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 13, k + 7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 13, k + 6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 13, k + 5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 13, k + 4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 13, k + 3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 13, k + 2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 13, k + 1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 13, k + 0, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 13, k + -1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 13, k + -2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 13, k + -3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 13, k + -4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 13, k + -5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 13, k + -6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 13, k + -7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 13, k + -8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 13, k + -9, Blocks.air);

		Warsmod.generateBlock(player.worldObj, i - 3, j - 13, k + 9, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 13, k + 8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 13, k + 7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 13, k + 6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 13, k + 5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 13, k + 4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 13, k + 3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 13, k + 2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 13, k + 1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 13, k + 0, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 13, k + -1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 13, k + -2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 13, k + -3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 13, k + -4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 13, k + -5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 13, k + -6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 13, k + -7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 13, k + -8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 13, k + -9, Blocks.air);

		Warsmod.generateBlock(player.worldObj, i - 2, j - 13, k + 9, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 13, k + 8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 13, k + 7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 13, k + 6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 13, k + 5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 13, k + 4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 13, k + 3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 13, k + 2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 13, k + 1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 13, k + 0, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 13, k + -1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 13, k + -2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 13, k + -3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 13, k + -4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 13, k + -5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 13, k + -6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 13, k + -7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 13, k + -8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 13, k + -9, Blocks.air);

		Warsmod.generateBlock(player.worldObj, i - 1, j - 13, k + 9, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 13, k + 8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 13, k + 7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 13, k + 6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 13, k + 5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 13, k + 4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 13, k + 3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 13, k + 2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 13, k + 1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 13, k + 0, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 13, k + -1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 13, k + -2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 13, k + -3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 13, k + -4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 13, k + -5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 13, k + -6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 13, k + -7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 13, k + -8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 13, k + -9, Blocks.air);

		Warsmod.generateBlock(player.worldObj, i - 0, j - 13, k + 9, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 13, k + 8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 13, k + 7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 13, k + 6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 13, k + 5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 13, k + 4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 13, k + 3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 13, k + 2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 13, k + 1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 13, k + 0, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 13, k + -1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 13, k + -2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 13, k + -3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 13, k + -4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 13, k + -5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 13, k + -6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 13, k + -7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 13, k + -8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 13, k + -9, Blocks.air);

		// //////

		Warsmod.generateBlock(player.worldObj, i - 5, j - 11, k + 9, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 11, k + 8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 11, k + 7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 11, k + 6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 11, k + 5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 11, k + 4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 11, k + 3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 11, k + 2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 11, k + 1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 11, k + 0, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 11, k + -1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 11, k + -2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 11, k + -3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 11, k + -4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 11, k + -5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 11, k + -6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 11, k + -7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 11, k + -8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 11, k + -9, Blocks.air);

		Warsmod.generateBlock(player.worldObj, i - 4, j - 11, k + 9, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 11, k + 8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 11, k + 7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 11, k + 6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 11, k + 5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 11, k + 4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 11, k + 3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 11, k + 2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 11, k + 1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 11, k + 0, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 11, k + -1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 11, k + -2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 11, k + -3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 11, k + -4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 11, k + -5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 11, k + -6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 11, k + -7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 11, k + -8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 11, k + -9, Blocks.air);

		Warsmod.generateBlock(player.worldObj, i - 3, j - 11, k + 9, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 11, k + 8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 11, k + 7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 11, k + 6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 11, k + 5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 11, k + 4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 11, k + 3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 11, k + 2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 11, k + 1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 11, k + 0, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 11, k + -1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 11, k + -2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 11, k + -3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 11, k + -4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 11, k + -5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 11, k + -6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 11, k + -7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 11, k + -8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 11, k + -9, Blocks.air);

		Warsmod.generateBlock(player.worldObj, i - 2, j - 11, k + 9, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 11, k + 8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 11, k + 7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 11, k + 6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 11, k + 5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 11, k + 4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 11, k + 3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 11, k + 2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 11, k + 1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 11, k + 0, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 11, k + -1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 11, k + -2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 11, k + -3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 11, k + -4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 11, k + -5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 11, k + -6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 11, k + -7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 11, k + -8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 11, k + -9, Blocks.air);

		Warsmod.generateBlock(player.worldObj, i - 1, j - 11, k + 9, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 11, k + 8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 11, k + 7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 11, k + 6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 11, k + 5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 11, k + 4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 11, k + 3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 11, k + 2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 11, k + 1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 11, k + 0, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 11, k + -1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 11, k + -2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 11, k + -3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 11, k + -4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 11, k + -5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 11, k + -6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 11, k + -7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 11, k + -8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 11, k + -9, Blocks.air);

		Warsmod.generateBlock(player.worldObj, i - 0, j - 11, k + 9, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 11, k + 8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 11, k + 7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 11, k + 6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 11, k + 5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 11, k + 4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 11, k + 3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 11, k + 2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 11, k + 1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 11, k + 0, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 11, k + -1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 11, k + -2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 11, k + -3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 11, k + -4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 11, k + -5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 11, k + -6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 11, k + -7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 11, k + -8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 11, k + -9, Blocks.air);

		// ////////////

		Warsmod.generateBlock(player.worldObj, i - 5, j - 10, k + 9, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 10, k + 8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 10, k + 7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 10, k + 6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 10, k + 5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 10, k + 4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 10, k + 3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 10, k + 2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 10, k + 1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 10, k + 0, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 10, k + -1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 10, k + -2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 10, k + -3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 10, k + -4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 10, k + -5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 10, k + -6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 10, k + -7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 10, k + -8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 5, j - 10, k + -9, Blocks.air);

		Warsmod.generateBlock(player.worldObj, i - 4, j - 10, k + 9, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 10, k + 8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 10, k + 7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 10, k + 6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 10, k + 5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 10, k + 4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 10, k + 3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 10, k + 2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 10, k + 1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 10, k + 0, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 10, k + -1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 10, k + -2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 10, k + -3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 10, k + -4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 10, k + -5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 10, k + -6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 10, k + -7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 10, k + -8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 4, j - 10, k + -9, Blocks.air);

		Warsmod.generateBlock(player.worldObj, i - 3, j - 10, k + 9, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 10, k + 8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 10, k + 7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 10, k + 6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 10, k + 5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 10, k + 4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 10, k + 3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 10, k + 2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 10, k + 1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 10, k + 0, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 10, k + -1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 10, k + -2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 10, k + -3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 10, k + -4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 10, k + -5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 10, k + -6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 10, k + -7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 10, k + -8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 3, j - 10, k + -9, Blocks.air);

		Warsmod.generateBlock(player.worldObj, i - 2, j - 10, k + 9, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 10, k + 8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 10, k + 7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 10, k + 6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 10, k + 5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 10, k + 4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 10, k + 3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 10, k + 2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 10, k + 1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 10, k + 0, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 10, k + -1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 10, k + -2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 10, k + -3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 10, k + -4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 10, k + -5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 10, k + -6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 10, k + -7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 10, k + -8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 10, k + -9, Blocks.air);

		Warsmod.generateBlock(player.worldObj, i - 1, j - 10, k + 9, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 10, k + 8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 10, k + 7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 10, k + 6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 10, k + 5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 10, k + 4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 10, k + 3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 10, k + 2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 10, k + 1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 10, k + 0, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 10, k + -1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 10, k + -2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 10, k + -3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 10, k + -4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 10, k + -5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 10, k + -6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 10, k + -7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 10, k + -8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 1, j - 10, k + -9, Blocks.air);

		Warsmod.generateBlock(player.worldObj, i - 0, j - 10, k + 9, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 10, k + 8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 10, k + 7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 10, k + 6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 10, k + 5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 10, k + 4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 10, k + 3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 10, k + 2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 10, k + 1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 10, k + 0, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 10, k + -1, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 10, k + -2, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 10, k + -3, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 10, k + -4, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 10, k + -5, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 10, k + -6, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 10, k + -7, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 10, k + -8, Blocks.air);
		Warsmod.generateBlock(player.worldObj, i - 0, j - 10, k + -9, Blocks.air);

		Warsmod.generateBlock(player.worldObj, i + 8, j - 8, k + 2, Blocks.cobblestone);
		Warsmod.generateBlock(player.worldObj, i + 8, j - 8, k + 3, Blocks.cobblestone);
		Warsmod.generateBlock(player.worldObj, i + 8, j - 8, k + 4, Blocks.cobblestone);

		Warsmod.generateBlock(player.worldObj, i - 11, j - 14, k + 0, Blocks.cobblestone);

		Warsmod.generateBlock(player.worldObj, i - 2, j - 12, k + 0, WarsBlocks.classSelect);
		Warsmod.generateBlock(player.worldObj, i - 2, j - 11, k + 0, WarsBlocks.classSelectDonator);

	}

}
