package resinresin.wars.Blocks.unseen;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import resinresin.wars.tileentities.TileEntityHungerGames;

public class BlockHungerGamesLv1Start extends Block {

	public BlockHungerGamesLv1Start() {
		super(Material.iron);
	}

	@Override
	public boolean hasTileEntity(IBlockState state) {
		
		return true;
	}

	@Override
	public TileEntity createTileEntity(World world, IBlockState state) {
		return new TileEntityHungerGames();
	}

	public boolean onBlockActivated(World par1World, int i, int j, int k, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9) {

		
		BlockPos position = new BlockPos(i, j, k);
		TileEntityHungerGames te = (TileEntityHungerGames) par1World.getTileEntity(position);
		if (te.shouldTick) {
			return false;
		}
		te.tickCount = 0;
		te.shouldTick = true;

		if (!par1World.isRemote) {
			par5EntityPlayer.addChatMessage(new ChatComponentText("\u00a79HUNGER GAMES SMALL STARTING IN 1 MINUTE"));
		}

		return false;

	}
}