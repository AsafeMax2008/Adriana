import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double janeiro, fevereiro, marco, abril, maio, junho;
        double julho, agosto, setembro, outubro, novembro, dezembro;
        double soma, media;

        System.out.println("Temperatura média de Janeiro (°C):");
        janeiro = s.nextDouble();
        if (janeiro < 18) {
            System.out.println("Frio");
        } else {
            System.out.println("Temperatura agradável");
        }

        System.out.println("Temperatura média de Fevereiro (°C):");
        fevereiro = s.nextDouble();
        if (fevereiro < 18) {
            System.out.println("Frio");
        } else {
            System.out.println("Temperatura agradável");
        }

        System.out.println("Temperatura média de Março (°C):");
        marco = s.nextDouble();
        if (marco < 18) {
            System.out.println("Frio");
        } else {
            System.out.println("Temperatura agradável");
        }

        System.out.println("Temperatura média de Abril (°C):");
        abril = s.nextDouble();
        if (abril < 18) {
            System.out.println("Frio");
        } else {
            System.out.println("Temperatura agradável");
        }

        System.out.println("Temperatura média de Maio (°C):");
        maio = s.nextDouble();
        if (maio < 18) {
            System.out.println("Frio");
        } else {
            System.out.println("Temperatura agradável");
        }

        System.out.println("Temperatura média de Junho (°C):");
        junho = s.nextDouble();
        if (junho < 18) {
            System.out.println("Frio");
        } else {
            System.out.println("Temperatura agradável");
        }

        System.out.println("Temperatura média de Julho (°C):");
        julho = s.nextDouble();
        if (julho < 18) {
            System.out.println("Frio");
        } else {
            System.out.println("Temperatura agradável");
        }

        System.out.println("Temperatura média de Agosto (°C):");
        agosto = s.nextDouble();
        if (agosto < 18) {
            System.out.println("Frio");
        } else {
            System.out.println("Temperatura agradável");
        }

        System.out.println("Temperatura média de Setembro (°C):");
        setembro = s.nextDouble();
        if (setembro < 18) {
            System.out.println("Frio");
        } else {
            System.out.println("Temperatura agradável");
        }

        System.out.println("Temperatura média de Outubro (°C):");
        outubro = s.nextDouble();
        if (outubro < 18) {
            System.out.println("Frio");
        } else {
            System.out.println("Temperatura agradável");
        }

        System.out.println("Temperatura média de Novembro (°C):");
        novembro = s.nextDouble();
        if (novembro < 18) {
            System.out.println("Frio");
        } else {
            System.out.println("Temperatura agradável");
        }

        System.out.println("Temperatura média de Dezembro (°C):");
        dezembro = s.nextDouble();
        if (dezembro < 18) {
            System.out.println("Frio");
        } else {
            System.out.println("Temperatura agradável");
        }

        // Média anual
        soma = janeiro + fevereiro + marco + abril + maio + junho
                + julho + agosto + setembro + outubro + novembro + dezembro;
        media = soma / 12;

        System.out.println();
        System.out.printf("Temperatura média anual: %.1f °C%n", media);

        if (media < 18) {
            System.out.println("Em geral, em São José dos Campos faz frio.");
        } else {
            System.out.println("Em geral, em São José dos Campos a temperatura é agradável.");
        }
    }
}