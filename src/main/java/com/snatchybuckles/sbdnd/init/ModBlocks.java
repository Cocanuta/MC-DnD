package com.snatchybuckles.sbdnd.init;

import com.snatchybuckles.sbdnd.SnatchyBucklesDnD;
import com.snatchybuckles.sbdnd.blocks.PodiumBlock;
import com.snatchybuckles.sbdnd.blocks.entity.PodiumBlockEntity;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SnatchyBucklesDnD.MODID);
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, SnatchyBucklesDnD.MODID);

    // Blocks

    // Block Entities

}
