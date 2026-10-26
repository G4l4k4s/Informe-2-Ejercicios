import java.util.Scanner;

public class SumaPares {
    public static void main(String[] args) {
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
    }
}