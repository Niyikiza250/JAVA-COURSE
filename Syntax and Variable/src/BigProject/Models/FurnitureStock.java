package BigProject.Models;

import BigProject.Abstracts.StockItem;

import java.util.Scanner;

public class FurnitureStock extends StockItem {
    Scanner scan = new Scanner(System.in);

    private String material;

    public void setMaterial(String material) {
        if (material!=null && !material.trim().isEmpty()) {
            this.material = material;
        }
        else {
            System.out.println(" Entered material is invalid ");
        }
    }

    public String getMaterial() {
        return material;
    }

    @Override
    protected void displayItemData() {

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
        // Material
        while (true){
            System.out.println(" Enter Material Name ");
            String inputMaterails= scan.nextLine();
            setMaterial(inputMaterails);
            if (material!=null && !material.trim().isEmpty()){
                break;
            }
            else {
                System.out.println(" The entered Material is Invalid ");
            }
        }
    }

    @Override
    protected void inputItemData() {

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
        } else if (getMaterial()!=null && getMaterial().trim().isEmpty()) {
            System.out.println(" the entered material is invalid ");
        }
        else {
            System.out.println(" The entered values are valid ");
        }
    }

    @Override
    protected void validateItemData() {

        System.out.println(" WELCOME TO THE FURNITURE STOCK DETAILS");
        System.out.println("===============================");
        System.out.println(" Item Id : "+ getItemId());
        System.out.println(" Item Name : "+ getItemName());
        System.out.println(" Quantity : "+ getQuantity());
        System.out.println(" Unity Price : "+ getUnityPrice());
        System.out.println(" Category : "+ getCategory());
        System.out.println(" Warranty Period : "+ getMaterial());

        System.out.println(" Thank you for using Furniture Stock ");
    }
}
