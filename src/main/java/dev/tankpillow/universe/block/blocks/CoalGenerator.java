package dev.tankpillow.universe.block.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

public class CoalGenerator extends HorizontalFacingBlock
{
 
	public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

	public CoalGenerator() 
	{
		super(Settings.of(Material.STONE).strength(3.5f));
		this.setDefaultState(this.getStateManager().getDefaultState().with(FACING, Direction.NORTH));
	}
	
	@Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) 
	{
        builder.add(FACING);
    }

	@Override
    public BlockState getPlacementState(ItemPlacementContext ctx) 
	{
        return this.getDefaultState().with(FACING, ctx.getPlayerFacing().getOpposite());
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) 
    {
        if (!world.isClient) {
            
        }
        return ActionResult.SUCCESS;
    }
	
}
