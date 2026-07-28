package commutertransitpack.common.core.handler;

import commutertransitpack.common.FoxTCCTP;
import commutertransitpack.common.entity.locomotive.ElectricBSLB4;
import commutertransitpack.common.entity.locomotive.ElectricSEPTALRV;
import commutertransitpack.common.entity.passenger.PassengerBSLB4;
import commutertransitpack.common.library.CTPRollingStockItems;
import train.common.Traincraft;
import train.common.library.EnumTrainType;
import train.common.library.register.TrainRecord;

public class AddonPackRollingStockEntityHandler
{
    private Object Instance()
    {
        return FoxTCCTP.instance;
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

                        new TrainRecord("BSLB4", ElectricBSLB4.class, CTPRollingStockItems.BSLB4.item)
                                .setTrainType(EnumTrainType.Electric)
                                .setMHP(350)
                                .setMaxSpeed(100)
                                .setMass(0)
                                .setFuelConsumption(10)
                                .setHeatingTime(170)
                                .setAccelerationRate(0.95)
                                .setBrakeRate(0.95)
                                .setColors(new String[] {"Orange"})
                                .setGuiRenderScale(10)
                                .setBogieLocoPosition(-2.5f)
                                .setAdditionalTooltip(new String[] {"First CTP Train"}),
                        Instance()
                );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(CTPRollingStockItems.BSLB4Passenger.item,
            new TrainRecord("BSLB4Passenger", PassengerBSLB4.class, CTPRollingStockItems.BSLB4Passenger.item)
                    .setTrainType(EnumTrainType.Passenger)
                    .setMass(2)
                    .setColors(new String[] {"Orange"})
                    .setGuiRenderScale(14)
                    .setBogieLocoPosition(-2.5f)
                    .setAdditionalTooltip(new String[] {"First CTP Passenger Cart"}),
            Instance()
    );

        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity(CTPRollingStockItems.SEPTALRV.item,

                        new TrainRecord("SEPTALRV", ElectricSEPTALRV.class, CTPRollingStockItems.SEPTALRV.item)
                                .setTrainType(EnumTrainType.Electric)
                                .setMHP(300)
                                .setMaxSpeed(70)
                                .setMass(0)
                                .setFuelConsumption(10)
                                .setHeatingTime(170)
                                .setAccelerationRate(0.95)
                                .setBrakeRate(0.95)
                                .setColors(new String[] {"White"})
                                .setGuiRenderScale(10)
                                .setBogieLocoPosition(-2.5f)
                                .setAdditionalTooltip(new String[] {"First trolley in CTP"}),
                        Instance()
                );



    }
}
