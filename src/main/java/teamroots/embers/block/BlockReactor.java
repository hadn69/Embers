package teamroots.embers.block;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import teamroots.embers.tileentity.TileEntityReactor;

public class BlockReactor extends BlockTEBase {
    public static AxisAlignedBB AABB_BASE = new AxisAlignedBB(0.125, 0.0, 0.125, 0.875, 1.0, 0.875);

    public BlockReactor(Material material, String name, boolean addToTab) {
        super(material, name, addToTab);
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return AABB_BASE;
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityReactor();
    }
}
