package com.example;

import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    private List<Product> products = new ArrayList<>();
    private double taxRate = 0.1;

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total + (total * taxRate);
    }

    public void printReceipt(String paymentMethod) {
        System.out.println("----- Чек -----");
        for (Product product : products) {
            System.out.println(product.getName() + " - $" + product.getPrice() + " (Скидка: $" + (product.getOriginalPrice() - product.getPrice()) + ")");
        }
        System.out.println("Итого с налогом: $" + calculateTotal());
        System.out.println("Метод оплаты: " + paymentMethod);
        System.out.println("Спасибо за покупку!");
    }
}
