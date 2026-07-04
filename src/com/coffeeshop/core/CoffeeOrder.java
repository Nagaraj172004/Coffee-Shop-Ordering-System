package com.coffeeshop.core;

import com.coffeeshop.model.Beverage;
import com.coffeeshop.model.OrderStatus;
import com.coffeeshop.observer.OrderObserver;
import java.util.ArrayList;
import java.util.List;

public class CoffeeOrder {
    private int orderId;
    private Beverage beverage;
    private OrderStatus status;
    private List<OrderObserver> observers;

    public CoffeeOrder(int orderId, Beverage beverage) {
        this.orderId = orderId;
        this.beverage = beverage;
        this.status = OrderStatus.PLACED;
        this.observers = new ArrayList<>();
    }

    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    public void setStatus(OrderStatus newStatus) {
        this.status = newStatus;
        System.out.println("\n--- SYSTEM: Order #" + orderId + " changed to " + status + " ---");
        notifyObservers();
    }

    private void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update(orderId, status);
        }
    }

    public void printReceipt() {
        System.out.println("Order #" + orderId + " | " + beverage.getDescription());
        System.out.println("Total Due: Rs." + beverage.getCost());
    }
}