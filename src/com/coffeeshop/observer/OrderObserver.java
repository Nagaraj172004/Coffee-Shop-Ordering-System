package com.coffeeshop.observer;
import com.coffeeshop.model.OrderStatus;

public interface OrderObserver {
    void update(int orderId, OrderStatus status);
}