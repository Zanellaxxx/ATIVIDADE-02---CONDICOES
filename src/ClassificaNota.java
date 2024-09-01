import java.util.Scanner;

public class ClassificaNota {
    public static void main(String[] args) {
        // 1. Crie uma variável para armazenar a nota de um aluno (de 0 a 10)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota do aluno (de 0 a 10): ");
        double nota = scanner.nextDouble();

        // Verifique se a nota está dentro do intervalo válido
        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida. Por favor, digite uma nota entre 0 e 10.");
        } else {
            // 2. Usando condições encadeadas, classifique a nota
            if (nota >= 9) {
                // 3. Imprima a classificação correspondente
                System.out.println("Excelente");
            } else if (nota >= 7) {
                System.out.println("Bom");
            } else if (nota >= 5) {
                System.out.println("Satisfatório");
            } else {
                System.out.println("Insatisfatório");
            }
        }
    }
}