package com.example;

class FiscalRegister {
    public void fiscalizeReceipt(ShoppingCart cart) {
        System.out.println("Чек фискализирован с общей суммой: $" + cart.calculateTotal());
    }
}
