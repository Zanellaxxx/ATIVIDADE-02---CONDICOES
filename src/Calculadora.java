import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        // 1. Peça ao usuário para inserir dois números e uma operação
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.print("Digite a operação (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);

        // 2. Com base na operação inserida, realize o cálculo correspondente
        double resultado = 0;
        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: divisão por zero!");
                    return;
                }
                break;
            default:
                System.out.println("Erro: operação inválida.");
                return;
        }

        // 3. Imprima o resultado da operação
        System.out.println("O resultado da operação é: " + resultado);
    }
}