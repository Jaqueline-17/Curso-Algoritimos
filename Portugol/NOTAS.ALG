Algoritmo "Notas"
// Peidr que o usu�rio informe duas notas de um aluno, calcular a m�dia considerando
// a m�dia 7,0 e informar o status de aprova��o ou reprova��o do aluno
Var
   nota1, nota2, media: real


Inicio
      Escreval("---- Calculo de Notas ----")
      Escreva("Informe a 1� nota: ")
      Leia(nota1)
      Escreva("Informe a 2� nota: ")
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