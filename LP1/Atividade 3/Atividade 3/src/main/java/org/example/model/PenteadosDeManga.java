package org.example.model;

// Imagem 4 - Penteados de mangá
public class PenteadosDeManga {

    private String nomePenteado;
    private double comprimentoCm;
    private String estilo;
    private String nomePersonagem;
    private int idade;
    private String penteado;
    private String nomeDesenhista;
    private int quantidadeDesenhos;
    private double minutosPorDesenho;

    public PenteadosDeManga(String nomePenteado, double comprimentoCm, String estilo, String nomePersonagem, int idade, String penteado, String nomeDesenhista, int quantidadeDesenhos, double minutosPorDesenho) {
        this.nomePenteado = nomePenteado;
        this.comprimentoCm = comprimentoCm;
        this.estilo = estilo;
        this.nomePersonagem = nomePersonagem;
        this.idade = idade;
        this.penteado = penteado;
        this.nomeDesenhista = nomeDesenhista;
        this.quantidadeDesenhos = quantidadeDesenhos;
        this.minutosPorDesenho = minutosPorDesenho;
    }

    public String getNomePenteado() {
        return nomePenteado;
    }

    public void setNomePenteado(String nomePenteado) {
        this.nomePenteado = nomePenteado;
    }

    public double getComprimentoCm() {
        return comprimentoCm;
    }

    public void setComprimentoCm(double comprimentoCm) {
        this.comprimentoCm = comprimentoCm;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getNomePersonagem() {
        return nomePersonagem;
    }

    public void setNomePersonagem(String nomePersonagem) {
        this.nomePersonagem = nomePersonagem;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPenteado() {
        return penteado;
    }

    public void setPenteado(String penteado) {
        this.penteado = penteado;
    }

    public String getNomeDesenhista() {
        return nomeDesenhista;
    }

    public void setNomeDesenhista(String nomeDesenhista) {
        this.nomeDesenhista = nomeDesenhista;
    }

    public int getQuantidadeDesenhos() {
        return quantidadeDesenhos;
    }

    public void setQuantidadeDesenhos(int quantidadeDesenhos) {
        this.quantidadeDesenhos = quantidadeDesenhos;
    }

    public double getMinutosPorDesenho() {
        return minutosPorDesenho;
    }

    public void setMinutosPorDesenho(double minutosPorDesenho) {
        this.minutosPorDesenho = minutosPorDesenho;
    }

    public double cortar(double cm) {
        comprimentoCm = comprimentoCm - cm;
        if (comprimentoCm < 0) {
            comprimentoCm = 0;
        }
        return comprimentoCm;
    }

    public boolean ehCurto() {
        return comprimentoCm < 15;
    }

    public String descreverPenteado() {
        return "Penteado " + nomePenteado + " (" + estilo + "), " + comprimentoCm + " cm";
    }

    public String apresentarPersonagem() {
        return nomePersonagem + ", " + idade + " anos, penteado " + penteado;
    }

    public String mudarPenteado(String novoPenteado) {
        penteado = novoPenteado;
        return nomePersonagem + " mudou o penteado para " + penteado + ".";
    }

    public int envelhecer(int anos) {
        idade += anos;
        return idade;
    }

    public int desenhar(int quantidade) {
        quantidadeDesenhos += quantidade;
        return quantidadeDesenhos;
    }

    public double calcularTempoTotal() {
        return quantidadeDesenhos * minutosPorDesenho / 60;
    }

    public String apresentarDesenhista() {
        return "Desenhista " + nomeDesenhista + " já fez " + quantidadeDesenhos + " desenhos";
    }
}
