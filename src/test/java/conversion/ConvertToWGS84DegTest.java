package conversion;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static conversion.TestConstants.*;

@RunWith(JUnit4.class)
public class ConvertToWGS84DegTest {

    public static List<HashMap<String, Double>> points = new ArrayList<HashMap<String, Double>>();

    static {
        points.add(TestConstants.buildPointMap(656548, 2084506));
        points.add(TestConstants.buildPointMap(655077, 2080698));
        points.add(TestConstants.buildPointMap(657130, 2086957));
        points.add(TestConstants.buildPointMap(876962.7, 2084698.5));
    }

    @Test
    public void testConvertToWGS84Deg(){

        HashMap<String, Double> p1 = points.get(0);
        o.LambertPoint pto1 = o.Lambert.convertToWGS84Deg(p1.get(X), p1.get(Y), o.LambertZone.LambertIIExtended);
        oApfloat.LambertPoint pta1 = oApfloat.Lambert.convertToWGS84Deg(p1.get(X), p1.get(Y), oApfloat.LambertZone.LambertIIExtended);
        oApfloatRefactored.LambertPoint ptar1 = oApfloatRefactored.Lambert.convertToWGS84Deg(p1.get(X), p1.get(Y), oApfloatRefactored.LambertZone.LambertIIExtended);
        System.out.println("CROIX DE FRUN Point lat,lng:");
        System.out.println(pto1.getY() + "," + pto1.getX());
        System.out.println(pta1.getY().doubleValue() + "," + pta1.getX().doubleValue());
        System.out.println(ptar1.getY().doubleValue() + "," + ptar1.getX().doubleValue());

        assertEquals(pta1.getY().doubleValue(), ptar1.getY().doubleValue(), DELTA);
        assertEquals(pta1.getX().doubleValue(), ptar1.getX().doubleValue(), DELTA);

        HashMap<String, Double> p2 = points.get(1);
        o.LambertPoint pto2 = o.Lambert.convertToWGS84Deg(p2.get(X), p2.get(Y), o.LambertZone.LambertIIExtended);
        oApfloat.LambertPoint pta2 = oApfloat.Lambert.convertToWGS84Deg(p2.get(X), p2.get(Y), oApfloat.LambertZone.LambertIIExtended);
        oApfloatRefactored.LambertPoint ptar2 = oApfloatRefactored.Lambert.convertToWGS84Deg(p2.get(X), p2.get(Y), oApfloatRefactored.LambertZone.LambertIIExtended);
        System.out.println("BERZET CHAPELLE Point lat,lng:");
        System.out.println(pto2.getY() + "," + pto2.getX());
        System.out.println(pta2.getY().doubleValue() + "," + pta2.getX().doubleValue());
        System.out.println(ptar2.getY().doubleValue() + "," + ptar2.getX().doubleValue());

        assertEquals(pta2.getY().doubleValue(), ptar2.getY().doubleValue(), DELTA);
        assertEquals(pta2.getX().doubleValue(), ptar2.getX().doubleValue(), DELTA);

        HashMap<String, Double> p3 = points.get(2);
        o.LambertPoint pto3 = o.Lambert.convertToWGS84Deg(p3.get(X), p3.get(Y), o.LambertZone.LambertIIExtended);
        oApfloat.LambertPoint pta3 = oApfloat.Lambert.convertToWGS84Deg(p3.get(X), p3.get(Y), oApfloat.LambertZone.LambertIIExtended);
        oApfloatRefactored.LambertPoint ptar3 = oApfloatRefactored.Lambert.convertToWGS84Deg(p3.get(X), p3.get(Y), oApfloatRefactored.LambertZone.LambertIIExtended);
        System.out.println("BERTHELOT Point lat,lng:");
        System.out.println(pto3.getY() + "," + pto3.getX());
        System.out.println(pta3.getY().doubleValue() + "," + pta3.getX().doubleValue());
        System.out.println(ptar3.getY().doubleValue() + "," + ptar3.getX().doubleValue());

        assertEquals(pta3.getY().doubleValue(), ptar3.getY().doubleValue(), DELTA);
        assertEquals(pta3.getX().doubleValue(), ptar3.getX().doubleValue(), DELTA);

        HashMap<String, Double> p4 = points.get(3);
        o.LambertPoint pto4 = o.Lambert.convertToWGS84Deg(p4.get(X), p4.get(Y), o.LambertZone.LambertIIExtended);
        oApfloat.LambertPoint pta4 = oApfloat.Lambert.convertToWGS84Deg(p4.get(X), p4.get(Y), oApfloat.LambertZone.LambertIIExtended);
        oApfloatRefactored.LambertPoint ptar4 = oApfloatRefactored.Lambert.convertToWGS84Deg(p4.get(X), p4.get(Y), oApfloatRefactored.LambertZone.LambertIIExtended);
        System.out.println("Alfred De Vigny Point lat,lng:");
        System.out.println(pto4.getY() + "," + pto4.getX());
        System.out.println(pta4.getY().doubleValue() + "," + pta4.getX().doubleValue());
        System.out.println(ptar4.getY().doubleValue() + "," + ptar4.getX().doubleValue());

        assertEquals(pta4.getY().doubleValue(), ptar4.getY().doubleValue(), DELTA);
        assertEquals(pta4.getX().doubleValue(), ptar4.getX().doubleValue(), DELTA);
    }

}
