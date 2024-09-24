public class Main {
    public static void main(String[] args) {
        /*
        Composition in Java is a type of association that represents a "strong" relationship
        between two classes. In composition, one class contains another class, and the
        contained class (part) cannot exist independently of the container (whole).
        If the whole object is destroyed, the part objects are also destroyed.

        In simpler terms, composition implies a "has-a" relationship where the contained objects
        (the parts) are dependent on the existence of the container object (the whole).

        Key Characteristics of Composition:

        Lifetime Dependency: If the container object is destroyed, the contained objects are also destroyed.

        Strong Association: The contained object does not exist independently outside the container object.

        Ownership: The container object is responsible for the lifecycle of the contained objects.
         */
        Car car = new Car("Tesla", "ELectric");
        car.startCar();
    }
}