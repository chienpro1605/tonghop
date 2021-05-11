package staticproperty;

public class Car {
    private String name;
    private String engine;

    public static int numberOfCar;

    public Car(String name, String engine){
        this.name = name;
        this.engine = engine;
        numberOfCar ++;
    }
    public String getName(){
        return name;
    }
    public String getEngine(){
        return engine;
    }
    public void setName(String name){
        System.out.println("fererjh");
    }
}
