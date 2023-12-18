Algoritmo "Contagem Inteligente"
// Solicitar ao usuário o número inicial e o número final de uma contegem e
// devolver o resultado em console, detectando se a contagem é crescente
// ou decrescente
Var
   comeco, fim, contador: inteiro


Inicio
      Escreval("--------------------")
      Escreval("Contagem Inteligente")
      Escreval("--------------------")
      
      Escreva("Informe o começo da contagem: ")
      Leia(comeco)
      Escreva("Informe o fim da contagem: ")
      Leia(fim)


      Se (comeco < fim) entao
         Enquanto comeco <= fim Faca
             Escreva(comeco, "...")
             comeco <- comeco + 1
         FimEnquanto
      senao
           Enquanto comeco >= fim Faca
             Escreva(comeco, "...")
             comeco <- comeco - 1
           FimEnquanto
      FimSe

Fimalgoritmo