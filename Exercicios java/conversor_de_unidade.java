import java.util.Scanner;

public class conversor_de_unidade {

    public static double converterCelsiusParaFahrenheit(double celsius){
        return 32 + (celsius * 1.8);
    }

    public static double converterFahrenheitParaCelsius(double fahrenheit){
        return (fahrenheit - 32) / 1.8;
    }

    public static double converterCelsiusParaKelvin(double celsius){
        return celsius + 273.15;
    }

    public static double converterKelvinParaCelsius(double kelvin){
        return kelvin - 273.15;
    }

    public static double converterFahrenheitParaKelvin(double fahrenheit){
        return ((fahrenheit - 32) / 1.8) + 273.15; 
    }

    public static double converterKelvinParaFahrenheit(double kelvin){
        return ((kelvin - 273.15) * 1.8) + 32;
    }
    public static void exibirResultado(double temperatura, double resultado){
        System.out.println("\nA temperatura informada: " + temperatura + "°");
        System.out.println("Resultado da conversão: " + resultado + "°\n");
        }

    public static void main(String[] args) {
        double resultado;
        int escolher = 1;
        double temperatura;
        Scanner entrada = new Scanner(System.in);
        while (escolher != 0){
            System.out.println("\nConversor de temperatura ");
            System.out.println("1 - Celsius para Fahrenheint");
            System.out.println("2 - Celsius para Kelvin");
            System.out.println("3 - Fahrenheit para Celsius");
            System.out.println("4 - Fahrenheit para Kelvin");
            System.out.println("5 - Kelvin para Fahrenheit");
            System.out.println("6 - Kelvin para Celsius");
            System.out.println("0 - SAIR");
            System.out.print("Escolha uma opção: ");
            escolher = entrada.nextInt();

            switch (escolher) {
                case 1:
                System.out.println("Vamos converter Celsius para Fahrenheit !!!");
                System.out.print("Informe o grau Celsius: ");
                temperatura = entrada.nextDouble();
                resultado = converterCelsiusParaFahrenheit(temperatura);
                exibirResultado(temperatura, resultado);
                break;
                
                case 2:
                System.out.println("Vamos converter Celsius para Kelvin !!!");
                System.out.print("Informe o grau Celsius: ");
                temperatura = entrada.nextDouble();
                resultado = converterCelsiusParaKelvin(temperatura);
                exibirResultado(temperatura, resultado);
                break;
                
                case 3:
                System.out.println("Vamos converter Fahrenheit para Celsius !!!");
                System.out.print("Informe o fahrenheit:");
                temperatura = entrada.nextDouble();
                resultado = converterFahrenheitParaCelsius(temperatura);
                exibirResultado(temperatura, resultado);
                break;
                
                case 4:
                System.out.println("Vamos converter Fahrenheit para Kelvin !!!");
                System.out.print("Informe o grau Fahrenheit:");
                temperatura = entrada.nextDouble();
                resultado = converterFahrenheitParaKelvin(temperatura);
                exibirResultado(temperatura, resultado);
                break;
                
                case 5:
                System.out.println("Vamos converter Kelvin para Fahrenheit !!!");
                System.out.print("Informe o grau Kelvin:");
                temperatura = entrada.nextDouble();
                resultado = converterKelvinParaFahrenheit(temperatura);
                exibirResultado(temperatura, resultado);
                break;
                
                case 6:
                System.out.println("Vamos converter Kelvin para Celsius !!!");
                System.out.print("Informe o grau Kelvin:");
                temperatura = entrada.nextDouble();
                resultado = converterKelvinParaCelsius(temperatura);
                exibirResultado(temperatura, resultado);
                break;

                default:
                System.out.println("Escolha com NÚMEROS inteiros de 0 - 6 !!!");
                    break;

                }
                
        }
        entrada.close();
    }
}
