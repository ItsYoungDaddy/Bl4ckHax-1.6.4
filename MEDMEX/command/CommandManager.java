package MEDMEX.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import MEDMEX.Client;
import MEDMEX.command.impl.*;
import MEDMEX.events.listeners.EventChat;
import net.minecraft.src.EntityOtherPlayerMP;
import net.minecraft.src.GuiChat;
import net.minecraft.src.Minecraft;

public class CommandManager {
	
	public List<Command> commands = new ArrayList<Command>();
	public String prefix = ".";
	
	public CommandManager() {
		setup();
	}
	
	public void setup() {
		commands.add(new Toggle());
		commands.add(new Author());
		commands.add(new Title());
		commands.add(new Help());
		commands.add(new Modules());
		commands.add(new Binds());
		commands.add(new Timer());
		commands.add(new CombatLog());
		commands.add(new BookExploit());
	}
	
	public void handleChat(EventChat event) {
		String message = event.getMessage();
		
		if(!message.startsWith(prefix))
			return;
		
		
		event.setCancelled(true);
		
		message = message.substring(prefix.length());
		
		boolean foundCommand = false;
		
		if(message.split(" ").length > 0);
		String commandName = message.split(" ")[0];
		
		for(Command c : commands) {
			if(c.aliases.contains(commandName) || c.name.equalsIgnoreCase(commandName)) {
				c.onCommand(Arrays.copyOfRange(message.split(" "), 1, message.split(" ").length), message);
				foundCommand = true;
				break;
			}
			
		}
		if(!foundCommand) {
			Client.addChatMessage("Could not find command.");
		}
		
	}
	
	
}
