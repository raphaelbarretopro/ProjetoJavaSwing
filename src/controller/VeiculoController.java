package controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.Veiculo;

public class VeiculoController {

    @FXML
    private TextField marcaField;
    @FXML
    private TextField modeloField;
    @FXML
    private TextField anoField;
    @FXML
    private TextField placaField;
    @FXML
    private TextArea detalhesVeiculoArea;
    
    private Veiculo veiculo;

    @FXML
    public void handleCadastrarVeiculo() {
        String marca = marcaField.getText();
        String modelo = modeloField.getText();
        int ano = Integer.parseInt(anoField.getText());
        String placa = placaField.getText();

        veiculo = new Veiculo(marca, modelo, ano, placa);
        
        detalhesVeiculoArea.setText("Marca: " + veiculo.getMarca() + "\n" +
                                    "Modelo: " + veiculo.getModelo() + "\n" +
                                    "Ano: " + veiculo.getAno() + "\n" +
                                    "Placa: " + veiculo.getPlaca());
    }
}