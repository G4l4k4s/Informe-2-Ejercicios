import java.util.Scanner;

public class EjercicioScanner5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el dia de la semana ");
        String dia = scanner.nextLine();

        System.out.print("Ingresa el producto ");
        String producto = scanner.nextLine();

        System.out.print("Ingresa el valor del producto. ");
        int valor = scanner.nextInt();

         //LUNES 30%

        if (dia.equals("lunes") && producto.equals("fruver")) {

            
            int descuentovalor = 30;
            float precio = valor - (valor*descuentovalor/100.0f);

            System.out.println("Descuento: " + descuentovalor+" % ");
            System.out.println("Costo Total: " + precio);

        }

         //MARTES 30%
        
         else if (dia.equals("martes") && producto.equals("carnes")) {

            
            int descuentovalor = 30;
            float precio = valor - (valor*descuentovalor/100);

            System.out.println("Descuento: " + descuentovalor+" % ");
            System.out.println("Costo Total: " + precio);

        }

         // JUEVES 30%

         else if (dia.equals("jueves") && producto.equals("vinos")) {

            
            int descuentovalor = 30;
            float precio = valor - (valor*descuentovalor/100);

            System.out.println("Descuento: " + descuentovalor+" % ");
            System.out.println("Costo Total: " + precio);

        }
         // MIERCOLES CARNES 15%, FRUVER 10%, VINOS 5%
         else if (dia.equals("miercoles")) {

            int descuentovalor= 0;
            if (producto.equals("carnes")) {
                descuentovalor=15;
                } else if (producto.equals("fruver")) {
                descuentovalor=10;
                } else if (producto.equals("vinos")) {
                descuentovalor=5;    
                }

            float precio = valor - (valor*descuentovalor/100);
            System.out.println("Descuento: " + descuentovalor+" % ");
            System.out.println("Costo Total: " + precio);

        }
        // VIERNES VINOS 15%, FRUVER 10%, CARNES 5%

         else if (dia.equals("viernes")) {

            int descuentovalor= 0;
            if (producto.equals("vinos")) {
                descuentovalor=15;
                } else if (producto.equals("fruver")) {
                descuentovalor=10;
                } else if (producto.equals("carnes")) {
                descuentovalor=5;    
                }

            float precio = valor - (valor*descuentovalor/100);
            System.out.println("Descuento: " + descuentovalor+" % ");
            System.out.println("Costo Total: " + precio);

        }

        //CUALQUIER OTRO CASO SIN DESCUENTO
        else{
            System.out.println("Descuento: 0% ");
            System.out.println("Costo Total: " + valor);
        }
         scanner.close();

    }
}