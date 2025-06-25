package com.financial.forecasting;

public class Main {

	public static void main(String[] args) {
		ForecastContext context = new ForecastContext();

        // Example 1: Sales Forecast
        context.setStrategy(new SalesForecast());
        context.generateReport();

        // Example 2: Expense Forecast
        context.setStrategy(new ExpenseForecast());
        context.generateReport();
	}

}
