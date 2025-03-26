import java.util.Scanner;

public class calculadora_simples {
   
    public static double calcularDivisao(double num1, double num2){
        if (num1 == 0 && num2 == 0){
            System.out.println("ERRO: não é possivel relizar divisão por zero !!!");
            return 0;
        } else {
            return num1 / num2;

        }
    }

    public static double calcularMultiplicao(double num1, double num2){
        return num1 * num2;
    }

    public static double calcularSubtracao(double num1, double num2){
        return num1 - num2;

    }

    public static double calcularAdicao(double num1, double num2){
        return num1 + num2;
    }

    public static void main(String[] args) {
        int escolha = 1;

        Scanner entrada = new Scanner(System.in);
        while (escolha != 0) {
            System.out.println("\nCALCULADORA");
            System.out.println("1 - CALCULAR");
            System.out.print("0 - SAIR");
            System.out.print("\nEscolha uma opção: ");
            escolha = entrada.nextInt();
            
            if (escolha == 1){
                System.out.println("\n1 - Somar");
                System.out.println("2 - Subtrair");
                System.out.println("3 - Dividir");
                System.out.println("4 - Multiplicar");
                System.out.print("\nEscolha uma opção: ");
                escolha = entrada.nextInt();
                switch (escolha){
                    case 1:
                    System.out.println("Vamos somar !!");
                    System.out.print("Digite o 1° número: ");
                    double num1 = entrada.nextDouble();
                    System.out.print("Digite o 2° número: ");
                    double num2 = entrada.nextDouble();
                    double resultado = calcularAdicao(num1, num2);
                    System.out.println("A soma de " + num1 + " com " + num2 + " é " + resultado);
                    break;

                    case 2:
                    System.out.println("Vamos subtrair !!");
                    System.out.print("Digite o 1° número: ");
                    num1 = entrada.nextDouble();
                    System.out.print("Digite o 2° número: ");
                    num2 = entrada.nextDouble();
                    resultado = calcularSubtracao(num1, num2);
                    System.out.println("A subtração de " + num1 + " com " + num2 + " é " + resultado);
                    break;
                    
                    case 3:
                    System.out.println("Vamos Dividir !!");
                    System.out.println("Não faça divisão com ZERO !!!");
                    System.out.print("Digite o 1° número: ");
                    num1 = entrada.nextDouble();
                    System.out.print("Digite o 2° número: ");
                    num2 = entrada.nextDouble();
                    resultado = calcularDivisao(num1, num2);
                    System.out.println("A divisão de " + num1 + " com " + num2 + " é " + resultado);
                    
                    break;
                    
                    case 4:
                    System.out.println("Vamos Multiplicar !!");
                    
                    System.out.print("Digite o 1° número: ");
                    num1 = entrada.nextDouble();
                    System.out.print("Digite o 2° número: ");
                    num2 = entrada.nextDouble();
                    resultado = calcularMultiplicao(num1, num2);
                    System.out.println("A multiplicação de " + num1 + " com " + num2 + " é " + resultado);
                    break;
                }

            }

        }


    }



}
