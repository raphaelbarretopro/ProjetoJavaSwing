package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

    @FXML
    public void abrirTelaCadastrarCliente() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/resources/Atendimento.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setTitle("Cadastro de Cliente");
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    public void abrirTelaCadastrarVeiculo() throws IOException {
        // Implementar a lógica para abrir a tela de cadastro de veículo
        // A princípio, o FXML e o controller ainda não existem, mas a estrutura
        // da chamada é a mesma.
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/resources/Veiculo.fxml"));
    	Parent root = loader.load();
    	Stage stage = new Stage();
    	stage.setTitle("Cadastro de Veículo");
    	stage.setScene(new Scene(root));
    	stage.show();
    }

    @FXML
    public void abrirTelaCadastrarServico() throws IOException {
        // Implementar a lógica para abrir a tela de cadastro de serviço
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/resources/Servico.fxml"));
    	Parent root = loader.load();
    	Stage stage = new Stage();
    	stage.setTitle("Cadastro de Serviço");
    	stage.setScene(new Scene(root));
    	stage.show();
    }

    @FXML
    public void abrirTelaAgendarServico() throws IOException {
        // Implementar a lógica para abrir a tela de agendamento
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/resources/Agendamento.fxml"));
    	Parent root = loader.load();
    	Stage stage = new Stage();
    	stage.setTitle("Agendar Serviço");
    	stage.setScene(new Scene(root));
    	stage.show();
    }
}