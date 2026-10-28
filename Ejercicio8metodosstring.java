import java.util.Scanner;
public class Ejercicio8metodosstring {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        //length(
        String texto;
        String texto2;
        System.out.println("El metodo length() devuelve el número de caracteres de la cadena");
        System.out.println("Ingresa el texto:");
        texto = scanner.next();
        System.out.println("El numero de caracteres es "+texto.length());

        //toUpperCase(
        System.out.println("El metodo toUpperCase() convierte todos los caracteres a mayúsculas");
        System.out.println("Ingresa el texto:");
        texto = scanner.next();
        System.out.println("Convertido a Mayusculas "+texto.toUpperCase());

        //toLowerCase()
        System.out.println("El metodo toLowerCase() convierte todos los caracteres a minúsculas ");
        System.out.println("Ingresa el texto:");
        texto = scanner.next();
        System.out.println("Convertido a Minisculas "+texto.toLowerCase());

        //charAt()
        System.out.println("El metodo charAt() devuelve el carácter en la posición indicada ");
        System.out.println("Ingresa el texto:");
        texto = scanner.next();
        System.out.println("La lentra en la posicion es "+texto.charAt(0));

        //substring()
        System.out.println("El metodo substring() extrae una parte de la cadena desde un índice inicial hasta uno final ");
        System.out.println("Ingresa el texto:");
        texto = scanner.next();
        System.out.println("Según el rango escogido trae la siguiente parte "+texto.substring(0,3));

        //equals()
        System.out.println("El metodo equals() compara si dos cadenas son iguales (distingue mayúsculas) ");
        System.out.println("Ingresa el texto 1:");
        texto = scanner.next();
        System.out.println("Ingresa el texto 2:");
        texto2 = scanner.next();
        System.out.println("¿Segun la comparacion los texto son iguales? "+texto.equals(texto2));

        //equalslgnoreCase()
        System.out.println("El metodo equals() compara si dos cadenas son iguales (Ignora mayusculas y minisculas) ");
        System.out.println("Ingresa el texto 1:");
        texto = scanner.next();
        System.out.println("Ingresa el texto 2:");
        texto2 = scanner.next();
        System.out.println("¿Segun la comparacion los texto son iguales? "+texto.equalsIgnoreCase(texto2));

        //contains()
        System.out.println("El metodo contains() verifica si una cadena contiene otra subcadena. ");
        texto = scanner.nextLine();
        System.out.println("Ingresa el texto:");
        texto = scanner.nextLine();
        System.out.println("¿La frase incluye la palabra java?  "+texto.contains("java"));

        //replace()
        System.out.println("El metodo replace() reemplaza un carácter o subcadena por otra ");
        System.out.println("Ingresa el texto:");
        texto = scanner.next();
        System.out.println("La palabra remplazando la a por la o queda:  "+texto.replace("a","o"));

        //trim()
        System.out.println("El metodo trim() elimina los espacios en blanco al inicio y al final de la cadena. ");
        texto = scanner.nextLine();
        System.out.println("Ingresa el texto:");
        texto = scanner.nextLine();
        System.out.println("¿La frase sin espacio queda de la siguiente manera:?  "+texto.trim());

        scanner.close();





    }
}