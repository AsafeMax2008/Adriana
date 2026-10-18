import java.util.Scanner;


    public class CompraDesconto {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            double arroz, feijao, oleo, acucar, cafe, macarrao, farinha, fuba, molho, sal;
            double soma, desconto, valorFinal;

            System.out.println("Preço do Arroz tipo 1 (5 kg):");
            arroz = s.nextDouble();

            System.out.println("Preço do Feijão carioca (1 kg):");
            feijao = s.nextDouble();

            System.out.println("Preço do Óleo de soja (900 ml):");
            oleo = s.nextDouble();

            System.out.println("Preço do Açúcar refinado (1 kg):");
            acucar = s.nextDouble();

            System.out.println("Preço do Café torrado e moído (500 g):");
            cafe = s.nextDouble();

            System.out.println("Preço do Macarrão espaguete (500 g):");
            macarrao = s.nextDouble();

            System.out.println("Preço da Farinha de trigo (1 kg):");
            farinha = s.nextDouble();

            System.out.println("Preço do Fubá de milho (500 g):");
            fuba = s.nextDouble();

            System.out.println("Preço do Molho de tomate (300 g):");
            molho = s.nextDouble();

            System.out.println("Preço do Sal refinado (1 kg):");
            sal = s.nextDouble();
            soma = arroz + feijao + oleo + acucar + cafe + macarrao + farinha + fuba + molho + sal;

            if (soma > 100) {
                desconto = soma * 0.10;
            } else {
                desconto = 0;
            }
            valorFinal = soma - desconto;

            System.out.println();
            System.out.println("================ CUPOM ================");
            System.out.printf("%-26s %-8s %s%n", "Item", "Qtd", "Preço parcial");
            System.out.println("---------------------------------------");
            System.out.printf("%-26s %-8s R$ %.2f%n", "Arroz tipo 1", "5 kg", arroz);
            System.out.printf("%-26s %-8s R$ %.2f%n", "Feijão carioca", "1 kg", feijao);
            System.out.printf("%-26s %-8s R$ %.2f%n", "Óleo de soja", "900 ml", oleo);
            System.out.printf("%-26s %-8s R$ %.2f%n", "Açúcar refinado", "1 kg", acucar);
            System.out.printf("%-26s %-8s R$ %.2f%n", "Café torrado e moído", "500 g", cafe);
            System.out.printf("%-26s %-8s R$ %.2f%n", "Macarrão espaguete", "500 g", macarrao);
            System.out.printf("%-26s %-8s R$ %.2f%n", "Farinha de trigo", "1 kg", farinha);
            System.out.printf("%-26s %-8s R$ %.2f%n", "Fubá de milho", "500 g", fuba);
            System.out.printf("%-26s %-8s R$ %.2f%n", "Molho de tomate", "300 g", molho);
            System.out.printf("%-26s %-8s R$ %.2f%n", "Sal refinado", "1 kg", sal);
            System.out.println("---------------------------------------");
            System.out.printf("Subtotal:      R$ %.2f%n", soma);
            System.out.printf("Desconto:      R$ %.2f%n", desconto);
            System.out.printf("Total a pagar: R$ %.2f%n", valorFinal);
        }
    }

