import java.util.Scanner;

public class VerificaLogin {
    public static void main(String[] args) {
        // 1. Crie duas variáveis para armazenar o nome de usuário e a senha corretos
        String usuarioCorreto = "admin";
        String senhaCorreta = "123456";

        // 2. Peça ao usuário para inserir um nome de usuário e uma senha
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome de usuário: ");
        String usuarioInserido = scanner.next();
        System.out.print("Digite a senha: ");
        String senhaInserida = scanner.next();

        // 3. Verifique se o nome de usuário e a senha inseridos correspondem aos valores corretos
        if (usuarioInserido.equals(usuarioCorreto) && senhaInserida.equals(senhaCorreta)) {
            // 4. Imprima uma mensagem de sucesso
            System.out.println("Login realizado com sucesso!");
        } else {
            // 4. Imprima uma mensagem de erro
            System.out.println("Erro: nome de usuário ou senha incorretos.");
        }
    }
}