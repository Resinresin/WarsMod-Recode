package the_fireplace.wars.network.packets;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.internal.FMLNetworkHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import the_fireplace.wars.WarsMod;

public class PacketOpenTeamSelect implements IMessage {

    public PacketOpenTeamSelect() {}

    @Override
    public void fromBytes(ByteBuf buf) {

    }

    @Override
    public void toBytes(ByteBuf buf) {

    }

    public static class Handler extends AbstractClientMessageHandler<PacketOpenTeamSelect> {
        
        @Override
        public IMessage handleClientMessage(EntityPlayer player, PacketOpenTeamSelect message, MessageContext ctx) {
            System.out.println(String.format("Received %s from %s", "command to open team selection gui", player.getDisplayName().getUnformattedText()));

            FMLNetworkHandler.openGui(player, WarsMod.instance, 3, player.worldObj, 0, 0, 0);
            
            return null;
        }
    }
}