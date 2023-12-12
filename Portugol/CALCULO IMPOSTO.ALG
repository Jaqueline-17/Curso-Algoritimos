Algoritmo "Calculo Imposto"
// Calcular o Valor do Imposto dos produtos comprados usando como base
// uma porcentagem de 60% pelo valor das compras e devolva os valores
// em console

Var
preco, imposto, preco_final: real


Inicio
      Escreva("Qual o valor dos Produtos? ")
      Leia(preco)
      
      imposto <- (preco * 60) / 100
      preco_final <- preco + imposto
      
      Escreval("O valor corrigido dos produtos é de R$", preco_final:5:2)
      Escreval("O valor do imposto é de R$", imposto:5:2)
      
      


Fimalgoritmo