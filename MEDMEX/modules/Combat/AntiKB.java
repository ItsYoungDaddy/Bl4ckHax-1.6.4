package MEDMEX.modules.Combat;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.EntityLivingBase;
import net.minecraft.src.Packet28EntityVelocity;

public class AntiKB extends Module {
	
	public AntiKB() {
		super("AntiKB", Keyboard.KEY_F19, Category.COMBAT);
		
	}
	

	public void onEnable() {
		
	}
	
	public void onDisable() {
		
	}
	
	public void onEvent(Event e) {
		if(e instanceof EventUpdate) {
			if(e.isPre()) {
				if (mc.thePlayer.hurtTime > 0) {
					mc.thePlayer.motionX = -.0d;
					mc.thePlayer.motionY = -.0d;
					mc.thePlayer.motionZ = -.0d;
				}
				
			}
		}
	}
	

}


