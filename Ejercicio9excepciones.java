import java.util.Scanner;

public class Ejercicio9excepciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // División entre cero

        // Enunciado: Capturar la excepción al dividir un número entre cero

        int numero = 0;
        System.out.println("Ingresa el numero que deseas dividir entre 0:");
        numero = scanner.nextInt();
        try {

            int resultado = numero / 0;
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException exception) {

            System.out.println("Error: No se puede dividir entre cero");

        }

      
          Scanner scanner2= new Scanner(System.in);
        try {
            int numero2 = 0;
            System.out.println("Ingresa el numero entero: ");
            numero2 = Integer.parseInt(scanner2.nextLine());
            System.out.println("Numero ingresado: "+ numero2);
        } catch (NumberFormatException exception) {

            System.out.println("Error: Debe ingresar un numero valido.");

        }
         scanner.close();

    }

}
