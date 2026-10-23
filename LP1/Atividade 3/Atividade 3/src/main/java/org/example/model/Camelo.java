package org.example.model;

public class Camelo {

    private int camelos;

    public Camelo(int camelos) {
        this.camelos = camelos;
    }

    public int getCamelos() {
        return camelos;
    }

    public void setCamelos(int camelos) {
        this.camelos = camelos;
    }

    // soma 1 camelo emprestado antes de dividir
    public int getTotal() {
        return camelos + 1;
    }

    public int getPrimeiroFilho() {
        return getTotal() / 2;
    }

    public int getSegundoFilho() {
        return getTotal() / 3;
    }

    public int getTerceiroFilho() {
        return getTotal() / 9;
    }
}
