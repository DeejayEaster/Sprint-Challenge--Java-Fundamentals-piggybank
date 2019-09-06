package com.lambdaschool.bank;

public class Nickel extends Money{

    public Nickel(int quantity) {
        super("Nickel", 0.05, quantity);
    }

    public Nickel() {
        super("Nickel", 0.05, 1);
    }
}