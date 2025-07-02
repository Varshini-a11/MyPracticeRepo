package com.example.orderservice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {

    private PaymentProcessor paymentProcessorMock;
    private OrderService orderService;

    @BeforeEach
    void setUp() {
        // Arrange: create mock and service
        paymentProcessorMock = mock(PaymentProcessor.class);
        orderService = new OrderService(paymentProcessorMock);
    }

    @Test
    void testPlaceOrder_PaymentSuccessful() {
        // Arrange
        String orderId = "ORD123";
        double amount = 99.99;
        when(paymentProcessorMock.processPayment(orderId, amount)).thenReturn(true);

        // Act
        boolean result = orderService.placeOrder(orderId, amount);

        // Assert
        System.out.println("Result: " + result);
        assertTrue(result);
        verify(paymentProcessorMock).processPayment(orderId, amount);
    }

    @Test
    void testPlaceOrder_PaymentFails() {
        // Arrange
        String orderId = "ORD456";
        double amount = 50.00;
        when(paymentProcessorMock.processPayment(orderId, amount)).thenReturn(false);

        // Act
        boolean result = orderService.placeOrder(orderId, amount);

        // Assert
        assertFalse(result);
        verify(paymentProcessorMock).processPayment(orderId, amount);
    }
}
