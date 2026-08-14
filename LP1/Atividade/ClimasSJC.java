import java.util.Scanner;

public class tempsjc {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double janeiro, fevereiro, marco, abril, maio, junho;
        double julho, agosto, setembro, outubro, novembro, dezembro;
        double soma, media;

        System.out.println("Informe a temperatura media de Janeiro (C):");
        janeiro = s.nextDouble();
        if (janeiro < 18) System.out.println("Frio");
        else System.out.println("Temperatura agradavel");

        System.out.println("Informe a temperatura media de Fevereiro (C):");
        fevereiro = s.nextDouble();
        if (fevereiro < 18) System.out.println("Frio");
        else System.out.println("Temperatura agradavel");

        System.out.println("Informe a temperatura media de Marco (C):");
        marco = s.nextDouble();
        if (marco < 18) System.out.println("Frio");
        else System.out.println("Temperatura agradavel");

        System.out.println("Informe a temperatura media de Abril (C):");
        abril = s.nextDouble();
        if (abril < 18) System.out.println("Frio");
        else System.out.println("Temperatura agradavel");

        System.out.println("Informe a temperatura media de Maio (C):");
        maio = s.nextDouble();
        if (maio < 18) System.out.println("Frio");
        else System.out.println("Temperatura agradavel");

        System.out.println("Informe a temperatura media de Junho (C):");
        junho = s.nextDouble();
        if (junho < 18) System.out.println("Frio");
        else System.out.println("Temperatura agradavel");

        System.out.println("Informe a temperatura media de Julho (C):");
        julho = s.nextDouble();
        if (julho < 18) System.out.println("Frio");
        else System.out.println("Temperatura agradavel");

        System.out.println("Informe a temperatura media de Agosto (C):");
        agosto = s.nextDouble();
        if (agosto < 18) System.out.println("Frio");
        else System.out.println("Temperatura agradavel");

        System.out.println("Informe a temperatura media de Setembro (C):");
        setembro = s.nextDouble();
        if (setembro < 18) System.out.println("Frio");
        else System.out.println("Temperatura agradavel");

        System.out.println("Informe a temperatura media de Outubro (C):");
        outubro = s.nextDouble();
        if (outubro < 18) System.out.println("Frio");
        else System.out.println("Temperatura agradavel");

        System.out.println("Informe a temperatura media de Novembro (C):");
        novembro = s.nextDouble();
        if (novembro < 18) System.out.println("Frio");
        else System.out.println("Temperatura agradavel");

        System.out.println("Informe a temperatura media de Dezembro (C):");
        dezembro = s.nextDouble();
        if (dezembro < 18) System.out.println("Frio");
        else System.out.println("Temperatura agradavel");

        soma = janeiro + fevereiro + marco + abril + maio + junho
                + julho + agosto + setembro + outubro + novembro + dezembro;
        media = soma / 12;

        System.out.println();
        System.out.println("Temperatura media anual: " + media + " ªC");

        if (media < 18) {
            System.out.println("Em geral, em Sao Jose dos Campos faz frio.");
        } else {
            System.out.println("Em geral, em Sao Jose dos Campos a temperatura e agradavel.");
        }
    }
    }
