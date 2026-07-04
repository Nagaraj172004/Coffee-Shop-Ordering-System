package com.coffeeshop.decorator;
import com.coffeeshop.model.Beverage;

public class Milk extends AddOnDecorator {
    public Milk(Beverage beverage) { super(beverage); }

    @Override
    public String getDescription() { return wrappedBeverage.getDescription() + " + Milk"; }

    @Override
    public double getCost() { return wrappedBeverage.getCost() + 30.0; }
}