public class Car {

    private static int totalCars = 0; // Static variable to track total cars created
    private String name;
    private int speed;
    private int fuel;
    private String track;

    // Default Constructor
    public Car() {
        this.name = "Unknown";
        this.speed = 0;
        this.fuel = 0;
        this.track = "Unknown";
        totalCars++; // Increment the static variable whenever a new car is created
        System.out.println("A car has been created using the default constructor.");
    }

    // Parameterized Constructor
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
    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(int speed) {
        if (speed > 0) {
            this.speed = speed;
        }
    }

    public void setFuel(int fuel) {
        if (fuel >= 0) {
            this.fuel = fuel;
        }
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public void displayInfo() {
        System.out.println("Car Name: " + name);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel: " + fuel + " liters");
        System.out.println("Track Type: " + track);
    }

    public boolean move() {
        if (fuel > 0) {
            fuel--;
            return true;
        } else {
            System.out.println(name + " is out of fuel and cannot continue.");
            return false;
        }
    }

    public int getAdjustedSpeed() {
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
            } else if (name.equalsIgnoreCase("Truck")) {
                return speed - 5;
            } else if (name.equalsIgnoreCase("Sedan")) {
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
