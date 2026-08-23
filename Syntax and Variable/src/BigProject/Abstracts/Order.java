package BigProject.Abstracts;

public abstract class Order {

    private String orderId;
    private String orderDate;
    private String supplierId;
    private  double totalAmount;
    private  String orderStatus;

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getOrderDate() {
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
