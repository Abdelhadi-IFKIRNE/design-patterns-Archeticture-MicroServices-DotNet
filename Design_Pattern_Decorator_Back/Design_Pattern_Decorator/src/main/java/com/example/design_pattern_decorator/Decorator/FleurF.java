package com.example.design_pattern_decorator.Decorator;

public class FleurF extends AbstractDecorator{

    public FleurF(Packet packet) {
        super(packet);
    }

    @Override
    public String getDescription() {
        return packet.getDescription()+" avec Fleur F";
    }

    @Override
    public double price() {
        return packet.price()+6;
    }
}
