package org.example;

public class CompressionImpl_1 extends Compression{
    public CompressionImpl_1(Image image) {
        super(image);
    }

    @Override
    int operation_1(int a, int b) {
        System.out.println("l'implémentation 1 de compression est appliquée");
        return a+b;
    }

    @Override
    int operation_2(int a, int b) {
        return a+b;
    }
}
