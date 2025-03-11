programa {
  
  funcao inicio() {
    inteiro opcao=0
    cadeia modalidade
    cadeia resposta

    enquanto(opcao < 5) {
      escreva("\n===== Academia FitLife =====\n")
      escreva("1) Matricular-se em uma modalidade\n")
      escreva("2) Consultar horários\n")
      escreva("3) Ver dicas de treino\n")
      escreva("4) Sair\n")
      escreva("Escolha uma opção: ")
      leia(opcao)

      escolha(opcao) {
        caso 1:
          escreva("\nEscolha a modalidade (Musculação, Yoga, Boxe, Natação): ")
          leia(modalidade)
          escreva("Matrícula confirmada na modalidade: ", modalidade, "!\n")
          pare
        
        caso 2:
          escreva("\nDigite o nome da modalidade para consultar horários: ")
          leia(modalidade)
          escreva("Os horários de ", modalidade, " serão enviados em breve!\n")
          pare
        
        caso 3:
          escreva("\nDeseja receber dicas de treino? (sim/nao): ")
          leia(resposta)
          
          se (resposta == "sim"){
            escreva("Dicas de treino:\n")
            escreva("- Mantenha a postura correta.\n")
            escreva("- Hidrate-se bem.\n")
            escreva("- Siga um plano de treino adequado.\n")
          } senao {
            escreva("Ok! Caso precise de dicas, estamos à disposição.\n")
          }
          pare
        
        caso 4:
          escreva("\nObrigado por usar o Academia FitLife! Até mais.\n")
          pare
          
        caso contrario:
          escreva("\nOpção inválida! Tente novamente.\n")
      }
    }
  }
}
