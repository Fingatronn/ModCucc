package net.mcreator.prob.procedures;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class IronSawBlockDestroyedWithToolProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if ((world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("logs")))) {
			if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
				if ((world.getBlockState(new BlockPos(x, y + 2, z))).getBlock() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
					if ((world.getBlockState(new BlockPos(x, y + 3, z))).getBlock() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
						if ((world.getBlockState(new BlockPos(x, y + 4, z))).getBlock() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
							if ((world.getBlockState(new BlockPos(x, y + 5, z))).getBlock() == (world.getBlockState(new BlockPos(x, y, z)))
									.getBlock()) {
								if ((world.getBlockState(new BlockPos(x, y + 6, z))).getBlock() == (world.getBlockState(new BlockPos(x, y, z)))
										.getBlock()) {
									if ((world.getBlockState(new BlockPos(x, y + 7, z))).getBlock() == (world.getBlockState(new BlockPos(x, y, z)))
											.getBlock()) {
										if ((world.getBlockState(new BlockPos(x, y + 8, z)))
												.getBlock() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
											if ((world.getBlockState(new BlockPos(x, y + 9, z)))
													.getBlock() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
												if ((world.getBlockState(new BlockPos(x, y + 10, z)))
														.getBlock() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
													if ((world.getBlockState(new BlockPos(x, y + 11, z)))
															.getBlock() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
														if ((world.getBlockState(new BlockPos(x, y + 12, z)))
																.getBlock() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
															if ((world.getBlockState(new BlockPos(x, y + 13, z)))
																	.getBlock() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
																if ((world.getBlockState(new BlockPos(x, y + 14, z)))
																		.getBlock() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
																	if ((world.getBlockState(new BlockPos(x, y + 15, z)))
																			.getBlock() == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
																		if ((world.getBlockState(new BlockPos(x, y + 16, z)))
																				.getBlock() == (world.getBlockState(new BlockPos(x, y, z)))
																						.getBlock()) {
																			if ((world.getBlockState(new BlockPos(x, y + 17, z)))
																					.getBlock() == (world.getBlockState(new BlockPos(x, y, z)))
																							.getBlock()) {
																				if ((world.getBlockState(new BlockPos(x, y + 18, z)))
																						.getBlock() == (world.getBlockState(new BlockPos(x, y, z)))
																								.getBlock()) {
																					if ((world.getBlockState(new BlockPos(x, y + 19, z)))
																							.getBlock() == (world
																									.getBlockState(new BlockPos(x, y, z)))
																									.getBlock()) {
																						if ((world.getBlockState(new BlockPos(x, y + 20, z)))
																								.getBlock() == (world
																										.getBlockState(new BlockPos(x, y, z)))
																										.getBlock()) {
																							{
																								BlockPos _pos = new BlockPos(x, y, y + 20);
																								Block.dropResources(world.getBlockState(_pos), world,
																										new BlockPos(x, y, z), null);
																								world.destroyBlock(_pos, false);
																							}
																						}
																						{
																							BlockPos _pos = new BlockPos(x, y, y + 19);
																							Block.dropResources(world.getBlockState(_pos), world,
																									new BlockPos(x, y, z), null);
																							world.destroyBlock(_pos, false);
																						}
																					}
																					{
																						BlockPos _pos = new BlockPos(x, y, y + 18);
																						Block.dropResources(world.getBlockState(_pos), world,
																								new BlockPos(x, y, z), null);
																						world.destroyBlock(_pos, false);
																					}
																				}
																				{
																					BlockPos _pos = new BlockPos(x, y, y + 17);
																					Block.dropResources(world.getBlockState(_pos), world,
																							new BlockPos(x, y, z), null);
																					world.destroyBlock(_pos, false);
																				}
																			}
																			{
																				BlockPos _pos = new BlockPos(x, y, y + 16);
																				Block.dropResources(world.getBlockState(_pos), world,
																						new BlockPos(x, y, z), null);
																				world.destroyBlock(_pos, false);
																			}
																		}
																		{
																			BlockPos _pos = new BlockPos(x, y, y + 15);
																			Block.dropResources(world.getBlockState(_pos), world,
																					new BlockPos(x, y, z), null);
																			world.destroyBlock(_pos, false);
																		}
																	}
																	{
																		BlockPos _pos = new BlockPos(x, y, y + 14);
																		Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z),
																				null);
																		world.destroyBlock(_pos, false);
																	}
																}
																{
																	BlockPos _pos = new BlockPos(x, y, y + 13);
																	Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z),
																			null);
																	world.destroyBlock(_pos, false);
																}
															}
															{
																BlockPos _pos = new BlockPos(x, y, y + 12);
																Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
																world.destroyBlock(_pos, false);
															}
														}
														{
															BlockPos _pos = new BlockPos(x, y, y + 11);
															Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
															world.destroyBlock(_pos, false);
														}
													}
													{
														BlockPos _pos = new BlockPos(x, y, y + 10);
														Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
														world.destroyBlock(_pos, false);
													}
												}
												{
													BlockPos _pos = new BlockPos(x, y, y + 9);
													Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
													world.destroyBlock(_pos, false);
												}
											}
											{
												BlockPos _pos = new BlockPos(x, y + 8, z);
												Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
												world.destroyBlock(_pos, false);
											}
										}
										{
											BlockPos _pos = new BlockPos(x, y + 7, z);
											Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
											world.destroyBlock(_pos, false);
										}
									}
									{
										BlockPos _pos = new BlockPos(x, y + 6, z);
										Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
										world.destroyBlock(_pos, false);
									}
								}
								{
									BlockPos _pos = new BlockPos(x, y + 5, z);
									Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
									world.destroyBlock(_pos, false);
								}
							}
							{
								BlockPos _pos = new BlockPos(x, y + 4, z);
								Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
								world.destroyBlock(_pos, false);
							}
						}
						{
							BlockPos _pos = new BlockPos(x, y + 3, z);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
							world.destroyBlock(_pos, false);
						}
					}
					{
						BlockPos _pos = new BlockPos(x, y + 2, z);
						Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
						world.destroyBlock(_pos, false);
					}
				}
				{
					BlockPos _pos = new BlockPos(x, y + 1, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
			}
			{
				BlockPos _pos = new BlockPos(x, y, z);
				Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
	}
}
