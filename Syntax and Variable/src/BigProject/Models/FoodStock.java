package BigProject.Models;

import BigProject.Abstracts.StockItem;

import java.time.LocalDate;

public class FoodStock extends StockItem {

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
    protected void displayItemData() {

    }

    @Override
    protected void inputItemData() {

    }

    @Override
    protected void validateItemData() {

    }
}
