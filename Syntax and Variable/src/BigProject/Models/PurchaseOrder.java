package BigProject.Models;

import BigProject.Abstracts.Order;

import java.time.LocalDate;
import java.util.Scanner;

public class PurchaseOrder extends Order {
    Scanner scan = new Scanner(System.in);

    private LocalDate deliveryDate;
    private  int itemCount;

    public void setDeliveryDate(LocalDate deliveryDate) {
        if (deliveryDate.isAfter(LocalDate.now())) {
            this.deliveryDate = deliveryDate;
        }
        else {
            System.out.println(" Entered Delivery Date is Invalid ");
        }
    }

    public void setItemCount(int itemCount) {
        if (itemCount>0) {
            this.itemCount = itemCount;
        }
        else {
            System.out.println(" The Item Count must be greater than 0 ");
        }
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public int getItemCount() {
        return itemCount;
    }

    @Override
    protected void inputOrderData() {
        //  Order ID
        while (true){
            System.out.println(" Enter the Order ID ");
            String inputOrderID = scan.nextLine();
            setOrderId(inputOrderID);
            if (getOrderId()!=null && !getOrderId().trim().isEmpty()){
                break;
            }
            else {
                System.out.println(" The order id is invalid! ");
            }
        }

        // Order Name
        while (true){
            System.out.println(" Enter the Order Date  (YY-MM-DD ");
            LocalDate inputOrderDate = LocalDate.parse(scan.nextLine());
            setOrderDate(inputOrderDate);
            if (getOrderDate().isAfter(LocalDate.now())){
                break;
            }
            else {
                System.out.println(" The order entered is invalid");
            }

        }
        // Supplier Id
        while (true){
            System.out.println(" Enter the Supplier Id ");
            String inputSupplierId= scan.nextLine();
            setSupplierId(inputSupplierId);
            if (getSupplierId()!=null && !getSupplierId().trim().isEmpty()){
                break;
            }
            else {
                System.out.println(" The Supplier Id is invalid");
            }
        }

        // TotalAmount
        while (true){
            System.out.println(" Enter the Total Amount ");
            double inputTotalAmount= scan.nextDouble();
            scan.nextLine();
            setTotalAmount(inputTotalAmount);
            if (getTotalAmount()>0){
                break;
            }
            else {
                System.out.println(" Entered |Total Amount is invalid ");
            }
        }

        // Order Status

        while (true){
            System.out.println(" Enter the Order Status ");
            String inputOrderStatus = scan.nextLine();
            setOrderStatus(inputOrderStatus);
            if (getOrderStatus()!=null && !getOrderStatus().trim().isEmpty()){
                break;
            }
            else {
                System.out.println(" Entered Status is invalid ");
            }
        }

        // Delivery Date
        while (true){
            System.out.println(" Enter Delivery Date (YYY-MMM-DDD ");
            LocalDate inputDeliveryDate= LocalDate.parse(scan.nextLine());
            setDeliveryDate(inputDeliveryDate);
            if (deliveryDate.isAfter(LocalDate.now())){
                break;
            }
            else {
                System.out.println(" The Date Entered is Invalid");
            }
        }

        // Item Count
        while (true){
            System.out.println(" Enter The Item Count ");
            int inputItemCount= scan.nextInt();
            setItemCount(inputItemCount);
            if (itemCount>0){
                break;
            }
            else {
                System.out.println(" Item Count is Invalid ");
            }
        }
    }

    @Override
    protected void validateOrderData() {

        if (getOrderId()==null && getOrderId().trim().isEmpty()){
            System.out.println(" Please Enter valid Order Id ");
        } else if (getOrderDate().isBefore(LocalDate.now())) {
            System.out.println(" Please enter valid Date ");
        } else if (getSupplierId()==null || getSupplierId().trim().isEmpty()) {
            System.out.println(" please Enter valid Supplier Id ");
        } else if (getOrderStatus()==null||getOrderStatus().trim().isEmpty()) {
            System.out.println(" Please enter valid Order Status ");
        } else if (getTotalAmount()<=0) {
            System.out.println(" The Total Amount must be greater than 0");
        } else if (getDeliveryDate().isBefore(LocalDate.now())) {
            System.out.println(" Enter valid Date Please ");
        } else if (getItemCount()<=0) {
            System.out.println(" The Item Count must be greater than 0");
        }
        else {
            System.out.println(" Data entered are valid ");
        }
    }

    @Override
    protected void displayOrderData() {
        System.out.println(" PURCHASE ORDER DETAILS ");
        System.out.println("=========================");
        System.out.println(" Item Count : "+getItemCount());
        System.out.println(" Order ID : "+getOrderId());
        System.out.println(" Order Date : "+getOrderDate());
        System.out.println(" Supplier ID : "+getSupplierId());
        System.out.println(" Order Status : "+getOrderStatus());
        System.out.println(" Delivery Date : "+getDeliveryDate());
        System.out.println(" Total Amount : "+getTotalAmount());

    }
}
