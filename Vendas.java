import java.util.Scanner;

public class Vendas {
    public static void main (String[] args) {
        int cod1, cod2, num1, num2;
        double val1, val2, valFinal;

        Scanner sc = new Scanner(System.in);
        cod1 = sc.nextInt();
        num1 = sc.nextInt();
        val1 = sc.nextDouble();

        cod2 = sc.nextInt();
        num2 = sc.nextInt();
        val2 = sc.nextDouble();

        valFinal = num1*val1 + num2*val2;

        System.out.printf("Valor a pagar: R$ %.2f", valFinal);
    }
}
