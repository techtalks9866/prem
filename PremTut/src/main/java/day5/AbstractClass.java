package day5;//package com.day5;

public abstract class AbstractClass implements Bank {

    abstract void debit();

    @Override
    public int getAmount() {
        return 0;
    }
}
