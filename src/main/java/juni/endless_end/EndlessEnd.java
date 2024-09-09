package juni.endless_end;

import juni.endless_end.blocks.Blocks;
import juni.endless_end.items.Items;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(EndlessEnd.MODID)
public class EndlessEnd
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "endless_end";

    // Taking the stuff in the other files and putting it in the game 
    public EndlessEnd(IEventBus modEventBus, ModContainer modContainer)
    {
        Blocks.BLOCKS.register(modEventBus);
        Blocks.ITEMS.register(modEventBus);
        Items.ITEMS.register(modEventBus);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS)
            event.accept(Blocks.SHATTERBURN_ITEM);
    }
}
