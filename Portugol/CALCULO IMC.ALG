Algoritmo "Calculo IMC"

Var
   M, A, IMC: real

Inicio
      Escreva("Massa (KG): ")
      Leia(M)
      Escreva("Altura (m): ")
      Leia(A)
      
      IMC <- M / (A ^ 2)
      
      Escreval("IMC: ", IMC:5:2)
      Se (IMC >= 18.5) e (IMC < 25) entao
           Escreva("Peso ideal")
      Senao
           Escreva("Fora do peso ideal")
      FimSe
      
      


Fimalgoritmo