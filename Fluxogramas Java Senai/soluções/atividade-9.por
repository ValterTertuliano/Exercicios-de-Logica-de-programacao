programa {
  funcao inicio() {
    inteiro n
  
    escreva("Digite o valor de saque: ")
    leia(n)
    se (n % 10 == 0){
      escreva("Saque liberado")
    }
    senao {
      escreva("Só é permitido saques multiplos de 10.")
    }
  }
}
