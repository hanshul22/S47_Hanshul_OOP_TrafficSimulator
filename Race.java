public class Race {

    private Car car1;
    private Car car2;
    private Car car3;
    private int distance;

    public Race(Car car1, Car car2, Car car3, int distance) {
        this.car1 = car1;
        this.car2 = car2;
        this.car3 = car3;
        this.distance = distance;
    }

    public void startRace() {
        System.out.println("The race has started!");
        car1.displayInfo();
        car2.displayInfo();
        car3.displayInfo();

        int car1Position = 0;
        int car2Position = 0;
        int car3Position = 0;

        // Racing logic
        while (car1Position < distance && car2Position < distance && car3Position < distance) {
            if (car1.move()) {
                car1Position += car1.getAdjustedSpeed() / 10;  // Adjust position based on track
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

        // Checking race results
        if (car1Position >= distance && car2Position >= distance && car3Position >= distance) {
            System.out.println("It's a tie!");
        } else if (car1Position >= distance) {
            System.out.println(car1.getName() + " wins the race!");
        } else if (car2Position >= distance) {
            System.out.println(car2.getName() + " wins the race!");
        } else if (car3Position >= distance) {
            System.out.println(car3.getName() + " wins the race!");
        } else {
            System.out.println("Cars did not finish the race due to an accident.");
        }
    }
}
