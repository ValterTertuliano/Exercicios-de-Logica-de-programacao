import java.util.Scanner; // Importação da classe Scanner para entrada de dados

public class descontos {
    
    public static void main(String[] args) {
        
        // Declaração das variáveis necessárias para cálculo dos descontos
        double obterPreco;
        int obterQuantidade;
        double obterDesconto;
        double totalCompra;
        double valorFinal;
        double calcularDesconto;
        int escolha = 0;

        // Loop infinito para manter o programa rodando até que o usuário escolha finalizar
        while (true) {
            
            // Exibição do menu de opções
            System.out.println("Bem vindo !!!");
            System.out.println("1 - Calcular desconto ");    
            System.out.println("2 - Finalizar operação ");    

            // Instanciação do Scanner para entrada de dados
            Scanner entrada = new Scanner(System.in);
            System.out.print("Escolha uma opção: ");
            escolha = entrada.nextInt();

            // Estrutura de decisão para tratar a escolha do usuário
            switch (escolha) {
                case 1:
                    System.out.println("Calculadora de descontos ");
                    
                    // Solicitação do valor total da compra e quantidade de itens ao usuário
                    System.out.print("\nInforme o valor total da compra: ");
                    totalCompra = entrada.nextDouble();
                    System.out.print("Informe a quantidade de itens: ");
                    obterQuantidade = entrada.nextInt();
                    
                    // Aplicação de um desconto adicional de 2% caso o valor total da compra seja superior a R$500
                    if (totalCompra > 500){
                        totalCompra = (totalCompra * 0.02) + totalCompra;
                    }

                    // Verificação da quantidade de itens para aplicar os descontos apropriados
                    if (obterQuantidade < 5) {
                        System.out.println("Não houve descontos");
                        System.out.println("Valor final: " + totalCompra);

                    } else if (obterQuantidade >= 5 && obterQuantidade <= 10) {
                        obterDesconto = 5.0 / 100; // Definição do percentual de desconto (5%)
                        calcularDesconto = totalCompra * obterDesconto; // Cálculo do valor do desconto
                        valorFinal = totalCompra - calcularDesconto; // Cálculo do valor final após o desconto

                        // Exibição do desconto concedido e do valor final
                        System.out.println("Você ganhou 5% de desconto, sua compra ficou " + calcularDesconto + " mais barata ");
                        System.out.println("Valor final: " + valorFinal);

                    } else if (obterQuantidade > 10 && obterQuantidade <= 20) {
                        obterDesconto = 10.0 / 100; // Definição do percentual de desconto (10%)
                        calcularDesconto = totalCompra * obterDesconto; 
                        valorFinal = totalCompra - calcularDesconto;

                        System.out.println("Você ganhou 10% de desconto, sua compra ficou " + calcularDesconto + " mais barata ");
                        System.out.println("Valor final: " + valorFinal);

                    } else {
                        obterDesconto = 15.0 / 100; // Definição do percentual de desconto (15%)
                        calcularDesconto = totalCompra * obterDesconto;
                        valorFinal = totalCompra - calcularDesconto;

                        System.out.println("Você ganhou 15% de desconto, sua compra ficou " + calcularDesconto + " mais barata ");
                        System.out.println("Valor final: " + valorFinal);
                    }

                    break;
            
                case 2:
                    // Mensagem de despedida e finalização do programa
                    System.out.println("Muito obrigado por estar aqui !!!");
                    System.out.println("Finalizando...");
                    break;

                default:
                    // Caso o usuário insira uma opção inválida, avisa sobre o erro
                    System.out.println("Escreva uma opção valida - digite 1 ou 2 ");
                    break;
            }
        }
    }
}
