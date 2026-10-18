import java.util.Scanner;

public class Multiplo {
    public void executar() {
        // o mesmo código do exercício
        Scanner s = new Scanner(System.in);
        int num1, num2;
        System.out.println("Digite o primeiro número: ");
        //s.nextInt() espera o usuário digitar um inteiro e devolve esse valor. O = guarda o valor na caixinha.
        num1 = s.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = s.nextInt();

        //Um = só guarda valor, e dois == comparam
        if (num2 == 0){
            System.out.println("Não é possível verificar: o segundo número deve ser diferente de 0");
        }
        //num1 % num2 é o resto da divisão de num1 por num2
        //else if cria uma terceira possibilidade
        else if (num1 % num2 == 0){
            System.out.println("O primeiro número É multiplo do segundo");
        }else {
            System.out.println("O primeiro número NÃO é multiplo do segundo");
        }
    }
}
