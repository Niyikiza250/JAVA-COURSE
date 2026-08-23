package BigProject.Models;

import BigProject.Abstracts.StockItem;

public class ElectronicsStock extends StockItem {

    private String warrantyPeriod;

    public void setWarrantyPeriod(String warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getWarrantyPeriod() {
        return warrantyPeriod;
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
