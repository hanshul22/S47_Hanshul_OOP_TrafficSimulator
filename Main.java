public class Main {
    public static void main(String[] args) {
        
        Car sportsCar = new Car("SportsCar", 120, 10); 
        Car sedan = new Car("Sedan", 100, 8);          

        Race race = new Race(sportsCar, sedan, 5);

        race.startRace();
    }
}