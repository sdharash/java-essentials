public class PetrolCar extends Car{

    PetrolCar(String carType) {
        super(carType);
    }

    @Override
    public void speedUp() {
        System.out.println("Petrol car speeding up");
    }

    @Override
    public void slowDown() {
        System.out.println("Petrol car speeding down");
    }

    @Override
    public void turnRight() {
        System.out.println("Petrol car turning right");
    }
}
