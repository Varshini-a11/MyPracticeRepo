package com.ecommerce.search;

public class Main {

	public static void main(String[] args) {
		 SearchFactory factory = new SearchFactory();

	        // Get Category Search Filter
	        SearchFilter filter1 = factory.getSearchFilter("CATEGORY");
	        filter1.search();

	        // Get Price Search Filter
	        SearchFilter filter2 = factory.getSearchFilter("PRICE");
	        filter2.search();
	    }
	}

	


