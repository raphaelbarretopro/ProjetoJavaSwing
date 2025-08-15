package controller;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.Agendamento;
import model.Cliente;
import model.Veiculo;
import model.Servico;

public class AgendamentoController {

    @FXML
    private TextField clienteIdField;
    @FXML
    private TextField veiculoPlacaField;
    @FXML
    private TextField servicoDescricaoField;
    @FXML
    private DatePicker dataAgendamentoPicker;
    @FXML
    private TextArea detalhesAgendamentoArea;
    
    private Agendamento agendamento;

    @FXML
    public void handleAgendarServico() {
        // Lógica de busca de cliente, veículo e serviço (simplificada para o exemplo)
        // Você precisará de métodos para buscar esses objetos em um banco de dados ou lista.
        Cliente cliente = new Cliente("Exemplo Cliente", "(11) 99999-9999", "email@exemplo.com", Integer.parseInt(clienteIdField.getText()));
        Veiculo veiculo = new Veiculo("Exemplo Marca", "Exemplo Modelo", 2020, veiculoPlacaField.getText());
        Servico servico = new Servico(servicoDescricaoField.getText(), 150.00, 2.0);

        String dataHora = dataAgendamentoPicker.getValue().toString(); // Converte a data para String
        
        // Crie uma nova instância de agendamento
        agendamento = new Agendamento(dataHora, cliente, veiculo, servico.getDescricao());

        detalhesAgendamentoArea.setText("Agendamento Criado:" + "\n" +
                                        "Data e Hora: " + agendamento.getDataHora() + "\n" +
                                        "Cliente: " + agendamento.getCliente().getNome() + "\n" +
                                        "Veículo: " + agendamento.getVeiculo().getModelo() + "\n" +
                                        "Serviço: " + agendamento.getServicosAgendados());
    }
}