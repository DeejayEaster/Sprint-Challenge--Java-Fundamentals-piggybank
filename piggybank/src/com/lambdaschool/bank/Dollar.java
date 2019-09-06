package com.lambdaschool.bank;

public class Dollar extends Money{

    public Dollar(int quantity) {
        super("Dollar", 1, quantity);
    }

    public Dollar() {
        super("Dollar", 1, 1);
    }
}