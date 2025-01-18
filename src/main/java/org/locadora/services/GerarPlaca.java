package org.locadora.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GerarPlaca {
    
    private static final String LETRAS = "ABCDEFGHIJKLOPQRSTUVWXYZ";
    private static final Random random = new Random();
    private static final List<String> placas = new ArrayList<>();
    
    public static String gerarLetras() {
        StringBuilder letras = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            int indice = random.nextInt(LETRAS.length());
            letras.append(LETRAS.charAt(indice));
        }  
        return letras.toString();
    }
    
    public static String gerarNumeros() {
        StringBuilder numeros = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int numero = random.nextInt(10);
            numeros.append(numero);
        }
        return numeros.toString();
    }
    
    public static String gerarPlaca() {
        String placa;
        
        do {
            placa = gerarLetras() + gerarNumeros();
        } while (placas.contains(placa));
        
        placas.add(placa);
        return placa;
    }
    
}
