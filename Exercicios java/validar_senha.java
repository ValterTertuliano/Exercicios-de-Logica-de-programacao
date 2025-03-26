import java.util.Scanner;

public class validar_senha {
    public static void main(String[] args) {
        String senhaarmazenada = "preferidodelas";
        String perguntarsenha;
        String perguntarNome;
        int tentativas = 3;
        Scanner scanner = new Scanner(System.in);


        while (tentativas != 0){
            System.out.println("Bem vindo seu feio !!!");
            System.out.print("Digite seu nome: ");
            perguntarNome = scanner.nextLine();
            System.out.print("Digite senha de acesso: ");
            perguntarsenha = scanner.nextLine();

            if (perguntarsenha.equals(senhaarmazenada)){
                System.out.println("\nAcesso Liberado");
                break;
            } else {
                System.out.println("\nAcesso Negado, restam " + tentativas + " tentaivas.");
                tentativas -= 1;
            }
        }

    }
}
