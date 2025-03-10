programa {
  funcao inicio() 
  {
  
    inteiro num

    escreva("Digite um número: ")
    leia(num)

    se ((num % 3 == 0) e (num % 5 == 0))
    {
      escreva("O número é multiplo por 3 e 5")
    }
    senao se (num % 3 == 0) 
    {
      escreva("Multiplo de 3")
    } 
    senao se(num % 5 == 0) 
    {
      escreva("Multiplo de 5")
    }
    senao 
    {
      escreva("Não é multiplo de 3 nem de 5")
    }
    
  }
}
