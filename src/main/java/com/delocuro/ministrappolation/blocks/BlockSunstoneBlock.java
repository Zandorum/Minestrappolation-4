package com.delocuro.ministrappolation.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;

import com.delocuro.ministrappolation.init.MItems;

public class BlockSunstoneBlock extends MBlock{
	
	private final MapColor mapColor;
	
	public BlockSunstoneBlock(Material materialIn, MapColor mapColorIn) {
		super(materialIn, mapColorIn);
		this.mapColor = mapColorIn;
	}
	
	public MapColor getMapColor(IBlockState state)
    {
        return this.mapColor;
    }
	
	public int quantityDroppedWithBonus(int fortune, Random random)
    {
        return MathHelper.clamp_int(this.quantityDropped(random) + random.nextInt(fortune + 1), 1, 4);
    }

    public int quantityDropped(Random random)
    {
        return 2 + random.nextInt(3);
    }

    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return MItems.sunstone_shard;
    }
}
