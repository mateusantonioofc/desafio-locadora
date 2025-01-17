package org.locadora.sistema;

import java.util.ArrayList;
import java.util.List;
import org.locadora.veiculos.Veiculo;

public class SistemaLocadora {
    
    List<Veiculo> veiculos = new ArrayList<>();
    
    public void cadastrarVeiculo(String marca, String modelo, String ano, double quilometragem, double valorDiaria) {
        veiculos.add(new Veiculo(marca, modelo, ano, quilometragem, valorDiaria));
    }
    
    public void listarTodosOsVeiculos() {
        for (Veiculo veiculo : veiculos) {
            System.out.println(veiculo);
        }
    }
    
    public List<Veiculo> listarVeiculosDisponiveis() {
        return veiculos.stream()
                .filter(v -> !v.isAlugado())
                .toList();
    }
    
    public List<Veiculo> procurarVeiculoPelaMarca(String marca) {
        return veiculos.stream()
                .filter(v -> v.getMarca().equalsIgnoreCase(marca))
                .toList();
    }
    
    public List<Veiculo> procurarVeiculoPeloAno(String ano) {
        return veiculos.stream()
                .filter(v -> v.getAno().equalsIgnoreCase(ano))
                .toList();
    }
    
    public List<Veiculo> procurarVeiculoPeloModelo(String modelo) {
        return veiculos.stream()
                .filter(v -> v.getModelo().equalsIgnoreCase(modelo))
                .toList();
    }
}
