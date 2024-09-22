public class Main {
    public static void main(String[] args) {
        Car electricCar = new ElectricCar("Electric");
        Car petrolCar = new PetrolCar("Petrol");

        electricCar.speedUp();
        electricCar.slowDown();

        petrolCar.speedUp();
        petrolCar.slowDown();

        System.out.println(electricCar.getCarType());
        System.out.println(petrolCar.getCarType());

    }
}