package com.coffeeshop.decorator;
import com.coffeeshop.model.Beverage;

public class Latte implements Beverage {
    @Override
    public String getDescription() { return "Latte"; }

    @Override
    public double getCost() { return 200.0; }
}