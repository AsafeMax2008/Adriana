package org.example.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ImagensController {

    @FXML
    void abrirLojaDeRoupas(ActionEvent event) {
        Util.irPara("lojaderoupas");
    }

    @FXML
    void abrirCiclismoNaTrilha(ActionEvent event) {
        Util.irPara("ciclismonatrilha");
    }

    @FXML
    void abrirMascarasAfricanas(ActionEvent event) {
        Util.irPara("mascarasafricanas");
    }

    @FXML
    void abrirPenteadosDeManga(ActionEvent event) {
        Util.irPara("penteadosdemanga");
    }

    @FXML
    void voltar(ActionEvent event) {
        Util.irPara("menu");
    }
}
