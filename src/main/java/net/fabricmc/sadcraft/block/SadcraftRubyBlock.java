package net.fabricmc.sadcraft.block;

import eu.pb4.polymer.ext.blocks.api.BlockModelType;
import eu.pb4.polymer.ext.blocks.api.PolymerBlockModel;
import eu.pb4.polymer.ext.blocks.api.PolymerBlockResourceUtils;
import eu.pb4.polymer.ext.blocks.api.PolymerTexturedBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;

public class SadcraftRubyBlock extends Block implements PolymerTexturedBlock {
    public SadcraftRubyBlock(Settings settings) {super(settings);}
    public Block getPolymerBlock(){return Blocks.EMERALD_BLOCK;}

    public PolymerBlockModel blockModel = new PolymerBlockModel(new Identifier("sadcraft","block/ruby_block"),0,0,false,1);

    public BlockState resourceUtils = PolymerBlockResourceUtils.requestBlock(BlockModelType.FULL_BLOCK,blockModel);

    @Override
    public BlockState getPolymerBlockState(BlockState state) {
        return resourceUtils;
    }

    @Override
    public Block getPolymerBlock(ServerPlayerEntity player, BlockState state) {
        return resourceUtils.getBlock();
    }
    @Override
    public Block getPolymerBlock(BlockState state) {
        return getPolymerBlock();
    }
}
