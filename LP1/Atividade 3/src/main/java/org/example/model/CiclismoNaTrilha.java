package org.example.model;

// Imagem 2 - Ciclismo na trilha
public class CiclismoNaTrilha {

    private String nomeCiclista;
    private int idade;
    private double velocidadeMedia;
    private String marca;
    private int numeroMarchas;
    private int marchaAtual;
    private String nomeTrilha;
    private double comprimentoKm;
    private String dificuldade;

    public CiclismoNaTrilha(String nomeCiclista, int idade, double velocidadeMedia, String marca, int numeroMarchas, int marchaAtual, String nomeTrilha, double comprimentoKm, String dificuldade) {
        this.nomeCiclista = nomeCiclista;
        this.idade = idade;
        this.velocidadeMedia = velocidadeMedia;
        this.marca = marca;
        this.numeroMarchas = numeroMarchas;
        this.marchaAtual = marchaAtual;
        this.nomeTrilha = nomeTrilha;
        this.comprimentoKm = comprimentoKm;
        this.dificuldade = dificuldade;
    }

    public String getNomeCiclista() {
        return nomeCiclista;
    }

    public void setNomeCiclista(String nomeCiclista) {
        this.nomeCiclista = nomeCiclista;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getVelocidadeMedia() {
        return velocidadeMedia;
    }

    public void setVelocidadeMedia(double velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumeroMarchas() {
        return numeroMarchas;
    }

    public void setNumeroMarchas(int numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }

    public int getMarchaAtual() {
        return marchaAtual;
    }

    public void setMarchaAtual(int marchaAtual) {
        this.marchaAtual = marchaAtual;
    }

    public String getNomeTrilha() {
        return nomeTrilha;
    }

    public void setNomeTrilha(String nomeTrilha) {
        this.nomeTrilha = nomeTrilha;
    }

    public double getComprimentoKm() {
        return comprimentoKm;
    }

    public void setComprimentoKm(double comprimentoKm) {
        this.comprimentoKm = comprimentoKm;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public double pedalar(double horas) {
        return velocidadeMedia * horas;
    }

    public double calcularTempo(double distanciaKm) {
        if (velocidadeMedia <= 0) {
            throw new IllegalArgumentException("A velocidade média deve ser maior que zero.");
        }
        return distanciaKm / velocidadeMedia;
    }

    public String apresentar() {
        return "Ciclista " + nomeCiclista + ", " + idade + " anos, média de " + velocidadeMedia + " km/h";
    }

    public String trocarMarcha(int novaMarcha) {
        if (novaMarcha < 1 || novaMarcha > numeroMarchas) {
            throw new IllegalArgumentException("A marcha deve estar entre 1 e " + numeroMarchas + ".");
        }
        marchaAtual = novaMarcha;
        return "Marcha alterada para " + marchaAtual + ".";
    }

    public String frear() {
        return "A bicicleta " + marca + " freou.";
    }

    public String descreverBicicleta() {
        return "Bicicleta " + marca + " com " + numeroMarchas + " marchas (marcha atual: " + marchaAtual + ")";
    }

    public double calcularTempoEstimado(double velocidade) {
        if (velocidade <= 0) {
            throw new IllegalArgumentException("A velocidade média deve ser maior que zero.");
        }
        return comprimentoKm / velocidade;
    }

    public boolean ehLonga() {
        return comprimentoKm > 10;
    }

    public String descreverTrilha() {
        return "Trilha " + nomeTrilha + ": " + comprimentoKm + " km, dificuldade " + dificuldade;
    }
}
