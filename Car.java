public class Car {

    private static int totalCars = 0; // Static variable to track total cars created
    private String name;
    private int speed; 
    private int fuel;
    private String track; 

    public Car(String name, int speed, int fuel, String track) {
        this.name = name;
        this.speed = speed;
        this.fuel = fuel;
        this.track = track;
        totalCars++; // Increment the static variable whenever a new car is created
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

    public String getName() {
        return name;
    }

    // Static method to display total cars
    public static void displayTotalCars() {
        System.out.println("Total Cars Participating in the Race : " + totalCars);
    }
}
