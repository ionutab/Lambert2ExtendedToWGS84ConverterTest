public class CompareTestMain {

    public static void main(String[] args) {

        o.LambertPoint pto1 = o.Lambert.convertToWGS84Deg(656548, 2084506, o.LambertZone.LambertIIExtended);
        oApfloat.LambertPoint pta1 = oApfloat.Lambert.convertToWGS84Deg(656548, 2084506, oApfloat.LambertZone.LambertIIExtended);
        oApfloatRefactored.LambertPoint ptar1 = oApfloatRefactored.Lambert.convertToWGS84Deg(656548, 2084506, oApfloatRefactored.LambertZone.LambertIIExtended);
        System.out.println("CROIX DE FRUN Point lat,lng:");
        System.out.println(pto1.getY() + "," + pto1.getX());
        System.out.println(pta1.getY().doubleValue() + "," + pta1.getX().doubleValue());
        System.out.println(ptar1.getY().doubleValue() + "," + ptar1.getX().doubleValue());

        o.LambertPoint pto2 = o.Lambert.convertToWGS84Deg(655077, 2080698, o.LambertZone.LambertIIExtended);
        oApfloat.LambertPoint pta2 = oApfloat.Lambert.convertToWGS84Deg(655077, 2080698, oApfloat.LambertZone.LambertIIExtended);
        oApfloatRefactored.LambertPoint ptar2 = oApfloatRefactored.Lambert.convertToWGS84Deg(655077, 2080698, oApfloatRefactored.LambertZone.LambertIIExtended);
        System.out.println("BERZET CHAPELLE Point lat,lng:");
        System.out.println(pto2.getY() + "," + pto2.getX());
        System.out.println(pta2.getY().doubleValue() + "," + pta2.getX().doubleValue());
        System.out.println(ptar2.getY().doubleValue() + "," + ptar2.getX().doubleValue());

        o.LambertPoint pto3 = o.Lambert.convertToWGS84Deg(657130, 2086957, o.LambertZone.LambertIIExtended);
        oApfloat.LambertPoint pta3 = oApfloat.Lambert.convertToWGS84Deg(657130, 2086957, oApfloat.LambertZone.LambertIIExtended);
        oApfloatRefactored.LambertPoint ptar3 = oApfloatRefactored.Lambert.convertToWGS84Deg(657130, 2086957, oApfloatRefactored.LambertZone.LambertIIExtended);
        System.out.println("BERTHELOT Point lat,lng:");
        System.out.println(pto3.getY() + "," + pto3.getX());
        System.out.println(pta3.getY().doubleValue() + "," + pta3.getX().doubleValue());
        System.out.println(ptar3.getY().doubleValue() + "," + ptar3.getX().doubleValue());

        o.LambertPoint pto4 = o.Lambert.convertToWGS84Deg(876962.7, 2084698.5, o.LambertZone.LambertIIExtended);
        oApfloat.LambertPoint pta4 = oApfloat.Lambert.convertToWGS84Deg(876962.7, 2084698.5, oApfloat.LambertZone.LambertIIExtended);
        oApfloatRefactored.LambertPoint ptar4 = oApfloatRefactored.Lambert.convertToWGS84Deg(876962.7, 2084698.5, oApfloatRefactored.LambertZone.LambertIIExtended);
        System.out.println("Alfred De Vigny Point lat,lng:");
        System.out.println(pto4.getY() + "," + pto4.getX());
        System.out.println(pta4.getY().doubleValue() + "," + pta4.getX().doubleValue());
        System.out.println(ptar4.getY().doubleValue() + "," + ptar4.getX().doubleValue());
    }

}
