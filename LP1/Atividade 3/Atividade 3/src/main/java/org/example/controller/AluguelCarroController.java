package org.example.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.model.AluguelCarro;

public class AluguelCarroController {

    @FXML private TextField txtDias;
    @FXML private TextField txtKm;
    @FXML private TextField txtDiaria;
    @FXML private TextField txtLimite;
    @FXML private TextField txtPrecoExtra;
    @FXML private Label lblResultado;

    @FXML
    void calcular(ActionEvent event) {
        try {
            int dias = Integer.parseInt(txtDias.getText());
            int km = Integer.parseInt(txtKm.getText());
            double diaria = Double.parseDouble(txtDiaria.getText());
            int limite = Integer.parseInt(txtLimite.getText());
            double precoExtra = Double.parseDouble(txtPrecoExtra.getText());

            AluguelCarro aluguel = new AluguelCarro(dias, km, diaria, limite, precoExtra);

            String texto = "";
            if (aluguel.getKmExcedente() > 0) {
                texto = texto + "Km excedente: " + aluguel.getKmExcedente() + " km\n";
            }
            texto = texto + String.format("Custo total do aluguel: R$ %.2f", aluguel.getCustoTotal());
            lblResultado.setText(texto);
        } catch (NumberFormatException e) {
            Util.erro("Preencha todos os campos com números válidos (dias, km e limite devem ser inteiros).");
        }
    }

    @FXML
    void voltar(ActionEvent event) {
        Util.irPara("menu");
    }
}
