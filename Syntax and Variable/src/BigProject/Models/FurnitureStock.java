package BigProject.Models;

import BigProject.Abstracts.StockItem;

public class FurnitureStock extends StockItem {

    private String material;

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
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
