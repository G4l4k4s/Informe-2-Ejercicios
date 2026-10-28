import java.util.Scanner;

public class Condicionales_java {

    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        // Condicional IF
        /**
         * 
         * System.out.println("Ingrese un numero.");
         * int num = scan.nextInt();
         * System.out.println("Ingrese otro numero.");
         * int num2 = scan.nextInt();
         * 
         * if (num > num2) {
         * System.out.println("el numero " + num + " es mayor.");
         * }
         * if (num2 > num) {
         * System.out.println("el numero " + num2 + " es mayor.\n");
         * }
         */

        // Condicional &&
        // la condicional && nos ayuda a diferenciar una condicion para obligar a que
        // ambas codiciones de tengas que cumplir para poder
        // continuar con lo que se desee.
        /**
         * System.out.println("Ingrese un Nombre.");
         * String Nombre = scan.next();
         * System.out.println("Ingrese su edad.");
         * int Edad = scan.nextInt();
         * System.out.println("Ingrese su capital.");
         * double Capital = scan.nextDouble();
         * 
         * if (Edad >= 18 && Capital >= 1000000) {
         * System.out.println("felicidades " + Nombre + " eres libre de ir por los
         * poderes.");
         * }
         * if (Edad >= 18 && Capital < 1000000) {
         * System.out.println(
         * "felicidades " + Nombre + " eres mayor pero no tienes plata suficiente pára
         * ir por los poderes.");
         * }
         * if (Edad < 18 && Capital >= 1000000) {
         * System.out.println("felicidades " + Nombre + " tienes plata pero no la edad
         * papa.");
         * }
         * if (Edad < 18 && Capital < 1000000) {
         * System.out.println("ni edad ni plata pa.");
         * }
         */

        // Condicional else, este lo usamos junto con el if para poder usarla en casos
        // de desear tener en cuenta
        // una respuesta contraria a la que tenemos en el if.
        // maquina de cafe

        System.out.println("Bienvenido a la cafeteichon.");
        System.out.println("Ya tomaste cafe?");
        String input = scan.next();
        System.out.println("*  " + input);

        if (input.equals("si")) {
            System.out.println("para llevar?");

            String input2 = scan.next();

            if (input2.equals("si")) {
                System.out.println("Ok.....  Aqui tienes");
            } else {
                System.out.println("Entonces para toma tu monda");
            }
        } else {
            System.out.println(" vaya tome monda");
        }
        scan.close();
    }
}
