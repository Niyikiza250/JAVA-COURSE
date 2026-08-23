package BigProject.Abstracts;

public abstract class Supplier {

    private String supplierId;
    private  String supplierName;
    private String contactNumber;
    private String email;
    private  int rating;


    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public int getRating() {
        return rating;
    }

    protected abstract void inputSupplierData();
    protected abstract void validateSupplierData();
    protected abstract void displaySupplierData();

}
