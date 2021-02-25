
public class LibraryTestMain {


    public static void main(String[] args) {
        oApfloat.LambertPoint pt1 = oApfloat.Lambert.convertToWGS84Deg(656548, 2084506, oApfloat.LambertZone.LambertIIExtended);
        System.out.println("CROIX DE FRUN Point lat,lng:");
        System.out.println(pt1.getY() + "," + pt1.getX());

        oApfloat.LambertPoint pt2 = oApfloat.Lambert.convertToWGS84Deg(655077, 2080698, oApfloat.LambertZone.LambertIIExtended);
        System.out.println("BERZET CHAPELLE Point lat,lng:");
        System.out.println(pt2.getY() + "," + pt2.getX());

        oApfloat.LambertPoint pt3 = oApfloat.Lambert.convertToWGS84Deg(657130, 2086957, oApfloat.LambertZone.LambertIIExtended);
        System.out.println("BERTHELOT Point lat,lng:");
        System.out.println(pt3.getY() + "," + pt3.getX());

        System.out.println("-----------------");

        oApfloat.LambertPoint it1 = oApfloat.Lambert.convertToWGS84Deg(660346, 2083553, oApfloat.LambertZone.LambertIIExtended);
        System.out.println("03AAA Point lng, lat:");
        System.out.println();
        System.out.println(it1.getX());
        System.out.println(it1.getY());
        System.out.println();
        oApfloat.LambertPoint it2 = oApfloat.Lambert.convertToWGS84Deg(660759, 2083943, oApfloat.LambertZone.LambertIIExtended);
        System.out.println("03AEA Point lng, lat:");
        System.out.println();
        System.out.println(it2.getX());
        System.out.println(it2.getY());
        System.out.println();
        oApfloat.LambertPoint it3 = oApfloat.Lambert.convertToWGS84Deg(660686, 2084050, oApfloat.LambertZone.LambertIIExtended);
        System.out.println("03AER Point lng, lat:");
        System.out.println();
        System.out.println(it3.getX());
        System.out.println(it3.getY());
        System.out.println();
        oApfloat.LambertPoint it4 = oApfloat.Lambert.convertToWGS84Deg(659029, 2087924, oApfloat.LambertZone.LambertIIExtended);
        System.out.println("03ASA Point lng, lat:");
        System.out.println();
        System.out.println(it4.getX());
        System.out.println(it4.getY());
        System.out.println();
        oApfloat.LambertPoint it5 = oApfloat.Lambert.convertToWGS84Deg(658340, 2086395, oApfloat.LambertZone.LambertIIExtended);
        System.out.println("03BAA Point lng, lat:");
        System.out.println();
        System.out.println(it5.getX());
        System.out.println(it5.getY());
    }
}
