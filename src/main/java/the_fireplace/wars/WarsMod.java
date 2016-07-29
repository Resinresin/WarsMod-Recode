package the_fireplace.wars;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.ICommandManager;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import the_fireplace.wars.command.*;
import the_fireplace.wars.entities.EntityPTNTPrimed;
import the_fireplace.wars.events.ForgeEvents;
import the_fireplace.wars.handlers.GuiHandler;
import the_fireplace.wars.handlers.WarsPlayerEventHandler;
import the_fireplace.wars.handlers.WarsTickEventHandler;
import the_fireplace.wars.network.PacketDispatcher;
import the_fireplace.wars.registry.*;
import the_fireplace.wars.tabs.WarsBlocksTab;
import the_fireplace.wars.tabs.WarsClassesTab;
import the_fireplace.wars.tabs.WarsItemsTab;
import the_fireplace.wars.worldgen.WarsWorldGenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@Mod(modid = WarsMod.MODID, name = WarsMod.MODNAME)
public class WarsMod {
	public static final String MODID = "warsmod";
	public static final String MODNAME = "Wars Mod";

	@SidedProxy(clientSide = "the_fireplace.wars.client.ClientProxy", serverSide = "the_fireplace.wars.CommonProxy")
	public static CommonProxy proxy;

	@Instance(MODID)
	public static WarsMod instance;

	@SuppressWarnings("rawtypes")
	public static List donators;

	public static CreativeTabs tabWarsBlocks = new WarsBlocksTab("tabWarsItems");
	public static CreativeTabs tabWarsItems = new WarsItemsTab("tabWarsBlocks");
	public static CreativeTabs tabWarsClasses = new WarsClassesTab("tabWarsClasses");

	@SuppressWarnings("unchecked")
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		WarsBlocks.createBlocks();
		WarsItems.createItems();

		registerNetwork();

		getDonators();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		CraftingRecipes.registerRecipes();
		WarsDungeonChests.doDungeonChestHooks();
		WarsTileEntities.createTileEntities();
		MinecraftForge.EVENT_BUS.register(new ForgeEvents());
		MinecraftForge.EVENT_BUS.register(new WarsPlayerEventHandler());
		MinecraftForge.EVENT_BUS.register(new WarsTickEventHandler());

		GameRegistry.registerWorldGenerator(new WarsWorldGenerator(), 0);

		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());

		int eid = -1;
		EntityRegistry.registerModEntity(EntityPTNTPrimed.class, "PTNTPrimed", ++eid, instance, 16, 1, false);

		proxy.registerRenderInformation();
	}

	@EventHandler
	public void serverStart(FMLServerStartingEvent event) {
		MinecraftServer server = MinecraftServer.getServer();
		ICommandManager command = server.getCommandManager();

		ServerCommandManager serverCommand = ((ServerCommandManager) command);

		serverCommand.registerCommand(new CommandKillstreak());
		serverCommand.registerCommand(new CommandTotalKills());
		serverCommand.registerCommand(new CommandRedBase());
		serverCommand.registerCommand(new CommandGreenBase());
		serverCommand.registerCommand(new CommandBlueBase());
		serverCommand.registerCommand(new CommandYellowBase());
		serverCommand.registerCommand(new CommandChaosSpawn());
		serverCommand.registerCommand(new CommandEditMode());
	}

	public static void generateBlock(World par1World, int i, int j, int k, Block block) {
		BlockPos position = new BlockPos(i, j, k);
		par1World.setBlockState(position, block.getDefaultState());
	}

	public static void generateBlockWithMeta(World par1World, int i, int j, int k, IBlockState state) {
		BlockPos position = new BlockPos(i, j, k);
		par1World.setBlockState(position, state);
	}

	private void registerNetwork(){
		PacketDispatcher.registerPackets();
	}

	private void getDonators(){
		donators = new ArrayList<String>();
		try {
			URL targetURL = new URL("https://dl.dropboxusercontent.com/u/104023161/Donators.txt");
			InputStream in = targetURL.openStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			String dona;
			while ((dona = reader.readLine()) != null) {
				dona = dona.trim();
				donators.add(dona);
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
