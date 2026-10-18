import java.util.Scanner;

public class AluguelCarro {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Valores fixos da locadora
        double diaria = 100.00;
        int limiteKmPorDia = 100;
        double precoKmExtra = 0.50;

        int dias, kmPercorrido;

        // Entrada de dados
        System.out.println("Informe a quantidade de dias:");
        dias = s.nextInt();

        System.out.println("Informe a quilometragem percorrida:");
        kmPercorrido = s.nextInt();

        // Processamento
        double custo = dias * diaria;
        int limiteTotal = limiteKmPorDia * dias;

        if (kmPercorrido > limiteTotal) {
            int kmExcedente = kmPercorrido - limiteTotal;
            custo = custo + (kmExcedente * precoKmExtra);
            System.out.println("Km excedente: " + kmExcedente + " km");
        }

        // Saída
        System.out.printf("Custo total do aluguel: R$ %.2f%n", custo);
    }
}