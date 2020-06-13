package pjatk;

import java.math.*;
import java.util.*;
import java.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.lang.annotation.*;

public class Shop {

   // @ShopAnn(key = "-1")
    String shopName;
    Product product;
    Customer customer;


    public Shop() {
        this.product = product;
        this.prodListToSale = prodListToSale;
        this.prodListSold = prodListSold;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<Product> getProdListToSale() {
        return prodListToSale;
    }

    public void setProdListToSale(List<Product> prodListToSale) {
        this.prodListToSale = prodListToSale;
    }

    public List<Product> getProdListSold() {
        return prodListSold;
    }

    public void setProdListSold(List<Product> prodListSold) {
        this.prodListSold = prodListSold;
    }

    public List<Product> prodListToSale = new ArrayList<>();
    public List<Product> prodListSold = new ArrayList<>();

    public List<Product> findAll() {
        return this.prodListToSale;
    }

    public List<Product> findAllForSale() {
        return this.prodListSold;
    }
    public void addProd(int prodId, String prodName, int price) {
        Product myProducts = new Product(prodId, prodName, price);
        prodListToSale.add(myProducts);
    }

    public Optional<Product> findById(int prodId) {
        return prodListToSale.stream().filter(product -> product.getProdId() == prodId).findFirst();
    }

    public void sell(int prodId, int custId) {
        Optional<Product> findbyId = findById(prodId);

        if (findbyId.isPresent()) {
            System.out.println("Products " + findbyId.get() + "are sold to client No. " + custId);

        } else {
            System.out.println("Product not found ");
        }
    }
/*
    public void sellAndRemove(List<Optional<Product>> products, int custId){
        products.stream().forEach(product-> {
            product.ifPresent(product1 -> {
                System.out.println("Product " + product1 + "has been sold to " + customer);
                removeProduct(product1);
            });
            products.ifPresentOrElse(product1 -> {
                System.out.println("Product " + product1 + "has been sold to " + customer);
                removeProduct(product1);
        },
                    () -> System.out.println("Product not found "));
    });
    }
*/


    public void removeProduct(int prodId, String prodName, int price){
        Product mySoldProducts = new Product(prodId, prodName, price) ;
        prodListSold.add(mySoldProducts);
        System.out.println("Products " + mySoldProducts + "are sold");

    }


    @Override
    public String toString() {
        return "Shop{" +
                "product=" + product +
                ", customer=" + customer +
                ", prodListToSale=" + prodListToSale +
                ", prodListSold=" + prodListSold +
                '}';
    }
}
