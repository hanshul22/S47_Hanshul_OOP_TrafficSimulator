public class Main {
    public static void main(String[] args) {
        // Step 1: Dynamic Memory Allocation for Car Objects
        Car car1 = new Car("SportsCar", 120, 10, "smooth");
        Car car2 = new Car("Sedan", 100, 8, "city");
        Car car3 = new Car("Truck", 80, 5, "offroad");

        // Step 2: Display total cars created (using static method)
        Car.displayTotalCars();

        // Step 3: Passing cars dynamically to the Race
        Race race1 = new Race(car1, car2, car3, 10);

        // Step 4: Start the race
        race1.startRace();

        // Step 5: Display total races conducted (using static method)
        Race.displayRaceCount();

        // Step 6: Cleanup
        car1 = null;
        car2 = null;
        car3 = null;
        System.gc();
    }
}
