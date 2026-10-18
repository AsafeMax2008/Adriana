import java.util.Scanner;
public class SistemaLogin {

    public void executar() {
        Scanner s = new Scanner(System.in);
        int SenhaCorreta = 1234;
        int SenhaDigitada;
        System.out.println("Digite a senha:");
        SenhaDigitada = s.nextInt();

        if (SenhaDigitada == SenhaCorreta) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");

        }

    }
}
