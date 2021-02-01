package java_basics_package;

public class TenthClass {
    //Enums
    enum CarTypes{
        TOYOTA,
        HONDA,
        LANDROVER,
        PASAT,
        FERRARI;
    }

    public static void main(String[] args) {
        System.out.println(CarTypes.FERRARI);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");

        //a way to print out the related model for each Car type
        CarTypes relatedModel = CarTypes.HONDA;
        switch (relatedModel){
            case HONDA:
                System.out.println("HONDA accord");
                break;
            case TOYOTA:
                System.out.println("TOYOTA Camry");
                break;
            case FERRARI:
                System.out.println("F580");
                break;
            case LANDROVER:
                System.out.println("Range Rover");
                break;
            case PASAT:
                System.out.println("PASAT Happer");
                break;
        }
    }
}
