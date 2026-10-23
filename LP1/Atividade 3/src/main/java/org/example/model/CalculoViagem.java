package org.example.model;

public class CalculoViagem {

    private double distancia;
    private double precoCombustivel;

    public CalculoViagem(double distancia, double precoCombustivel) {
        this.distancia = distancia;
        this.precoCombustivel = precoCombustivel;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getPrecoCombustivel() {
        return precoCombustivel;
    }

    public void setPrecoCombustivel(double precoCombustivel) {
        this.precoCombustivel = precoCombustivel;
    }

    // o carro faz 12 km por litro
    public double getLitrosGastos() {
        return distancia / 12;
    }

    // viagem acima de 500 km tem desconto
    public boolean temDesconto() {
        return distancia > 500;
    }

    public double getCusto() {
        double custo = getLitrosGastos() * precoCombustivel;
        if (temDesconto()) {
            custo = custo - custo * 0.05;
        }
        return custo;
    }
}
