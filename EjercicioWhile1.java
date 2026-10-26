import java.util.Scanner;
public class EjercicioWhile1 {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int numero;
     System.out.println("Ingresa un numero para ver todos los numero impares desde 0 hasta el numero ingresado: ");
     numero=scanner.nextInt();

     int contador12renglones=0;
     int i=1;

     while (i <= numero) {
        
         if ( i % 2 !=0) {

         System.out.print(i+"\t");
         contador12renglones++;
         if(contador12renglones==12){
         System.out.println();
         contador12renglones=0;  
         
          }
          
        }
         i++;
      }
         scanner.close();
 }
}
