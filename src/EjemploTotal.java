
import java.util.Scanner;

public class EjemploTotal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();

        System.out.println("Ingrese su genero (M - F - O): ");
        String genero = scanner.next();

        System.out.println("Ingrese su salario: ");
        double salario = scanner.nextDouble();

        System.out.println("¿Tiene casa propia? (True / False): ");
        boolean tieneCasa = scanner.nextBoolean();

        System.out.println("Comparacion total: ");
        if (edad > 18 && genero.equals("M") && salario >= 1500 && tieneCasa){
            System.out.println("Usted cumple con todos los requisitos");
        }
        else {
            System.out.println("No cumple con los requisitor exigidos.");
        }


    }
}
