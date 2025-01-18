package org.locadora.services;

import java.util.Random;

public class GerarPlaca {
    
    private static final String LETRAS = "ABCDEFGHIJKLOPQRSTUVWXYZ";
    private static final Random random = new Random();
    
    public static String gerarPlaca() {
        StringBuilder placa = new StringBuilder();
        
        for (int i = 0; i < 3; i++) {
            int indice = random.nextInt(LETRAS.length());
            placa.append(LETRAS.charAt(indice));
        }
        
        for (int i = 0; i < 4; i++) {
            int numero = random.nextInt(10);
            placa.append(numero);
        }
        
        return placa.toString();
    }
}
