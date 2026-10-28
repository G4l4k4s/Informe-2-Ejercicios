import java.util.Scanner;

public class EjercicioScanner3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el nombre:  ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa la edad:  ");
        int edad = scanner.nextInt();

        System.out.print("Ingresa el capital:  ");
        float capital = scanner.nextInt();

        if (edad > 18 && capital >= 1000000) {

            System.out.print(nombre + " " + "puedes ser independiente");

        }

        else

            System.out.print("No se cumplen las condiciones");

        scanner.close();

    }

}