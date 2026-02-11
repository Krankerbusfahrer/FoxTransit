package commutertransitpack.common.core.handler;

public enum TypeOfRollingStockCommuterTransitPack {


    DIESEL("DIESEL"),
    ELECTRIC("ELETRIC"),
    PASSENGER("PASSENGER"),
    UNIVERSAL("UNIVERSAL"),
    //BUS "BUS" ..Please?),


    public final String EnumTypeOfRollingStockCommuterTransitPack;

    private TypeOfRollingStockCommuterTransitPack(String EnumTypeOfRollingStockCommuterTransitPack) {
        this.EnumTypeOfRollingStockCommuterTransitPack = EnumTypeOfRollingStockCommuterTransitPack;
    }
}
