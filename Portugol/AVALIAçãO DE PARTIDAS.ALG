Algoritmo "Avaliação de Partidas"
// Pedir ao usuário a quantidade de gols feitos por cada time e devolver em console
// a análise dam partida de acordo com os critérios:
// diferença de até 3 gols = Partida Normal
// diferença igual a 0 = Empate
// diferença de mais de 4 gols = Goleada
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
                   Escreval("Diferença: ", media)
                   Escreva("Status: Empate")
              caso 1,2,3
                   Escreval("Diferença: ", media)
                   Escreva("Status: Partida Normal")
              outrocaso
                   Escreval("Diferença: ", media)
                   Escreva("Status: Goleada")
      FimEscolha

Fimalgoritmo