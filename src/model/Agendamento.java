package model;

public class Agendamento {
    private String dataHora;
    private Cliente cliente;
    private Veiculo veiculo;
    private String servicosAgendados;
    private String status;

    // Construtor
    public Agendamento(String dataHora, Cliente cliente, Veiculo veiculo, String servicosAgendados) {
        this.dataHora = dataHora;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.servicosAgendados = servicosAgendados;
        this.status = "Agendado"; // Status inicial
    }

    // Métodos de acesso (Getters)
    public String getDataHora() {
        return dataHora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public String getServicosAgendados() {
        return servicosAgendados;
    }

    public String getStatus() {
        return status;
    }

    // Métodos (Comportamentos)
    public void exibirAgendamentoCompleto() {
        System.out.println("\n--- Detalhes do Agendamento ---");
        System.out.println("Data e Hora: " + dataHora);
        System.out.println("Status: " + status);
        
        System.out.println("\nInformações do Cliente:");
        cliente.exibirDetalhesCliente();
        
        System.out.println("\nInformações do Veículo:");
        veiculo.exibirInformacoesVeiculo();
        
        System.out.println("\nServiços Agendados: " + servicosAgendados);
        System.out.println("------------------------------");
    }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
        System.out.println("Status do agendamento atualizado para: " + novoStatus);
    }
}