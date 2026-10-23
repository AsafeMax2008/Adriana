package org.example.controller;

import javafx.scene.control.Alert;
import org.example.App;

import java.io.IOException;

public class Util {

    // mostra uma janela de erro
    public static void erro(String mensagem) {
        Alert alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setTitle("Erro");
        alerta.setHeaderText(null);
        alerta.setContentText(mensagem);
        alerta.showAndWait();
    }

    // troca de tela
    public static void irPara(String tela) {
        try {
            App.setRoot(tela);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
