import java.util.Scanner;

public class Camelos {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int camelos, parcela1, parcela2, parcela3;

        // Entrada de dados
        System.out.println("Quantos camelos existem?");
        camelos = s.nextInt();

        System.out.println("Divisão do primeiro irmão (ex.: 2 para a metade):");
        parcela1 = s.nextInt();

        System.out.println("Divisão do segundo irmão (ex.: 3 para a terça parte):");
        parcela2 = s.nextInt();

        System.out.println("Divisão do terceiro irmão (ex.: 9 para a nona parte):");
        parcela3 = s.nextInt();

        // Beremiz empresta um camelo
        int total = camelos + 1;

        // Divisão inteira: a parte decimal é descartada
        int irmao1 = total / parcela1;
        int irmao2 = total / parcela2;
        int irmao3 = total / parcela3;

        // Saída
        System.out.println();
        System.out.println("O primeiro irmão recebeu " + irmao1 + " camelos");
        System.out.println("O segundo irmão recebeu " + irmao2 + " camelos");
        System.out.println("O terceiro irmão recebeu " + irmao3 + " camelos");

        int sobra = total - (irmao1 + irmao2 + irmao3);
        System.out.println("Sobraram " + sobra + " camelos (um volta ao dono e outro fica com Beremiz)");
    }
}