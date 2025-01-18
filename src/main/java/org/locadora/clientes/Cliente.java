package org.locadora.clientes;

import org.locadora.services.GerarID;

public class Cliente {
    private String nome;
    private int ID;
    // função para historico de alugueis
    // função para historico de multas

    // Construtor
    public Cliente(String nome){
        this.nome = nome;
        this.ID = GerarID.gerarID();
    }

    // Construtor vazio
    public Cliente() { }

    // Get: Retornar valor de um atributo
    public String getNome() {
        return nome;
    }

    // Set: Aqui pode modificar o valor de um atributo
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Get: Retornar valor de um atributo
    public int getID() {
        return ID;
    }

    // Set: Aqui pode modificar o valor de um atributo
    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", ID=" + ID +
                '}';
    }
}