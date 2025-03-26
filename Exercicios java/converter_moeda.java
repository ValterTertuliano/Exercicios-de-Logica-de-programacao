import java.util.Scanner;

public class converter_moeda {



    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double precoatual = 5.7;
        double convertermoeda;
        double resultado;
        int escolha = 1;

        while (escolha != 0){
            System.out.println("\nBem vindo ao conversor do tio !!!");
            System.out.println("1 - Real para dolar ");
            System.out.println("2 - Dolar para Real");
            System.out.println("0 - SAIR");
            System.out.print("Escolha: ");
            escolha = entrada.nextInt();

            if (escolha == 1){
                System.out.print("\nInforme o valor em Real: ");
                convertermoeda = entrada.nextDouble();
                resultado = convertermoeda / precoatual;
                System.out.println("R$ " + convertermoeda + " são " + resultado + " USD ");
            } else if (escolha == 2) {
                System.out.print("Informe o valor em Dolar: ");
                convertermoeda = entrada.nextDouble();
                resultado = convertermoeda * precoatual;
                System.out.println(convertermoeda + "USD" + " são " + "R$ " + resultado);
                
            } else {
                System.out.println("Escolha uma opção valida (0, 1, 2) ");
            }

        }
    entrada.close();
    }
}