package com.coffeeshop.decorator;
import com.coffeeshop.model.Beverage;

public abstract class AddOnDecorator implements Beverage {
    protected Beverage wrappedBeverage;

    public AddOnDecorator(Beverage beverage) {
        this.wrappedBeverage = beverage;
    }
}