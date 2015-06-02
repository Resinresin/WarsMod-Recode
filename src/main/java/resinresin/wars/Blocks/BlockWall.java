package resinresin.wars.Blocks;

import javax.swing.Icon;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import resinresin.wars.Warsmod;
import resinresin.wars.WorldGen.resinresinLoader;

public class BlockWall extends BlockStairs {

	public BlockWall(int ID, Block par2Block, int par3) {
		super(ID, par2Block, par3);

		setCreativeTab(Warsmod.tabWarsBlocks);
	}

	resinresinLoader wallNS = new resinresinLoader("wall0.resinresin");
	resinresinLoader wallWE = new resinresinLoader("wall90.resinresin");

	private boolean isBlockStairsDirection(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5) {
		int i1 = par1IBlockAccess.getBlockId(par2, par3, par4);
		return isBlockStairsID(i1) && par1IBlockAccess.getBlockMetadata(par2, par3, par4) == par5;
	}

	public boolean onBlockActivated(World par1World, int i, int j, int k, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {

		if (this.isBlockStairsDirection(par1World, i, j, k, 2) || this.isBlockStairsDirection(par1World, i, j, k, 3)) {
			wallNS.generate(par1World, i - 2, j - 0, k - 4, true);
		}
		if (this.isBlockStairsDirection(par1World, i, j, k, 0) || this.isBlockStairsDirection(par1World, i, j, k, 1)) {

			wallWE.generate(par1World, i - 4, j - 0, k - 2, true);
		}

		return blockConstructorCalled;

	}

	@SideOnly(Side.CLIENT)
	public static Icon iconMain;

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		iconMain = icon.registerIcon("warsmod:Wall1");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int metadata) {

		return iconMain;

	}

}