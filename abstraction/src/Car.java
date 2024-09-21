abstract class Car {

    private final String carType;

    // abstract class can have constructor
    public Car(String carType) {
        this.carType = carType;
    }

    public abstract void speedUp();
    public abstract void slowDown();
    public abstract void turnRight();

    public String getCarType() {
        return carType;
    }

}
