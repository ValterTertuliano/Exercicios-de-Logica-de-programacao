programa {
  funcao inicio() {
    inteiro totalDivisores = 0
    inteiro numero

    escreva("Escreva um número: ")
    leia(numero)
    escreva("O número ", numero, " é divisivel por { ")
    para (inteiro i = 0; i<=numero; i++){
      se (numero % i == 0){
        totalDivisores += 1
        escreva(i, " ")
      } 
    }
    escreva("}\n")
    se (totalDivisores == 2){
      escreva("O número ", numero, " é Primo")
    } senao {
      escreva("O número ", numero, " é Composto")

    }
  }
}
