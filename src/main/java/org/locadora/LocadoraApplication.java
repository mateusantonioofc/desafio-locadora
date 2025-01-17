package org.locadora;

import org.locadora.sistema.SistemaLocadora;

public class LocadoraApplication {

    public static void main(String[] args) {
        SistemaLocadora sistemaLocadora = new SistemaLocadora();
        sistemaLocadora.cadastrarVeiculo("Honda", "HB20", "2020", 33, 200);
        sistemaLocadora.cadastrarVeiculo("Nissan", "Corsa", "2013", 100.90, 100.40);
        sistemaLocadora.cadastrarVeiculo("BMW", "XS", "2019", 0, 70.98);
        sistemaLocadora.listarVeiculosDisponiveis();
    }
}
