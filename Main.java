public class Main {
    public static void main(String[] args) {
        // Before creating cars
        System.out.println("Before creating cars:");
        Car.displayTotalCars();

        // Creating cars using the parameterized constructor
        Car car1 = new Car("SportsCar", 120, 10, "smooth");
        Car car2 = new Car("Sedan", 100, 8, "city");
        Car car3 = new Car("Truck", 80, 5, "offroad");

        // Creating a car using the default constructor
        Car car4 = new Car(); // Default constructor is called
        car4.setName("CompactCar");
        car4.setSpeed(90);
        car4.setFuel(7);
        car4.setTrack("city");

        // Display updated information
        System.out.println("\nCars after creation:");
        car1.displayInfo();
        car2.displayInfo();
        car3.displayInfo();
        car4.displayInfo();

        // Display total cars
        System.out.println("\nTotal Cars Created:");
        Car.displayTotalCars();

        // Starting the race
        System.out.println("\nStarting a race:");
        Race race = new Race(car1, car2, car4, 10);
        race.startRace();

        // Display total races
        Race.displayRaceCount();
    }
}
