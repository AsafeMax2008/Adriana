package org.example.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.example.model.LojaDeRoupas;

public class LojaDeRoupasController {

    // campos da tela
    @FXML private TextField txtNome;
    @FXML private TextField txtCidade;
    @FXML private TextField txtFuncionarios;
    @FXML private TextField txtContratar;
    @FXML private TextField txtCalcularFolha;
    @FXML private TextField txtCorTerno;
    @FXML private TextField txtTamanho;
    @FXML private TextField txtPreco;
    @FXML private TextField txtAplicarDesconto;
    @FXML private TextField txtCalcularParcela;
    @FXML private TextField txtAlturaCm;
    @FXML private TextField txtCorManequim;
    @FXML private TextField txtRoupa;
    @FXML private TextField txtVestir;
    @FXML private TextArea txtResultado;

    // pega o que foi digitado na tela e cria o objeto
    private LojaDeRoupas criarObjeto() {
        String nome = txtNome.getText();
        String cidade = txtCidade.getText();
        int funcionarios = Integer.parseInt(txtFuncionarios.getText());
        String corTerno = txtCorTerno.getText();
        String tamanho = txtTamanho.getText();
        double preco = Double.parseDouble(txtPreco.getText());
        double alturaCm = Double.parseDouble(txtAlturaCm.getText());
        String corManequim = txtCorManequim.getText();
        String roupa = txtRoupa.getText();
        LojaDeRoupas lojaDeRoupas = new LojaDeRoupas(nome, cidade, funcionarios, corTerno, tamanho, preco, alturaCm, corManequim, roupa);
        return lojaDeRoupas;
    }

    // botão Anunciar inauguração
    @FXML
    void anunciarInauguracao(ActionEvent event) {
        try {
            LojaDeRoupas lojaDeRoupas = criarObjeto();
            String resultado = lojaDeRoupas.anunciarInauguracao();
            txtResultado.setText(resultado);
        } catch (NumberFormatException e) {
            Util.erro("Digite números válidos!");
        } catch (Exception e) {
            Util.erro(e.getMessage());
        }
    }

    // botão Contratar
    @FXML
    void contratar(ActionEvent event) {
        try {
            LojaDeRoupas lojaDeRoupas = criarObjeto();
            int quantidade = Integer.parseInt(txtContratar.getText());
            String resultado = lojaDeRoupas.contratar(quantidade);
            txtResultado.setText(resultado);
        } catch (NumberFormatException e) {
            Util.erro("Digite números válidos!");
        } catch (Exception e) {
            Util.erro(e.getMessage());
        }
    }

    // botão Calcular folha
    @FXML
    void calcularFolha(ActionEvent event) {
        try {
            LojaDeRoupas lojaDeRoupas = criarObjeto();
            double salarioMedio = Double.parseDouble(txtCalcularFolha.getText());
            double resultado = lojaDeRoupas.calcularFolha(salarioMedio);
            txtResultado.setText(String.format("Folha de pagamento: R$ %.2f", resultado));
        } catch (NumberFormatException e) {
            Util.erro("Digite números válidos!");
        } catch (Exception e) {
            Util.erro(e.getMessage());
        }
    }

    // botão Aplicar desconto
    @FXML
    void aplicarDesconto(ActionEvent event) {
        try {
            LojaDeRoupas lojaDeRoupas = criarObjeto();
            double percentual = Double.parseDouble(txtAplicarDesconto.getText());
            double resultado = lojaDeRoupas.aplicarDesconto(percentual);
            txtResultado.setText(String.format("Preço com desconto: R$ %.2f", resultado));
        } catch (NumberFormatException e) {
            Util.erro("Digite números válidos!");
        } catch (Exception e) {
            Util.erro(e.getMessage());
        }
    }

    // botão Calcular parcela
    @FXML
    void calcularParcela(ActionEvent event) {
        try {
            LojaDeRoupas lojaDeRoupas = criarObjeto();
            int parcelas = Integer.parseInt(txtCalcularParcela.getText());
            double resultado = lojaDeRoupas.calcularParcela(parcelas);
            txtResultado.setText(String.format("Valor da parcela: R$ %.2f", resultado));
        } catch (NumberFormatException e) {
            Util.erro("Digite números válidos!");
        } catch (Exception e) {
            Util.erro(e.getMessage());
        }
    }

    // botão Descrever terno
    @FXML
    void descreverTerno(ActionEvent event) {
        try {
            LojaDeRoupas lojaDeRoupas = criarObjeto();
            String resultado = lojaDeRoupas.descreverTerno();
            txtResultado.setText(resultado);
        } catch (NumberFormatException e) {
            Util.erro("Digite números válidos!");
        } catch (Exception e) {
            Util.erro(e.getMessage());
        }
    }

    // botão Vestir
    @FXML
    void vestir(ActionEvent event) {
        try {
            LojaDeRoupas lojaDeRoupas = criarObjeto();
            String novaRoupa = txtVestir.getText();
            String resultado = lojaDeRoupas.vestir(novaRoupa);
            txtResultado.setText(resultado);
        } catch (NumberFormatException e) {
            Util.erro("Digite números válidos!");
        } catch (Exception e) {
            Util.erro(e.getMessage());
        }
    }

    // botão Despir
    @FXML
    void despir(ActionEvent event) {
        try {
            LojaDeRoupas lojaDeRoupas = criarObjeto();
            String resultado = lojaDeRoupas.despir();
            txtResultado.setText(resultado);
        } catch (NumberFormatException e) {
            Util.erro("Digite números válidos!");
        } catch (Exception e) {
            Util.erro(e.getMessage());
        }
    }

    // botão Descrever manequim
    @FXML
    void descreverManequim(ActionEvent event) {
        try {
            LojaDeRoupas lojaDeRoupas = criarObjeto();
            String resultado = lojaDeRoupas.descreverManequim();
            txtResultado.setText(resultado);
        } catch (NumberFormatException e) {
            Util.erro("Digite números válidos!");
        } catch (Exception e) {
            Util.erro(e.getMessage());
        }
    }

    @FXML
    void voltar(ActionEvent event) {
        Util.irPara("imagens");
    }
}
