import java.util.Scanner;

public class EjercicioScanner6 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la velocidad del vehiculo. ");
        int velocidad = scanner.nextInt();

         if (velocidad >=0 && velocidad <= 30) {

          System.out.println("Grupo de limite zonas escolares y no inflige los limites");
            
        }
         else if (velocidad > 30 && velocidad <=60) {
          System.out.println("Grupo de limite vías urbanas y no inflige los limites");  
        }
         else if (velocidad > 60 && velocidad <=80) {
          System.out.println("Grupo de limite vías rurales y no inflige los limites");  
        }
        else if (velocidad > 80 && velocidad <=100) {
          System.out.println("Grupo de limite rutas nacionales y no inflige los limites");  
        }
        else{
            System.out.println("Estas infrigiendo los límites de velocidad");
        }
        scanner.close();
    }

    
}