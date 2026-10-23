package org.example;

import org.example.model.*;

// Item 2c: testa as 4 classes no console (sem tela).
// Para abrir a tela, execute a classe App.
public class PrincipalImagens {

    public static void main(String[] args) {
        System.out.println("===== Imagem 1 - Loja de roupas =====");
        LojaDeRoupas loja = new LojaDeRoupas("Dorinho's", "São José dos Campos", 12,
                "Azul", "M", 899.90,
                185, "Preto", "Terno azul");
        System.out.println(loja.anunciarInauguracao());
        System.out.println(loja.contratar(3));
        System.out.println(String.format("Folha de pagamento: R$ %.2f", loja.calcularFolha(2500)));
        System.out.println(String.format("Preço com desconto: R$ %.2f", loja.aplicarDesconto(10)));
        System.out.println(String.format("Valor da parcela: R$ %.2f", loja.calcularParcela(3)));
        System.out.println(loja.descreverTerno());
        System.out.println(loja.vestir("Camisa polo"));
        System.out.println(loja.despir());
        System.out.println(loja.descreverManequim());


        System.out.println("===== Imagem 2 - Ciclismo na trilha =====");
        CiclismoNaTrilha ciclismo = new CiclismoNaTrilha("Ana", 28, 15,
                "Caloi", 21, 1,
                "Trilha da Mata", 12, "Média");
        System.out.println(String.format("Distância percorrida: %.2f km", ciclismo.pedalar(2)));
        System.out.println(String.format("Tempo necessário: %.2f h", ciclismo.calcularTempo(30)));
        System.out.println(ciclismo.apresentar());
        System.out.println(ciclismo.trocarMarcha(7));
        System.out.println(ciclismo.frear());
        System.out.println(ciclismo.descreverBicicleta());
        System.out.println(String.format("Tempo estimado: %.2f h", ciclismo.calcularTempoEstimado(15)));
        if (ciclismo.ehLonga()) {
            System.out.println("A trilha é longa (mais de 10 km)? Sim");
        } else {
            System.out.println("A trilha é longa (mais de 10 km)? Não");
        }
        System.out.println(ciclismo.descreverTrilha());


        System.out.println("===== Imagem 3 - Máscaras africanas =====");
        MascarasAfricanas mascaras = new MascarasAfricanas("Congo", "Madeira", 45,
                "Kwame", "Kinshasa", 25,
                "Máscaras da África", 20, 25);
        System.out.println(mascaras.descreverMascara());
        if (mascaras.ehGrande()) {
            System.out.println("A máscara é grande (mais de 40 cm)? Sim");
        } else {
            System.out.println("A máscara é grande (mais de 40 cm)? Não");
        }
        System.out.println(mascaras.usarEmCerimonia("iniciação"));
        System.out.println(mascaras.esculpir("madeira"));
        if (mascaras.ehMestre()) {
            System.out.println("O artesão é mestre (20 anos ou mais de ofício)? Sim");
        } else {
            System.out.println("O artesão é mestre (20 anos ou mais de ofício)? Não");
        }
        System.out.println(mascaras.apresentar());
        System.out.println(String.format("Total de máscaras na exposição: %d", mascaras.adicionarMascaras(5)));
        System.out.println(String.format("Receita com ingressos: R$ %.2f", mascaras.calcularReceita(100)));
        System.out.println(mascaras.descreverExposicao());


        System.out.println("===== Imagem 4 - Penteados de mangá =====");
        PenteadosDeManga penteados = new PenteadosDeManga("Franja curta", 12, "Repicado",
                "Kenji", 17, "Repicado",
                "Mika", 10, 45);
        System.out.println(String.format("Novo comprimento: %.1f cm", penteados.cortar(3)));
        if (penteados.ehCurto()) {
            System.out.println("O penteado é curto (menos de 15 cm)? Sim");
        } else {
            System.out.println("O penteado é curto (menos de 15 cm)? Não");
        }
        System.out.println(penteados.descreverPenteado());
        System.out.println(penteados.apresentarPersonagem());
        System.out.println(penteados.mudarPenteado("Ondulado"));
        System.out.println(String.format("Nova idade: %d anos", penteados.envelhecer(2)));
        System.out.println(String.format("Total de desenhos: %d", penteados.desenhar(2)));
        System.out.println(String.format("Tempo total: %.2f h", penteados.calcularTempoTotal()));
        System.out.println(penteados.apresentarDesenhista());
    }
}
