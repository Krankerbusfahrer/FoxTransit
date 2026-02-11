package commutertransitpack.common.library;

import cpw.mods.fml.common.registry.GameRegistry;
import commutertransitpack.common.items.ItemAddonPackRollingStock;

public class CTPItems
{
    /**
     * Setup all items
     */
    public CTPItems()
    {
        loadRollingStockItems();
        registerItems();
    }

    private void loadRollingStockItems()
    {
        for (CTPRollingStockItems item : CTPRollingStockItems.values())
        {
            item.item = new ItemAddonPackRollingStock(item.iconName, item.TypeOfRollingStock);
        }
    }

    private void registerItems() {
        for (CTPRollingStockItems item : CTPRollingStockItems.values()) {
            if (item.item != null) {
                item.item.setUnlocalizedName(Info.modID + ":" + item.ItemName);
                GameRegistry.registerItem(item.item, item.ItemName);
            }
        }
    }
}
