
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.prob.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.prob.block.entity.SurvivalgeneratorBlockEntity;
import net.mcreator.prob.block.entity.PumpBlockEntity;
import net.mcreator.prob.block.entity.OilRefineryBlockEntity;
import net.mcreator.prob.block.entity.NaquadahGeneratorBlockEntity;
import net.mcreator.prob.block.entity.MilitaryChestBlockEntity;
import net.mcreator.prob.block.entity.DustsmelterBlockEntity;
import net.mcreator.prob.block.entity.Crusherlvl2BlockEntity;
import net.mcreator.prob.block.entity.Crusherlvl1BlockEntity;
import net.mcreator.prob.block.entity.ChemicalReactorBlockEntity;
import net.mcreator.prob.block.entity.BoilerBlockEntity;
import net.mcreator.prob.block.entity.Alloysmelterlvl2BlockEntity;
import net.mcreator.prob.block.entity.Alloysmelterlvl1BlockEntity;
import net.mcreator.prob.ProbMod;

public class ProbModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ProbMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> MILITARY_CHEST = register("military_chest", ProbModBlocks.MILITARY_CHEST,
			MilitaryChestBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ALLOYSMELTERLVL_1 = register("alloysmelterlvl_1", ProbModBlocks.ALLOYSMELTERLVL_1,
			Alloysmelterlvl1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CRUSHERLVL_1 = register("crusherlvl_1", ProbModBlocks.CRUSHERLVL_1,
			Crusherlvl1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BOILER = register("boiler", ProbModBlocks.BOILER, BoilerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SURVIVALGENERATOR = register("survivalgenerator", ProbModBlocks.SURVIVALGENERATOR,
			SurvivalgeneratorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ALLOYSMELTERLVL_2 = register("alloysmelterlvl_2", ProbModBlocks.ALLOYSMELTERLVL_2,
			Alloysmelterlvl2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> NAQUADAH_GENERATOR = register("naquadah_generator", ProbModBlocks.NAQUADAH_GENERATOR,
			NaquadahGeneratorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DUSTSMELTER = register("dustsmelter", ProbModBlocks.DUSTSMELTER,
			DustsmelterBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CRUSHERLVL_2 = register("crusherlvl_2", ProbModBlocks.CRUSHERLVL_2,
			Crusherlvl2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> OIL_REFINERY = register("oil_refinery", ProbModBlocks.OIL_REFINERY,
			OilRefineryBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CHEMICAL_REACTOR = register("chemical_reactor", ProbModBlocks.CHEMICAL_REACTOR,
			ChemicalReactorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PUMP = register("pump", ProbModBlocks.PUMP, PumpBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
