package org.example.model;

public class Temperatura {

    private String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
    private double[] temperaturas = new double[12];

    public String[] getMeses() {
        return meses;
    }

    public double getTemperatura(int mes) {
        return temperaturas[mes];
    }

    public void setTemperatura(int mes, double valor) {
        temperaturas[mes] = valor;
    }

    public String classificarMes(int mes) {
        if (temperaturas[mes] < 18) {
            return "Frio";
        } else {
            return "Temperatura agradável";
        }
    }

    public double getMedia() {
        double soma = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            soma = soma + temperaturas[i];
        }
        return soma / temperaturas.length;
    }

    public String classificarAno() {
        if (getMedia() < 18) {
            return "Em geral, em São José dos Campos faz frio.";
        } else {
            return "Em geral, em São José dos Campos a temperatura é agradável.";
        }
    }
}
