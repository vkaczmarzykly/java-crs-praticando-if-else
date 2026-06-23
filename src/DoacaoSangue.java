import java.util.Scanner;

public class DoacaoSangue {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = ler.nextInt();
        System.out.println("Digite sua peso: ");
        double peso = ler.nextDouble();

        if (idade >= 18 && idade <= 65) {
            if (peso > 50.0) {
                System.out.println("Doador compatível");
            } else {
                System.out.println("O doador não é compatível");
                System.out.println("Motivo: Deve pesar mais que 50kg");
            }
        } else {
            System.out.println("O doador não é compatível");
            System.out.println("Motivo: Deve ter entre 18 e 65 anos");
        }
    }
}
