package com.coffeeshop.core;

import java.util.HashMap;
import java.util.Map;

public class CoffeeShopManager {
    private static CoffeeShopManager instance;
    private Map<Integer, CoffeeOrder> activeOrders;
    private int orderCounter = 100; // Starting ID

    private CoffeeShopManager() {
        activeOrders = new HashMap<>();
    }

    // Standard Singleton access method
    public static CoffeeShopManager getInstance() {
        if (instance == null) {
            instance = new CoffeeShopManager();
        }
        return instance;
    }

    public CoffeeOrder createNewOrder(com.coffeeshop.model.Beverage beverage) {
        orderCounter++;
        CoffeeOrder newOrder = new CoffeeOrder(orderCounter, beverage);
        activeOrders.put(orderCounter, newOrder);
        return newOrder;
    }
}