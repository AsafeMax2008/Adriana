
import java.util.Scanner;
public class Sistema_de_Login {
    void main(){
        int senha;
        Scanner s= new Scanner(System.in);
        IO.println("Digite uma senha");
        senha= s.nextInt();
        if (senha!=1234) {
            IO.println("Senha está incorreta");

        }else {
            IO.println("A senha está correta");
        }
    }

}
