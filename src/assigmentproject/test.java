package assigmentproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class test {
    public static void main(String[] args) {
        Car lexus = new Car(001,"lexus",199,"lexus001");
        Car rangeRover = new Car(002,"Range Rover",190, "RangeRover002");
        List<Object> item = new ArrayList<>();
        item.add(Car.getCarMap().get(1));
        item.add(Car.getCarMap().get(2));
        Saler thai = new Saler("Thái");
        Saler thi = new Saler("Thi");
        thai.transaction();
        thi.transaction();
        System.out.println(Sale.getSaleHistory());


    }
}
