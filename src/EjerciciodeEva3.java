import java.util.Scanner;

public class EjerciciodeEva3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la velocidad a la que transitaba: ");
        int velocidad = scanner.nextInt();

        if (velocidad <= 70){
            System.out.println("Usted no tiene sancion");
        } else if (velocidad <= 90) {
            System.out.println("Usted tiene una sancion de 100 euros");
        } else if (velocidad <= 100) {
            System.out.println("Usted tiene una sancion de 140 euros");
        } else {
            System.out.println("Usted tiene una sancion de 240 euros");
        }
    }
}
