package MEDMEX.command.impl;

import MEDMEX.Client;
import MEDMEX.command.Command;
import net.minecraft.src.GuiScreenBook;

public class Binds extends Command {
	
	public Binds() {
		super("Binds", "Shows keybinds", "binds", "binds");
		
	}

	@Override
	public void onCommand(String[] args, String command) {
		Client.addChatMessage("-----Bind List-----");
		Client.addChatMessage("Fly - F");
		Client.addChatMessage("Safewalk - J");
		Client.addChatMessage("Sprint - K");
		Client.addChatMessage("Freecam - U");
		Client.addChatMessage("Timer - L");
		Client.addChatMessage("NoRender - N");
		Client.addChatMessage("NoWeather - P");
		Client.addChatMessage("Fullbright - B");
		Client.addChatMessage("NoClip - G");
		Client.addChatMessage("Speed - V");
		Client.addChatMessage("Bhop - M");
		Client.addChatMessage("Xray - X");
		Client.addChatMessage("Aura - H");
		}
	}
		
