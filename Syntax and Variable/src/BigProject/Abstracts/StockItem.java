package BigProject.Abstracts;

public abstract class StockItem {
        private String itemId;
        private String itemName;
        private int quantity;
        private double unityPrice;
        private String category;

    public void setItemId(String itemId) {
        if (itemId.matches("[a-zA-Z ]+") && itemId.matches("[0-9]")) {
            this.itemId = itemId;
        }
        else {
            System.out.println(" The Item Id must Contain Characters and Numbers .");
        }
    }

    public void setItemName(String itemName) {
        if (itemName.matches("[a-zA-Z ]+")) {
            this.itemName = itemName;
        }
        else {
            System.out.println(" The name must be btn a-z");
        }
    }

    public void setQuantity(int quantity) {
        if (quantity>0) {
            this.quantity = quantity;
        }
        else {
            System.out.println(" The Quantity must be greater than 0");
        }
    }

    public void setUnityPrice(double unityPrice) {
        if (unityPrice>0) {
            this.unityPrice = unityPrice;
        }
        else {
            System.out.println(" The unity Price must be greater than 0 ");
        }
    }

    public void setCategory(String category) {
        if (category.matches(" [a-zA-Z ]+") && category.matches("[0-9]")) {
            this.category = category;
        }
        else {
            System.out.println(" The category can be btn characters or numbers ");
        }
    }

    public String getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnityPrice() {
        return unityPrice;
    }

    public String getCategory() {
        return category;
    }

    protected abstract void inputItemData();
    protected abstract void validateItemData();
    protected abstract  void displayItemData();
}
