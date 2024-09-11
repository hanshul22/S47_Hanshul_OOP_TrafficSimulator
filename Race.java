public class Race {

    private Car car1;
    private Car car2;
    private int distance; 

    public Race(Car car1, Car car2, int distance) {
        this.car1 = car1;
        this.car2 = car2;
        this.distance = distance;
    }

    public void startRace() {
        System.out.println("The race has started!");
        car1.displayInfo();
        car2.displayInfo();

        int car1Position = 0;
        int car2Position = 0;

        while (car1Position < distance && car2Position < distance) {
            if (car1.move()) {
                car1Position++;
            }
            if (car2.move()) {
                car2Position++;
            }
            System.out.println(car1.getName() + " is at position: " + car1Position + " km");
            System.out.println(car2.getName() + " is at position: " + car2Position + " km");
        }

        if (car1Position >= distance && car2Position >= distance) {
            System.out.println("It's a tie!");
        } else if (car1Position >= distance) {
            System.out.println(car1.getName() + " wins the race!");
        } else {
            System.out.println(car2.getName() + " wins the race!");
        }
    }
}