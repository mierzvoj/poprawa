package pjatk;

public class Main {
    public static void main(String[] args) {
        Shop sh1 = new Shop();
        Customer cs1 = new Customer(44);
        Product pr1 = new Product(123, "Soap", 20);

        sh1.addProd(123, "Soap", 20);
        sh1.sell(123, 44);
        sh1.removeProduct(123, "Soap", 20);


    }
}