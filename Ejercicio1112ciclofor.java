import java.util.Scanner;
public class Ejercicio1112ciclofor {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numero;
    System.out.println("Ingresa un numero para ver todos los numero pares desde 0 hasta el numero ingresado: ");
    numero=scanner.nextInt();
    System.out.println("Los número pares que hay hasta "+ numero);
    for(int i=0; i<=numero; i+=2){
    System.out.print(i + " "); 
    }

    //SEGUNDO EJERCICIO CICLOS
    
    System.out.println("\n\n==========================================================================");
    System.out.println("      MOSTRAR NÚMEROS PARES 10 POR RENGLON     ");

    System.out.println("Ingresa un numero para ver todos los numero pares desde 0 hasta el numero ingresado: ");
    numero=scanner.nextInt();
    System.out.println("Numero pares organizados de a 10 por reglón ");
    int contador10renglones=0;

    for (int i=0; i<=numero; i +=2){

        System.out.print(i+"\t");
        contador10renglones++;
        if(contador10renglones==10){
            System.out.println();
            contador10renglones=0;
        }
    }
    scanner.close();




    }
}