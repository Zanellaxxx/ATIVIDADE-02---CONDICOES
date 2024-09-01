import java.util.Scanner;

public class CalculaDesconto {
    public static void main(String[] args) {
        // 1. Peça ao usuário para inserir o valor total da compra
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor total da compra: R$ ");
        double valorOriginal = scanner.nextDouble();

        // 2. Aplique as regras de desconto progressivo
        double valorDesconto = 0;
        double percentualDesconto = 0;
        if (valorOriginal > 500) {
            percentualDesconto = 20;
            valorDesconto = valorOriginal * (percentualDesconto / 100);
        } else if (valorOriginal >= 200 && valorOriginal <= 500) {
            percentualDesconto = 10;
            valorDesconto = valorOriginal * (percentualDesconto / 100);
        } else if (valorOriginal >= 100 && valorOriginal < 200) {
            percentualDesconto = 5;
            valorDesconto = valorOriginal * (percentualDesconto / 100);
        } else {
            percentualDesconto = 0;
            valorDesconto = 0;
        }

        // 3. Calcule o valor final após o desconto
        double valorFinal = valorOriginal - valorDesconto;

        // 4. Informe o valor original, o percentual de desconto aplicado, o valor descontado e o valor final da compra
        System.out.println("Valor original: R$ " + valorOriginal);
        System.out.println("Percentual de desconto: " + percentualDesconto + "%");
        System.out.println("Valor descontado: R$ " + valorDesconto);
        System.out.println("Valor final: R$ " + valorFinal);
    }
}