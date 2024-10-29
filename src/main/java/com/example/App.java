package com.example;

public class App {
    public static void main(String[] args) {
        Product product1 = new Product("Хлеб", 2.0, 10, false);
        Product product2 = new Product("Молоко", 1.5, 0, true);  // Маркированный товар
        Product product3 = new Product("Сыр", 3.0, 5, false);

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);

        String paymentMethod = "QR-код";

        cart.printReceipt(paymentMethod);

        FiscalRegister fiscalRegister = new FiscalRegister();
        fiscalRegister.fiscalizeReceipt(cart);

        PaymentSystem paymentSystem = new PaymentSystem();
        paymentSystem.processPayment(cart, paymentMethod);
    }
}
