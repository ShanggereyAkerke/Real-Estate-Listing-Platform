public class Main{
    public static void main(String[] args) {
        RealEstateAgency agency = new RealEstateAgency("Astana Grand Estates", "Astana", 15, 10);
        Property property1 = new Property("Qabanbay batyr 23", 120, 100000000.0);
        Property property2 = new Property("Turan 55", 80, 4500000.0);
        Property property3 = new Property("Syganaq 16/1", 150, 15000000.0);
        Property property4 = new Property("Mangilik El 50", 100, 80000000.0);
        Property property5 = new Property("Nursultan Nazarbaev 25", 90, 70000000.0);

        Realtor realtor1 = new Realtor(1, "QAZ-123-2025", "Shangerey Akerke", "7 777 123 4567", 5, 4.0);
        Realtor realtor2 = new Realtor(2, "QAZ-234-2025", "Kairat Nurtas", "7 705 105 1234", 10, 5.0);
        Realtor realtor3 = new Realtor(3, "QAZ-345-2025", "Toregali Toreali", "7 701 101 5698", 8, 4.5);
        Realtor realtor4 = new Realtor(4, "QAZ-674-2025", "Billie Eilish", "7 701 105 8245", 3, 3.6);

        agency.addProperty(property1);
        agency.addProperty(property2);
        agency.addProperty(property3);
        agency.addProperty(property4);
        agency.addProperty(property5);

        System.out.println("=== Real Estate Agency===");
        agency.printInfo();
        System.out.println();

        System.out.println("=== Property ===");
        property1.printInfo();
        System.out.println();
        property2.printInfo();
        System.out.println();
        property3.printInfo();
        System.out.println();
        property4.printInfo();
        System.out.println();
        property5.printInfo();
        System.out.println();

        System.out.println("=== Realtors===");
        realtor1.printInfo();
        System.out.println();
        realtor2.printInfo();
        System.out.println();
        realtor3.printInfo();
        System.out.println();
        realtor4.printInfo();
        System.out.println();

        System.out.println("\n=== Properties Information ===");
        int totalProperties = 5;
        double totalValue = 0.0;
        boolean hasLuxuryProperty = false;
        String report = "Properties Report";

        System.out.println(report);
        System.out.println("Total properties: " + totalProperties);

        System.out.println("\n=== Property numbers ===");
        Property[] propertyArray = {property1, property2, property3, property4, property5};

        for (int i = 0; i < propertyArray.length; i++) {
            totalValue += propertyArray[i].getPrice();
            if (propertyArray[i].getPrice() > 200000000.0) {
                hasLuxuryProperty = true;
            }
        }
        System.out.println("Total properties: " + totalProperties);

        System.out.println("\n=== Commission ===");
        double commission = realtor1.calculateCost(property1.getPrice());
        System.out.println("Commission for " + realtor1.getName() + " on " + property1.getPrice() + "KZT " + commission + "KZT");

        System.out.println("\n=== Sizes of the properties ===");
        Property biggest = propertyArray[0];
        for (int i = 1; i < propertyArray.length; i++) {
            if (propertyArray[i].getSquareFootage() > biggest.getSquareFootage()) {
                biggest = propertyArray[i];
            }
        }
        System.out.println("The largest property: " + biggest.getAddress() + ", " + biggest.getSquareFootage() + " m²");

        System.out.println("=== Most Expensive Property ===");
        Property expensive = agency.findMostExpensiveProperty();
        if (expensive != null) {
            System.out.println("Most expensive: " + expensive.getAddress() + " , " + expensive.getPrice() + " KZT");
        }
        System.out.println("\n=== Cheapest Property ===");
        Property[] allProperties = {property1, property2, property3, property4, property5};
        Property cheapest = allProperties[0];

        for (int i = 1; i < allProperties.length; i++) {
            if (allProperties[i].getPrice() < cheapest.getPrice()) {
                cheapest = allProperties[i];
            }
        }
        System.out.println("The Cheapest Property: " + cheapest.getAddress() + " , " + cheapest.getPrice() + " KZT");
    }


}