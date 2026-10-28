import java.util.Scanner;

public class SumaPares{
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        int sum = 0;
        for( int i = 1; i <= num; i++ ){
            int num2 =scan.nextInt();
            if (num2 % 2 == 0){
                sum = sum + num2;
            }
        }
        System.out.println(sum);


        
        Scanner scanner = new Scanner(System.in);
        
        // Lee el numero de iteraciones n
        int n = scanner.nextInt();
        int acumulador = 0;
        
        // Ciclo que se ejecuta n veces
        for (int i = 0; i < n; i++) {
            int numero = scanner.nextInt();
            
            // Condicion para verificar si es par usando el operador modulo
            if (numero % 2 == 0) {
                acumulador += numero;
            }
        }
        
        // Muestra exclusivamente el valor solicitado, sin textos adicionales
        System.out.println(acumulador);
        
        scanner.close();
        scan.close();
}}




