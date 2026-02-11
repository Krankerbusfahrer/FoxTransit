package commutertransitpack.common.library;

import net.minecraft.item.Item;
import train.common.library.TypeOfRollingStock;

/**
 * Enum class for the Rolling stock item
 * DO NOT ADD OTHER ITEMS BESIDES ROLLING STOCK ITEMS HERE
 */
public enum CTPRollingStockItems
{
    BSLB4("item.BSLB4_Icon", train.common.library.TypeOfRollingStock.ELECTRIC),
    ;


    /**
     * @param iconName
     * @param amountForEmerald amount for Emerald
     */
    CTPRollingStockItems(String iconName, train.common.library.TypeOfRollingStock typeOfRollingStock, int amountForEmerald)
    {
        this.iconName = iconName;
        TypeOfRollingStock = typeOfRollingStock;
        this.amountForEmerald = (byte) amountForEmerald;
        ItemName = this.name();
    }

    CTPRollingStockItems(String itemName, String iconName, train.common.library.TypeOfRollingStock typeOfRollingStock, int amountForEmerald)
    {
        this.iconName = iconName;
        TypeOfRollingStock = typeOfRollingStock;
        this.amountForEmerald = (byte) amountForEmerald;
        ItemName = itemName;
    }

    /** USED FOR ROLLINGSTOCK THAT IS NOT ALLOWED TO BE TRADED FOR
     * @param iconName
     * @param typeOfRollingStock the type of rollingstock
     */

    CTPRollingStockItems(String iconName, TypeOfRollingStock typeOfRollingStock)
    {
        this.iconName = iconName;
        TypeOfRollingStock = typeOfRollingStock;
        this.amountForEmerald = -1;
        ItemName = this.name();
    }

    CTPRollingStockItems(String itemName, String iconName, TypeOfRollingStock typeOfRollingStock)
    {
        this.iconName = iconName;
        TypeOfRollingStock = typeOfRollingStock;
        this.amountForEmerald = -1;
        ItemName = itemName;
    }

    public Item item;
    public final String iconName;
    public final TypeOfRollingStock TypeOfRollingStock;

    public final String ItemName;

    /**
     * amount for emerald. For ItemRollingStock, it is the price for one train
     */
    public byte amountForEmerald;
}
