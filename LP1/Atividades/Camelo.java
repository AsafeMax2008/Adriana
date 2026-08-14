import java.util.Scanner;


public class Camelo {
}
void main () {
    Scanner s= new Scanner(System.in);
    int camelo, pfilho, sfilho, tfilho;
    IO.println("quantos camelos existem?");
    camelo = s.nextInt();
    if (camelo % 1 == 0) ;
    camelo = camelo + 1;
    pfilho = (camelo / 2);
    sfilho = (camelo / 3);
    tfilho = (camelo / 9);

    IO.println("O primeiro filho recebeu " + pfilho + " camelos");

    IO.println("O segundo filho recebeu " + sfilho + " camelos");

    IO.println("O terceiro filho recebeu " + tfilho + " camelos");



}










