package org.locadora.clientes;

public class Cliente {
    private String nome;
    private int ID;
    // função para historico de alugueis
    // função para historico de multas

    // Construtor
    public Cliente(String nome, int ID){
        this.nome = nome;
        this.ID = ID;
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
}