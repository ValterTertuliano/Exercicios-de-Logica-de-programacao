programa {
  funcao inicio() {
    inteiro menor
    inteiro maior

    escreva("Informe um número: ")
    leia(maior)
    escreva("Informe um número: ")
    leia(menor)

    se (maior > menor){
      para (maior; maior >= menor; menor++){
        escreva(menor, ", ")
      } 
      } senao se (menor > maior) {
        para (menor; menor >= maior; maior++){
          escreva(maior, ", ")
        }
    } senao{
      escreva("Ambos os numeros são iguais")
    }
    
  }
}
