package com.financial.forecasting;

public class ForecastContext {
    private ForecastStrategy strategy;

    public void setStrategy(ForecastStrategy strategy) {
        this.strategy = strategy;
    }

    public void generateReport() {
        if (strategy != null) {
            strategy.generateForecast();
        } else {
            System.out.println("No forecasting strategy selected.");
        }
    }
}

