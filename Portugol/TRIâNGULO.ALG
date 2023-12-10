Algoritmo "Triângulo"
// Disciplina   : [Linguagem e Lógica de Programação] 
// Professor   : Antonio Carlos Nicolodi 
// Fazer o cauculo de Três lados de um triângulo L1, L2, L3 e definir se é
// um triângulo equilátero (EQ) ou um triângulo escaleno (ES), e se é capaz
// de formar um triângulo(TRI).
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
      
      Escreval("Pode formar um TRIÂNGULO? ", TRI)
      Escreval("O Triângulo é EQUILATERO? ", EQ)
      Escreval("O Triângulo é ESCALENO? ", ES)




Fimalgoritmo