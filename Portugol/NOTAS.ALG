Algoritmo "Notas"
// Peidr que o usuário informe duas notas de um aluno, calcular a média considerando
// a média 7,0 e informar o status de aprovação ou reprovação do aluno
Var
   nota1, nota2, media: real


Inicio
      Escreval("---- Calculo de Notas ----")
      Escreva("Informe a 1ª nota: ")
      Leia(nota1)
      Escreva("Informe a 2ª nota: ")
      Leia(nota2)
      
      media <- (nota1 + nota2) / 2
      
      Se (media >= 7.0) entao
         Escreval("Media: ", media:5:2)
         Escreva("Aluno Aprovado.")
      Senao
         Escreval("Media: ", media:5:2)
         Escreva("Aluno Reprovado.")
      FimSe
      


Fimalgoritmo