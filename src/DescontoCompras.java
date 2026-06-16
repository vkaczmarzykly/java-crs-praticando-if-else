import java.util.Scanner;

public class DescontoCompras {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da compra: ");
        double valorCompra = sc.nextDouble();

        if (valorCompra >= 100.00) {
            double desconto = valorCompra * 0.10;
            double total = valorCompra - desconto;
            System.out.println("Desconto de 10% aplicado.");
            System.out.println("Novo valor: R$ " + total);
        } else {
            System.out.println("Nenhum desconto aplicado.");
            System.out.println("Valor total: R$ " + valorCompra);
        }
    }
}
