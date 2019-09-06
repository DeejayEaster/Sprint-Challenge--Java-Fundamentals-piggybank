package com.lambdaschool.bank;

public class Dime extends Money{

    public Dime(int quantity) {
        super("Dime", 0.1, quantity);
    }

    public Dime() {
        super("Dime", 0.1, 1);
    }
}