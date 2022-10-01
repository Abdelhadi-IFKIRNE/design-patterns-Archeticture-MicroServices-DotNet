package com.example.design_pattern_decorator.Decorator;

public class PacketC extends Packet{
    public PacketC() {
        description="Packet en C";
    }

    @Override
    public double price() {
        return 5;
    }
}
