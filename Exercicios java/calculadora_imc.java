import java.util.Scanner;

public class calculadora_imc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual é seu peso kg: ");
        Double peso = scanner.nextDouble();

        System.out.print("Qual é sua altura em Metro: ");
        Double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("O seu IMC é %.1f.%n", imc);

        if (imc < 18.5) {
            System.out.println("Você está ABAIXO DO PESO normal.");
        } else if (imc < 25) {
            System.out.println("PARABÉNS, você está na faixa de PESO NORMAL.");
        } else if (imc < 30) {
            System.out.println("Você está em SOBREPESO.");
        } else if (imc < 40) {
            System.out.println("Você está em OBESIDADE.");
        } else {
            System.out.println("Você está em OBESIDADE MÓRBIDA, cuidado!");
        }

        scanner.close();
    }
}