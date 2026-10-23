package org.example.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.model.CalculoViagem;

public class CalculoViagemController {

    @FXML private TextField txtDistancia;
    @FXML private TextField txtPreco;
    @FXML private Label lblResultado;

    @FXML
    void calcular(ActionEvent event) {
        try {
            double distancia = Double.parseDouble(txtDistancia.getText());
            double preco = Double.parseDouble(txtPreco.getText());

            CalculoViagem viagem = new CalculoViagem(distancia, preco);

            String texto = "";
            if (viagem.temDesconto()) {
                texto = texto + "Viagem acima de 500 km: desconto de 5% aplicado.\n";
            }
            texto = texto + String.format("Custo total da viagem: R$ %.2f", viagem.getCusto());
            lblResultado.setText(texto);
        } catch (NumberFormatException e) {
            Util.erro("Informe a distância e o preço do combustível com números válidos.");
        }
    }

    @FXML
    void voltar(ActionEvent event) {
        Util.irPara("menu");
    }
}
