package org.locadora.services;

import java.util.Random;

@Deprecated
public class UnusedGerarID {
    
    private static final Random random = new Random();
    
    public static int gerarID() {
        int ID;
        return ID = random.nextInt(11);
    }
}
