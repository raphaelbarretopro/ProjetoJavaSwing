package model;

public class Cliente {
    private String nome;
    private String telefone;
    private String email;
    private int idCliente;

    // Construtor
    public Cliente(String nome, String telefone, String email, int idCliente) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.idCliente = idCliente;
    }

    // Métodos de acesso (Getters)
    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public int getIdCliente() {
        return idCliente;
    }

    // Métodos (Comportamentos)
    public void exibirDetalhesCliente() {
        System.out.println("Detalhes do Cliente:");
        System.out.println("ID: " + idCliente);
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
    }

    public void atualizarTelefone(String novoTelefone) {
        this.telefone = novoTelefone;
        System.out.println("Telefone de " + nome + " atualizado para " + novoTelefone);
    }
}