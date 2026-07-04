package com.coffeeshop.core;

import com.coffeeshop.decorator.*;
import com.coffeeshop.model.*;
import com.coffeeshop.observer.*;

public class Main {
    public static void main(String[] args) {
        CoffeeShopManager manager = CoffeeShopManager.getInstance();

        Beverage myDrink = new Latte();
        myDrink = new Caramel(myDrink);
        myDrink = new Caramel(myDrink);
        myDrink = new Milk(myDrink);

        CoffeeOrder order1 = manager.createNewOrder(myDrink);

        System.out.println("--- NEW ORDER RECEIVED ---");
        order1.printReceipt();

        order1.addObserver(new KitchenDisplay());
        order1.addObserver(new CustomerNotifier("Nagaraj"));

        order1.setStatus(OrderStatus.PREPARING);
        order1.setStatus(OrderStatus.READY);
        order1.setStatus(OrderStatus.DELIVERED);
    }
}