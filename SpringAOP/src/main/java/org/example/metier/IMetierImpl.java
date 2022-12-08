package org.example.metier;

import org.example.Aspects.Log;
import org.example.Aspects.SecuredByAspect;
import org.springframework.stereotype.Service;

@Service
public class IMetierImpl implements IMetier {
    @Override
    @Log
    @SecuredByAspect(roles={"USER","ADMIN"})
    public void display() {
         System.out.println("display.......");
    }

    @Override
    @Log
    @SecuredByAspect(roles={"ADMIN"})
    public int account() {
        return 9700;
    }
}
