package com.ecommerce.search;
public class SearchFactory {

    public SearchFilter getSearchFilter(String filterType) {
        if (filterType == null) {
            return null;
        }

        if (filterType.equalsIgnoreCase("CATEGORY")) {
            return new CategorySearch();
        } else if (filterType.equalsIgnoreCase("PRICE")) {
            return new PriceSearch();
        }

        return null;
    }
}
