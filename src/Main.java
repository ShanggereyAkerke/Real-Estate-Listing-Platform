public class Main{
    public static void main(String[] args) {
        RealEstateAgency agency = new RealEstateAgency("Astana Grand Estates", "Astana", 15, 10);
        Property property1 = new Property("Qabanbay batyr 23", 120, 200000);
        Property property2 = new Property("Turan 55", 80, 120000);
        Property property3 = new Property("Syganaq 16/1", 150, 350000);

        Realtor realtor1 = new Realtor(1,  "Shangerey Akerke", "7 777 123 4567", 5, 4.0);
        Realtor realtor2 = new Realtor(2, "Kairat Nurtas", "7 705 105 1234", 10, 4.8);
        Realtor realtor3 = new Realtor(3,  "Toregali Toreali", "7 701 101 5698", 8, 4.5);

        agency.addProperty(property1);
        agency.addProperty(property2);
        agency.addProperty(property3);

        agency.addRealtor(realtor1);
        agency.addRealtor(realtor2);
        agency.addRealtor(realtor3);

        System.out.println("=== REAL ESTATE AGENCY ===");
        agency.printInfo();
        int totalProperties = 3;
        String property = "Properties: ";

        System.out.println(property + totalProperties);
        Property[] propertyArray = {property1, property2, property3};

        System.out.println("\n=== Most Experienced Realtor ===");
        Realtor mostExperienced = agency.findMostExperiencedRealtor();
        if (mostExperienced != null) {
            System.out.println("Name: " + mostExperienced.getName());
            System.out.println("Years of experience: " + mostExperienced.getYearsOfExperience());
            System.out.println("Commission rate: " + mostExperienced.getCommissionRate());
        } else {
            System.out.println("No realtors available.");
        }
        System.out.println("\n===Commiccion costs of the most experienced realtor===");
        Realtor mostExperiencedRealtor=agency.findMostExperiencedRealtor();
        if (mostExperiencedRealtor != null) {
            Property[] propertyList = {property1, property2, property3};
            for (int i = 0; i < propertyList.length; i++) {
                double commission=mostExperienced.calculateCost(propertyList[i].getPrice());
                System.out.println("Property address: " + propertyList[i].getAddress());
                System.out.println("  Price of the property: " + propertyList[i].getPrice());
                System.out.println("  Commission: $" + commission);
                System.out.println();
            }
        }
        System.out.println("=== Sizes of the properties ===");
        Property largest = propertyArray[0];
        for (int i = 1; i < propertyArray.length; i++) {
            if (propertyArray[i].getSquareFootage() > largest.getSquareFootage()) {
                largest = propertyArray[i];
            }
        }System.out.println("The Largest property: " + largest.getAddress() + ", " + largest.getSquareFootage() + " m^2");
        Property smallest = propertyArray[0];
        for (int i = 1; i < propertyArray.length; i++) {
            if (propertyArray[i].getSquareFootage() < smallest.getSquareFootage()) {
                smallest = propertyArray[i];
            }
        }System.out.println("The Smallest property: " + smallest.getAddress() + ", " + smallest.getSquareFootage() + " m^2");

        System.out.println("=== Most Expensive Property ===");
        Property expensive = agency.findMostExpensiveProperty();
        if (expensive != null) {
            System.out.println( expensive.getAddress() + " , " + expensive.getPrice() + " $");
        }
    }

}