public class Race {

    private static int raceCount = 0; // Static variable to track total races conducted
    private Car car1;
    private Car car2;
    private Car car3;
    private int distance;

    public Race(Car car1, Car car2, Car car3, int distance) {
        this.car1 = car1;
        this.car2 = car2;
        this.car3 = car3;
        this.distance = distance;
        raceCount++; // Increment static variable whenever a new race is created
    }

    // Accessors (Getters)
    public int getDistance() {
        return distance;
    }

    public Car getCar1() {
        return car1;
    }

    public Car getCar2() {
        return car2;
    }

    public Car getCar3() {
        return car3;
    }

    // Mutators (Setters)
    public void setDistance(int distance) {
        if (distance > 0) { // Validation: distance must be positive
            this.distance = distance;
        }
    }

    public void setCar1(Car car1) {
        this.car1 = car1;
    }

    public void setCar2(Car car2) {
        this.car2 = car2;
    }

    public void setCar3(Car car3) {
        this.car3 = car3;
    }

    public void startRace() {
        System.out.println("The race has started!");
        car1.displayInfo();
        car2.displayInfo();
        car3.displayInfo();

        int car1Position = 0;
        int car2Position = 0;
        int car3Position = 0;

        while (car1Position < distance && car2Position < distance && car3Position < distance) {
            if (car1.move()) {
                car1Position += car1.getAdjustedSpeed() / 10;
            }
            if (car2.move()) {
                car2Position += car2.getAdjustedSpeed() / 10;
            }
            if (car3.move()) {
                car3Position += car3.getAdjustedSpeed() / 10;
            }

            System.out.println(car1.getName() + " is at position: " + car1Position + " km");
            System.out.println(car2.getName() + " is at position: " + car2Position + " km");
            System.out.println(car3.getName() + " is at position: " + car3Position + " km");
        }

        if (car1Position >= distance && car2Position >= distance && car3Position >= distance) {
            System.out.println("It's a tie!");
        } else if (car1Position >= distance) {
            System.out.println(car1.getName() + " wins the race!");
        } else if (car2Position >= distance) {
            System.out.println(car2.getName() + " wins the race!");
        } else if (car3Position >= distance) {
            System.out.println(car3.getName() + " wins the race!");
        }
    }

    // Static method to display total races conducted
    public static void displayRaceCount() {
        System.out.println("Total Races Conducted: " + raceCount);
    }
}
