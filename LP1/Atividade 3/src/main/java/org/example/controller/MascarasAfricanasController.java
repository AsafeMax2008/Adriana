package org.example.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.example.model.MascarasAfricanas;

public class MascarasAfricanasController {

    // campos da tela
    @FXML private TextField txtOrigem;
    @FXML private TextField txtMaterial;
    @FXML private TextField txtAlturaCm;
    @FXML private TextField txtUsarEmCerimonia;
    @FXML private TextField txtNome;
    @FXML private TextField txtAldeia;
    @FXML private TextField txtAnosDeOficio;
    @FXML private TextField txtEsculpir;
    @FXML private TextField txtTitulo;
    @FXML private TextField txtNumeroMascaras;
    @FXML private TextField txtPrecoIngresso;
    @FXML private TextField txtAdicionarMascaras;
    @FXML private TextField txtCalcularReceita;
    @FXML private TextArea txtResultado;

    // pega o que foi digitado na tela e cria o objeto
    private MascarasAfricanas criarObjeto() {
        String origem = txtOrigem.getText();
        String material = txtMaterial.getText();
        double alturaCm = Double.parseDouble(txtAlturaCm.getText());
        String nome = txtNome.getText();
        String aldeia = txtAldeia.getText();
        int anosDeOficio = Integer.parseInt(txtAnosDeOficio.getText());
        String titulo = txtTitulo.getText();
        int numeroMascaras = Integer.parseInt(txtNumeroMascaras.getText());
        double precoIngresso = Double.parseDouble(txtPrecoIngresso.getText());
        MascarasAfricanas mascarasAfricanas = new MascarasAfricanas(origem, material, alturaCm, nome, aldeia, anosDeOficio, titulo, numeroMascaras, precoIngresso);
        return mascarasAfricanas;
    }

    // botão Descrever máscara
    @FXML
    void descreverMascara(ActionEvent event) {
        try {
            MascarasAfricanas mascarasAfricanas = criarObjeto();
            String resultado = mascarasAfricanas.descreverMascara();
            txtResultado.setText(resultado);
        } catch (NumberFormatException e) {
            Util.erro("Digite números válidos!");
        } catch (Exception e) {
            Util.erro(e.getMessage());
        }
    }

    // botão É grande?
    @FXML
    void ehGrande(ActionEvent event) {
        try {
            MascarasAfricanas mascarasAfricanas = criarObjeto();
            boolean resultado = mascarasAfricanas.ehGrande();
            if (resultado) {
                txtResultado.setText("A máscara é grande (mais de 40 cm)? Sim");
            } else {
                txtResultado.setText("A máscara é grande (mais de 40 cm)? Não");
            }
        } catch (NumberFormatException e) {
            Util.erro("Digite números válidos!");
        } catch (Exception e) {
            Util.erro(e.getMessage());
        }
    }

    // botão Usar em cerimônia
    @FXML
    void usarEmCerimonia(ActionEvent event) {
        try {
            MascarasAfricanas mascarasAfricanas = criarObjeto();
            String cerimonia = txtUsarEmCerimonia.getText();
            String resultado = mascarasAfricanas.usarEmCerimonia(cerimonia);
            txtResultado.setText(resultado);
        } catch (NumberFormatException e) {
            Util.erro("Digite números válidos!");
        } catch (Exception e) {
            Util.erro(e.getMessage());
        }
    }

    // botão Esculpir máscara
    @FXML
    void esculpir(ActionEvent event) {
        try {
            MascarasAfricanas mascarasAfricanas = criarObjeto();
            String materialUsado = txtEsculpir.getText();
            String resultado = mascarasAfricanas.esculpir(materialUsado);
            txtResultado.setText(resultado);
        } catch (NumberFormatException e) {
            Util.erro("Digite números válidos!");
        } catch (Exception e) {
            Util.erro(e.getMessage());
        }
    }

    // botão É mestre?
    @FXML
    void ehMestre(ActionEvent event) {
        try {
            MascarasAfricanas mascarasAfricanas = criarObjeto();
            boolean resultado = mascarasAfricanas.ehMestre();
            if (resultado) {
                txtResultado.setText("O artesão é mestre (20 anos ou mais de ofício)? Sim");
            } else {
                txtResultado.setText("O artesão é mestre (20 anos ou mais de ofício)? Não");
            }
        } catch (NumberFormatException e) {
            Util.erro("Digite números válidos!");
        } catch (Exception e) {
            Util.erro(e.getMessage());
        }
    }

    // botão Apresentar artesão
    @FXML
    void apresentar(ActionEvent event) {
        try {
            MascarasAfricanas mascarasAfricanas = criarObjeto();
            String resultado = mascarasAfricanas.apresentar();
            txtResultado.setText(resultado);
        } catch (NumberFormatException e) {
            Util.erro("Digite números válidos!");
        } catch (Exception e) {
            Util.erro(e.getMessage());
        }
    }

    // botão Adicionar máscaras
    @FXML
    void adicionarMascaras(ActionEvent event) {
        try {
            MascarasAfricanas mascarasAfricanas = criarObjeto();
            int quantidade = Integer.parseInt(txtAdicionarMascaras.getText());
            int resultado = mascarasAfricanas.adicionarMascaras(quantidade);
            txtResultado.setText(String.format("Total de máscaras na exposição: %d", resultado));
        } catch (NumberFormatException e) {
            Util.erro("Digite números válidos!");
        } catch (Exception e) {
            Util.erro(e.getMessage());
        }
    }

    // botão Calcular receita
    @FXML
    void calcularReceita(ActionEvent event) {
        try {
            MascarasAfricanas mascarasAfricanas = criarObjeto();
            int visitantes = Integer.parseInt(txtCalcularReceita.getText());
            double resultado = mascarasAfricanas.calcularReceita(visitantes);
            txtResultado.setText(String.format("Receita com ingressos: R$ %.2f", resultado));
        } catch (NumberFormatException e) {
            Util.erro("Digite números válidos!");
        } catch (Exception e) {
            Util.erro(e.getMessage());
        }
    }

    // botão Descrever exposição
    @FXML
    void descreverExposicao(ActionEvent event) {
        try {
            MascarasAfricanas mascarasAfricanas = criarObjeto();
            String resultado = mascarasAfricanas.descreverExposicao();
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
