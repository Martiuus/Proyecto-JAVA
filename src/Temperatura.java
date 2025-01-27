import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la temperatura: ");
        int temperatura = scanner.nextInt();
        if (temperatura < 0){
            System.out.println("Hace mucho frio");
        } else if (temperatura >= 0 && temperatura <= 20) {
            System.out.println("El clima està fresco");
        } else if (temperatura > 20 && temperatura <= 30) {
            System.out.println("El clima està calido");
        } else {
            System.out.println("Hace mucho calor");
        }

    }
}
