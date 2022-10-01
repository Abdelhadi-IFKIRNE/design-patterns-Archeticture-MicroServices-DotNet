package com.example.design_pattern_decorator.Decorator;

public class PacketA extends Packet{
    public PacketA() {
        description="Packet en A";
    }

    @Override
    public double price() {
        return 8;
    }
}
