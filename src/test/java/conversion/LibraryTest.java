package conversion;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static conversion.TestConstants.*;

@RunWith(JUnit4.class)
public class LibraryTest {

    public static List<HashMap<String, Double>> inputPoints = new ArrayList<HashMap<String, Double>>();
    public static List<HashMap<String, Double>> outputPoints = new ArrayList<HashMap<String, Double>>();

    static {
        inputPoints.add(buildPointMap(656548, 2084506));
        inputPoints.add(buildPointMap(655077, 2080698));
        inputPoints.add(buildPointMap(657130, 2086957));
        inputPoints.add(buildPointMap(660346, 2083553));
        inputPoints.add(buildPointMap(660759, 2083943));
        inputPoints.add(buildPointMap(660686, 2084050));
        inputPoints.add(buildPointMap(659029, 2087924));
        inputPoints.add(buildPointMap(658340, 2086395));

        outputPoints.add(buildPointMap(3.06327505D, 45.758503964D));
        outputPoints.add(buildPointMap(3.043929102D, 45.724366679D));
        outputPoints.add(buildPointMap(3.071049241D, 45.780505316D));
        outputPoints.add(buildPointMap(3.111967328D, 45.749604288D));
        outputPoints.add(buildPointMap(3.117324206D, 45.753076073D));
        outputPoints.add(buildPointMap(3.116399714D, 45.754045186D));
        outputPoints.add(buildPointMap(3.095585527D, 45.789042582D));
        outputPoints.add(buildPointMap(3.086537896D, 45.775346678D));
    }

    @Test
    public void testLibrary() {

        DecimalFormat df = new DecimalFormat("#");
        df.setMaximumFractionDigits(DELTA.intValue());

        HashMap<String, Double> i0 = inputPoints.get(0);
        HashMap<String, Double> o0 = outputPoints.get(0);
        oApfloat.LambertPoint pt0 = oApfloat.Lambert.convertToWGS84Deg(i0.get(X), i0.get(Y), oApfloat.LambertZone.LambertIIExtended);
        System.out.println("CROIX DE FRUN Point lat,lng:");
        System.out.println(df.format(pt0.getY()) + "," + df.format(pt0.getX()));
        assertEquals(pt0.getY().doubleValue(), o0.get(Y).doubleValue(), DELTA);
        assertEquals(pt0.getX().doubleValue(), o0.get(X).doubleValue(), DELTA);

        HashMap<String, Double> i1 = inputPoints.get(1);
        HashMap<String, Double> o1 = outputPoints.get(1);
        oApfloat.LambertPoint pt1 = oApfloat.Lambert.convertToWGS84Deg(i1.get(X), i1.get(Y), oApfloat.LambertZone.LambertIIExtended);
        System.out.println("BERZET CHAPELLE Point lat,lng:");
        System.out.println(df.format(pt1.getY()) + "," + df.format(pt1.getX()));
        assertEquals(pt1.getY().doubleValue(), o1.get(Y).doubleValue(), DELTA);
        assertEquals(pt1.getX().doubleValue(), o1.get(X).doubleValue(), DELTA);

        HashMap<String, Double> i2 = inputPoints.get(2);
        HashMap<String, Double> o2 = outputPoints.get(2);
        oApfloat.LambertPoint pt2 = oApfloat.Lambert.convertToWGS84Deg(i2.get(X), i2.get(Y), oApfloat.LambertZone.LambertIIExtended);
        System.out.println("BERTHELOT Point lat,lng:");
        System.out.println(df.format(pt2.getY()) + "," + df.format(pt2.getX()));
        assertEquals(pt2.getY().doubleValue(), o2.get(Y).doubleValue(), DELTA);
        assertEquals(pt2.getX().doubleValue(), o2.get(X).doubleValue(), DELTA);

        System.out.println("---------------- don't remember why I put this here-");

        HashMap<String, Double> i3 = inputPoints.get(3);
        HashMap<String, Double> o3 = outputPoints.get(3);
        oApfloat.LambertPoint pt3 = oApfloat.Lambert.convertToWGS84Deg(i3.get(X), i3.get(Y), oApfloat.LambertZone.LambertIIExtended);
        System.out.println("03AAA Point lng, lat:");
        System.out.println(df.format(pt3.getY()) + "," + df.format(pt3.getX()));
        assertEquals(pt3.getY().doubleValue(), o3.get(Y).doubleValue(), DELTA);
        assertEquals(pt3.getX().doubleValue(), o3.get(X).doubleValue(), DELTA);

        HashMap<String, Double> i4 = inputPoints.get(4);
        HashMap<String, Double> o4 = outputPoints.get(4);
        oApfloat.LambertPoint pt4 = oApfloat.Lambert.convertToWGS84Deg(i4.get(X), i4.get(Y), oApfloat.LambertZone.LambertIIExtended);
        System.out.println("03AEA Point lng, lat:");
        System.out.println(df.format(pt4.getY()) + "," + df.format(pt4.getX()));
        assertEquals(pt4.getY().doubleValue(), o4.get(Y).doubleValue(), DELTA);
        assertEquals(pt4.getX().doubleValue(), o4.get(X).doubleValue(), DELTA);


        HashMap<String, Double> i5 = inputPoints.get(5);
        HashMap<String, Double> o5 = outputPoints.get(5);
        oApfloat.LambertPoint pt5 = oApfloat.Lambert.convertToWGS84Deg(i5.get(X), i5.get(Y), oApfloat.LambertZone.LambertIIExtended);
        System.out.println("03AER Point lng, lat:");
        System.out.println(df.format(pt5.getY()) + "," + df.format(pt5.getX()));
        assertEquals(pt5.getY().doubleValue(), o5.get(Y).doubleValue(), DELTA);
        assertEquals(pt5.getX().doubleValue(), o5.get(X).doubleValue(), DELTA);

        HashMap<String, Double> i6 = inputPoints.get(6);
        HashMap<String, Double> o6 = outputPoints.get(6);
        oApfloat.LambertPoint pt6 = oApfloat.Lambert.convertToWGS84Deg(i6.get(X), i6.get(Y), oApfloat.LambertZone.LambertIIExtended);
        System.out.println("03ASA Point lng, lat:");
        System.out.println(df.format(pt6.getY()) + "," + df.format(pt6.getX()));
        assertEquals(pt6.getY().doubleValue(), o6.get(Y).doubleValue(), DELTA);
        assertEquals(pt6.getX().doubleValue(), o6.get(X).doubleValue(), DELTA);

        HashMap<String, Double> i7 = inputPoints.get(7);
        HashMap<String, Double> o7 = outputPoints.get(7);
        oApfloat.LambertPoint pt7 = oApfloat.Lambert.convertToWGS84Deg(i7.get(X), i7.get(Y), oApfloat.LambertZone.LambertIIExtended);
        System.out.println("03BAA Point lng, lat:");
        System.out.println(df.format(pt7.getY()) + "," + df.format(pt7.getX()));
        assertEquals(pt7.getY().doubleValue(), o7.get(Y).doubleValue(), DELTA);
        assertEquals(pt7.getX().doubleValue(), o7.get(X).doubleValue(), DELTA);
    }

}
