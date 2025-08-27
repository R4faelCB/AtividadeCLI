import java.util.Scanner;

public class CalculadoraCLI {

    public static int somar(int num1, int num2){
        return num1 + num2;
    }

    public static int subtrair(int num1, int num2){
        return num1 - num2;
    }

    public static int multiplicar(int num1, int num2){
        return num1 * num2;
    }

    public static double dividir(int num1, int num2){
        return (double) num1 / num2;
    }

    public static double exponenciar(int num1, int num2){
        return Math.pow(num1, num2);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String oper = args[1];
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[2]);

        switch (oper){
            case "+" ->{
                int resultado = somar(num1, num2);
                System.out.printf("O resultado da Soma foi: %d", resultado);
            }
            case "-" ->{
                int resultado = subtrair(num1, num2);
                System.out.printf("O resultado da Subtração foi: %d", resultado);
            }
            case "x" ->{
                int resultado = multiplicar(num1, num2);
                System.out.printf("O resultado da Multiplicação foi: %d", resultado);
            }
            case ":" ->{
                double resultado = dividir(num1, num2);
                System.out.printf("O resultado da Divisão foi: %.2f", resultado);
            }
            case "^" ->{
                double resultado = exponenciar(num1, num2);
                System.out.printf("O resultado da Exponenciação foi: %.0f", resultado);
            }
        }



    }
}
