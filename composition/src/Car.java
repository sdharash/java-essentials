public class Car {
    private String model;
    private Engine engine;

    Car(String model, String engineType) {
        this.model = model;
        this.engine = new Engine(engineType);
    }

    public void startCar() {
        this.engine.start();
        System.out.println("Car has started");
    }
}
