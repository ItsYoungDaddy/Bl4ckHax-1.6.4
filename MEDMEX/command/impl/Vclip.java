package MEDMEX.command.impl;

import MEDMEX.Client;
import MEDMEX.command.Command;
import net.minecraft.src.GuiScreenBook;
import net.minecraft.src.Minecraft;

public class Vclip extends Command {
	
	public Vclip() {
		super("Vclip", "Changed y coord", "Vclip <value>", "value");
		
	}

	@Override
	public void onCommand(String[] args, String command) {
		if(args.length > 0) {
			final int distance = Integer.valueOf(args[0]);
			Minecraft.thePlayer.setPositionAndUpdate(Minecraft.thePlayer.posX, Minecraft.thePlayer.posY + distance, Minecraft.thePlayer.posZ);
			Client.addChatMessage("Vclipped "+args[0]+" blocks.");
			
		}
	}
}
		
