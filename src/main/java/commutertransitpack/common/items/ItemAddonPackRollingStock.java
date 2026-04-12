package commutertransitpack.common.items;

import commutertransitpack.common.FoxTCCTP;
import train.common.items.ItemAbstractRollingStock;
import train.common.library.TypeOfRollingStock;


public class ItemAddonPackRollingStock  extends ItemAbstractRollingStock
{
    public ItemAddonPackRollingStock(String iconName, TypeOfRollingStock trainType)
    {
        super(iconName);
        setCreativeTab(FoxTCCTP.addonTabOne);
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
