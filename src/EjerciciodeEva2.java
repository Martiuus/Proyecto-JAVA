import java.util.Scanner;

public class EjerciciodeEva2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese tu nota: ");
        double nota = scanner.nextInt();

        if (nota >= 17){
            System.out.println("Perteneces a la categoria A");
        } else if (nota >= 14) {
            System.out.println("Perteneces a la categoria B");
        } else if (nota >= 12) {
            System.out.println("Perteneces a la categoria C");
        }else {
            System.out.println("Perteneces a la categoria D");
        }




    }
}
