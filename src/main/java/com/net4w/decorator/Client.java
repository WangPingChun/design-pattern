package com.net4w.decorator;

/**
 * @author WangPingChun
 */
public class Client {
    public static void main(String[] args) {
        // 点一份 LongBlack
        Drink longBlack = new LongBlack();
        System.out.println("\ntotal = " + longBlack.cost() + "\ndetail = " + longBlack.getDescription());
        longBlack = new Milk(longBlack);
        System.out.println("\ntotal = " + longBlack.cost() + "\ndetail = " + longBlack.getDescription());
        longBlack = new Chocolate(longBlack);
        System.out.println("\ntotal = " + longBlack.cost() + "\ndetail = " + longBlack.getDescription());
        longBlack = new Chocolate(longBlack);
        System.out.println("\ntotal = " + longBlack.cost() + "\ndetail = " + longBlack.getDescription());
    }
}
