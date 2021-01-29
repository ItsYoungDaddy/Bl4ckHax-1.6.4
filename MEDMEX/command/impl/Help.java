package MEDMEX.command.impl;

import MEDMEX.Client;
import MEDMEX.command.Command;
import net.minecraft.src.GuiScreenBook;

public class Help extends Command {
	
	public Help() {
		super("Help", "Help command", "help", "help");
		
	}

	@Override
	public void onCommand(String[] args, String command) {
		Client.addChatMessage("-----Help Menu-----");
		Client.addChatMessage(".t <module> - Toggles specified command");
		Client.addChatMessage(".modules - Shows all modules.");
		Client.addChatMessage(".author <author> - Sets custom book author (Supports color with &)");
		Client.addChatMessage(".title <title? - Sets custom book title (Supports color with &)");
		Client.addChatMessage(".binds - shows keybinds");
		Client.addChatMessage(".timer <speed> - Sets timer speed (requires toggle of timer after change");
		Client.addChatMessage(".combatlog <health> - Sets custom combatlog health (default 3 hearts, requires toggle after change)");
		Client.addChatMessage(".bookexploit - Creates a 127 book, must be holding book in hand");
		Client.addChatMessage(".SpawnTP - Teleports you to spawn (doesn't work on macro)");
		Client.addChatMessage(".Vclip <int> - Teleports you vertically");
	}
	}
		
