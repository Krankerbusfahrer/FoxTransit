package commutertransitpack.common.items;

import train.common.items.ItemAbstractRollingStock;
import train.common.library.TypeOfRollingStock;
import commutertransitpack.common.FoxTCAddonPack;


public class ItemAddonPackRollingStock  extends ItemAbstractRollingStock
{
    public ItemAddonPackRollingStock(String iconName, TypeOfRollingStock trainType)
    {
        super(iconName);
        setCreativeTab(FoxTCAddonPack.addonTabOne);
    }

    @Override
    public String GetContentPackName()
    {
        return "CommuterTransitPack";
    }

    @Override
    public String GetTexturePath()
    {
        return commutertransitpack.common.library.Info.modID.toLowerCase() + ":trains/" + this.iconName;
    }
}
