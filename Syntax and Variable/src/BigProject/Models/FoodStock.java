package BigProject.Models;

import BigProject.Abstracts.StockItem;

import java.time.LocalDate;
import java.util.Scanner;

public class FoodStock extends StockItem {
    Scanner scan =new Scanner(System.in);

 private LocalDate expiryDate;

    public void setExpiryDate(LocalDate expiryDate) {
        if (expiryDate.isAfter(LocalDate.now())){
        this.expiryDate = expiryDate;
    }
        else {
        System.out.println(" Entered Date is Expired");
        }}

    public LocalDate getExpiryDate() {
        return expiryDate;
    }


    @Override
    protected void inputItemData() {
        // Item ID
        while (true){
            System.out.println(" Enter the Item Id ");
            String inputItemId=scan.nextLine();
            setItemId(inputItemId);
            if (getItemId()!=null && !getItemId().trim().isEmpty()){
                break;
            }
            else {
                System.out.println(" Enter name of Item is invalid ");
            }
        }
        // Item Name
        while (true){
            System.out.println(" Enter the Name of Item ");
            String inputItemName= scan.nextLine();
            setItemName(inputItemName);
            if (getItemName()!=null && !getItemName().trim().isEmpty()){
                break;
            }
            else {
                System.out.println(" The entered name of Item is invalid ");
            }
        }
        // Quantity
        while (true){
            System.out.println(" Enter The Quantity You want ");
            int inputQuantity=scan.nextInt();
            scan.nextLine();
            setQuantity(inputQuantity);
            if (getQuantity()>0){
                break;
            }
            else {
                System.out.println(" The Quantity must be btn 0 and 9 ");
            }
        }
        // Unit Price
        while (true){
            System.out.println(" Enter the unity Price of your Quantity  ");
            double inputUnityPrice= scan.nextDouble();
            scan.nextLine();
            setUnityPrice(inputUnityPrice);
            if (getUnityPrice()>0){
                break;
            }
            else {
                System.out.println(" The unit Price must be greater than 0 ");
            }
        }

        // Category
        while (true){
            System.out.println(" Enter the Category of your Quantity ");
            String inputCategory= scan.nextLine();
            setCategory(inputCategory);
            if (getCategory()!=null && !getCategory().trim().isEmpty()){
                break;
            }
            else {
                System.out.println(" The entered Category is Invalid ");
            }
        }
        // Expiry Date
        while (true){
            System.out.println(" Enter the Date Expiry");
            LocalDate inputExpiryDate=LocalDate.parse(scan.nextLine());
            setExpiryDate(inputExpiryDate);
            if (getExpiryDate().isAfter(LocalDate.now())){
                break;
            }
            else {
                System.out.println(" Expiry date is Invalid ");
            }
        }

    }

    @Override
    protected void validateItemData() {
        if (getItemId()!=null && !getItemId().trim().isEmpty()){
            System.out.println(" Item ID is invalid");
        } else if (getItemName()!=null && !getItemName().trim().isEmpty()) {
            System.out.println(" Item Name is invalid ");
        }
        else if (getQuantity()>0){
            System.out.println(" The Quantity must greater than 0");
        } else if (getUnityPrice()>0) {
            System.out.println(" The Unity price must greater than 0");
        } else if (getCategory()!=null && !getCategory().trim().isEmpty()) {
            System.out.println(" The category is invalid ");
        } else if (getExpiryDate().isAfter(LocalDate.now())) {
            System.out.println(" Entered Expiry Date is Invalid ");
        }
        else {
            System.out.println(" The entered values are valid ");
        }

    }

    @Override
    protected void displayItemData() {

        System.out.println("  WELCOME TO THE FOOD STOCK DETAILS ");
        System.out.println("=======================================");
        System.out.println(" Item Id : "+ getItemId());
        System.out.println(" Item Name : "+ getItemName());
        System.out.println(" Quantity : "+ getQuantity());
        System.out.println(" Unity Price : "+ getUnityPrice());
        System.out.println(" Category : "+ getCategory());
        System.out.println(" Warranty Period : "+ getExpiryDate());

        System.out.println(" Thank you for using Food Stock ");
    }
}
