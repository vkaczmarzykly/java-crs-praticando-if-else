import java.util.Scanner;

public class NumeroIntervalo {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do emprestimo: ");
        double emprestimo = sc.nextDouble();

        if (emprestimo >= 1000 && emprestimo <= 5000) {
            System.out.println("O valor " + emprestimo + ", está dentro do intervalo permitido para empréstimo");
        } else {
            System.out.println("O valor " + emprestimo + ", não está dentro do intervalo permitido para empréstimo");
        }
    }
}
