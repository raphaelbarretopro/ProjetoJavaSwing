package model;

public class Servico {
    private String descricao;
    private double custo;
    private double tempoEstimadoEmHoras;
    private boolean concluido;

    // Construtor
    public Servico(String descricao, double custo, double tempoEstimadoEmHoras) {
        this.descricao = descricao;
        this.custo = custo;
        this.tempoEstimadoEmHoras = tempoEstimadoEmHoras;
        this.concluido = false; // Por padrão, o serviço não está concluído
    }

    // Métodos de acesso (Getters)
    public String getDescricao() {
        return descricao;
    }

    public double getCusto() {
        return custo;
    }

    public double getTempoEstimadoEmHoras() {
        return tempoEstimadoEmHoras;
    }

    public boolean isConcluido() {
        return concluido;
    }

    // Métodos (Comportamentos)
    public void mostrarDetalhesServico() {
        System.out.println("Detalhes do Serviço:");
        System.out.println("Descrição: " + descricao);
        System.out.println("Custo: R$" + custo);
        System.out.println("Tempo Estimado: " + tempoEstimadoEmHoras + " horas");
        System.out.println("Status: " + (concluido ? "Concluído" : "Pendente"));
    }

    public void marcarConcluido() {
        this.concluido = true;
        System.out.println("Serviço '" + descricao + "' marcado como concluído.");
    }
}