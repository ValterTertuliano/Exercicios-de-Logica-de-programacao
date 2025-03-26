import java.util.Random;
import java.util.Scanner;

public class jogo_adivinhacao {

    public static void main(String[] args) {
        int tentativas = 30;
        Random numero = new Random();
        int EscolhaMaquina = numero.nextInt(21);
        Scanner entrada = new Scanner(System.in);
    
        System.out.println("Bem vindo ao jogo da adivinhação ");
        
        while (tentativas != 0){
            System.out.println("Tentativas Restantes: " + tentativas);
            System.out.println("--------------------------------------");
            System.out.print("Escolha um  número entre 0 a 20: ");
            int escolha = entrada.nextInt();
            if (escolha == EscolhaMaquina){
                System.out.println("\nParabéns você acertou !!!");
                System.out.print("O número escolhido foi " + EscolhaMaquina);
                System.out.println("\n--------------------------------------");
                break;
            } else if (escolha > EscolhaMaquina){
                System.out.println("Palpite muito alto, tente novamente\n");
                tentativas -= 1;
                System.out.println("--------------------------------------");
            } else {
                System.out.println("Palpite muito baixo, tente novamente");
                tentativas -= 1;
                System.out.println("--------------------------------------");
            }

    }

    }
    }    
