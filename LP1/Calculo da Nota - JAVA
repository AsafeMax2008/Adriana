public class Main {
    public static void main(String[] args) {
    double P1, E1, E2, X, SUB, API, EXF;
    double notaBase, notaAntesAPI, notaFinal;
    P1 = 7;
    E1 = 8;
    E2 = 6;
    X = 0;
    SUB = 5;
    API = 8;
    EXF = 6;

    System.out.println ("Calculo da Nota");
    System.out.println ();

    notaBase = (P1*0.5)+(E1*0.2)+(E2*0.3)+X+(SUB*0.15);
    notaAntesAPI = notaBase*0.5;

    if(notaBase>5.9){
       notaAntesAPI = notaAntesAPI + (API*0.5);
    }
    if(EXF> notaAntesAPI){
        notaFinal = EXF;
    } else {
        notaFinal = notaAntesAPI;
    }

    System.out.println("NotaFinal: " + notaFinal);
    if(notaFinal>=6.0){
        System.out.println("SITUAÇÃO: O aluno está APROVADO");
    } else {
        System.out.println("SITUAÇÃO: O aluno está REPROVADO");
    }
    
  }
}
