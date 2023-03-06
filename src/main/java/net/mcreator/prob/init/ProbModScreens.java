
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.prob.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.prob.client.gui.SgeneratorGuiScreen;
import net.mcreator.prob.client.gui.OilrefScreen;
import net.mcreator.prob.client.gui.MilitarychestguiScreen;
import net.mcreator.prob.client.gui.DustSmelterGUIScreen;
import net.mcreator.prob.client.gui.Crusherlvl2guiScreen;
import net.mcreator.prob.client.gui.CrusherGuiScreen;
import net.mcreator.prob.client.gui.Chem1Screen;
import net.mcreator.prob.client.gui.BoilerguiScreen;
import net.mcreator.prob.client.gui.Alloysmelterlvl2guiScreen;
import net.mcreator.prob.client.gui.AlloyFurneaceScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ProbModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(ProbModMenus.ALLOY_FURNEACE.get(), AlloyFurneaceScreen::new);
			MenuScreens.register(ProbModMenus.MILITARYCHESTGUI.get(), MilitarychestguiScreen::new);
			MenuScreens.register(ProbModMenus.CRUSHER_GUI.get(), CrusherGuiScreen::new);
			MenuScreens.register(ProbModMenus.BOILERGUI.get(), BoilerguiScreen::new);
			MenuScreens.register(ProbModMenus.SGENERATOR_GUI.get(), SgeneratorGuiScreen::new);
			MenuScreens.register(ProbModMenus.ALLOYSMELTERLVL_2GUI.get(), Alloysmelterlvl2guiScreen::new);
			MenuScreens.register(ProbModMenus.DUST_SMELTER_GUI.get(), DustSmelterGUIScreen::new);
			MenuScreens.register(ProbModMenus.CRUSHERLVL_2GUI.get(), Crusherlvl2guiScreen::new);
			MenuScreens.register(ProbModMenus.OILREF.get(), OilrefScreen::new);
			MenuScreens.register(ProbModMenus.CHEM_1.get(), Chem1Screen::new);
		});
	}
}
