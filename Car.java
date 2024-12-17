public class Car {

    // Private data members for encapsulation
    private static int totalCars = 0; // Static variable to track total cars
    private String name;
    private int speed;
    private int fuel;
    private String track;

    // Constructor
    public Car(String name, int speed, int fuel, String track) {
        this.name = name;
        this.speed = speed;
        this.fuel = fuel;
        this.track = track;
        totalCars++;
    }

    // Accessors (Getters)
    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getFuel() {
        return fuel;
    }

    public String getTrack() {
        return track;
    }

    // Mutators (Setters)
    public void setFuel(int fuel) {
        if (fuel >= 0) {
            this.fuel = fuel;
        } else {
            System.out.println("Fuel cannot be negative!");
        }
    }

    public void setTrack(String track) {
        this.track = track;
    }

    // Public method to display car details
    public void displayInfo() {
        System.out.println("Car Name: " + name);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel: " + fuel + " liters");
        System.out.println("Track Type: " + track);
    }

    // Method to simulate movement
    public boolean move() {
        if (fuel > 0) {
            fuel--;
            return true;
        } else {
            System.out.println(name + " is out of fuel and cannot continue.");
            return false;
        }
    }

    // Protected method for adjusted speed (demonstrating protected access)
    protected int getAdjustedSpeed() {
        if (track.equalsIgnoreCase("offroad")) {
            if (name.equalsIgnoreCase("SportsCar")) {
                return speed - 20;
            } else if (name.equalsIgnoreCase("Truck")) {
                return speed;
            } else if (name.equalsIgnoreCase("Sedan")) {
                return speed - 10;
            }
        } else if (track.equalsIgnoreCase("city")) {
            if (name.equalsIgnoreCase("SportsCar")) {
                return speed - 10;
            } else if (name.equalsIgnoreCase("Truck")) {
                return speed - 5;
            } else if (name.equalsIgnoreCase("Sedan")) {
                return speed;
            }
        } else if (track.equalsIgnoreCase("smooth")) {
            if (name.equalsIgnoreCase("SportsCar")) {
                return speed;
            } else {
                return speed - 5;
            }
        }
        return speed;
    }

    // Static method to display total cars
    public static void displayTotalCars() {
        System.out.println("Total Cars Participating in the Race: " + totalCars);
    }
}