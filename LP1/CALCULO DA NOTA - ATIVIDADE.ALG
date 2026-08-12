algoritmo "Calculo da nota - ATIVIDADE"

var
   P1, E1, E2, X, SUB, API, EXF: real
   notaBase, notaAntesAPI, notaFinal: real

inicio

   escreval("CALCULO DA NOTA")
   escreval()
   
   escreva("Digite a nota da P1: ")
   leia(P1)

   escreva("Digite a nota da E1: ")
   leia(E1)
   
   escreva("Digite a nota da E2: ")
   leia(E2)

   escreva("Digite a nota das atividades extras (X): ")
   leia(X)

   escreva("Digite a nota da prova substitutiva (SUB): ")
   leia(SUB)

   escreva("Digite a nota da API: ")
   leia(API)

   escreva("Digite a nota do Exame Final (EXF): ")
   leia(EXF)


   notaBase <- P1 * 0.5 + E1 * 0.2 + E2 * 0.3 + X + SUB * 0.15

   notaAntesAPI <- notaBase * 0.5

   se notaBase > 5.9 entao
      notaAntesAPI <- notaAntesAPI + API * 0.5
   fimse

   se EXF > notaAntesAPI entao
      notaFinal <- EXF
   senao
      notaFinal <- notaAntesAPI
   fimse

   escreval()
   escreval("Nota final: ", notaFinal:0:2)

   se notaFinal >= 6.0 entao
      escreval("Situacao: O aluno está APROVADO")
   senao
      escreval("Situacao: O aluno está REPROVADO")
   fimse

fimalgoritmo