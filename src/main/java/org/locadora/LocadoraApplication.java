package org.locadora;

import org.locadora.sistema.SistemaLocadora;

public class LocadoraApplication {

    public static void main(String[] args) {
        SistemaLocadora sistemaLocadora = new SistemaLocadora();
        sistemaLocadora.cadastrarVeiculo("Honda", "HB20", "2020", 33, 200);
        sistemaLocadora.cadastrarVeiculo("Nissan", "Corsa", "2013", 100.90, 100.40);
        sistemaLocadora.cadastrarVeiculo("BMW", "XS", "2019", 0, 70.98);
        
        //System.out.println(sistemaLocadora.listarVeiculosDisponiveis());
        //System.out.println(sistemaLocadora.listarTodosOsVeiculos());
        
        SistemaLocadora teste = new SistemaLocadora();
        teste.cadastrarVeiculo("MOKADO", "TESTE", "9999", 0, 0);
        teste.procurarVeiculoPelaMarca("mokado");
        
        //System.out.println(teste.procurarVeiculoPelaMarca("mokado"));
        teste.procurarVeiculoPeloAno("9999");
        teste.procurarVeiculoPeloModelo("Teste");

        sistemaLocadora.cadastrarCliente("Joao");
        sistemaLocadora.cadastrarCliente("Mateu");
        sistemaLocadora.cadastrarCliente("Camis");
        sistemaLocadora.cadastrarCliente("Jose");
        System.out.println(sistemaLocadora.listarTodosOsClientes());
    }
}
