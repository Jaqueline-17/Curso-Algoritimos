Algoritmo "Tri�ngulo"
// Disciplina   : [Linguagem e L�gica de Programa��o] 
// Professor   : Antonio Carlos Nicolodi 
// Fazer o cauculo de Tr�s lados de um tri�ngulo L1, L2, L3 e definir se �
// um tri�ngulo equil�tero (EQ) ou um tri�ngulo escaleno (ES), e se � capaz
// de formar um tri�ngulo(TRI).
Var
L1, L2, L3: real
EQ, ES, TRI: Logico


Inicio
      Escreva("Digite o primeiro Lado ")
      leia(L1)
      Escreva("Digite o segundo Lado ")
      leia(L2)
      Escreva("Digite o terceiro Lado ")
      leia(L3)
      
      TRI <- (L1 < L1 + L3) e (L2 < L1 + L3) e (L3 < L1 + L2)
      EQ <- (L1 = L2) e (L2 = L3)
      ES <- (L1 <> L2) e (L2 <> L3) e (L1 <> L3)
      
      Escreval("Pode formar um TRI�NGULO? ", TRI)
      Escreval("O Tri�ngulo � EQUILATERO? ", EQ)
      Escreval("O Tri�ngulo � ESCALENO? ", ES)




Fimalgoritmo