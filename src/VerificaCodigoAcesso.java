import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class VerificaCodigoAcesso {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o codigo de acesso: ");
        int codigoAcesso =  sc.nextInt();
        System.out.println("Digite o nivel de permissao: ");
        int nivelPermissao = sc.nextInt();

        boolean verificaAcesso = codigoAcesso == 2023;
        boolean verificaNivelPermissao = nivelPermissao == 1 || nivelPermissao == 2 || nivelPermissao == 3;

        if(verificaAcesso && verificaNivelPermissao) {
            System.out.println("Acesso permitido. Bem-vindo ao sistema!");
        } else {
            System.out.println("Acesso negado. Motivo: ");
            if (!verificaAcesso) {
                System.out.println("- Codigo de acesso inválido");
            }
            if (!verificaNivelPermissao) {
                System.out.println("- Nivel de permissao inválido");
            }
        }
        sc.close();
    }
}
