package BigProject.Models;

import BigProject.Abstracts.StockItem;

public class ClothingStock extends StockItem {

    private String fabricType;

    public void setFabricType(String fabricType) {
        this.fabricType = fabricType;
    }

    public String getFabricType() {
        return fabricType;
    }

    @Override
    protected void inputItemData() {

    }

    @Override
    protected void validateItemData() {

    }

    @Override
    protected void displayItemData() {

    }
}
