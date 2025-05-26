import java.util.Scanner;

public class Areas {
    public static void main (String[] args) {
        double a, b, c, pi = 3.14159;
        double triangulo, circulo, trapezio,quadrado, retangulo;

        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        triangulo = (a*c)/2;

        circulo = pi*Math.pow(c,2);

        trapezio = ((a + b)/2)*c;

        quadrado = Math.pow(b,2);

        retangulo = a*b;

        System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f", triangulo, circulo, trapezio, quadrado, retangulo);
    }
}
