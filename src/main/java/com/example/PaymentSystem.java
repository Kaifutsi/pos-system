package com.example;

class PaymentSystem {
    public void processPayment(ShoppingCart cart, String method) {
        if ("QR-код".equals(method)) {
            System.out.println("Оплата через СБП обработана.");
        } else {
            System.out.println("Оплата обработана через: " + method);
        }
    }
}
