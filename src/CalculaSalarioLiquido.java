import java.util.Scanner;

public class CalculaSalarioLiquido {
    public static void main(String[] args) {
        // 1. Peça ao usuário para inserir o salário bruto de um funcionário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o salário bruto do funcionário: R$ ");
        double salarioBruto = scanner.nextDouble();

        // 2. Solicite o número de anos que o funcionário trabalhou na empresa
        System.out.print("Digite o número de anos que o funcionário trabalhou na empresa: ");
        int anosTrabalhados = scanner.nextInt();

        // 3. Aplique as regras de bonificação
        double bonus = 0;
        if (anosTrabalhados > 10) {
            bonus = salarioBruto * 0.10;
        } else if (anosTrabalhados >= 5 && anosTrabalhados <= 10) {
            bonus = salarioBruto * 0.05;
        }

        // 4. Aplique as regras de desconto de impostos com base no salário bruto
        double imposto = 0;
        if (salarioBruto > 5000) {
            imposto = salarioBruto * 0.27;
        } else if (salarioBruto >= 3000 && salarioBruto <= 4999.99) {
            imposto = salarioBruto * 0.18;
        } else if (salarioBruto < 3000) {
            imposto = salarioBruto * 0.10;
        }

        // 5. Calcule o salário líquido considerando o bônus e o desconto de imposto
        double salarioLiquido = salarioBruto + bonus - imposto;

        // 6. Imprima o salário bruto, o bônus recebido, o imposto descontado e o salário líquido
        System.out.println("Salário bruto: R$ " + salarioBruto);
        System.out.println("Bônus recebido: R$ " + bonus);
        System.out.println("Imposto descontado: R$ " + imposto);
        System.out.println("Salário líquido: R$ " + salarioLiquido);
    }
}