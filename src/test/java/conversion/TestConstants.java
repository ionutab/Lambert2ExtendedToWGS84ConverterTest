package conversion;

import java.util.HashMap;

public class TestConstants {

    public static final Double DELTA = 9D;

    public static final String X = "X";
    public static final String Y = "Y";

    public static HashMap<String, Double> buildPointMap(double x, double y){
        HashMap<String, Double> map = new HashMap<String, Double>();

        map.put(X, x);
        map.put(Y, y);

        return map;
    }
}
