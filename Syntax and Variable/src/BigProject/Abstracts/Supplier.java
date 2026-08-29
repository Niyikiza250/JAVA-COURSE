package BigProject.Abstracts;

public abstract class Supplier {

    private String supplierId;
    private  String supplierName;
    private String contactNumber;
    private String email;
    private  int rating;


    public void setSupplierId(String supplierId) {
        if (supplierId.matches("[a-zA-Z ]+") && supplierId.matches("[0-9]")) {
            this.supplierId = supplierId;
        }
        else {
            System.out.println(" The Supplier Id must contain characters or numbers .");
        }
    }

    public void setSupplierName(String supplierName) {
        if (supplierName.matches("[a-zA-Z ]+")) {
            this.supplierName = supplierName;
        }
        else{
            System.out.println(" The Supplier name must contain characters ");
        }
    }

    public void setContactNumber(String contactNumber) {
        if (!contactNumber.isEmpty()) {
            this.contactNumber = contactNumber;
        }
        else {
            System.out.println(" The Contact number must not be Empty");
        }
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        }
        else {
            System.out.println(" The email must contain @ ");
        }
    }

    public void setRating(int rating) {
        if (rating>0) {
            this.rating = rating;
        }
        else {
            System.out.println(" The rating score must be greater than 0 ");
        }
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
