package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Carrega o novo arquivo FXML da tela principal
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/resources/main.fxml"));
        Parent root = loader.load();

        // Cria a cena e define o stage
        Scene scene = new Scene(root);
        primaryStage.setTitle("Oficina Mecânica Os Blonson - Menu Principal");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}