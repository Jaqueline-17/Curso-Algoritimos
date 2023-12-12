Algoritmo "Converspr de Temperatura"
// Fazer um programa que converta a temperatura de Fahrenheit para celcius

Var
far, cel: real


Inicio
      Escreva("Qual a temperatura em Fahrenheit? ")
      leia(far)
      
      cel <- (far - 32) / 1.8
      
      Escreva("O resultado da conversão é de ", cel:4:1, "°") // formatação de número flutuante

Fimalgoritmo