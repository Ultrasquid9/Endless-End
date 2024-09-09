package juni.endless_end.blocks;

import juni.endless_end.EndlessEnd;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

public class EndlessEndBlocks {
	public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(EndlessEnd.MODID);
	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EndlessEnd.MODID);

	public static final DeferredBlock<TransparentBlock> SHATTERBURN = BLOCKS.register("shatterburn", () -> new TransparentBlock(
		BlockBehaviour.Properties.of()
		.mapColor(MapColor.COLOR_PINK)
		.sound(SoundType.GLASS)
		.lightLevel(state -> 15)
		.noOcclusion()
		.requiresCorrectToolForDrops()
		.strength(0.4F, 4.0F)
	));

	public static final DeferredItem<BlockItem> SHATTERBURN_ITEM = ITEMS.registerSimpleBlockItem("shatterburn", SHATTERBURN);

	public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
		ITEMS.register(eventBus);
    }
}
