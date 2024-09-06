package assigmentproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Sale {
    private String saleID;
    private List<Object> itemList;
    private Long total_amount;
    private static List<Sale> saleHistory = new ArrayList<>();

    public Sale(String saleID, List<Object> itemList, Long total_amount) {
        this.saleID = saleID;
        this.itemList = itemList;
        this.total_amount = total_amount;
        saleHistory.add(this);
    }

    @Override
    public String toString() {
        return "Sale{" +
                "saleID='" + saleID + '\'' +
                ", itemList=" + itemList +
                ", total_amount=" + total_amount +
                '}';
    }

    public static List<Sale> getSaleHistory() {
        return saleHistory;
    }

    public static void setSaleHistory(List<Sale> saleHistory) {
        Sale.saleHistory = saleHistory;
    }

    public List<Object> getItemList() {
        return itemList;
    }

    public void setItemList(List<Object> itemList) {
        this.itemList = itemList;
    }

    public Long getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(Long total_amount) {
        this.total_amount = total_amount;
    }

    public String getSaleID() {
        return saleID;
    }

    public void setSaleID(String saleID) {
        this.saleID = saleID;
    }

}
