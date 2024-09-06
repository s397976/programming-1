package assigmentproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Saler {
    private String name;

    public Saler(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void transaction(){
        Scanner Scan = new Scanner(System.in);
        System.out.println("Hãy nhập mã giao dịch");
        String saleId = Scan.nextLine();
        System.out.println("Có bao nhiêu món đồ trong lần giao dịch này");
        int amount = Scan.nextInt();
        List<Object> item = new ArrayList<>();
        System.out.println("Hãy nhập mã sản phẩm bạn muốn");
        long Total = 0;
        for (int i = 0; i < amount; i++) {
            System.out.println("Mã sản phẩm " + (i+1));
            int carId = Scan.nextInt();
            item.add(Car.getCarMap().get(carId));
            System.out.println("nhập số lượng của sản phẩm này");
            int soLuong = Scan.nextInt();
            Total = Total + (Car.getCarMap().get(carId).getPrice()*soLuong);


        }
        Sale sale = new Sale(saleId,item,Total);
    }
}
