import java.util.Scanner;

public class traducao_de_linguagem {

    public static void main(String[] args) {
        int escolha = 0;
        while (escolha != 4) {
            System.out.println("\nBem-vindo ao menu");
            System.out.println("1 - Opçao 1");
            System.out.println("2 - Opçao 2");
            System.out.println("3 - Opçao 3");
            System.out.println("4 - Sair\n");
            Scanner ler = new Scanner(System.in);
            System.out.print("Escolha uma opção: ");
            escolha = ler.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Você escolheu a opção 1");
                    break;
                case 2:
                System.out.println("Você escolheu a opção 2");
                break;

                case 3:
                System.out.println("Você escolheu a opção 3");
                break;

                case 4:
                System.out.println("Você escolheu sair")
                ;
                break;

                default:
                System.out.println("Escolha uma opção valida");
                    break;
            }
        }
    }
    
}