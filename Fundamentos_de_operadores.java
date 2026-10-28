public class Fundamentos_de_operadores {

    public static void main(String[] org) {

        // los operadores son simbolos que nos permiten realizar operaciones entre
        // variables y valores de diferentes tipos de datos
        // los operadores se dividen en diferentes tipos de operadores como lo son los
        // operadores
        // aritmeticos, relacionales, logicos, de asignacion y de incremento y
        // decremento

        // Operador de asignacion: el operador de asignacion nos permite asignar un
        // valor a una variable
        int numero = 5;
        // donde el operador es el simbolo de igual (=) que nos permite asignar un valor
        // a una variable

        // Operadores aritmeticos: los operadores aritmeticos nos permiten realizar
        // operaciones matematicas entre variables y
        // valores de diferentes tipos de datos

        int numero1 = 10;
        int numero2 = 5;
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int division = numero1 / numero2;
        int modulo = numero % numero2;

        System.out.println("la suma de " + numero1 + " y " + numero2 + " es: " + suma);
        System.out.println("la resta de " + numero1 + " y " + numero2 + " es: " + resta);
        System.out.println("la multiplicacion de " + numero1 + " y " + numero2 + " es: " + multiplicacion);
        System.out.println("la division de " + numero1 + " y " + numero2 + " es: " + division);
        System.out.println("el modulo de " + numero1 + " y " + numero2 + " es: " + modulo);

        // Operadores aritmeticos de incremento y decremento: los operadores de
        // incremento y decremento nos permiten
        // aumentar o disminuir el valor de una variable en 1

        int numero3 = 10;
        numero3++;
        System.out.println("el valor de la variable numero3 es: " + numero3);
        numero3--;
        System.out.println("el valor de la variable numero3 es: " + numero3);

        // Operadores relacionales: los operadores relacionales nos permiten comparar
        // dos valores y nos devuelven un valor booleano

        int numero4 = 10;
        int numero5 = 5;

        // el operador == nos permite comparar si dos valores son iguales
        boolean esIgual = numero4 == numero5;
        // el operador != nos permite comparar si dos valores son distintos
        boolean esDistinto = numero4 != numero5;
        // el operador > nos permite comparar si un valor es mayor que otro
        boolean esMayor = numero4 > numero5;
        // el operador < nos permite comparar si un valor es menor que otro
        boolean esMenor = numero4 < numero5;
        // el operador >= nos permite comparar si un valor es mayor o igual que otro
        boolean esMayorIgual = numero4 >= numero5;
        // el operador <= nos permite comparar si un valor es menor o igual que otro
        boolean esMenorIgual = numero4 <= numero5;

        System.out.println("¿Es igual? " + esIgual);
        System.out.println("¿Es distinto? " + esDistinto);
        System.out.println("¿Es mayor? " + esMayor);
        System.out.println("¿Es menor? " + esMenor);
        System.out.println("¿Es mayor o igual? " + esMayorIgual);
        System.out.println("¿Es menor o igual? " + esMenorIgual);

        // Operador condicional: el operador condicional nos permite evaluar una
        // condicion y nos devuelve un valor booleano

        boolean esVerdadero = true;
        boolean esFalso = false;

        // el operador && nos permite evaluar si dos condiciones son verdaderas al mismo
        // tiempo
        boolean resultado = esVerdadero && esFalso;
        System.out.println("¿Es verdadero y falso? " + resultado);
        // el operador || nos permite evaluar si al menos una de las condiciones es
        // verdadera
        boolean resultado2 = esVerdadero || esFalso;
        System.out.println("¿Es verdadero o falso? " + resultado2);
        // el operador ! nos permite evaluar la negación de una condicion
        boolean resultado3 = !esVerdadero;
        System.out.println("¿Es negación de verdadero? " + resultado3);

    }

}