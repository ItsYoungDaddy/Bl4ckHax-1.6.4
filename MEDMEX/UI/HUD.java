package MEDMEX.UI;

import java.awt.Color;
import java.util.Collections;
import java.util.Comparator;

import MEDMEX.Client;
import MEDMEX.Util.ColorUtil;
import MEDMEX.modules.Module;
import MEDMEX.modules.Render.Info;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.FontRenderer;
import net.minecraft.src.GameSettings;
import net.minecraft.src.Gui;
import net.minecraft.src.Minecraft;
import net.minecraft.src.ScaledResolution;
import net.minecraft.src.Session;

public class HUD {
	public static boolean infoenabled = false;
	

	
	public Minecraft mc = Minecraft.getMinecraft();
	
	public static class ModuleComparator implements Comparator<Module> {

		@Override
		public int compare(Module o1, Module o2) {
			if(Minecraft.getMinecraft().fontRenderer.getStringWidth(o1.name) > Minecraft.getMinecraft().fontRenderer.getStringWidth(o2.name))
				return -1;
			if(Minecraft.getMinecraft().fontRenderer.getStringWidth(o1.name) < Minecraft.getMinecraft().fontRenderer.getStringWidth(o2.name))
				return 1;
			
			
			return 0;
		}
		
	}
	
	public void draw() {
		if(infoenabled == true) {
			if(GameSettings.showDebugInfo == false) {
			int xCoord = (int) Minecraft.thePlayer.posX;
			int yCoord = (int) Minecraft.thePlayer.posY;
			int zCoord = (int) Minecraft.thePlayer.posZ;
			mc.fontRenderer.drawStringWithShadow("["+xCoord+", "+yCoord+", "+zCoord+"]", 4, 14, ColorUtil.getRainbow(4, 1.0f, 1, 1));
			mc.fontRenderer.drawStringWithShadow("Current Item: "+Minecraft.thePlayer.inventory.getStackInSlot(Minecraft.thePlayer.inventory.currentItem), 4, 24, ColorUtil.getRainbow(4, 1.0f, 1, 1));
			mc.fontRenderer.drawStringWithShadow("Name: "+ Session.username, 4, 34, ColorUtil.getRainbow(4, 1.0f, 1, 1));
		}
		}

		
		
		
		ScaledResolution sr = new ScaledResolution(mc.gameSettings, mc.displayWidth, mc.displayHeight);
		FontRenderer fr = mc.fontRenderer;
		
		Collections.sort(Client.modules, new ModuleComparator());
		if(GameSettings.showDebugInfo == false) {
		mc.fontRenderer.drawStringWithShadow(Client.name + " "+ Client.version, 4, 4, ColorUtil.getRainbow(4, 1.0f, 1, 1));
		}
		
		int count = 0;
		
		for(Module m : Client.modules) {
			
			if(!m.toggled)
				continue;	
			if(GameSettings.showDebugInfo == false) {
			mc.fontRenderer.drawStringWithShadow(m.name, sr.getScaledWidth() - fr.getStringWidth(m.name) - 4, 4 + count * (fr.FONT_HEIGHT + 2), ColorUtil.getRainbow(4, 1.0f, 1, 1));
			}
			count++;
			
		}
		
		
	
}
}
	
