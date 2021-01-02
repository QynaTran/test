package com.example.alo.demo.model;

public class Number {
    private int a;
    private int b;

    public Number() {
    }

    public Number(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int sum(){
        return this.getA() + this.getB();
    }
}
