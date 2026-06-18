import java.util.Scanner;

public class VerificaTriangulo {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro lado: ");
        int lado1 = sc.nextInt();
        System.out.println("Digite o segundo lado: ");
        int lado2 = sc.nextInt();
        System.out.println("Digite o terceiro lado: ");
        int lado3 = sc.nextInt();

        int soma1e2 = lado1 + lado2;
        int soma1e3 = lado1 + lado3;
        int soma2e3 = lado2 + lado3;

        if (soma1e2 > lado3 && soma1e3 > lado2 && soma2e3 > lado1) {
            System.out.println("Os lados podem formar um triangulo.");
        } else {
            System.out.println("Os lados não podem formar um triangulo.");
        }
    }
}
