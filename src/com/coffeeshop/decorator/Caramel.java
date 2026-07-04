package com.coffeeshop.decorator;
import com.coffeeshop.model.Beverage;

public class Caramel extends AddOnDecorator {
    public Caramel(Beverage beverage) { super(beverage); }

    @Override
    public String getDescription() { return wrappedBeverage.getDescription() + " + Caramel"; }

    @Override
    public double getCost() { return wrappedBeverage.getCost() + 50.0; }
}