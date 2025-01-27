import java.util.Scanner;

public class EjerciciodeEva1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el primer numero: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingresa el segundo numero: ");
        int num2 = scanner.nextInt();

        System.out.println("Ingresa el terecer  numero: ");
        int num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("El numero " + num1 + " es el mayor de todos");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El numero " + num2 + " es el mayor de todos");
        }else {
            System.out.println("El numero " + num3 + " es el mayor de todos");
        }

    }
}
