public class ElectricCar extends Car{

    ElectricCar(String carType) {
        super(carType);
    }

    @Override
    public void speedUp() {
        System.out.println("Electric car speeding up");
    }

    @Override
    public void slowDown() {
        System.out.println("Electric car speeding down");
    }

    @Override
    public void turnRight() {
        System.out.println("Electric car turning right");
    }
}
