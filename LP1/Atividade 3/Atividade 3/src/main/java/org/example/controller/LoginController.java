package org.example.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import org.example.model.SistemaLogin;

public class LoginController {

    @FXML private PasswordField txtSenha;
    @FXML private Label lblResultado;

    @FXML
    void entrar(ActionEvent event) {
        SistemaLogin login = new SistemaLogin(txtSenha.getText());
        if (login.validar()) {
            lblResultado.setText("A senha está correta");
        } else {
            lblResultado.setText("Senha está incorreta");
        }
        txtSenha.clear();
    }

    @FXML
    void voltar(ActionEvent event) {
        Util.irPara("menu");
    }
}
