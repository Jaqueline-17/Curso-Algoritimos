Algoritmo "Departamento de tr�nsito"
// Inserir io ano atual e o ano de nascimento e verificar se a pessoa est� apta
// a dirigir conforme esteja na maior idade, dar a resposta em console
Var
   nasc, ano_atual, idade: inteiro


Inicio
   Escreval("****Departamento de Tr�nsito****")
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
      Escreva("N�o est� apto a dirigir")
   FimSe


Fimalgoritmo