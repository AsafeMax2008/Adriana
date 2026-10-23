package org.example.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.example.model.Temperatura;

public class TemperaturaController {

    @FXML private TextField txtJaneiro;
    @FXML private TextField txtFevereiro;
    @FXML private TextField txtMarco;
    @FXML private TextField txtAbril;
    @FXML private TextField txtMaio;
    @FXML private TextField txtJunho;
    @FXML private TextField txtJulho;
    @FXML private TextField txtAgosto;
    @FXML private TextField txtSetembro;
    @FXML private TextField txtOutubro;
    @FXML private TextField txtNovembro;
    @FXML private TextField txtDezembro;
    @FXML private TextArea txtResultado;

    @FXML
    void calcular(ActionEvent event) {
        Temperatura temperatura = new Temperatura();

        // lê a temperatura de cada mês
        try {
            temperatura.setTemperatura(0, Double.parseDouble(txtJaneiro.getText()));
            temperatura.setTemperatura(1, Double.parseDouble(txtFevereiro.getText()));
            temperatura.setTemperatura(2, Double.parseDouble(txtMarco.getText()));
            temperatura.setTemperatura(3, Double.parseDouble(txtAbril.getText()));
            temperatura.setTemperatura(4, Double.parseDouble(txtMaio.getText()));
            temperatura.setTemperatura(5, Double.parseDouble(txtJunho.getText()));
            temperatura.setTemperatura(6, Double.parseDouble(txtJulho.getText()));
            temperatura.setTemperatura(7, Double.parseDouble(txtAgosto.getText()));
            temperatura.setTemperatura(8, Double.parseDouble(txtSetembro.getText()));
            temperatura.setTemperatura(9, Double.parseDouble(txtOutubro.getText()));
            temperatura.setTemperatura(10, Double.parseDouble(txtNovembro.getText()));
            temperatura.setTemperatura(11, Double.parseDouble(txtDezembro.getText()));
        } catch (NumberFormatException e) {
            Util.erro("Preencha a temperatura de todos os meses com números válidos.");
            return;
        }

        String texto = "";
        String[] nomes = temperatura.getMeses();
        for (int i = 0; i < nomes.length; i++) {
            texto = texto + nomes[i] + ": " + temperatura.classificarMes(i) + "\n";
        }
        texto = texto + String.format("\nTemperatura média anual: %.1f °C\n", temperatura.getMedia());
        texto = texto + temperatura.classificarAno();
        txtResultado.setText(texto);
    }

    @FXML
    void voltar(ActionEvent event) {
        Util.irPara("menu");
    }
}
