package org.example.model;

// Imagem 1 - Loja de roupas
public class LojaDeRoupas {

    private String nome;
    private String cidade;
    private int funcionarios;
    private String corTerno;
    private String tamanho;
    private double preco;
    private double alturaCm;
    private String corManequim;
    private String roupa;

    public LojaDeRoupas(String nome, String cidade, int funcionarios, String corTerno, String tamanho, double preco, double alturaCm, String corManequim, String roupa) {
        this.nome = nome;
        this.cidade = cidade;
        this.funcionarios = funcionarios;
        this.corTerno = corTerno;
        this.tamanho = tamanho;
        this.preco = preco;
        this.alturaCm = alturaCm;
        this.corManequim = corManequim;
        this.roupa = roupa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(int funcionarios) {
        this.funcionarios = funcionarios;
    }

    public String getCorTerno() {
        return corTerno;
    }

    public void setCorTerno(String corTerno) {
        this.corTerno = corTerno;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getAlturaCm() {
        return alturaCm;
    }

    public void setAlturaCm(double alturaCm) {
        this.alturaCm = alturaCm;
    }

    public String getCorManequim() {
        return corManequim;
    }

    public void setCorManequim(String corManequim) {
        this.corManequim = corManequim;
    }

    public String getRoupa() {
        return roupa;
    }

    public void setRoupa(String roupa) {
        this.roupa = roupa;
    }

    public String anunciarInauguracao() {
        return "Nova loja: " + nome + " - " + cidade;
    }

    public String contratar(int quantidade) {
        funcionarios += quantidade;
        return "A loja " + nome + " agora tem " + funcionarios + " funcionários.";
    }

    public double calcularFolha(double salarioMedio) {
        return funcionarios * salarioMedio;
    }

    public double aplicarDesconto(double percentual) {
        return preco - preco * percentual / 100;
    }

    public double calcularParcela(int parcelas) {
        if (parcelas <= 0) {
            throw new IllegalArgumentException("O número de parcelas deve ser maior que zero.");
        }
        return preco / parcelas;
    }

    public String descreverTerno() {
        return "Terno " + corTerno + ", tamanho " + tamanho + ", R$ " + String.format("%.2f", preco);
    }

    public String vestir(String novaRoupa) {
        roupa = novaRoupa;
        return "O manequim (" + corManequim + ") agora veste: " + roupa;
    }

    public String despir() {
        roupa = "nenhuma";
        return "O manequim (" + corManequim + ") está sem roupa.";
    }

    public String descreverManequim() {
        return "Manequim " + corManequim + " de " + alturaCm + " cm, vestindo: " + roupa;
    }
}
