package com.example.design_pattern_decorator.Decorator;

public abstract class AbstractDecorator extends Packet{
    protected Packet packet;

    public AbstractDecorator(Packet packet) {
        this.packet = packet;
    }
    public abstract String getDescription();
}
