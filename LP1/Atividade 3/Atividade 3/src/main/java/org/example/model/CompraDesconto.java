package org.example.model;

public class CompraDesconto {

    private String[] itens = {"Arroz", "Feijão", "Óleo de soja", "Açúcar", "Café torrado e moído",
            "Macarrão", "Farinha", "Fubá de milho", "Molho de tomate", "Sal"};
    private double[] precos = new double[10];

    public String[] getItens() {
        return itens;
    }

    public double getPreco(int indice) {
        return precos[indice];
    }

    public void setPreco(int indice, double preco) {
        precos[indice] = preco;
    }

    public double getSubtotal() {
        double soma = 0;
        for (int i = 0; i < precos.length; i++) {
            soma = soma + precos[i];
        }
        return soma;
    }

    // 10% de desconto se passar de R$ 100
    public double getDesconto() {
        double desconto = 0;
        if (getSubtotal() > 100) {
            desconto = getSubtotal() * 0.10;
        }
        return desconto;
    }

    public double getTotal() {
        return getSubtotal() - getDesconto();
    }
}
