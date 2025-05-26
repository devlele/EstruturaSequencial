import java.util.Locale;
import java.util.Scanner;

public class Salario {
    public static void main (String[] args) {
        int num;
        int horas;
        double valHora;
        double sal;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();
        horas = sc.nextInt();
        valHora = sc.nextDouble();
        sal = horas*valHora;

        System.out.printf("Number = %d\nSalary = U$ %.2f", num, sal);

    }
}
