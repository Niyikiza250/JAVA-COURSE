package BigProject.Models;

import BigProject.Abstracts.Order;

public class PurchaseOrder extends Order {

    private String deliveryDate;
    private  int itemCount;

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public int getItemCount() {
        return itemCount;
    }

    @Override
    protected void displayOrderData() {

    }

    @Override
    protected void inputOrderData() {

    }

    @Override
    protected void validateOrderData() {

    }
}
