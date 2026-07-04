package com.coffeeshop.observer;
import com.coffeeshop.model.OrderStatus;

public class CustomerNotifier implements OrderObserver {
    private String customerName;

    public CustomerNotifier(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void update(int orderId, OrderStatus status) {
        System.out.println("📱 SMS to " + customerName + ": Your order #" + orderId + " is " + status);
    }
}