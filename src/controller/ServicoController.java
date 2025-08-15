package controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.Servico;

public class ServicoController {

    @FXML
    private TextField descricaoField;
    @FXML
    private TextField custoField;
    @FXML
    private TextField tempoEstimadoField;
    @FXML
    private TextArea detalhesServicoArea;

    private Servico servico;

    @FXML
    public void handleCadastrarServico() {
        String descricao = descricaoField.getText();
        double custo = Double.parseDouble(custoField.getText());
        double tempoEstimado = Double.parseDouble(tempoEstimadoField.getText());

        servico = new Servico(descricao, custo, tempoEstimado);

        detalhesServicoArea.setText("Descrição: " + servico.getDescricao() + "\n" +
                                     "Custo: R$" + servico.getCusto() + "\n" +
                                     "Tempo Estimado: " + servico.getTempoEstimadoEmHoras() + " horas");
    }
}