package BigProject.Models;

import BigProject.Abstracts.StockItem;

public class DigitalProductStock extends StockItem {

    private String downloadLink;

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }

    public String getDownloadLink() {
        return downloadLink;
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
