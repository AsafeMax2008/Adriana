import java.util.Scanner;
public class Compra_Desconto {
    void main() {
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
        SomaValores = (SomaValores) + (arroz);
        IO.println("Digite o preço pago no Feijão");
        feijao = s.nextInt();
        SomaValores = (SomaValores) + (feijao);
        IO.println("Digite o preço pago no Óleo de soja");
        oleoSoja=s.nextInt();
        SomaValores = (SomaValores) + (oleoSoja);
        IO.println("Digite o preço pago no Açúcar");
        acucar=s.nesxtInt();
        SomaValores = (SomaValores) + (acucar);
        IO.println("Digite o preço pago no Café Torrado e Moído");
        cafe=s.nextInt();
        SomaValores = (SomaValores) + (cafe);
        IO.println("Digite o preço pago no Macarrão");
       macarrao=s.nextInt();
        SomaValores = (SomaValores) + (macarrao);
        IO.println("Digite o preço pago na Farinha de Trigo ou Mandioca");
        farinha=s.nextInt();
        SomaValores= (SomaValores)+ (farinha);
        IO.println("Digite o preço pago no Fubá");
        fuba=s.nextInt();
        SomaValores= (SomaValores)+ (fuba);
        IO.println("Digite o preço pago no Molho ou Extrato de tomate");
        molho=s.nextInt();
        SomaValores= (SomaValores)+(molho);
        IO.println("Digite o preço pago no Sal");
        sal=s.nextInt();
        SomaValores = (SomaValores) + (sal);
        if(SomaValores>100){
            ValorFinal=SomaValores*(10/100);
        }



    }
}
