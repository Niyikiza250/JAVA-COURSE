package BigProject.Models;

import BigProject.Abstracts.StockItem;

import java.util.Scanner;

public class ClothingStock extends StockItem {
    Scanner scan = new Scanner(System.in);

    private String fabricType;

    public void setFabricType(String fabricType) {
        if (fabricType!=null && !fabricType.trim().isEmpty()) {
            this.fabricType = fabricType;
        }
        else {
            System.out.println(" Entered FabricType is Invalid");
        }
    }

    public String getFabricType() {
        return fabricType;
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
        // Fabric type
        while (true) {
            System.out.println(" Enter the Fabric Type ");
            String inputFabricType = scan.nextLine();
            setFabricType(inputFabricType);
            if (getFabricType() != null && !getFabricType().trim().isEmpty()) {
                break;
            } else {
                System.out.println(" Entered Fabric Type is Invalid ");
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
        } else if (getFabricType()!=null && !getFabricType().trim().isEmpty()) {
            System.out.println(" The entered Fabric type is invalid ");
        }
        else {
            System.out.println(" The entered values are valid ");
        }
    }

    @Override
    protected void displayItemData() {
        System.out.println(" WELCOME TO THE CLOTHING STOCK DETAILS");
        System.out.println("===============================");
        System.out.println(" Item Id : "+ getItemId());
        System.out.println(" Item Name : "+ getItemName());
        System.out.println(" Quantity : "+ getQuantity());
        System.out.println(" Unity Price : "+ getUnityPrice());
        System.out.println(" Category : "+ getCategory());
        System.out.println(" Warranty Period : "+ getFabricType());

        System.out.println(" Thank you for using Clothing Stock ");
    }
}
