package org.locadora.sistema;

import java.util.ArrayList;
import java.util.List;
import org.locadora.veiculo.VeiculoModel;

public class SistemaLocadora {
    
    List<VeiculoModel> veiculos = new ArrayList<>();
    
    public void cadastrarVeiculo(String marca, String modelo, String ano, double quilometragem, double valorDiaria) {
        veiculos.add(new VeiculoModel(marca, modelo, ano, quilometragem, valorDiaria));
    }
    
    public void listarVeiculosDisponiveis() {
        for (VeiculoModel veiculo : veiculos) {
            System.out.println(veiculo);
        }
    }
}
