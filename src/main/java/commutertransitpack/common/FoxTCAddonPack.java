package commutertransitpack.common;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import train.common.core.creativetab.GenericCreativeTabTraincraft;
import commutertransitpack.common.core.handler.AddonPackRollingStockEntityHandler;
import commutertransitpack.common.library.CTPItems;
import commutertransitpack.common.library.Info;
import commutertransitpack.common.recipes.AddonTableRecipeRegister;


@Mod(modid = Info.modID, name = Info.modName, version = Info.modVersion, dependencies = "required-after:tc")
public class FoxTCAddonPack
{
    /* TrainCraft instance */
    @Instance(Info.modID)
    public static FoxTCAddonPack instance;

    /* TrainCraft Logger */
    public static Logger addonLog = LogManager.getLogger(Info.modName);

    public static CreativeTabs addonTabOne;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        addonLog.info("preInit Addon Pack -" + Info.modName);
        addonTabOne = new GenericCreativeTabTraincraft("addonTabOne", Info.modID, "apple");

        CTPItems addonPackItems = new CTPItems();
        AddonPackRollingStockEntityHandler entityHandler = new AddonPackRollingStockEntityHandler();
    }

    @EventHandler
    public void load(FMLInitializationEvent event)
    {
        addonLog.info("load Addon Pack -" + Info.modName);

        addonLog.info("Initializing recipes...");
        new AddonTableRecipeRegister();

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        addonLog.info("postInit Addon Pack -" + Info.modName);
    }
}
