programa {
  funcao inicio() {
    cadeia usuario, id_usuario

    inteiro senha, id_senha

    usuario = "admin"
    senha = 1234

    escreva("Digite seu nome de usuario: ")
    leia(id_usuario)
    escreva("Digite sua senha de acesso: ")
    leia(id_senha)

    se ( (usuario == id_usuario) e (senha == id_senha)){
      escreva("\nAcesso Liberado !!!")
      escreva("\nBem vindo ", usuario)
    } senao {
      escreva("\nAcesso negado !!!\n")
    }

  }
}
