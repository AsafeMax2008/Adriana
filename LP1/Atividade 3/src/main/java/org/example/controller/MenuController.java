package org.example.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MenuController {

    @FXML
    void abrirAluguel(ActionEvent event) {
        Util.irPara("aluguel");
    }

    @FXML
    void abrirLogin(ActionEvent event) {
        Util.irPara("login");
    }

    @FXML
    void abrirCompra(ActionEvent event) {
        Util.irPara("compra");
    }

    @FXML
    void abrirTemperatura(ActionEvent event) {
        Util.irPara("temperatura");
    }

    @FXML
    void abrirViagem(ActionEvent event) {
        Util.irPara("viagem");
    }

    @FXML
    void abrirMultiplo(ActionEvent event) {
        Util.irPara("multiplo");
    }

    @FXML
    void abrirCamelo(ActionEvent event) {
        Util.irPara("camelo");
    }

    @FXML
    void abrirImagens(ActionEvent event) {
        Util.irPara("imagens");
    }
}
