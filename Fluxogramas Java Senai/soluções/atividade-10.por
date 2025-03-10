programa {
  funcao inicio() {
    inteiro n, contador

    escreva("Digite um número: ")
    leia(n)
    contador = 0
    enquanto (n >= 0)
    {
      contador = contador + n
      n = n - 1 
    }
    escreva("A soma dos primeiros 'n' numeros: ", contador, "\n")
  }
}

  }
}
