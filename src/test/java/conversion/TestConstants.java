package conversion;

import java.text.DecimalFormat;
import java.util.HashMap;

public class TestConstants {

    public static final Double DELTA = 0.000000001;
    public static final Double DELTA_MINOR = 0.0001;

    public static final String X = "X";
    public static final String Y = "Y";

    public static HashMap<String, Double> buildPointMap(double x, double y){
        HashMap<String, Double> map = new HashMap<String, Double>();

        map.put(X, x);
        map.put(Y, y);

        return map;
    }

    public static DecimalFormat DF = new DecimalFormat("#");

    static {
        DF.setMaximumFractionDigits(9);
    }
}
