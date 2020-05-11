package com.net4w.decorator;

/**
 * @author WangPingChun
 */
public class Decorator extends Drink {
    private final Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public Double cost() {
        return getPrice() + drink.cost();
    }

    @Override
    public String getDescription() {
        return this.description + " " + getPrice() + " && " + drink.getDescription();
    }
}
