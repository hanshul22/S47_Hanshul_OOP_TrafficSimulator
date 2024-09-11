public class Main {
    public static void main(String[] args) {
        
        Car[] cars = new Car[2]; 

        cars[0] = new Car("SportsCar", 120, 10);
        cars[1] = new Car("Sedan", 100, 8);      
        
        Race race = new Race(cars[0], cars[1], 5); 
        
        race.startRace();
    }
}
