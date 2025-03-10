programa
{
    funcao inicio()
    {
        real n1, n2, media

        escreva("Digite a primeira nota: ")
        leia(n1)

        escreva("Digite a segunda nota: ")
        leia(n2)

        media = (n1 + n2) / 2

        se (media >= 7)
        {
            escreva("Aluno Aprovado, média: ", media)
        }
        senao se ((media >= 5) e (media < 7))
        {
            escreva("Aluno em recuperação, média: ", media)
        }
        senao
        {
            escreva("Aluno Reprovado, média: ", media)
        }
    }
}

