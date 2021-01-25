package MEDMEX.command.impl;

import MEDMEX.Client;
import MEDMEX.command.Command;
import net.minecraft.src.GuiScreenBook;

public class Title extends Command {
	
	public Title() {
		super("Title", "Sets custom book title", "title <name>", "title");
		
	}

	@Override
	public void onCommand(String[] args, String command) {
		if(args.length > 0) {
		GuiScreenBook.colortitle = args[0].replace("&", "§");
		Client.addChatMessage("Changed title to: "+GuiScreenBook.colortitle.replace("&", "§"));
			}
		}
	}
		
