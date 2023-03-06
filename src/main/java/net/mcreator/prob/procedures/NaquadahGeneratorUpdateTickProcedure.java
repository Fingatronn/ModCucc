package net.mcreator.prob.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import net.mcreator.prob.init.ProbModItems;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicBoolean;

public class NaquadahGeneratorUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null)
							.ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, new BlockPos(x, y, z), 0)).getItem() == ProbModItems.REFINED_NAQUADAH_DIOXID.get()) {
			if (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos(x, y, z), "burn") <= 250) {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("burn", (new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos(x, y, z), "burn") + 1));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (new Object() {
					public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
						AtomicBoolean _retval = new AtomicBoolean(false);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
						return _retval.get();
					}
				}.canReceiveEnergy(world, new BlockPos(x, y + 1, z))) {
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y + 1, z));
						int _amount = new Object() {
							public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
								AtomicInteger _retval = new AtomicInteger(0);
								BlockEntity _ent = level.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(ForgeCapabilities.ENERGY, null)
											.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
								return _retval.get();
							}
						}.receiveEnergySimulate(world, new BlockPos(x, y + 1, z), 1000);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
					}
				}
				if (new Object() {
					public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
						AtomicBoolean _retval = new AtomicBoolean(false);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
						return _retval.get();
					}
				}.canReceiveEnergy(world, new BlockPos(x, y - 1, z))) {
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y - 1, z));
						int _amount = new Object() {
							public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
								AtomicInteger _retval = new AtomicInteger(0);
								BlockEntity _ent = level.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(ForgeCapabilities.ENERGY, null)
											.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
								return _retval.get();
							}
						}.receiveEnergySimulate(world, new BlockPos(x, y - 1, z), 1000);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
					}
				}
				if (new Object() {
					public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
						AtomicBoolean _retval = new AtomicBoolean(false);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
						return _retval.get();
					}
				}.canReceiveEnergy(world, new BlockPos(x + 1, y, z))) {
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos(x + 1, y, z));
						int _amount = new Object() {
							public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
								AtomicInteger _retval = new AtomicInteger(0);
								BlockEntity _ent = level.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(ForgeCapabilities.ENERGY, null)
											.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
								return _retval.get();
							}
						}.receiveEnergySimulate(world, new BlockPos(x + 1, y, z), 1000);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
					}
				}
				if (new Object() {
					public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
						AtomicBoolean _retval = new AtomicBoolean(false);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
						return _retval.get();
					}
				}.canReceiveEnergy(world, new BlockPos(x - 1, y, z))) {
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos(x - 1, y, z));
						int _amount = new Object() {
							public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
								AtomicInteger _retval = new AtomicInteger(0);
								BlockEntity _ent = level.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(ForgeCapabilities.ENERGY, null)
											.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
								return _retval.get();
							}
						}.receiveEnergySimulate(world, new BlockPos(x - 1, y, z), 1000);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
					}
				}
				if (new Object() {
					public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
						AtomicBoolean _retval = new AtomicBoolean(false);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> _retval.set(capability.canReceive()));
						return _retval.get();
					}
				}.canReceiveEnergy(world, new BlockPos(x, y, z - 1))) {
					{
						BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z - 1));
						int _amount = new Object() {
							public int receiveEnergySimulate(LevelAccessor level, BlockPos pos, int _amount) {
								AtomicInteger _retval = new AtomicInteger(0);
								BlockEntity _ent = level.getBlockEntity(pos);
								if (_ent != null)
									_ent.getCapability(ForgeCapabilities.ENERGY, null)
											.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
								return _retval.get();
							}
						}.receiveEnergySimulate(world, new BlockPos(x, y, z - 1), 1000);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
					}
				}
			} else {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("burn", 0);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				{
					BlockEntity _ent = world.getBlockEntity(new BlockPos(x, y, z));
					if (_ent != null) {
						final int _slotid = 0;
						final int _amount = 1;
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable) {
								ItemStack _stk = capability.getStackInSlot(_slotid).copy();
								_stk.shrink(_amount);
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
							}
						});
					}
				}
			}
		}
	}
}
