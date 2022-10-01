package com.example.design_pattern_decorator.Decorator;

public abstract class Packet {
    protected String description;

    public String getDescription() {
        return description;
    }
    public abstract double price();
}
