package BigProject.Models;

import BigProject.Abstracts.StockItem;

import java.util.Scanner;

public class ElectronicsStock extends StockItem {

    Scanner scan = new Scanner(System.in);

    private int warrantyPeriod;

    public void setWarrantyPeriod(int warrantyPeriod) {
            if (warrantyPeriod>0) {
                this.warrantyPeriod = warrantyPeriod;
            }
            else {
                System.out.println(" The warranty Period must be greater than 0 ");
            }
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    @Override
    protected void inputItemData() {
        // Item ID
        while (true){
            System.out.println(" Enter the item Id :");
            String input=scan.nextLine();
            setItemId(input);
            if (getItemId()!=null && !getItemId().isEmpty()){
                break;
            }
            else {
                System.out.println(" Please enter valid Item Id ");
            }
        }
        // Item Name
        while (true){
            System.out.println(" Enter the Item Name ");
            String inputName = scan.nextLine();
            setItemName(inputName);
            if (getItemName()!=null && !getItemName().trim().isEmpty()){
                break;
            }
            else {
                System.out.println(" Please enter valid name of Item ");
            }
        }

        // Quantity
        while (true){
            System.out.println(" Enter the quantity of item ");
            int inputQuantity= scan.nextInt();
            scan.nextLine();
            setQuantity(inputQuantity);
            if (getQuantity()>0){
                break;
            }
            else {
                System.out.println(" Please the Quantity must be greater than 0 ");
            }
        }

        // Unity Price

        while (true){
            System.out.println(" Enter your unity Price ");
            double inputPrice= scan.nextDouble();
            scan.nextLine();
            setUnityPrice(inputPrice);

            if (getUnityPrice()>0){
                break;
            }
            else {
                System.out.println(" The Unity Price must be greater than 0");
            }
        }

        // Category
        while (true){
            System.out.println(" Enter your Item Category");
            String inputCategory= scan.nextLine();
            setCategory(inputCategory);
            if (getCategory()!=null && !getCategory().isEmpty()){
                break;
            }
            else {
                System.out.println(" The Item Category con contain characters or numbers");
            }
        }

        // Warranty Period
        while (true){
            System.out.println(" Enter how many months of your warranty period ");
            int inputWarranty = scan.nextInt();
            scan.nextLine();
            setWarrantyPeriod(inputWarranty);

            if (getWarrantyPeriod()>0){
                break;
            }
            else {
                System.out.println(" The Warranty Period must be greater than 0");
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
        } else if (getWarrantyPeriod()>0) {
            System.out.println(" the Warranty period must be greater than zero ");
        }
        else {
            System.out.println(" The entered values are valid ");
        }
    }

    @Override
    protected void displayItemData() {

        System.out.println(" WELCOME TO THE STOCK DETAILS");
        System.out.println("===============================");
        System.out.println(" Item Id : "+ getItemId());
        System.out.println(" Item Name : "+ getItemName());
        System.out.println(" Quantity : "+ getQuantity());
        System.out.println(" Unity Price : "+ getUnityPrice());
        System.out.println(" Category : "+ getCategory());
        System.out.println(" Warranty Period : "+ getWarrantyPeriod());

        System.out.println(" Thank you for using Electronics Stock ");
    }
}
