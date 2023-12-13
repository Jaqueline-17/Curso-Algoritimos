Algoritmo "Departamento de trânsito"
// Inserir io ano atual e o ano de nascimento e verificar se a pessoa está apta
// a dirigir conforme esteja na maior idade, dar a resposta em console
Var
   nasc, ano_atual, idade: inteiro


Inicio
   Escreval("****Departamento de Trânsito****")
   Escreva("Ano de nascimento: ")
   Leia(nasc)
   Escreva("Ano atual: ")
   Leia(ano_atual)

   idade <- ano_atual - nasc
   Se (idade >= 18) entao
      Escreval("Idade: ", idade)
      Escreva("Apto a dirigir.")
   senao
      Escreval("Idade: ", idade)
      Escreva("Não está apto a dirigir")
   FimSe


Fimalgoritmo