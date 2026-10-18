import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Qual exercício você deseja executar?");
        System.out.println();
        System.out.println("1 - Verificação de múltiplo");
        System.out.println("2 - Sistema de login simplificado");
        System.out.println("3 - Compra com desconto");
        System.out.println("4 - Temperatura");
        System.out.println("5 - Os trinta e cinco camelos");
        System.out.println("6 - Calculadora de viagem");
        System.out.println("7 - Aluguel de carro");

        int opcao = s.nextInt();

        if (opcao == 1) {
            Multiplo m = new Multiplo();
            m.executar();
        } else if (opcao == 2) {
            SistemaLogin l = new SistemaLogin();
            l.executar();
        } else if (opcao == 3) {
            CompraDesconto c = new CompraDesconto();
            c.executar();
        } else if (opcao == 4) {
            Temperatura t = new Temperatura();
            t.executar();
        } else if (opcao == 5) {
            Camelos ca = new Camelos();
            ca.executar();
        } else if (opcao == 6) {
            CalculoViagem v = new CalculoViagem();
            v.executar();
        } else if (opcao == 7) {
            AluguelCarro a = new AluguelCarro();
            a.executar();
        } else {
            System.out.println("Opção inválida.");
        }
    }
}