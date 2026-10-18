import java.util.Scanner;

public class CalculoViagem {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double distancia, precoCombustivel;
        double consumo = 12;   // o carro faz 12 km por litro

        // Entrada de dados
        System.out.println("Informe a distância da viagem (km):");
        distancia = s.nextDouble();

        System.out.println("Informe o preço do combustível (R$/L):");
        precoCombustivel = s.nextDouble();

        // Processamento
        double litros = distancia / consumo;
        double custo = litros * precoCombustivel;

        // Desconto de 5% para viagens acima de 500 km
        if (distancia > 500) {
            custo = custo - (custo * 0.05);
            System.out.println("Viagem acima de 500 km: desconto de 5% aplicado.");
        }

        // Saída
        System.out.printf("Custo total da viagem: R$ %.2f%n", custo);
    }
}