package netcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import netcraft.Netcraft;
import netcraft.init.Blocks;
import netcraft.init.Items;

import javax.annotation.Nullable;
import java.util.Random;

public class CupritOre extends Block {

    public static final String name = "cuprit_ore";

    public CupritOre() {
        super(Material.ROCK);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(Netcraft.NETCRAFT_TAB);
        Blocks.registerBlock(this);
    }

    @Override
    public int quantityDropped(Random random) {
        return 1 + random.nextInt(3);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Items.cupritDust;
    }
}