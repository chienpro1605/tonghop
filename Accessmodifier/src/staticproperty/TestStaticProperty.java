package staticproperty;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Madza3", "Skyactiv3");

        System.out.println(Car.numberOfCar);
        System.out.println(car1.getName());
        System.out.println(car1.getEngine());

        Car car2 = new Car("Madza6", "Skyactiv6");
        System.out.println(Car.numberOfCar);

    }
}
