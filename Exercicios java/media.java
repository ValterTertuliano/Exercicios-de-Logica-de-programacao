import java.util.Scanner;
class media {
    public static void main(String[] args) {
        // declara as variaveis
        Double n1, n2, n3, media;
        
        // Inicia o scanner para entrada de dados
        Scanner ler = new Scanner(System.in);
        
        // entrada
        System.out.print("Digite a 1° nota: ");
        n1 = ler.nextDouble();
        System.out.print("Digite a 2° nota: ");
        n2 = ler.nextDouble();
        System.out.print("Digite a 3° nota: ");
        n3 = ler.nextDouble();
        
        // processar 
        media = (n1 + n2 + n3) / 3;
        
        // saida
        if (media >= 70){
            System.out.print(" --- Aluno aprovado --- ");
            System.out.println("Media: " + media);
        } else if (media < 7 && media >= 3){
            System.out.print(" --- Aluno em recuperacao --- ");
            System.out.println("\nMedia: " + media);
            
        }else {
            System.out.print(" --- Aluno reprovado --- ");
            System.out.print("Media: " + media);
        }
        ler.close();
    }


}
