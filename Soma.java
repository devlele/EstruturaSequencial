import java.util.Scanner;

public class Soma {
    public static void main(String[] args){
        int a, b;
        int result;
        Scanner sc = new Scanner(System.in); //Declaração de um obj scanner para entrada de dados

        a = sc.nextInt();
        b = sc.nextInt();
        result = a + b;

        System.out.printf("Soma = %d", result);
    }
}
