package org.example;

import java.util.HashMap;
import java.util.Map;

public class proxy extends Metier{
    private Metier metier=new MetierImpl();
    private Map<Integer,Double> cache=new HashMap<>();
    @Override
    double doOperation(int a, int b) {
        Double res=cache.get(a+b);
        if (res!=null){
            System.out.println("From the cache .....");
            return res;
        }
        else {
            System.out.println("From the implementation metier.....");
            double tor=metier.doOperation(a, b);
            cache.put(a+b,tor);
            return tor;
        }
    }
}
