Algoritmo "Aproveitamento do de alunos"
// Caucular a m�dia de um aluno e mostrar em console seu desempenho de acordo com
// a tabela abaixo:
// entre 9 e 10 = A
// entre 8 e 9 = B
// entre 7 e 8 = C
// entre 6 e 7 = D
// entre 5 e 6 = E
// abaixo de 5 = F
Var
   nota1, nota2, media: real


Inicio
      Escreval("--------------------")
      Escreval("Avalia��o de Alunos")
      Escreval("--------------------")
      
      Escreva("Informe a primeira nota: ")
      Leia(nota1)
      Escreva("Infrome a seguda nota: ")
      Leia(nota2)
      
      media <- (nota1 + nota2) / 2
      
      se (media <= 10) e (media >= 9) entao
         Escreva("Aluno com Desempenho A com m�dia ", media:4:1)
      senao
           se(media < 9) e (media >= 8) entao
              Escreva("Aluno com Desempenho B com m�dia ", media:4:1)
           senao
                se (media < 8) e (media >= 7) entao
                   Escreva("Aluno com Desempenho C com m�dia ", media:4:1)
                senao
                     se (media < 7) e (media >= 6) entao
                        Escreva("Aluno com Desempenho D com m�dia ", media:4:1)
                        senao
                             se (media < 6) e (media >=5) entao
                                Escreva("Aluno com Desempenho E com m�dia ", media:4:1)
                             senao
                                  se(media < 5) entao
                                      Escreva("Aluno com Desempenho F com m�dia ", media:4:1)
                                  fimse
                             fimse
                     fimse
                fimse
           fimse
      fimse
      
      


Fimalgoritmo