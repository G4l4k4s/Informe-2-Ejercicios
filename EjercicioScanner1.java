import java.util.Scanner;

public class EjercicioScanner1 {
    public static void main(String[] args) {
      
        Scanner scanner= new Scanner (System.in);

        System.out.print("Nombre:  ");
        String nombre=scanner.nextLine();

        System.out.print("Edad:  ");
        int edad = scanner.nextInt();

        System.out.println(nombre+ " tiene " +edad + " años. ");

        scanner.close();









    }

    
}