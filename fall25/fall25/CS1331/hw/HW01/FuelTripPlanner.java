public class FuelTripPlanner {
    public static void main(String[] args) {
        int backRoadMiles = 25;
        int highwayMiles = 60;
        int hillyMiles = 10;
        int currentGasGallons = 20;
        int numberOfPeople = 5;
        double gallonsPerPerson = 0;

        gallonsPerPerson += (backRoadMiles * 2);
        gallonsPerPerson += (highwayMiles * 1);
        gallonsPerPerson += (hillyMiles * 5);
        gallonsPerPerson -= currentGasGallons;
        gallonsPerPerson /= numberOfPeople;

        System.out.printf("Each passenger is responsible for %.1f gallons of gas\n", gallonsPerPerson);
    } 
}
