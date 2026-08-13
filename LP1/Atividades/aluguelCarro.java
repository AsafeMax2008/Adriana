import java.util.Scanner;

public class aluguelCarro {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int dias, kmPercorrido, limiteKm;
        double diaria, precoPorKmExtra, kmExcedente, custoTotal;

        System.out.println("Informe a quantidade de dias:");
        dias = s.nextInt();

        System.out.println("Informe a quilometragem percorrida:");
        kmPercorrido = s.nextInt();

        System.out.println("Informe o valor da diaria (R$):");
        diaria = s.nextDouble();

        System.out.println("Informe o limite de km incluso por dia:");
        limiteKm = s.nextInt();

        System.out.println("Informe o preco por km excedente (R$):");
        precoPorKmExtra = s.nextDouble();

        limiteKm = limiteKm * dias;

        custoTotal = dias * diaria;

        if (kmPercorrido > limiteKm) {
            kmExcedente = kmPercorrido - limiteKm;
            custoTotal = custoTotal + (kmExcedente * precoPorKmExtra);
            System.out.println("Km excedente: " + kmExcedente + " km");
        }

        System.out.println("Custo total do aluguel: R$ " + custoTotal);
    }
}