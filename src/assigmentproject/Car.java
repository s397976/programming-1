package assigmentproject;

import java.util.HashMap;

public class Car {
    private int carID;
    private String name;
    private int price;
    private String model;
    private static HashMap<Integer,Car> carMap = new HashMap<>();

    public Car(int carID,String name, int price, String model) {
        this.carID = carID;
        this.name = name;
        this.price = price;
        this.model = model;
        carMap.put(this.carID, this);
    }
    public static void displayCarByID(){
        for(Car carMapss: carMap.values()){
            System.out.println(carMapss);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "carID=" + carID +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", model='" + model + '\'' +
                '}';
    }

    public static HashMap<Integer, Car> getCarMap() {
        return carMap;
    }

    public static void setCarMap(HashMap<Integer, Car> carMap) {
        Car.carMap = carMap;
    }

    public int getCarID() {
        return carID;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
