public class Main {
    public static void main(String[] args) {
        // Step 1: Dynamic Memory Allocation for Car Objects
        System.out.println("Before creating cars:");
        Car.displayTotalCars(); // Static method call before creating car objects

        Car car1 = new Car("SportsCar", 120, 10, "smooth");
        Car car2 = new Car("Sedan", 100, 8, "city");
        Car car3 = new Car("Truck", 80, 5, "offroad");

        System.out.println("\nAfter creating cars:");
        Car.displayTotalCars(); // Static method call after creating car objects

        // Step 2: Update car attributes using setters
        car1.setFuel(12);
        car2.setTrack("highway");

        System.out.println("\nUpdated Car Details:");
        car1.displayInfo();
        car2.displayInfo();

        // Step 3: Passing cars dynamically to the Race
        Race race = new Race(car1, car2, car3, 10);

        // Step 4: Start the race
        race.startRace();

        // Step 5: Cleanup
        car1 = null;
        car2 = null;
        car3 = null;
        System.gc();
    }
}