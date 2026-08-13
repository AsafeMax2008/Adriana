import java.util.Scanner;

public class calculoviagem {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double distancia, precoCombustivel, litrosGastos, custo;

        System.out.println("Informe a distancia da viagem (km):");
        distancia = s.nextDouble();

        System.out.println("Informe o preco do combustivel (R$/L):");
        precoCombustivel = s.nextDouble();

        litrosGastos = distancia / 12;
        custo = litrosGastos * precoCombustivel;

        if (distancia > 500) {
            custo = custo - (custo * 0.05);
            System.out.println("Viagem acima de 500 km: desconto de 5% aplicado.");
        }

        System.out.println("Custo total da viagem: R$ " + custo);
    }
}