package com.example.design_pattern_decorator.Decorator;

public class FleurE extends AbstractDecorator{

    public FleurE(Packet packet) {
        super(packet);
    }

    @Override
    public String getDescription() {
        return packet.getDescription()+" avec Fleur E";
    }

    @Override
    public double price() {
        return packet.price()+9;
    }
}
