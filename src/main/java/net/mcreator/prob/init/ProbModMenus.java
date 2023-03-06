
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.prob.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.prob.world.inventory.SgeneratorGuiMenu;
import net.mcreator.prob.world.inventory.OilrefMenu;
import net.mcreator.prob.world.inventory.MilitarychestguiMenu;
import net.mcreator.prob.world.inventory.DustSmelterGUIMenu;
import net.mcreator.prob.world.inventory.Crusherlvl2guiMenu;
import net.mcreator.prob.world.inventory.CrusherGuiMenu;
import net.mcreator.prob.world.inventory.Chem1Menu;
import net.mcreator.prob.world.inventory.BoilerguiMenu;
import net.mcreator.prob.world.inventory.Alloysmelterlvl2guiMenu;
import net.mcreator.prob.world.inventory.AlloyFurneaceMenu;
import net.mcreator.prob.ProbMod;

public class ProbModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, ProbMod.MODID);
	public static final RegistryObject<MenuType<AlloyFurneaceMenu>> ALLOY_FURNEACE = REGISTRY.register("alloy_furneace",
			() -> IForgeMenuType.create(AlloyFurneaceMenu::new));
	public static final RegistryObject<MenuType<MilitarychestguiMenu>> MILITARYCHESTGUI = REGISTRY.register("militarychestgui",
			() -> IForgeMenuType.create(MilitarychestguiMenu::new));
	public static final RegistryObject<MenuType<CrusherGuiMenu>> CRUSHER_GUI = REGISTRY.register("crusher_gui",
			() -> IForgeMenuType.create(CrusherGuiMenu::new));
	public static final RegistryObject<MenuType<BoilerguiMenu>> BOILERGUI = REGISTRY.register("boilergui",
			() -> IForgeMenuType.create(BoilerguiMenu::new));
	public static final RegistryObject<MenuType<SgeneratorGuiMenu>> SGENERATOR_GUI = REGISTRY.register("sgenerator_gui",
			() -> IForgeMenuType.create(SgeneratorGuiMenu::new));
	public static final RegistryObject<MenuType<Alloysmelterlvl2guiMenu>> ALLOYSMELTERLVL_2GUI = REGISTRY.register("alloysmelterlvl_2gui",
			() -> IForgeMenuType.create(Alloysmelterlvl2guiMenu::new));
	public static final RegistryObject<MenuType<DustSmelterGUIMenu>> DUST_SMELTER_GUI = REGISTRY.register("dust_smelter_gui",
			() -> IForgeMenuType.create(DustSmelterGUIMenu::new));
	public static final RegistryObject<MenuType<Crusherlvl2guiMenu>> CRUSHERLVL_2GUI = REGISTRY.register("crusherlvl_2gui",
			() -> IForgeMenuType.create(Crusherlvl2guiMenu::new));
	public static final RegistryObject<MenuType<OilrefMenu>> OILREF = REGISTRY.register("oilref", () -> IForgeMenuType.create(OilrefMenu::new));
	public static final RegistryObject<MenuType<Chem1Menu>> CHEM_1 = REGISTRY.register("chem_1", () -> IForgeMenuType.create(Chem1Menu::new));
}
