package com.minecraftabnormals.biome_vote_losers.register;

import com.minecraftabnormals.biome_vote_losers.BiomeVoteLosers;
import com.minecraftabnormals.biome_vote_losers.world.level.block.*;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.grower.OakTreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;

public class ModBlocks {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BiomeVoteLosers.MODID);

	// BADLANDS

	public static final RegistryObject<PearCactusBlock> PEAR_CACTUS = register("pear_cactus", () -> new PearCactusBlock(BlockBehaviour.Properties.of(Material.CACTUS).noOcclusion().randomTicks().instabreak().sound(SoundType.WOOL)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<PearCactusBlock> STRIPPED_PEAR_CACTUS = register("stripped_pear_cactus", () -> new PearCactusBlock(BlockBehaviour.Properties.of(Material.CACTUS).noOcclusion().randomTicks().instabreak().sound(SoundType.WOOL)), CreativeModeTab.TAB_DECORATIONS);

	public static final RegistryObject<TumbleWeedBlock> TUMBLEWEED = noItemRegister("tumbleweed", () -> new TumbleWeedBlock(BlockBehaviour.Properties.of(Material.PLANT).noOcclusion().randomTicks().instabreak().sound(SoundType.SWEET_BERRY_BUSH)));

	// SAVANNA

	public static final RegistryObject<MoundBlock> MOUND = register("mound", () -> new MoundBlock(BlockBehaviour.Properties.of(Material.CLAY)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<MoundBlock> TERMITE_MOUND = register("termite_mound", () -> new MoundBlock(BlockBehaviour.Properties.of(Material.CLAY)), CreativeModeTab.TAB_DECORATIONS);

	public static final RegistryObject<OstrichEggBlock> OSTRICH_EGG = register("ostrich_egg", () -> new OstrichEggBlock(BlockBehaviour.Properties.of(Material.EGG)), CreativeModeTab.TAB_DECORATIONS);

	public static final RegistryObject<Block> BAOBAB_LEAVES = register("baobab_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<RotatedPillarBlock> BAOBAB_TRUNK = register("baobab_trunk", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD)));
	public static final RegistryObject<RotatedPillarBlock> BAOBAB_BARK = register("baobab_bark", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD)));
	public static final RegistryObject<HangingLeavesBlock> BAOBAB_FLOWER = register("baobab_flower", () -> new HangingLeavesBlock(BlockBehaviour.Properties.of(Material.PLANT)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<HangingLeavesBlock> BAOBAB_FRUIT = noItemRegister("baobab_fruit", () -> new HangingLeavesBlock(BlockBehaviour.Properties.of(Material.PLANT)));

	// DESERT

	public static final RegistryObject<Block> BURROW = register("burrow", () -> new Block(BlockBehaviour.Properties.of(Material.SAND)));

	public static final BlockBehaviour.Properties PALM = BlockBehaviour.Properties.of(Material.WOOD).explosionResistance(9.0F);

	public static final RegistryObject<RotatedPillarBlock> PALM_LOG = register("palm_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD)));
	public static final RegistryObject<LeavesBlock> PALM_LEAVES = register("palm_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<HangingLeavesBlock> PALM_LEAVES_HANGING = register("palm_leaves_hanging", () -> new HangingLeavesBlock(BlockBehaviour.Properties.of(Material.PLANT)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<RotatedPillarBlock> STRIPPED_PALM_LOG = register("stripped_palm_log", () -> new RotatedPillarBlock(PALM));
	public static final RegistryObject<RotatedPillarBlock> PALM_WOOD = register("palm_wood", () -> new RotatedPillarBlock(PALM));
	public static final RegistryObject<RotatedPillarBlock> STRIPPED_PALM_WOOD = register("stripped_palm_wood", () -> new RotatedPillarBlock(PALM));
	public static final RegistryObject<Block> PALM_PLANKS = register("palm_planks", () -> new Block(PALM));
	public static final RegistryObject<Block> PALM_SAPLING = register("palm_sapling", () -> new SaplingBlock(new OakTreeGrower(), BlockBehaviour.Properties.of(Material.PLANT)), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<DoorBlock> PALM_DOOR = register("palm_door", () -> new DoorBlock(PALM.noOcclusion()), CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<TrapDoorBlock> PALM_TRAPDOOR = register("palm_trapdoor", () -> new TrapDoorBlock(PALM.noOcclusion()), CreativeModeTab.TAB_REDSTONE);
	// todo public static final RegistryObject<StandingSignBlock> PALM_SIGN = register("palm_sign", () -> new StandingSignBlock(BlockBehaviour.Properties.of(Material.WOOD), WoodType.OAK), CreativeModeTab.TAB_DECORATIONS);
	// todo public static final RegistryObject<WallSignBlock> PALM_WALL_SIGN = register("palm_wall_sign", () -> new WallSignBlock(BlockBehaviour.Properties.of(Material.WOOD), WoodType.OAK), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<FenceBlock> PALM_FENCE = register("palm_fence", () -> new FenceBlock(PALM), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<FenceGateBlock> PALM_FENCE_GATE = register("palm_fence_gate", () -> new FenceGateBlock(PALM), CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<StairBlock> PALM_STAIRS = register("palm_stairs", () -> new StairBlock(() -> PALM_PLANKS.get().defaultBlockState(), PALM));
	public static final RegistryObject<SlabBlock> PALM_SLAB = register("palm_slab", () -> new SlabBlock(PALM));
	public static final RegistryObject<WoodButtonBlock> PALM_BUTTON = register("palm_button", () -> new WoodButtonBlock(PALM), CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<PressurePlateBlock> PALM_PRESSURE_PLATE = register("palm_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, PALM), CreativeModeTab.TAB_REDSTONE);

	public static final RegistryObject<SaltBlock> SALT_BLOCK = register("salt_block", () -> new SaltBlock(BlockBehaviour.Properties.of(Material.GLASS).noOcclusion()));
	public static final RegistryObject<SaltBlock> SALT_BRICKS = register("salt_bricks", () -> new SaltBlock(BlockBehaviour.Properties.of(Material.GLASS).noOcclusion()));
	public static final RegistryObject<SaltBlock> SALT_TILES = register("salt_tiles", () -> new SaltBlock(BlockBehaviour.Properties.of(Material.GLASS).noOcclusion()));
	public static final RegistryObject<SaltBlock> CHISELED_SALT_BLOCK = register("chiseled_salt_block", () -> new SaltBlock(BlockBehaviour.Properties.of(Material.GLASS).noOcclusion()));
	public static final RegistryObject<SaltBlock> SALT_SLAB = register("salt_slab", () -> new SaltSlabBlock(BlockBehaviour.Properties.of(Material.GLASS).noOcclusion()));
	public static final RegistryObject<SaltBlock> SALT_BRICK_SLAB = register("salt_brick_slab", () -> new SaltSlabBlock(BlockBehaviour.Properties.of(Material.GLASS).noOcclusion()));
	public static final RegistryObject<SaltBlock> SALT_TILE_SLAB = register("salt_tile_slab", () -> new SaltSlabBlock(BlockBehaviour.Properties.of(Material.GLASS).noOcclusion()));
	public static final RegistryObject<SaltBlock> SALT_STAIRS = register("salt_stairs", () -> new SaltStairBlock(BlockBehaviour.Properties.of(Material.GLASS).noOcclusion()));
	public static final RegistryObject<SaltBlock> SALT_BRICK_STAIRS = register("salt_brick_stairs", () -> new SaltStairBlock(BlockBehaviour.Properties.of(Material.GLASS).noOcclusion()));
	public static final RegistryObject<SaltBlock> SALT_TILE_STAIRS = register("salt_tile_stairs", () -> new SaltStairBlock(BlockBehaviour.Properties.of(Material.GLASS).noOcclusion()));

	public static final RegistryObject<SaltLampBlock> SALT_LAMP = register("salt_lamp", () -> new SaltLampBlock(BlockBehaviour.Properties.of(Material.GLASS).noOcclusion()), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<SaltTrailBlock> SALT = register("salt", () -> new SaltTrailBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().instabreak()), CreativeModeTab.TAB_MISC);

	public static final RegistryObject<SucculentBlock> SUCCULENT = register("succulent", () -> new SucculentBlock(BlockBehaviour.Properties.of(Material.PLANT).instabreak().noOcclusion().noCollission()), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<FlowerPotBlock> POTTED_SUCCULENT = noItemRegister("potted_succulent", () -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, SUCCULENT, BlockBehaviour.Properties.of(Material.DECORATION).instabreak().noOcclusion()));

	private static <T extends Block> RegistryObject<T> baseRegister(String name, Supplier<? extends T> block, Function<RegistryObject<T>, Supplier<? extends Item>> item) {
		RegistryObject<T> register = BLOCKS.register(name, block);
		ModItems.ITEMS.register(name, item.apply(register));
		return register;
	}

	private static <T extends Block> RegistryObject<T> noItemRegister(String name, Supplier<? extends T> block) {
		RegistryObject<T> register = BLOCKS.register(name, block);
		return register;
	}

	private static <B extends Block> RegistryObject<B> register(String name, Supplier<? extends Block> block) {
		return (RegistryObject<B>) baseRegister(name, block, (object) -> ModBlocks.registerBlockItem(object, CreativeModeTab.TAB_BUILDING_BLOCKS));
	}

	private static <B extends Block> RegistryObject<B> register(String name, Supplier<? extends Block> block, CreativeModeTab tab) {
		return (RegistryObject<B>) baseRegister(name, block, (object) -> ModBlocks.registerBlockItem(object, tab));
	}

	private static <T extends Block> Supplier<BlockItem> registerBlockItem(final RegistryObject<T> block, CreativeModeTab tab) {
		return () -> {
			return new BlockItem(Objects.requireNonNull(block.get()), new Item.Properties().tab(tab));
		};
	}
}
