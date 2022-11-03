package org.example;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

import static java.lang.Class.forName;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Image image = new Image(new int[]{1, 2, 5, 9, 20, 87, 98, 0, 80, 20, 20, 20, 900});
        PhotoShop photoShop = new PhotoShop();
        Scanner scanner=new Scanner(System.in);
        String nameCompres=scanner.next();
        Compression c1 = (Compression) Class.forName("org.example."+nameCompres).getConstructor(Compression.class)
                .newInstance(image);
        photoShop.setCompression(c1);
        Scanner scanner2=new Scanner(System.in);
        String nameFiltre=scanner2.next();
        IstrategyFiltre f1=(IstrategyFiltre) forName("org.example."+nameFiltre).getConstructor(IstrategyFiltre.class)
                .newInstance(image);
        photoShop.setIstrategyFiltre(f1);
        int[] data_1 = photoShop.EffectuerComression();
        int[] data_2 = photoShop.EffectuerFiltre();
    }
}