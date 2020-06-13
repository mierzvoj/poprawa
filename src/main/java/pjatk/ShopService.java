package pjatk;

import java.util.*;
import java.util.stream.*;

public class ShopService {

    Product product;
    Customer customer;
    Shop shop;

    public List<Product> productListToSale = new ArrayList<>();
    public List<Product> prodListSold = new ArrayList<>();
    public List<Product> purchaseList= new ArrayList<>();

    public ShopService() {
        this.product = product;
        this.customer = customer;
        this.shop = shop;
        this.productListToSale = productListToSale;
        this.prodListSold = prodListSold;
        this.purchaseList = purchaseList;
    }

    Shop sh1 = new Shop();
    public void addProd(int prodId, String prodName, int price) {
        Product myProducts1 = new Product(prodId, prodName, price);
        productListToSale.add(myProducts1);
    }
    public List<Product> findAllToSale() {
        System.out.println(productListToSale);
        return this.productListToSale;

    }
    public void addSold(int prodId, String prodName, int custId) {
        Product myProducts2 = new Product(prodId, prodName, custId);
        purchaseList.add(myProducts2);
    }

    public Optional<Product> findById(int prodId) {
        return purchaseList.stream().filter(product -> product.getProdId() == prodId).findFirst();
    }

    private Optional<Product> findProductinShop(int prodId) {
        return productListToSale.stream().filter(product -> product.getProdId() == prodId).findFirst();
    }




}
