//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();

        System.out.println("Comparacion de numeros: ");
        System.out.println("¿Num1 es igual a Num2? " + (num1 == num2));
        System.out.println("¿Num1 es diferente a Num2? " + (num1 != num2));
        System.out.println("¿Num1 es mayor que Num2? " + (num1 > num2));
        System.out.println("¿Num1 es menor o igual que Num2? " + (num1 <= num2));


    }
}