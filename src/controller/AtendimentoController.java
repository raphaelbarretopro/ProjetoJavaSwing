package controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import java.util.function.UnaryOperator;
import model.Cliente;

public class AtendimentoController {

    @FXML
    private TextField nomeClienteField;
    @FXML
    private TextField telefoneClienteField;
    @FXML
    private TextField emailClienteField;
    @FXML
    private TextArea detalhesClienteArea;

    private Cliente cliente;

    @FXML
    public void initialize() {
        // UnaryOperator que define a lógica de formatação do telefone
        UnaryOperator<TextFormatter.Change> filter = change -> {
            String newText = change.getControlNewText();

            // Remove todos os caracteres que não sejam dígitos
            String digitsOnly = newText.replaceAll("[^\\d]", "");
            
            // Limita o número de dígitos a 11 (2 para DDD e 9 para o número)
            if (digitsOnly.length() > 11) {
                return null;
            }

            StringBuilder formatted = new StringBuilder();
            if (digitsOnly.length() > 0) {
                formatted.append("(");
                if (digitsOnly.length() > 2) {
                    formatted.append(digitsOnly.substring(0, 2)).append(") ");
                    if (digitsOnly.length() > 7) {
                        formatted.append(digitsOnly.substring(2, 7)).append("-");
                        formatted.append(digitsOnly.substring(7));
                    } else {
                        formatted.append(digitsOnly.substring(2));
                    }
                } else {
                    formatted.append(digitsOnly);
                }
            }

            // Define o novo texto formatado
            change.setText(formatted.toString());
            
            // Atualiza o range para que o cursor se mova para o final
            change.setRange(0, change.getControlText().length());
            change.setCaretPosition(formatted.length());
            change.setAnchor(formatted.length());

            return change;
        };

        telefoneClienteField.setTextFormatter(new TextFormatter<>(filter));
    }

    @FXML
    public void handleCadastrarCliente() {
        String nome = nomeClienteField.getText();
        String telefone = telefoneClienteField.getText();
        String email = emailClienteField.getText();

        cliente = new Cliente(nome, telefone, email, 1);
        
        detalhesClienteArea.setText("ID: " + cliente.getIdCliente() + "\n" +
                                    "Nome: " + cliente.getNome() + "\n" +
                                    "Celular: " + cliente.getTelefone() + "\n" +
                                    "Email: " + cliente.getEmail());
    }
}