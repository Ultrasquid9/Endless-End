package juni.endless_end.items;

import juni.endless_end.EndlessEnd;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

public class EndlessEndItems {
	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EndlessEnd.MODID);

	public static final DeferredItem<Item> EXAMPLE_ITEM = ITEMS.registerSimpleItem("example_item", new Item.Properties().food(new FoodProperties.Builder()
	.alwaysEdible().nutrition(1).saturationModifier(2f).build()));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
    }
}
