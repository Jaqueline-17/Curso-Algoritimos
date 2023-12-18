Algoritmo "Melhor Aluno"
// Solicitar ao usuário quantos alunos a escola tem, solicitar o nome e a nota
// de cada aluno e devolover o nome e o aproveitamento do melhor aluno informado
Var
  alunos, contador: inteiro
  nome_aluno, melhor_aluno: caracter
  nota_aluno, maior_nota: real


Inicio

      Escreval("----------------")
      Escreval("Escolha de Auno")
      Escreval("----------------")
      
      Escreva("Quantos aludos deseja adicionar? ")
      leia(alunos)
      
      contador <- 0
      
      Enquanto contador < alunos faca
          Escreval("-----------")
          Escreval("Aluno: ")
          Leia(nome_aluno)
          Escreval("Nota: ")
          Leia(nota_aluno)

          contador <- contador + 1
          
          Se(nota_aluno > maior_nota) entao
             melhor_aluno <- nome_aluno
             maior_nota <- nota_aluno
          FimSe
      FimEnquanto
      
      LimpaTela
      
      Escreval("Aluno com a melhor nota: ", melhor_aluno)
      Escreval("Com o desempenho de: ", maior_nota:4:1)


Fimalgoritmo