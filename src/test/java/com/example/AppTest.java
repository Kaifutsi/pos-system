package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {

    @Test
    public void testCalculateTotalWithDiscount() {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(new Product("Хлеб", 2.0, 10, false));
        cart.addProduct(new Product("Молоко", 1.5, 0, true));

        double expectedTotal = ((2.0 * 0.9) + 1.5) * 1.1;
        assertEquals(expectedTotal, cart.calculateTotal(), 0.01);
    }

    @Test
    public void testEmptyCartTotal() {
        ShoppingCart cart = new ShoppingCart();
        assertEquals(0.0, cart.calculateTotal(), 0.01);
    }

    @Test
    public void testMarkedProduct() {
        Product markedProduct = new Product("Молоко", 1.5, 0, true);
        assertTrue(markedProduct.isMarked());
    }

    @Test
    public void testFiscalization() {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(new Product("Хлеб", 2.0, 10, false));
        FiscalRegister fiscalRegister = new FiscalRegister();
        fiscalRegister.fiscalizeReceipt(cart);
    }

    @Test
    public void testQRPayment() {
        ShoppingCart cart = new ShoppingCart();
        PaymentSystem paymentSystem = new PaymentSystem();
        paymentSystem.processPayment(cart, "QR-код");
    }
}
