package org.example.model;

public class AluguelCarro {

    private int dias;
    private int kmPercorrido;
    private double diaria;
    private int limiteKmPorDia;
    private double precoPorKmExtra;

    public AluguelCarro(int dias, int kmPercorrido, double diaria, int limiteKmPorDia, double precoPorKmExtra) {
        this.dias = dias;
        this.kmPercorrido = kmPercorrido;
        this.diaria = diaria;
        this.limiteKmPorDia = limiteKmPorDia;
        this.precoPorKmExtra = precoPorKmExtra;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getKmPercorrido() {
        return kmPercorrido;
    }

    public void setKmPercorrido(int kmPercorrido) {
        this.kmPercorrido = kmPercorrido;
    }

    public double getDiaria() {
        return diaria;
    }

    public void setDiaria(double diaria) {
        this.diaria = diaria;
    }

    public int getLimiteKmPorDia() {
        return limiteKmPorDia;
    }

    public void setLimiteKmPorDia(int limiteKmPorDia) {
        this.limiteKmPorDia = limiteKmPorDia;
    }

    public double getPrecoPorKmExtra() {
        return precoPorKmExtra;
    }

    public void setPrecoPorKmExtra(double precoPorKmExtra) {
        this.precoPorKmExtra = precoPorKmExtra;
    }

    // km que passou do limite
    public int getKmExcedente() {
        int limiteTotal = limiteKmPorDia * dias;
        int excedente = kmPercorrido - limiteTotal;
        if (excedente < 0) {
            excedente = 0;
        }
        return excedente;
    }

    public double getCustoTotal() {
        double custo = dias * diaria + getKmExcedente() * precoPorKmExtra;
        return custo;
    }
}
