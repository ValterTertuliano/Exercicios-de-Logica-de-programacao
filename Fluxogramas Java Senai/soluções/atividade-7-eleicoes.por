programa {
  funcao inicio() {
  inteiro candidato_A = 0
  inteiro candidato_B = 0
  inteiro candidato_C = 0
  inteiro totalEleitores
  inteiro escolher

  escreva("Informe o número de eleitore: ")
  leia(totalEleitores)
  para (inteiro i = 0; i < totalEleitores; i++){
    escreva("Escolha um dos seguintes candidatos: \n")
    escreva("Digite 1 - Candidato A\n")
    escreva("Digite 2 - Candidato B\n")
    escreva("Digite 3 - Candidato C\n")
    escreva("Faça seu voto: ")
    leia(escolher)
    se (escolher == 1){
      candidato_A += 1
    } senao se (escolher == 2){
      candidato_B += 1
    } senao se (escolher == 3){
      candidato_C += 1
    } senao {
      escreva("Voto anulado !!!\n")
    }
  }
  escreva("O candidato A teve ", candidato_A, " votos\n")
  escreva("O candidato B teve ", candidato_B, " votos\n")
  escreva("O candidato C teve ", candidato_C, " votos\n")

  }
}
