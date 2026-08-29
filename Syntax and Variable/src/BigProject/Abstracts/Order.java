package BigProject.Abstracts;

import java.time.LocalDate;

public abstract class Order {

    private String orderId;
    private LocalDate orderDate;
    private String supplierId;
    private  double totalAmount;
    private  String orderStatus;

    public void setOrderId(String orderId) {
        if (orderId.matches("[a-zA-Z ]+") && orderId.matches("[0-9]") || !orderId.isEmpty()) {
            this.orderId = orderId;
        }
        else {
            System.out.println(" The OrderId must be btn A-Z and 0-9 ");
        }

    }

    public void setOrderDate(LocalDate orderDate) {
        if (orderDate.isAfter(LocalDate.now())) {
            this.orderDate = orderDate;
        }
        else {
            System.out.println(" The Order Date has Expired.");
        }
    }

    public void setSupplierId(String supplierId) {
        if (supplierId.matches("[a-zA-Z ]+") && supplierId.matches("[0-9]") || !supplierId.isEmpty()) {
            this.supplierId = supplierId;
        }
        System.out.println(" The Supplier Id must be btn A-Z and 0-9.");
    }

    public void setTotalAmount(double totalAmount) {
        if (totalAmount>0) {
            this.totalAmount = totalAmount;
        }
        else {
            System.out.println(" The total Amount must be greater than Zero (0).");
        }
    }

    public void setOrderStatus(String orderStatus) {
        if (orderStatus.matches("[a-zA-Z ]+") && orderStatus.matches("[0-9]")) {
            this.orderStatus = orderStatus;
        }
        else {
            System.out.println(" The order status must be Characters or numbers .");
        }
    }

    public String getOrderId() {
        return orderId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    protected abstract void inputOrderData();
    protected abstract  void validateOrderData();
    protected abstract void displayOrderData();
}
