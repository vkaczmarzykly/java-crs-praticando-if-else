import java.util.Scanner;

public class ValidacaoSenha {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String senhaDefinida = "123456";

        System.out.println("Digite a senha: ");
        String senhaDigitada = scanner.nextLine();

        scanner.close();

        if (senhaDigitada.equals(senhaDefinida) ) {
            System.out.println("Acesso Permitido!");
        } else {
            System.out.println("Acesso Negado!");
        }

    }
}
