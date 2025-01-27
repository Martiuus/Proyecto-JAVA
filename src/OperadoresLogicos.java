import java.util.Scanner;

public class OperadoresLogicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Es adulto? (true/false): ");
        boolean esAdulto = scanner.nextBoolean();
        System.out.println("¿Tiene licencia? (true/false): ");
        boolean tieneLicencia = scanner.nextBoolean();
        System.out.println("Operadores Logicos: ");
        System.out.println("¿Es adulto y tiene licencia? "
                + (esAdulto && tieneLicencia));
        System.out.println("¿Es adulto o tiene licencia? "
                + (esAdulto || tieneLicencia));
        System.out.println("¿No es adulto? " + (!esAdulto));
    }
}
