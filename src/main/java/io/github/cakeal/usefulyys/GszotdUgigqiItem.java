package io.github.cakeal.usefulyys;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class GszotdUgigqiItem extends Item {
    public GszotdUgigqiItem(Settings settings){
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        user.playSound(SoundEvents.ENTITY_SQUID_SQUIRT,1.0F, 1.0F);
        user.spawnSweepAttackParticles();
        return super.use(world, user, hand);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        Block gb = world.getBlockState(context.getBlockPos()).getBlock();
        if(gb == Blocks.ACACIA_LOG || gb == Blocks.BIRCH_LOG
        || gb == Blocks.DARK_OAK_LOG || gb == Blocks.OAK_LOG
        || gb == Blocks.JUNGLE_LOG || gb == Blocks.SPRUCE_LOG) {
            world.removeBlock(context.getBlockPos(),true);
            world.setBlockState(context.getBlockPos(), Blocks.CRAFTING_TABLE.getDefaultState());
        }
        return super.useOnBlock(context);
    }
}
