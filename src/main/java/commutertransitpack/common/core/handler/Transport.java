package commutertransitpack.common.core.handler;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Transport {

    public static String era = "commutertransitpack.era";
    public static String nick = "commutertransitpack.nick";
    public static String type = "commutertransitpack.type";
    public static String aditional = "commutertransitpack.aditional";

    /**
     * Backspeed has to be known
     */
    public static class LocomotiveWithBackspeed {
        public String name;
        public String country;
        public String year;
        public String fuel;
        public String additionalTextTitle;
        public String additionalText;
        public String additionalTextTitle2;
        public String additionalText2;
        public int rows;
        public float tractive_effort;
        public float metric_horsepower;
        public double weightinKGs;
        public float topSpeed;
        public float backTopSpeed;
        public boolean fictional;
        public boolean reinforced;

        public LocomotiveWithBackspeed(String Name, String Country, String Year, String Fuel, String AditionalTextTitle, String AditionalText, String AditionalText2Title, String AditionalText2,
                                       float TractiveEffort, float MetricHorsepower, float WeightinTons, float TopSpeed, float BackTopSpeed, boolean Fictional, boolean Reinforced, int MaxRows) {
            name = Name;
            country = Country;
            year = Year;
            fuel = Fuel;
            additionalTextTitle = AditionalTextTitle;
            additionalText = AditionalText;
            additionalTextTitle2 = AditionalText2Title;
            additionalText2 = AditionalText2;
            tractive_effort = TractiveEffort;
            double weight = WeightinTons/10;
            BigDecimal bd = new BigDecimal(Double.toString(weight));
            bd = bd.setScale(1, RoundingMode.HALF_UP);
            weightinKGs = bd.doubleValue();
            topSpeed = TopSpeed;
            metric_horsepower = MetricHorsepower;
            backTopSpeed = BackTopSpeed;
            fictional = Fictional;
            reinforced = Reinforced;
            rows = MaxRows;
        }


    }

    /**
     * This is for Trains with no defined backspeed, Backspeed simply equals Topspeed
     */
    public static class LocomotiveNoBackspeed {
        public String name;
        public String country;
        public String year;
        public String fuel;
        public String additionalTextTitle;
        public String additionalText;
        public String additionalTextTitle2;
        public String additionalText2;
        public int rows;
        public float tractive_effort;
        public float metric_horsepower;
        public double weightinKGs;
        public float topSpeed;
        public float backTopSpeed;
        public boolean fictional;
        public boolean reinforced;

        public LocomotiveNoBackspeed(String Name, String Country, String Year, String Fuel, String AditionalTextTitle, String AditionalText, String AditionalText2Title, String AditionalText2,
                                     float TractiveEffort, float MetricHorsepower, float WeightinTons, float TopSpeed, boolean Fictional, boolean Reinforced, int MaxRows) {
            name = Name;
            country = Country;
            year = Year;
            fuel = Fuel;
            additionalTextTitle = AditionalTextTitle;
            additionalText = AditionalText;
            additionalTextTitle2 = AditionalText2Title;
            additionalText2 = AditionalText2;
            tractive_effort = TractiveEffort;
            double weight = WeightinTons/10;
            BigDecimal bd = new BigDecimal(Double.toString(weight));
            bd = bd.setScale(1, RoundingMode.HALF_UP);
            weightinKGs = bd.doubleValue();
            topSpeed = TopSpeed;
            metric_horsepower = MetricHorsepower;
            backTopSpeed = TopSpeed;
            reinforced = Reinforced;
            fictional = Fictional;
            rows = MaxRows;
        }


    }

    /**
     * This is for rolingstock with a defined topspeed or with no topspeed "0"
     */
    public static class Rollingstock {
        public String name;
        public String country;
        public String year;
        public String additionalTextTitle;
        public String additionalText;
        public String additionalTextTitle2;
        public String additionalText2;
        public int rows;
        public double weightinKGs;
        public float topSpeed;
        public float backTopSpeed;
        public boolean fictional;
        public boolean reinforced;

        public Rollingstock(String Name, String Country, String Year, String AditionalTextTitle, String AditionalText, String AditionalText2Title,
                            String AditionalText2, float WeightinTons, float TopSpeed, boolean Fictional, boolean Reinforced, int MaxRows) {
            name = Name;
            country = Country;
            year = Year;
            additionalTextTitle = AditionalTextTitle;
            additionalText = AditionalText;
            additionalTextTitle2 = AditionalText2Title;
            additionalText2 = AditionalText2;
            double weight = WeightinTons/10;
            BigDecimal bd = new BigDecimal(Double.toString(weight));
            bd = bd.setScale(1, RoundingMode.HALF_UP);
            weightinKGs = bd.doubleValue();
            topSpeed = TopSpeed;
            fictional = Fictional;
            backTopSpeed = TopSpeed;
            reinforced = Reinforced;
            rows = MaxRows;
        }
    }

    /**
     * this is for tank cars
     */

    //BSLB4
    public static LocomotiveWithBackspeed BSLB4() {
        return new LocomotiveWithBackspeed("BSLB4", "USA", "1980", "Electric",
                "", "", type, " Passenger Locomotive",
                9566f, 2240f, 30.9f, 110f, 50f, false, true, 0);
    }
}



