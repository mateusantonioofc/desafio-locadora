package org.locadora.services;

import java.util.Random;


public class GerarID {
    
    private static final Random random = new Random();
    
    public static int gerarID() {
        int ID;
        return ID = random.nextInt(1000);
    }
}
