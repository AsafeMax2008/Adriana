package org.example.model;

// Imagem 3 - Máscaras africanas
public class MascarasAfricanas {

    private String origem;
    private String material;
    private double alturaCm;
    private String nome;
    private String aldeia;
    private int anosDeOficio;
    private String titulo;
    private int numeroMascaras;
    private double precoIngresso;

    public MascarasAfricanas(String origem, String material, double alturaCm, String nome, String aldeia, int anosDeOficio, String titulo, int numeroMascaras, double precoIngresso) {
        this.origem = origem;
        this.material = material;
        this.alturaCm = alturaCm;
        this.nome = nome;
        this.aldeia = aldeia;
        this.anosDeOficio = anosDeOficio;
        this.titulo = titulo;
        this.numeroMascaras = numeroMascaras;
        this.precoIngresso = precoIngresso;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getAlturaCm() {
        return alturaCm;
    }

    public void setAlturaCm(double alturaCm) {
        this.alturaCm = alturaCm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public int getAnosDeOficio() {
        return anosDeOficio;
    }

    public void setAnosDeOficio(int anosDeOficio) {
        this.anosDeOficio = anosDeOficio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroMascaras() {
        return numeroMascaras;
    }

    public void setNumeroMascaras(int numeroMascaras) {
        this.numeroMascaras = numeroMascaras;
    }

    public double getPrecoIngresso() {
        return precoIngresso;
    }

    public void setPrecoIngresso(double precoIngresso) {
        this.precoIngresso = precoIngresso;
    }

    public String descreverMascara() {
        return "Máscara de " + origem + ", feita de " + material + ", com " + alturaCm + " cm";
    }

    public boolean ehGrande() {
        return alturaCm > 40;
    }

    public String usarEmCerimonia(String cerimonia) {
        return "A máscara de " + origem + " é usada na cerimônia de " + cerimonia + ".";
    }

    public String esculpir(String materialUsado) {
        return nome + " esculpiu uma máscara de " + materialUsado + ".";
    }

    public boolean ehMestre() {
        return anosDeOficio >= 20;
    }

    public String apresentar() {
        return "Artesão " + nome + " da aldeia " + aldeia + ", com " + anosDeOficio + " anos de ofício";
    }

    public int adicionarMascaras(int quantidade) {
        numeroMascaras += quantidade;
        return numeroMascaras;
    }

    public double calcularReceita(int visitantes) {
        return visitantes * precoIngresso;
    }

    public String descreverExposicao() {
        return "Exposição \"" + titulo + "\" com " + numeroMascaras + " máscaras, ingresso a R$ " + String.format("%.2f", precoIngresso);
    }
}
