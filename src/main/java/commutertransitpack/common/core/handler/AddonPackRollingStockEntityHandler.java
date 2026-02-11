package commutertransitpack.common.core.handler;

import commutertransitpack.common.FoxTCAddonPack;
import commutertransitpack.common.entity.locomotive.ElectricBSLB4;
import commutertransitpack.common.library.CTPRollingStockItems;
import train.common.Traincraft;
import train.common.library.register.TrainRecord;

public class AddonPackRollingStockEntityHandler
{
    private Object Instance()
    {
        return FoxTCAddonPack.instance;
    }

    public AddonPackRollingStockEntityHandler()
    {
        /* Sample

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity
                        (ItemIDs.minecartPassengerBlue.item,
                                new TrainRecord("Passenger Blue", EntityPassengerBlue.class, ItemIDs.minecartPassengerBlue.item, EnumTrainType.Passenger, 1,
                                        new String[]{"Blue", "Red", "Green", "White", "Black", "Cyan", "Orange", "Grey", "LightGrey", "LightBlue"},
                                        18),
                                Instance() // don't touch this line
                        );
         */

        // Put Calls to RegisterRollingStockEntity below this.


        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(CTPRollingStockItems.BSLB4.item,
                        new TrainRecord(Transport.BSLB4().name, ElectricBSLB4.class, CTPRollingStockItems.BSLB4.item,
                                Transport.BSLB4().additionalText2, Transport.BSLB4().weightinKGs,
                                new String[] {"Orange"}, 5, 0, 0.95, (int)Transport.BSLB4().topSpeed,
                                (int)Transport.BSLB4().metric_horsepower, 40, 0,
                                0.95, -3.5f, 0),
                        Instance()
                );


    }
}
