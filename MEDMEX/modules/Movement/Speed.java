package MEDMEX.modules.Movement;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;

public class Speed extends Module {
	
	public Speed() {
		super("Speed" , Keyboard.KEY_V, Category.MOVEMENT);
	}
	
	private long timer = 0l;
	
		
	public void onEvent(Event e) {
		if(e instanceof EventUpdate) {
			if(e.isPre()) {
				timer++;
				if (mc.thePlayer.onGround) {
					if (timer >= 5L) {
						mc.thePlayer.motionX *=9;
						mc.thePlayer.motionZ *=9;
						net.minecraft.src.Timer.CustomTimer = 1.5f;
						
						
						timer = 0l;
					}
					else {
						mc.thePlayer.motionX *=0.1;
						mc.thePlayer.motionZ *=0.1;
						net.minecraft.src.Timer.CustomTimer = 1f;
					}
				}
			}
		}
	}
	public void onDisable() {
		net.minecraft.src.Timer.CustomTimer = 1.00f;
		
	}

	



}
