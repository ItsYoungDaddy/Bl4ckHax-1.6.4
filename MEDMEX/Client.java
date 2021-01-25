package MEDMEX;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.lwjgl.opengl.Display;

import MEDMEX.UI.HUD;
import MEDMEX.command.CommandManager;
import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventChat;
import MEDMEX.modules.Module;
import MEDMEX.modules.Module.Category;
import MEDMEX.modules.Movement.*;
import MEDMEX.modules.Render.*;
import net.minecraft.src.Minecraft;
import MEDMEX.modules.Player.*;
import MEDMEX.modules.Combat.*;

public class Client {
	
	
	public static String name = "Bl4ckHax", version = "b1.5";
	public static CopyOnWriteArrayList<Module> modules = new CopyOnWriteArrayList<Module>();
	public static HUD hud = new HUD();
	public static CommandManager commandManager = new CommandManager();
		
	public static void startup() {
		System.out.println("Loading "+ name +" "+ version);
		Display.setTitle(name + " version: "+ version);
		
		modules.add(new Fly());
		modules.add(new Sprint());
		modules.add(new Fullbright());
		modules.add(new NoFall());
		modules.add(new NoWeather());
		modules.add(new Info());
		modules.add(new AntiKB());
		modules.add(new Safewalk());
		modules.add(new Fastplace());
		modules.add(new Freecam());
		modules.add(new NoRender());
		modules.add(new Tracers());
		modules.add(new Timer());
		modules.add(new Glide());
		modules.add(new CombatLog());
		modules.add(new AntiFall());
		modules.add(new NoClip());
		modules.add(new Speed());
		modules.add(new AutoWalk());
		modules.add(new Jesus());
		modules.add(new Bhop());
		modules.add(new NoSlow());
	
	}
	
	public static void onEvent(Event e) {
		
		if(e instanceof EventChat) {
			commandManager.handleChat((EventChat)e);
			
		}
		
		for(Module m: modules) {
			if(!m.toggled)
				continue;
			
			m.onEvent(e);
		}
	}

	public static void keyPress(int key) {
		for(Module m : modules) {
			if(key == m.getKey()) {
				m.toggle();
			}
		}
		
	}
	
	public List<Module> getModuleByCategory(Category c){
		List<Module> modules = new ArrayList<Module>();
		for(Module m : this.modules) {
			if(m.category == c)
				modules.add(m);
		}
		return modules;
		
	}
	
	public static void addChatMessage(String message) {
		message = "\2474[" + name +"]: " + "\2477"  + message;
		
		Minecraft.getMinecraft().thePlayer.addChatMessage(new String(message));
	}
	
}
