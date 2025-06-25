package com.financial.forecasting;

public class ExpenseForecast implements ForecastStrategy {
    @Override
    public void generateForecast() {
        System.out.println("Generating Expense Forecast for next quarter...");
    }
}

