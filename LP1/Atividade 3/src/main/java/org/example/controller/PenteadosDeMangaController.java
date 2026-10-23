package org.example.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.example.model.PenteadosDeManga;

public class PenteadosDeMangaController {

    // campos da tela
    @FXML private TextField txtNomePenteado;
    @FXML private TextField txtComprimentoCm;
    @FXML private TextField txtEstilo;
    @FXML private TextField txtCortar;
    @FXML private TextField txtNomePersonagem;
    @FXML private TextField txtIdade;
    @FXML private TextField txtPenteado;
    @FXML private TextField txtMudarPenteado;
    @FXML private TextField txtEnvelhecer;
    @FXML private TextField txtNomeDesenhista;
    @FXML private TextField txtQuantidadeDesenhos;
    @FXML private TextField txtMinutosPorDesenho;
    @FXML private TextField txtDesenhar;
    @FXML private TextArea txtResultado;

    // pega o que foi digitado na tela e cria o objeto
    private PenteadosDeManga criarObjeto() {
        String nomePenteado = txtNomePenteado.getText();
        double comprimentoCm = Double.parseDouble(txtComprimentoCm.getText());
        String estilo = txtEstilo.getText();
        String nomePersonagem = txtNomePersonagem.getText();
        int idade = Integer.parseInt(txtIdade.getText());
        String penteado = txtPenteado.getText();
        String nomeDesenhista = txtNomeDesenhista.getText();
        int quantidadeDesenhos = Integer.parseInt(txtQuantidadeDesenhos.getText());
        double minutosPorDesenho = Double.parseDouble(txtMinutosPorDesenho.getText());
        PenteadosDeManga penteadosDeManga = new PenteadosDeManga(nomePenteado, comprimentoCm, estilo, nomePersonagem, idade, penteado, nomeDesenhista, quantidadeDesenhos, minutosPorDesenho);
        return penteadosDeManga;
    }

    // botão Cortar
    @FXML
    void cortar(ActionEvent event) {
        try {
            PenteadosDeManga penteadosDeManga = criarObjeto();
            double cm = Double.parseDouble(txtCortar.getText());
            double resultado = penteadosDeManga.cortar(cm);
            txtResultado.setText(String.format("Novo comprimento: %.1f cm", resultado));
        } catch (NumberFormatException e) {
            Util.erro("Digite números válidos!");
        } catch (Exception e) {
            Util.erro(e.getMessage());
        }
    }

    // botão É curto?
    @FXML
    void ehCurto(ActionEvent event) {
        try {
            PenteadosDeManga penteadosDeManga = criarObjeto();
            boolean resultado = penteadosDeManga.ehCurto();
            if (resultado) {
                txtResultado.setText("O penteado é curto (menos de 15 cm)? Sim");
            } else {
                txtResultado.setText("O penteado é curto (menos de 15 cm)? Não");
            }
        } catch (NumberFormatException e) {
            Util.erro("Digite números válidos!");
        } catch (Exception e) {
            Util.erro(e.getMessage());
        }
    }

    // botão Descrever penteado
    @FXML
    void descreverPenteado(ActionEvent event) {
        try {
            PenteadosDeManga penteadosDeManga = criarObjeto();
            String resultado = penteadosDeManga.descreverPenteado();
            txtResultado.setText(resultado);
        } catch (NumberFormatException e) {
            Util.erro("Digite números válidos!");
        } catch (Exception e) {
            Util.erro(e.getMessage());
        }
    }

    // botão Apresentar personagem
    @FXML
    void apresentarPersonagem(ActionEvent event) {
        try {
            PenteadosDeManga penteadosDeManga = criarObjeto();
            String resultado = penteadosDeManga.apresentarPersonagem();
            txtResultado.setText(resultado);
        } catch (NumberFormatException e) {
            Util.erro("Digite números válidos!");
        } catch (Exception e) {
            Util.erro(e.getMessage());
        }
    }

    // botão Mudar penteado
    @FXML
    void mudarPenteado(ActionEvent event) {
        try {
            PenteadosDeManga penteadosDeManga = criarObjeto();
            String novoPenteado = txtMudarPenteado.getText();
            String resultado = penteadosDeManga.mudarPenteado(novoPenteado);
            txtResultado.setText(resultado);
        } catch (NumberFormatException e) {
            Util.erro("Digite números válidos!");
        } catch (Exception e) {
            Util.erro(e.getMessage());
        }
    }

    // botão Envelhecer
    @FXML
    void envelhecer(ActionEvent event) {
        try {
            PenteadosDeManga penteadosDeManga = criarObjeto();
            int anos = Integer.parseInt(txtEnvelhecer.getText());
            int resultado = penteadosDeManga.envelhecer(anos);
            txtResultado.setText(String.format("Nova idade: %d anos", resultado));
        } catch (NumberFormatException e) {
            Util.erro("Digite números válidos!");
        } catch (Exception e) {
            Util.erro(e.getMessage());
        }
    }

    // botão Desenhar
    @FXML
    void desenhar(ActionEvent event) {
        try {
            PenteadosDeManga penteadosDeManga = criarObjeto();
            int quantidade = Integer.parseInt(txtDesenhar.getText());
            int resultado = penteadosDeManga.desenhar(quantidade);
            txtResultado.setText(String.format("Total de desenhos: %d", resultado));
        } catch (NumberFormatException e) {
            Util.erro("Digite números válidos!");
        } catch (Exception e) {
            Util.erro(e.getMessage());
        }
    }

    // botão Calcular tempo total
    @FXML
    void calcularTempoTotal(ActionEvent event) {
        try {
            PenteadosDeManga penteadosDeManga = criarObjeto();
            double resultado = penteadosDeManga.calcularTempoTotal();
            txtResultado.setText(String.format("Tempo total: %.2f h", resultado));
        } catch (NumberFormatException e) {
            Util.erro("Digite números válidos!");
        } catch (Exception e) {
            Util.erro(e.getMessage());
        }
    }

    // botão Apresentar desenhista
    @FXML
    void apresentarDesenhista(ActionEvent event) {
        try {
            PenteadosDeManga penteadosDeManga = criarObjeto();
            String resultado = penteadosDeManga.apresentarDesenhista();
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
