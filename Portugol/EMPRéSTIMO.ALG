Algoritmo "Empréstimo"
// Escrever um algorítimo que receba o valor do empréstimo, que receba a
// quantidade de parcelas, faça o cálculo do empréstimo que tem um adicional
// de 20% e devolva em console o resultado
Var
parcelas, valor, valor_final, adicional, valor_parcelas: real

Inicio

      Escreva("Qual o valor do empréstimo? R$" )
      leia(valor)
      
      Escreva("Pagamento em quantas parcelas? ")
      Leia(parcelas)
      
      adicional <- (valor * 20) / 100
      valor_final <- valor + adicional
      valor_parcelas <- valor / parcelas
      
      limpatela
      
      Escreval("O valor final do empréstimo é de R$", valor_final:5:2)
      Escreval("Adicional de 20% é igual a R$", adicional:4:2)
      Escreval("Será pago em ", parcelas, "x de R$", valor_parcelas:5:2)


Fimalgoritmo