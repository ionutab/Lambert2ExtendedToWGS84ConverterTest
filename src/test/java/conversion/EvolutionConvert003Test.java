package conversion;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static conversion.TestConstants.*;

@RunWith(JUnit4.class)
public class EvolutionConvert003Test {


    @Test
    public void testConvert003(){
        double latitude = 48.87412734248018; // 48.8741427818;
        double latitude2 = latitude * 400 / 360; // Grad
        double radLat = Math.toRadians(latitude);
        double longitude = 2.5832231178521186; //2.58331732871;
        double longitude2 = longitude * 400 / 360; // Grad
        double radLong = Math.toRadians(longitude);

        o.LambertPoint pto1 = o.Lambert.convertToLambertByAlg003(radLat, radLong, o.LambertZone.LambertIIExtended);
//        oApfloat.LambertPoint pta1 = oApfloat.Lambert.convertToLambertByAlg003(radLat, radLong, oApfloat.LambertZone.LambertIIExtended);
        oApfloatRefactored.LambertPoint ptar1 = oApfloatRefactored.Lambert.convertToLambertByAlg003(radLat, radLong, oApfloatRefactored.LambertZone.LambertIIExtended);

        System.out.println(pto1.getX() + " - " + pto1.getY());
        assertEquals(618115, pto1.getX(), 1);
        assertEquals(2430676, pto1.getY(), 1);

        System.out.println(DF.format(ptar1.getX().doubleValue()) + " - " + DF.format(ptar1.getY().doubleValue()));
        assertEquals(618114.2156780206, ptar1.getX().doubleValue(), DELTA);
        assertEquals(2430925.9117567632, ptar1.getY().doubleValue(), DELTA);



    }
}
