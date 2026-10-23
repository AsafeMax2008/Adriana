package org.example.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.model.Camelo;

public class CameloController {

    @FXML private TextField txtCamelos;
    @FXML private Label lblResultado;

    @FXML
    void calcular(ActionEvent event) {
        try {
            int quantidade = Integer.parseInt(txtCamelos.getText());
            Camelo camelo = new Camelo(quantidade);

            String texto = "O primeiro filho recebeu " + camelo.getPrimeiroFilho() + " camelos\n";
            texto = texto + "O segundo filho recebeu " + camelo.getSegundoFilho() + " camelos\n";
            texto = texto + "O terceiro filho recebeu " + camelo.getTerceiroFilho() + " camelos";
            lblResultado.setText(texto);
        } catch (NumberFormatException e) {
            Util.erro("Digite um número inteiro de camelos.");
        }
    }

    @FXML
    void voltar(ActionEvent event) {
        Util.irPara("menu");
    }
}
