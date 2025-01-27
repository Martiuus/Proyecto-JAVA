import java.util.Scanner;


public class ComparacionCadenas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese primera cadena: ");
        String str1 = scanner.nextLine();
        System.out.println("Ingrese segunda cadena: ");
        String str2 = scanner.nextLine();
        System.out.println("Comparacion de cadenas: ");
        System.out.println("¿str1 es igual a str2? (==) " + (str1 == str2));
        System.out.println("¿str1 es igual a str2? (equals) " + (str1.equals(str2)));

    }
}
