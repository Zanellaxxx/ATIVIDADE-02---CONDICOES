import java.util.Scanner;

public class ClassificaTemperatura {
    public static void main(String[] args) {
        // 1. Peça ao usuário para inserir uma temperatura em graus Celsius
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em graus Celsius: ");
        double temperatura = scanner.nextDouble();

        // 2. Classifique a temperatura
        String classificacao;
        if (temperatura > 30) {
            classificacao = "Quente";
        } else if (temperatura >= 15 && temperatura <= 30) {
            classificacao = "Agradável";
        } else if (temperatura < 15) {
            classificacao = "Frio";
        } else {
            classificacao = "Erro: temperatura inválida.";
        }

        // 3. Imprima a classificação correspondente
        System.out.println("A temperatura é " + classificacao);
    }
}