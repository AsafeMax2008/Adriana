package org.example.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.example.model.CompraDesconto;

public class CompraDescontoController {

    @FXML private TextField txtArroz;
    @FXML private TextField txtFeijao;
    @FXML private TextField txtOleo;
    @FXML private TextField txtAcucar;
    @FXML private TextField txtCafe;
    @FXML private TextField txtMacarrao;
    @FXML private TextField txtFarinha;
    @FXML private TextField txtFuba;
    @FXML private TextField txtMolho;
    @FXML private TextField txtSal;
    @FXML private TextArea txtRecibo;

    @FXML
    void calcular(ActionEvent event) {
        CompraDesconto compra = new CompraDesconto();

        // lê o preço de cada item
        try {
            compra.setPreco(0, Double.parseDouble(txtArroz.getText()));
            compra.setPreco(1, Double.parseDouble(txtFeijao.getText()));
            compra.setPreco(2, Double.parseDouble(txtOleo.getText()));
            compra.setPreco(3, Double.parseDouble(txtAcucar.getText()));
            compra.setPreco(4, Double.parseDouble(txtCafe.getText()));
            compra.setPreco(5, Double.parseDouble(txtMacarrao.getText()));
            compra.setPreco(6, Double.parseDouble(txtFarinha.getText()));
            compra.setPreco(7, Double.parseDouble(txtFuba.getText()));
            compra.setPreco(8, Double.parseDouble(txtMolho.getText()));
            compra.setPreco(9, Double.parseDouble(txtSal.getText()));
        } catch (NumberFormatException e) {
            Util.erro("Preencha o preço de todos os itens com números válidos.");
            return;
        }

        String recibo = "=========== RECIBO ===========\n\n";
        String[] itens = compra.getItens();
        for (int i = 0; i < itens.length; i++) {
            recibo = recibo + String.format("1 %s  R$ %.2f\n", itens[i], compra.getPreco(i));
        }
        recibo = recibo + String.format("\nSubtotal: R$ %.2f\n", compra.getSubtotal());
        recibo = recibo + String.format("Desconto: R$ %.2f\n", compra.getDesconto());
        recibo = recibo + String.format("Total: R$ %.2f\n", compra.getTotal());
        txtRecibo.setText(recibo);
    }

    @FXML
    void voltar(ActionEvent event) {
        Util.irPara("menu");
    }
}
