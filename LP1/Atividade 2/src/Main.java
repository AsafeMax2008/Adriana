import java.util.Scanner;

public class Main {

    void main() {
        int num;
        Scanner s = new Scanner(System.in);
        IO.println("Qual você deseja executar?");
        IO.println();
        IO.println("1 - Aluguel de carro");
        IO.println("2 - Sistema de Login Simplificado");
        IO.println("3 - Compra com desconto");
        IO.println("4 - Temperatura");
        IO.println("5 - Calculadora de viagem");
        IO.println("6 - Verificação de Múltiplo");
        IO.println("7 - Os trinta e cinco camelos");

        num = s.nextInt();

        if (num == 1) {
            aluguelCarro m = new aluguelCarro();
            m.aluguelcarro();

        } else if (num == 2) {
            Sistema_de_Login l = new Sistema_de_Login();
            l.sistema_de_login();

        } else if (num == 3) {
            Compra_Desconto c = new Compra_Desconto();
            c.compra ();

        } else if (num == 4) {
            tempsjc t = new tempsjc();
            t.temperatura();

        } else if (num == 5) {
            calculoviagem i = new calculoviagem();
            i.viagem();

        } else if (num == 6) {
            Multiplo v = new Multiplo();
            v.multiplo();

        } else if (num == 7) {
            Camelo a = new Camelo();
            a.camelo();
        }
        }
    }
