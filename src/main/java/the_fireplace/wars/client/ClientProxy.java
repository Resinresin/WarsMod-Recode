package the_fireplace.wars.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.multiplayer.ServerList;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.input.Keyboard;
import the_fireplace.wars.CommonProxy;
import the_fireplace.wars.handlers.WarsTickEventHandler;
import the_fireplace.wars.registry.WarsBlocks;
import the_fireplace.wars.registry.WarsItems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy {

	public static KeyBinding toggleHUD;

	public static boolean guiVisible = true;

	public static int totalKills;
	public static int killStreak;
	public static int redPlayers;
	public static int bluePlayers;
	public static int greenPlayers;
	public static int yellowPlayers;

	@SuppressWarnings("rawtypes")
	public static List donators;

	//protected GuiTeamSelect teamSelected;//This is not used

	@SuppressWarnings("unchecked")
	@Override
	public void registerRenderInformation() {
		WarsBlocks.registerItemRenders();
		WarsItems.registerItemRenders();
		donators = new ArrayList<String>();

		try {
			URL targetURL = new URL("https://dl.dropbox.com/u/104023161/Donators.txt");
			InputStream in = targetURL.openStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			String dona;
			while ((dona = reader.readLine()) != null) {
				dona = dona.trim();
				// toLowerCase().
				donators.add(dona);
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// TickRegistry.registerTickHandler(new ClientTickEventHandler(),
		// Side.CLIENT);
		MinecraftForge.EVENT_BUS.register(new WarsTickEventHandler());
		MinecraftForge.EVENT_BUS.register(new WarsKeyEventHandler());

		//RenderingRegistry.registerEntityRenderingHandler(EntityPTNTPrimed.class, new RenderPTNTPrimed());

		toggleHUD = new KeyBinding("key.toggleHUD", Keyboard.KEY_B, "key.categories.warsmod");
		ClientRegistry.registerKeyBinding(toggleHUD);

		// Automatically adds official server to servers list
		// TODO turn this into a button
		ServerList list = new ServerList(Minecraft.getMinecraft());
		list.loadServerList();
		boolean found = false;
		for (int i = 0; i < list.countServers(); i++) {
			ServerData data = list.getServerData(i);
			if (data.serverName.equals("Wars Mod Battle Server") && data.serverIP.equals("108.170.23.98:63293")) {
				found = true;
				break;
			}
		}
		if (!found) {
			list.addServerData(new ServerData("Wars Mod Battle Server", "108.170.23.98:63293"));
		}
		list.saveServerList();
	}

	@Override
	public void handleKillData(int totalKills, int killStreak) {
		System.out.println("This was actually sent");
		ClientProxy.totalKills = totalKills;
		ClientProxy.killStreak = killStreak;
	}

	@Override
	public void handleTeams(int redPlayers, int greenPlayers, int bluePlayers, int yellowPlayers) {
		ClientProxy.redPlayers = redPlayers;
		ClientProxy.greenPlayers = greenPlayers;
		ClientProxy.bluePlayers = bluePlayers;
		ClientProxy.yellowPlayers = yellowPlayers;
	}

	@Override
	public void closeOpenGui() {

	}

    @Override
    public EntityPlayer getPlayerEntity(MessageContext ctx) {
        return (ctx.side.isClient() ? Minecraft.getMinecraft().thePlayer : super.getPlayerEntity(ctx));
    }
}