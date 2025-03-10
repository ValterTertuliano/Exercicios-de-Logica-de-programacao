programa
{
    funcao inicio()
    {
        inteiro num

        escreva("Informe um número inteiro: ")
        leia(num)

        se (num == 0)
        {
            escreva("O número digitado é zero.")
        }
        senao
        {
            se (num > 0)
            {
                escreva("O ", num, " é positivo.")
            }
            senao
            {
                escreva("O ", num, " é negativo.")
            }
        }
    }
}
