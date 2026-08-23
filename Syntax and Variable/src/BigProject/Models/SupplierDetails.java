package BigProject.Models;

import BigProject.Abstracts.Supplier;

public class SupplierDetails extends Supplier {

    private String address;
    private String contractStartDate;

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContractStartDate(String contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public String getAddress() {
        return address;
    }

    public String getContractStartDate() {
        return contractStartDate;
    }

    @Override
    protected void displaySupplierData() {


    }

    @Override
    protected void inputSupplierData() {

    }

    @Override
    protected void validateSupplierData() {


    }
}
