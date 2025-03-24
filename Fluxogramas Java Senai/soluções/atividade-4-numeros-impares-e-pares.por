programa {
  funcao inicio() {
    inteiro numeros[10]
    inteiro totalPar = 0
    inteiro totalImpar = 0

    para (inteiro i = 0; i < 10; i++){
      escreva("Digite um número: ")
      leia(numeros[i])
    }

    para (inteiro i = 0; i < 10; i++){
      se (numeros[i] % 2 == 0){
        totalPar += 1
        escreva("O número ", numeros[i], " é PAR\n")
      } senao {
        totalImpar += 1
        escreva("O número ", numeros[i], " é IMPAR\n")

      }
    }
    escreva("Foram escritos ", totalPar, " numeros PARES\n")
    escreva("Foram escritos ", totalImpar, " numeros IMPARES")
  }
}
