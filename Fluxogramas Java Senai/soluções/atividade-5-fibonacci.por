programa {
  funcao inicio() {
    inteiro primeiro = 0
    inteiro segundo = 1
    inteiro fibo
    inteiro n = 2
    escreva("Sequencia de Fibonnaci = { ")
    escreva(primeiro, ", ")
    escreva(segundo, ", ")
    enquanto (verdadeiro){
      fibo = primeiro + segundo
      escreva(fibo, ", ")
      primeiro = segundo
      segundo = fibo
      
      se (fibo >= 500){
        pare
      }

      n += 1
    }
    escreva("... }")
escreva("\nO ", n, "° número de fibonacci é ", fibo) 
  } 
}
