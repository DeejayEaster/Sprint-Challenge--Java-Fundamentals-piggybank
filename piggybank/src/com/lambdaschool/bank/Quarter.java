package com.lambdaschool.bank;

public class Quarter extends Money{

    public Quarter(int quantity) {
        super("Quarter", 0.25, quantity);
    }

    public Quarter() {
        super("Quarter", 0.25, 1);
    }
}
