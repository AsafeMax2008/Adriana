import java.util.Scanner;

public class Compra_Desconto {

    public static void main(String[] args) {

        double desconto;
        double SomaValores;
        double ValorFinal;

        int arroz;
        int feijao;
        int oleoSoja;
        int acucar;
        int cafe;
        int macarrao;
        int farinha;
        int fuba;
        int molho;
        int sal;

        Scanner s = new Scanner(System.in);

        IO.println("Digite o preço pago no Arroz");
        arroz = s.nextInt();
        SomaValores = arroz;

        IO.println("Digite o preço pago no Feijão");
        feijao = s.nextInt();
        SomaValores = SomaValores + feijao;

        IO.println("Digite o preço pago no Óleo de soja");
        oleoSoja = s.nextInt();
        SomaValores = SomaValores + oleoSoja;

        IO.println("Digite o preço pago no Açúcar");
        acucar = s.nextInt();
        SomaValores = SomaValores + acucar;

        IO.println("Digite o preço pago no Café Torrado e Moído");
        cafe = s.nextInt();
        SomaValores = SomaValores + cafe;

        IO.println("Digite o preço pago no Macarrão");
        macarrao = s.nextInt();
        SomaValores = SomaValores + macarrao;

        IO.println("Digite o preço pago na Farinha");
        farinha = s.nextInt();
        SomaValores = SomaValores + farinha;

        IO.println("Digite o preço pago no Fubá");
        fuba = s.nextInt();
        SomaValores = SomaValores + fuba;

        IO.println("Digite o preço pago no Molho de tomate");
        molho = s.nextInt();
        SomaValores = SomaValores + molho;

        IO.println("Digite o preço pago no Sal");
        sal = s.nextInt();
        SomaValores = SomaValores + sal;

        // Desconto de 10% para compras acima de R$ 100
        if (SomaValores > 100) {
            desconto = SomaValores * 0.10;
            ValorFinal = SomaValores - desconto;
        } else {
            desconto = 0;
            ValorFinal = SomaValores;
        }

        IO.println("=========== RECIBO ===========");
        IO.println();
        IO.println("1 Arroz R$ " + arroz);
        IO.println("1 Feijão R$ " + feijao);
        IO.println("1 Óleo de Soja R$ " + oleoSoja);
        IO.println("1 Açúcar R$ " + acucar);
        IO.println("1 Café Torrado e Moído R$ " + cafe);
        IO.println("1 Macarrão R$ " + macarrao);
        IO.println("1 Farinha R$ " + farinha);
        IO.println("1 Fubá de Milho R$ " + fuba);
        IO.println("1 Molho de Tomate R$ " + molho);
        IO.println("1 Sal R$ " + sal);

        IO.println();
        IO.println("Subtotal: R$ " + SomaValores);
        IO.println("Desconto: R$ " + desconto);
        IO.println("Total: R$ " + ValorFinal);
    }
}

