public class Race {

    // Private data members
    private static int raceCount = 0; // Static variable to track total races
    private Car car1;
    private Car car2;
    private Car car3;
    private int distance;

    // Constructor
    public Race(Car car1, Car car2, Car car3, int distance) {
        this.car1 = car1;
        this.car2 = car2;
        this.car3 = car3;
        this.distance = distance;
        raceCount++;
    }

    // Public method to start the race
    public void startRace() {
        System.out.println("\nThe race has started!");
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

        determineWinner(car1Position, car2Position, car3Position);
    }

    // Private method to determine race winner
    private void determineWinner(int pos1, int pos2, int pos3) {
        if (pos1 >= distance && pos2 >= distance && pos3 >= distance) {
            System.out.println("It's a tie!");
        } else if (pos1 >= distance) {
            System.out.println(car1.getName() + " wins the race!");
        } else if (pos2 >= distance) {
            System.out.println(car2.getName() + " wins the race!");
        } else if (pos3 >= distance) {
            System.out.println(car3.getName() + " wins the race!");
        }
    }

    // Public static method to display total races
    public static void displayRaceCount() {
        System.out.println("Total Races Conducted: " + raceCount);
    }
}