import java.util.Scanner;

public class VerificacaoDeMaioridade {
    public static void main(String[] args) {
        // 1. Crie uma variável que armazene a idade de uma pessoa
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();

        // 2. Verifique se a pessoa é maior de idade (18 anos ou mais)
        if (idade >= 18) {
            // 3. Imprima uma mensagem informando se a pessoa é maior de idade
            System.out.println("A pessoa é maior de idade.");
        } else {
            // 3. Imprima uma mensagem informando se a pessoa é menor de idade
            System.out.println("A pessoa é menor de idade.");
        }
    }
}