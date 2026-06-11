import java.util.Scanner;

public class ValidacaoSenha {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int senhaDefinida = 123456;

        System.out.println("Digite a senha: ");
        int senhaDigitada = scanner.nextInt();

        if (senhaDigitada == senhaDefinida ) {
            System.out.println("Acesso Permitido!");
        } else {
            System.out.println("Acesso Negado!");
        }

    }
}
