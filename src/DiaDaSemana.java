import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {
        // 1. Crie uma variável que armazene um número de 1 a 7, representando um dia da semana
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 7: ");
        int dia = scanner.nextInt();

        // 2. Usando a estrutura `switch`, imprima o nome do dia correspondente ao número inserido
        switch (dia) {
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                // 3. Se o número for inválido (não estiver no intervalo de 1 a 7), imprima uma mensagem de erro
                System.out.println("Erro: número inválido. Deve ser entre 1 e 7.");
        }
    }
}