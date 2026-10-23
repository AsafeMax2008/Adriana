package org.example.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.example.model.CiclismoNaTrilha;

public class CiclismoNaTrilhaController {

    // campos da tela
    @FXML private TextField txtNomeCiclista;
    @FXML private TextField txtIdade;
    @FXML private TextField txtVelocidadeMedia;
    @FXML private TextField txtPedalar;
    @FXML private TextField txtCalcularTempo;
    @FXML private TextField txtMarca;
    @FXML private TextField txtNumeroMarchas;
    @FXML private TextField txtMarchaAtual;
    @FXML private TextField txtTrocarMarcha;
    @FXML private TextField txtNomeTrilha;
    @FXML private TextField txtComprimentoKm;
    @FXML private TextField txtDificuldade;
    @FXML private TextField txtCalcularTempoEstimado;
    @FXML private TextArea txtResultado;

    // pega o que foi digitado na tela e cria o objeto
    private CiclismoNaTrilha criarObjeto() {
        String nomeCiclista = txtNomeCiclista.getText();
        int idade = Integer.parseInt(txtIdade.getText());
        double velocidadeMedia = Double.parseDouble(txtVelocidadeMedia.getText());
        String marca = txtMarca.getText();
        int numeroMarchas = Integer.parseInt(txtNumeroMarchas.getText());
        int marchaAtual = Integer.parseInt(txtMarchaAtual.getText());
        String nomeTrilha = txtNomeTrilha.getText();
        double comprimentoKm = Double.parseDouble(txtComprimentoKm.getText());
        String dificuldade = txtDificuldade.getText();
        CiclismoNaTrilha ciclismoNaTrilha = new CiclismoNaTrilha(nomeCiclista, idade, velocidadeMedia, marca, numeroMarchas, marchaAtual, nomeTrilha, comprimentoKm, dificuldade);
        return ciclismoNaTrilha;
    }

    // botão Pedalar
    @FXML
    void pedalar(ActionEvent event) {
        try {
            CiclismoNaTrilha ciclismoNaTrilha = criarObjeto();
            double horas = Double.parseDouble(txtPedalar.getText());
            double resultado = ciclismoNaTrilha.pedalar(horas);
            txtResultado.setText(String.format("Distância percorrida: %.2f km", resultado));
        } catch (NumberFormatException e) {
            Util.erro("Digite números válidos!");
        } catch (Exception e) {
            Util.erro(e.getMessage());
        }
    }

    // botão Calcular tempo
    @FXML
    void calcularTempo(ActionEvent event) {
        try {
            CiclismoNaTrilha ciclismoNaTrilha = criarObjeto();
            double distanciaKm = Double.parseDouble(txtCalcularTempo.getText());
            double resultado = ciclismoNaTrilha.calcularTempo(distanciaKm);
            txtResultado.setText(String.format("Tempo necessário: %.2f h", resultado));
        } catch (NumberFormatException e) {
            Util.erro("Digite números válidos!");
        } catch (Exception e) {
            Util.erro(e.getMessage());
        }
    }

    // botão Apresentar
    @FXML
    void apresentar(ActionEvent event) {
        try {
            CiclismoNaTrilha ciclismoNaTrilha = criarObjeto();
            String resultado = ciclismoNaTrilha.apresentar();
            txtResultado.setText(resultado);
        } catch (NumberFormatException e) {
            Util.erro("Digite números válidos!");
        } catch (Exception e) {
            Util.erro(e.getMessage());
        }
    }

    // botão Trocar marcha
    @FXML
    void trocarMarcha(ActionEvent event) {
        try {
            CiclismoNaTrilha ciclismoNaTrilha = criarObjeto();
            int novaMarcha = Integer.parseInt(txtTrocarMarcha.getText());
            String resultado = ciclismoNaTrilha.trocarMarcha(novaMarcha);
            txtResultado.setText(resultado);
        } catch (NumberFormatException e) {
            Util.erro("Digite números válidos!");
        } catch (Exception e) {
            Util.erro(e.getMessage());
        }
    }

    // botão Frear
    @FXML
    void frear(ActionEvent event) {
        try {
            CiclismoNaTrilha ciclismoNaTrilha = criarObjeto();
            String resultado = ciclismoNaTrilha.frear();
            txtResultado.setText(resultado);
        } catch (NumberFormatException e) {
            Util.erro("Digite números válidos!");
        } catch (Exception e) {
            Util.erro(e.getMessage());
        }
    }

    // botão Descrever bicicleta
    @FXML
    void descreverBicicleta(ActionEvent event) {
        try {
            CiclismoNaTrilha ciclismoNaTrilha = criarObjeto();
            String resultado = ciclismoNaTrilha.descreverBicicleta();
            txtResultado.setText(resultado);
        } catch (NumberFormatException e) {
            Util.erro("Digite números válidos!");
        } catch (Exception e) {
            Util.erro(e.getMessage());
        }
    }

    // botão Calcular tempo estimado
    @FXML
    void calcularTempoEstimado(ActionEvent event) {
        try {
            CiclismoNaTrilha ciclismoNaTrilha = criarObjeto();
            double velocidade = Double.parseDouble(txtCalcularTempoEstimado.getText());
            double resultado = ciclismoNaTrilha.calcularTempoEstimado(velocidade);
            txtResultado.setText(String.format("Tempo estimado: %.2f h", resultado));
        } catch (NumberFormatException e) {
            Util.erro("Digite números válidos!");
        } catch (Exception e) {
            Util.erro(e.getMessage());
        }
    }

    // botão É longa?
    @FXML
    void ehLonga(ActionEvent event) {
        try {
            CiclismoNaTrilha ciclismoNaTrilha = criarObjeto();
            boolean resultado = ciclismoNaTrilha.ehLonga();
            if (resultado) {
                txtResultado.setText("A trilha é longa (mais de 10 km)? Sim");
            } else {
                txtResultado.setText("A trilha é longa (mais de 10 km)? Não");
            }
        } catch (NumberFormatException e) {
            Util.erro("Digite números válidos!");
        } catch (Exception e) {
            Util.erro(e.getMessage());
        }
    }

    // botão Descrever trilha
    @FXML
    void descreverTrilha(ActionEvent event) {
        try {
            CiclismoNaTrilha ciclismoNaTrilha = criarObjeto();
            String resultado = ciclismoNaTrilha.descreverTrilha();
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
