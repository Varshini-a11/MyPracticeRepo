package com.ecommerce.search;

public class PriceSearch implements SearchFilter {
    @Override
    public void search() {
        System.out.println("Searching products by Price Range...");
    }
}
