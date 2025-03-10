programa
{
funcao logico login(cadeia user, inteiro pass)
{
    se (user == "cliente" e pass == 1234)
    {
        retorne verdadeiro
    }
    senao
    {
        retorne falso
    }
}

funcao logico validarSaque(inteiro saldoInicial, inteiro valorSaque){
  se ((valorSaque % 10 == 0) e (valorSaque <= saldoInicial)){
    retorne verdadeiro
  } senao {
    retorne falso
  }
}

funcao logico validarDeposito(inteiro valorDeposito)
{
  se (valorDeposito > 0) {
    retorne verdadeiro
  }
  senao {
    retorne falso
  }
}



    funcao inicio()
    {
        cadeia user
        inteiro senha, opcao, saldo=1000, deposito, saque

        escreva("Informe usuario: ")
        leia(user)
        escreva("Informe senha: ")
        leia(senha)

        se (login(user, senha)){
          escreva("Acesso liberado")
      
        enquanto (opcao != 4){
        escreva("\n\nEscolha uma das opções:\n")
        escreva("1 - Consultar saldo\n")
        escreva("2 - Depositar dinheiro\n")
        escreva("3 - sacar dinheiro\n")
        escreva("4 - sair\n")
        escreva("\nDigite o número da opção desejada: ")
        leia(opcao)

        se (opcao == 1){
          escreva("\nSeu saldo disponivel: ", saldo)
        }
        senao se (opcao ==2){
          escreva("\nInforme o valor a ser depositado: ")
          leia(deposito)
          se (validarDeposito(deposito)){
            saldo = saldo + deposito
            escreva("\nValor depositado com sucesso, seu novo saldo: ", saldo)
          } senao {
            escreva("\nValor para deposito invalido: ", deposito)
          }
        }
        senao se (opcao == 3){
          escreva("\nInforme o valor que deseja sacar: ")
          leia(saque)
          se (validarSaque(saldo, saque)){
            escreva("\nsaque liberado com sucesso !!!")
            saldo = saldo - saque
            escreva("\nSeu novo saldo: ", saldo)
          } senao {
            escreva("\nFalha no saque: Saque deve ser multiplo de 10 e maior que o saldo atual")
          }
        }

        }
          }
    }
}
