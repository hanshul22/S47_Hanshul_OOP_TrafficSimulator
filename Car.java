public class Car {

    private String name;
    private int speed; 
    private int fuel;
    private String track; // Added track field

    public Car(String name, int speed, int fuel, String track) {
        // Using this pointer
        this.name = name;
        this.speed = speed;
        this.fuel = fuel;
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
        // Adjust speed based on the track and car type
        if (track.equalsIgnoreCase("offroad")) {
            if (name.equalsIgnoreCase("SportsCar")) {
                return speed - 20;  // SportsCar loses 20 speed on off-road
            } else if (name.equalsIgnoreCase("Truck")) {
                return speed;  // Truck speed remains the same on off-road
            } else if (name.equalsIgnoreCase("Sedan")) {
                return speed - 10;  // Sedan loses 10 speed on off-road
            }
        } else if (track.equalsIgnoreCase("city")) {
            if (name.equalsIgnoreCase("SportsCar")) {
                return speed - 10;  // SportsCar loses 10 speed in the city
            } else if (name.equalsIgnoreCase("Truck")) {
                return speed - 5;  // Truck loses 5 speed in the city
            } else if (name.equalsIgnoreCase("Sedan")) {
                return speed;  // Sedan maintains speed in the city
            }
        } else if (track.equalsIgnoreCase("smooth")) {
            if (name.equalsIgnoreCase("SportsCar")) {
                return speed;  // SportsCar maintains speed on smooth road
            } else if (name.equalsIgnoreCase("Truck")) {
                return speed - 5;  // Truck loses 5 speed on smooth road
            } else if (name.equalsIgnoreCase("Sedan")) {
                return speed - 5;  // Sedan loses 5 speed on smooth road
            }
        }
        return speed;  // Default return if no track matched
    }

    public String getName() {
        return name;
    }
}
