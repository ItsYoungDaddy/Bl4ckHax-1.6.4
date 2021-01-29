package MEDMEX.command.impl;

import MEDMEX.Client;
import MEDMEX.command.Command;
import net.minecraft.src.GuiScreenBook;

public class Modules extends Command {
	
	public Modules() {
		super("Modules", "Shows modules", "modules", "modules");
		
	}

	@Override
	public void onCommand(String[] args, String command) {
		Client.addChatMessage("----Module List----");
		Client.addChatMessage("Fly");
		Client.addChatMessage("Fullbright");
		Client.addChatMessage("Sprint");
		Client.addChatMessage("NoFall");
		Client.addChatMessage("NoWeather");
		Client.addChatMessage("Info");
		Client.addChatMessage("AntiKB");
		Client.addChatMessage("Safewalk");
		Client.addChatMessage("Fastplace");
		Client.addChatMessage("Freecam");
		Client.addChatMessage("NoRender");
		Client.addChatMessage("Timer");
		Client.addChatMessage("Glide");
		Client.addChatMessage("CombatLog");
		Client.addChatMessage("AntiFall");
		Client.addChatMessage("NoClip");
		Client.addChatMessage("Speed");
		Client.addChatMessage("Autowalk");
		Client.addChatMessage("Jesus");
		Client.addChatMessage("Bhop");
		Client.addChatMessage("NoSlow");
		Client.addChatMessage("Xray");
		Client.addChatMessage("ChestESP");
		Client.addChatMessage("Wallhack");
		Client.addChatMessage("Aura");
		Client.addChatMessage("AntiPortalTrap");
		
		}
	}
		
