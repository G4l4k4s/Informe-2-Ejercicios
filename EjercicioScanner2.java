import java.util.Scanner;

public class EjercicioScanner2 {
 
    public static void main(String[] args) {

     Scanner scanner= new Scanner (System.in);

        System.out.print("Ingresa el primero número:  ");
        int numero1=scanner.nextInt();

        System.out.print("Ingresa el segundo número:  ");
        int numero2 =scanner.nextInt();

        if (numero1>numero2){

        System.out.println("El Numero Mayor es "+numero1);

         }
        
        else 

        System.out.println("El Numero Mayor es "+numero2);   

        scanner.close();




    }
}
