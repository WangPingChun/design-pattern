package com.net4w.decorator;

/**
 * @author WangPingChun
 */
public abstract class Drink {
    protected String description;
    private Double price;


    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public abstract Double cost();
}
