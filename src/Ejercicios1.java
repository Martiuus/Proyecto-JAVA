import java.util.Scanner;

public class Ejercicios1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el numero 1: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingresa el numero 2: ");
        int num2 = scanner.nextInt();

        System.out.println("La suma del num1 y el num2 es: " + (num1 + num2));
        System.out.println("La resta del num1 y el num2 es: " + (num1 - num2));
        System.out.println("La multiplicacion del num1 y el num2 es: " + (num1 * num2));
        System.out.println("La division del num1 y el num2 es: " + (num1 / num2));

    }
}
