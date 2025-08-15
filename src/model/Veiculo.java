package model;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private String placa;

    // Construtor
    public Veiculo(String marca, String modelo, int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
    }

    // Métodos de acesso (Getters)
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getPlaca() {
        return placa;
    }

    // Métodos (Comportamentos)
    public void exibirInformacoesVeiculo() {
        System.out.println("Informações do Veículo:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Placa: " + placa);
    }
}