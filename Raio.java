import java.util.Scanner;

public class Raio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double raio;
        double area;
        double pi = 3.14159;

        raio =sc.nextDouble();

        area = pi * Math.pow(raio, 2);

        System.out.printf("A = %.4f", area);
    }
}
