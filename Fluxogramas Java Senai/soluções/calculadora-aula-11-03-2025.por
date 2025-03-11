programa {

  funcao real soma(real n1, real n2){
    retorne n1 + n2
  }
  
  funcao real subtrair(real n1, real n2){
    retorne n1 - n2
  }

  funcao real multiplicar(real n1, real n2){
    retorne n1 * n2
  }

  funcao real dividir(real n1, real n2){
    se ((n1==0) ou (n2==0)) {
      escreva("Impossivel dividir por zero !!!")
  } senao{
    retorne n1 / n2
  }
  }


  funcao inicio() {
    real n1, n2
    inteiro op

    enquanto(op!=0){
      escreva("\nBem vindo a calculadora do tio !!!\n")
      escreva("1 - somar\n")
      escreva("2 - subtrair\n")
      escreva("3 - multiplicar\n")
      escreva("4 - dividir\n")
      escreva("0 - sair\n")
      escreva("Escreva a operação a ser realizada: ")
      leia(op)

      escolha(op){
        caso 1:
        escreva("Digite o primeiro numero:\n")
        leia(n1)
        escreva("Digite o segundo numero:\n")
        leia(n2)
        escreva("A soma de ", n1, " + ", n2, " é ", soma(n1, n2))
        pare

        caso 2:
        escreva("Digite o primeiro numero:\n")
        leia(n1)
        escreva("Digite o segundo numero:\n")
        leia(n2)
        escreva("A subtração de ", n1, " - ", n2, " é ", subtrair(n1, n2))
        pare

        caso 3:
        escreva("Digite o primeiro numero:\n")
        leia(n1)
        escreva("Digite o segundo numero:\n")
        leia(n2)
        escreva("A multiplicação de ", n1, " * ", n2, " é ", multiplicar(n1, n2))
        pare
        
        caso 4:
        escreva("Digite o primeiro numero:\n")
        leia(n1)
        escreva("Digite o segundo numero:\n")
        leia(n2)
        escreva("A divisão de ", n1, " / ", n2, " é ", dividir(n1, n2))
        pare

        caso 0:
        escreva("Encerrando execução")
  
        pare

        
      }
    }
  }
}
