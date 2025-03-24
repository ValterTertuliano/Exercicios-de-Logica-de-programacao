programa {
  funcao inicio() {
    
    real pop_a = 80000
    real pop_b = 200000
    real taxa_a = 3 / 100
    real taxa_b = 1.5 / 100
    inteiro anos = 0

    enquanto (pop_b >= pop_a){
      pop_a += pop_a * taxa_a
      pop_b += pop_b * taxa_b
      anos +=1
    }
    escreva("A população do país A vai levar ", anos, " anos")
    escreva("\nPara igualar a ou ultrapassar a população B")

  }
}
