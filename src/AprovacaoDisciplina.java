public class AprovacaoDisciplina {
    public static void main(String[] args) {
        double media = 8.0;

        if (media >= 7.0) {
            System.out.println("O estudante teve média " + media + " e foi aprovado.");
        } else if (media >= 5.0 && media <= 6.9) {
            System.out.println("O estudante teve média " + media + " e está de recuperação");
        } else {
            System.out.println("O estudante teve a média " + media + " e está reprovado");
        }
    }
}
