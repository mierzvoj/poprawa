package pjatk;

import java.math.*;

public class Product {
    int productId;
    String prodName;
    int price;

    public Product(int prodId, String prodName, int price) {
        this.productId = prodId;
        this.prodName = prodName;
        this.price = price;
    }

    public int getProdId() {
        return productId;
    }

    public void setProdId(int prodId) {
        this.productId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Product{" +
                "prodId=" + productId +
                ", prodName='" + prodName + '\'' +
                ", price=" + price +
                '}';
    }
}
