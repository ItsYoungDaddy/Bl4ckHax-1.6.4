package MEDMEX.modules.Movement;

import org.lwjgl.input.Keyboard;

import MEDMEX.events.Event;
import MEDMEX.events.listeners.EventUpdate;
import MEDMEX.modules.Module;
import net.minecraft.src.BlockFluid;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;


public class Jesus extends Module {
	
	public Jesus() {
		super("Jesus" , Keyboard.KEY_X, Category.MOVEMENT);
	}
	
	
	
		
	public void onEnable() {
		BlockFluid.jesus = true;
		mc.thePlayer.onGround = true;
	}
	public void onDisable() {
		BlockFluid.jesus = false;
		mc.thePlayer.onGround = false;
		mc.thePlayer.speedInAir = 0.02f;
		net.minecraft.src.Timer.CustomTimer = 1.00f;
		mc.gameSettings.keyBindJump.pressed = Keyboard.isKeyDown(mc.gameSettings.keyBindJump.keyCode);
	}

	public void onEvent(Event e) {
		if(e instanceof EventUpdate) {
			if(e.isPre()) {
				mc.gameSettings.keyBindJump.pressed = true;
				mc.thePlayer.speedInAir = 0.03f;
				net.minecraft.src.Timer.CustomTimer = 1.08f;
				
				}
			}
		}
	}



