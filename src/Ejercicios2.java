import java.util.Scanner;

public class Ejercicios2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el numero 1: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingresa el numero 2: ");
        int num2 = scanner.nextInt();

        if (num1 >= num2) {
            if (num1 == num2){
                System.out.println("El numero " + num1 + " es igual al numero " + num2);
            }else {
                System.out.println("El numero " + num1 + " es mayor que el numero " + num2);
            }
        }else {
            System.out.println("El numero " + num2 + " es mayor que el numero " + num1);
        }
    }

}
