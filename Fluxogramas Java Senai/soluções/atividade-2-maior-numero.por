programa {
  funcao inicio() {
    inteiro numeros[5]
    inteiro maior = 0

    para (inteiro i = 0;i < 5; i++){
      escreva("Digite um numero: ")
      leia(numeros[i])
    }

    para (inteiro x = 0; x < 5; x++){
      se (numeros[x] > maior){
        maior = numeros[x]
      }
    }
    escreva("O maior número digitado é o ", maior)
  }
}
