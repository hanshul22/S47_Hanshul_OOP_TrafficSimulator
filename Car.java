public class Car {

    private String name;
    private int speed; 
    private int fuel;  

    public Car(String name, int speed, int fuel) {
        this.name = name;
        this.speed = speed;
        this.fuel = fuel;
    }

    public void displayInfo() {
        System.out.println("Car Name: " + name);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel: " + fuel + " liters");
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

    public String getName() {
        return name;
    }
}