package pjatk;

import java.util.*;

public class Customer {
    int custId;
    public List<Product> puchaseList= new ArrayList<>();

    public Customer(int custId) {
        this.custId = custId;
        this.puchaseList = puchaseList;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public List<Product> getPuchaseList() {
        return puchaseList;
    }

    public void setPuchaseList(List<Product> puchaseList) {
        this.puchaseList = puchaseList;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", puchaseList=" + puchaseList +
                '}';
    }
}
