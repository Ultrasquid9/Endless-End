package juni.endless_end.blocks;

import juni.endless_end.EndlessEnd;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

public class Blocks {
	public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(EndlessEnd.MODID);
	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EndlessEnd.MODID);

	public static final DeferredBlock<Block> SHATTERBURN = BLOCKS.registerSimpleBlock("shatterburn", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));

	public static final DeferredItem<BlockItem> SHATTERBURN_ITEM = ITEMS.registerSimpleBlockItem("shatterburn", SHATTERBURN);

	public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
		ITEMS.register(eventBus);
    }
}
