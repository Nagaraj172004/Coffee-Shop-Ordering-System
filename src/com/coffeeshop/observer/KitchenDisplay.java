package com.coffeeshop.observer;
import com.coffeeshop.model.OrderStatus;

public class KitchenDisplay implements OrderObserver {
    @Override
    public void update(int orderId, OrderStatus status) {
        if (status == OrderStatus.PLACED || status == OrderStatus.PREPARING) {
            System.out.println("👨‍🍳 KITCHEN: Order #" + orderId + " is now " + status);
        }
    }
}