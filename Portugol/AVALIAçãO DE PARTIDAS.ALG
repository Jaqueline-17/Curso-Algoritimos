Algoritmo "Avalia��o de Partidas"
// Pedir ao usu�rio a quantidade de gols feitos por cada time e devolver em console
// a an�lise dam partida de acordo com os crit�rios:
// diferen�a de at� 3 gols = Partida Normal
// diferen�a igual a 0 = Empate
// diferen�a de mais de 4 gols = Goleada
Var
   bang, mad, media: inteiro


Inicio
      Escreval("--------------------------")
      Escreval("Partida Bangu x Madureira")
      Escreval("--------------------------")
      
      Escreva("Quantos gols o Bangu marcou? ")
      Leia(bang)
      Escreva("Quantos gols o Madureira marcou? ")
      Leia(mad)
      
      media <- abs(bang - mad)

      
      Escolha media
              caso 0
                   Escreval("Diferen�a: ", media)
                   Escreva("Status: Empate")
              caso 1,2,3
                   Escreval("Diferen�a: ", media)
                   Escreva("Status: Partida Normal")
              outrocaso
                   Escreval("Diferen�a: ", media)
                   Escreva("Status: Goleada")
      FimEscolha

Fimalgoritmo