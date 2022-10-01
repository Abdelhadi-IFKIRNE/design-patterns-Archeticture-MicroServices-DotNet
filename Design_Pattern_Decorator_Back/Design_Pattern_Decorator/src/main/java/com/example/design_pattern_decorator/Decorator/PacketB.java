package com.example.design_pattern_decorator.Decorator;

public class PacketB extends Packet{
    public PacketB() {
        description="Packet en B";
    }

    @Override
    public double price() {
        return 12;
    }
}
