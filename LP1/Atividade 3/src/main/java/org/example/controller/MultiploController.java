package org.example.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.example.model.Multiplo;

public class MultiploController {

    @FXML private TextField txtNum1;
    @FXML private TextField txtNum2;
    @FXML private Label lblResultado;

    @FXML
    void verificar(ActionEvent event) {
        try {
            int num1 = Integer.parseInt(txtNum1.getText());
            int num2 = Integer.parseInt(txtNum2.getText());

            Multiplo multiplo = new Multiplo(num1, num2);
            if (multiplo.verificar()) {
                lblResultado.setText("Os números são múltiplos");
            } else {
                lblResultado.setText("Os números não são múltiplos");
            }
        } catch (NumberFormatException e) {
            Util.erro("Digite dois números inteiros válidos.");
        } catch (Exception e) {
            Util.erro(e.getMessage());
        }
    }

    @FXML
    void voltar(ActionEvent event) {
        Util.irPara("menu");
    }
}
