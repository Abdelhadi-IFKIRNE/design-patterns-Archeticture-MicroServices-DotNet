package org.example;

public abstract class Compression {
    private int count=0;
    private Image image;

    public Compression(Image image) {
        this.image = image;
    }

    private int[] tab=new int[80];

    public int[] compression_Impl(){
        for (int i = 0; i < image.getData().length; i++) {
            count+=i;
            tab[i]=count;
        }

        tab[2]=operation_1(image.getData()[2],image.getData()[1] );
        tab[3]=operation_2(tab[0],tab[1]);
        return tab;
    }

    abstract int operation_1(int a,int b);
    abstract int operation_2(int a,int b);
}
