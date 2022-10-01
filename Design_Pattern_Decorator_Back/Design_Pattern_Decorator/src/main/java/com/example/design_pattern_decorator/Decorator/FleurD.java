package com.example.design_pattern_decorator.Decorator;

public class FleurD extends AbstractDecorator{

    public FleurD(Packet packet) {
        super(packet);
    }

    @Override
    public String getDescription() {
        return packet.getDescription()+" avec fleur D";
    }

    @Override
    public double price() {
        return packet.price()+4;
    }
}
