package com.financial.forecasting;

public class SalesForecast implements ForecastStrategy {
    @Override
    public void generateForecast() {
        System.out.println("Generating Sales Forecast for next quarter...");
    }
}
