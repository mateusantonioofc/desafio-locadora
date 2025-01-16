package org.locadora.veiculo;

import java.util.Objects;

public class VeiculoModel {
    
    private String marca;
    private String modelo;
    private String ano;
    // adicionar placa
    private double quilometragem;
    private double valorDiaria;

    public VeiculoModel(String marca, String modelo, String ano, double quilometragem, double valorDiaria) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.quilometragem = quilometragem;
        this.valorDiaria = valorDiaria;
    }

    public VeiculoModel() {
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getAno() {
        return ano;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }    

    @Override
    public String toString() {
        return "VeiculoModel{" + "marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", quilometragem=" + quilometragem + ", valorDiaria=" + valorDiaria + '}';
    }
 
}
