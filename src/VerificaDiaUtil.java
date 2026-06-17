import java.util.Scanner;

public class VerificaDiaUtil {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dia da semana(em letras minúsculas: ");
        String dia = sc.nextLine();

        if (dia.equals("segunda") || dia.equals("terça")  ||
            dia.equals("quarta")  || dia.equals("quinta") || dia.equals("sexta")) {
            System.out.println(dia + " é um dia útil");
        } else if(dia.equals("sabado") || dia.equals("doming")) {
            System.out.println(dia + " não é dia útil");
        } else {
            System.out.println(dia + " é inválido");
        }
    }

}
