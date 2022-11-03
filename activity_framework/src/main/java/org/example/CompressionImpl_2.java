package org.example;

public class CompressionImpl_2 extends Compression{
    public CompressionImpl_2(Image image) {
        super(image);
    }

    @Override
    int operation_1(int a, int b) {
        System.out.println("l'implémenation 2 de compression est appliquée");
        return a+b*2;
    }

    @Override
    int operation_2(int a, int b) {
        return (a+b)*2;
    }
}
