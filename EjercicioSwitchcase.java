import java.util.Scanner;
public class EjercicioSwitchcase {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int producto;
        System.out.println("=========================================");
        System.out.println("        BIENVENIDO A LA CAFETERÍA     ");
        System.out.println("=========================================");
        System.out.println("1. Café Espresso");
        System.out.println("2. Café Latte");
        System.out.println("3. Chocolate Caliente");
        System.out.println("4. Croissant de Almendras");
        System.out.println("5. Porción de Torta de Zanahoria");
        System.out.println("=========================================");
        do{
        System.out.print("Por favor, ingrese el número de su elección: ");
        producto = scanner.nextInt();
        
        switch (producto) 
        {
            case 1:
                System.out.print("El valor es: $2.500 COP");
                break;
            case 2:
                 System.out.print("El valor es: $4.500 COP");
                break;
            case 3:
                 System.out.print("El valor es: $5.000 COP");
                 break;
            case 4:
                 System.out.print("El valor es: $6.000 COP");
                 break;
            case 5:
                 System.out.print("El valor es: $7.500 COP");
                 break;
            default:
                System.out.print("Opcion no valida. Intente de nuevo\n");
                break;
        }
     } while (producto < 1 || producto > 5);
                scanner.close();
    }
}