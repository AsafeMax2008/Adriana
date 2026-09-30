import java.util.Scanner;

public class Camelo {

    void camelo () {
        Scanner s = new Scanner(System.in);

        int camelo, pfilho, sfilho, tfilho;

        System.out.println("Quantos camelos existem?");
        camelo = s.nextInt();

        camelo = camelo + 1;

        pfilho = camelo / 2;
        sfilho = camelo / 3;
        tfilho = camelo / 9;

        System.out.println("O primeiro filho recebeu " + pfilho + " camelos");
        System.out.println("O segundo filho recebeu " + sfilho + " camelos");
        System.out.println("O terceiro filho recebeu " + tfilho + " camelos");

        s.close();
    }
}

