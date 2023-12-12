Algoritmo "Conversor de Moeda"
// Fazer um programa que receba um valor em reais e converta para o dólar usando
// como parâmetro o dólar estando em $4,90.

Var
  reais, dolar: real


Inicio
     Escreva("Qual o valor em reais para ser convertido? ")
     Leia(reais)
     
     dolar <- reais / 4.90
     
     Escreva("O valor em dólar é de: U$ ", dolar:2:2)


Fimalgoritmo