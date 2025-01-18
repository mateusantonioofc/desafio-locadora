package org.locadora;

import org.locadora.sistema.SistemaLocadora;

public class LocadoraApplication {

    public static void main(String[] args) {
        SistemaLocadora sistemaLocadora = new SistemaLocadora();
        
        for (int i = 0; i < 1000; i++) {
            sistemaLocadora.cadastrarVeiculo("MARCA" + i, "MODELO" + i, "2000" + i, 0 + i, 0 + i);
        }
        
        System.out.println(sistemaLocadora.listarTodosOsVeiculos());
        
    }
}

