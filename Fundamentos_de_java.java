public class Fundamentos_de_java {
    public static void main(String[] arg) {

        // este es un taller realizador para la clase de arquitectura de sofware
        // donde realizaremos la declaracion de diferentes variables para
        // comenzar a practicar el usa de java

        // el typo de dato primitivo byte almacena un masimo de 127 tipos de
        // combinaciones de datos
        byte numeroByte = 127;
        String tipoVarByte = ((Object) numeroByte).getClass().getSimpleName();
        System.out.println("la variable" + " " + numeroByte + " y es de tipo: " + tipoVarByte);
        // el short almacena un maximo de 32767 de datos
        short numeroShort = 32767;
        String tipoVarShort = ((Object) numeroShort).getClass().getSimpleName();
        System.out.println("la variable" + " " + numeroShort + " y es de tipo: " + tipoVarShort);

        // el tipo de dato int tiene una mayor capacidad
        int numeroInt = 41825;
        String tipoVarInt = ((Object) numeroInt).getClass().getSimpleName();
        System.out.println("la variable" + " " + numeroInt + " y es de tipo: " + tipoVarInt);

        // el tipo de dato lon almacena cadenas de datos extremada mente grandes
        long numeroLong = 926465464697266565l;
        String tipoVarLong = ((Object) numeroLong).getClass().getSimpleName();
        System.out.println("la variable" + " " + numeroLong + " y es de tipo: " + tipoVarLong);

        // para los numeros decimales usamos el tipo de dato float y double que almacena
        // numeros alfanumericos con sus decimales
        float numeroFloat = 5.22232f;
        double numeroDouble = 99.5513d;

        String tipoVarFloat = ((Object) numeroFloat).getClass().getSimpleName();
        System.out.println("la variable" + " " + numeroFloat + " y es de tipo: " + tipoVarFloat);

        String tipoVardDouble = ((Object) numeroDouble).getClass().getSimpleName();
        System.out.println("la variable" + " " + numeroDouble + " y es de tipo: " + tipoVardDouble);

        // los tipos de datos booleanos nos permiten almacenar datos de falso o
        // verdadero comun mente usados para condicionales
        boolean datoBool = true;
        String tipoVarBool = ((Object) datoBool).getClass().getSimpleName();
        System.out.println("la variable" + " " + datoBool + " y es de tipo: " + tipoVarBool);

        // el tipo de dato char nos permite almacenar un solo dato de tipo string lo que
        // seria una sola caneda de texto
        // devemos tener en cuenta que esto solo se puede hacer con letra usando
        // comilla solitaria
        char letra = 'a';
        String tipoVarChar = ((Object) letra).getClass().getSimpleName();
        System.out.println("la variable" + " " + letra + " y es de tipo: " + tipoVarChar);

        // tambien lo podemos hacer para el caso en el que solo necesitemos hacer usa
        // del guardado de una solo numero
        char numeroChar = 1;
        String tipoVarCharNum = ((Object) numeroChar).getClass().getSimpleName();
        System.out.println("la variable" + " " + numeroChar + " y es de tipo: " + tipoVarCharNum);

        // para las cadenas de textos en java usamos string que nos permite guardar
        // largas cadenas de texto en una variable
        String variableString = "hola mundo y adios mundo.";
        String tipoVarString = ((Object) variableString).getClass().getSimpleName();
        System.out.println("la variable" + " " + variableString + " y es de tipo: " + tipoVarString);

        // Operador de contatenacion: el operador de concatenacion nos permite
        // unir dos o mas cadenas de texto en una sola cadena de texto
        String nombre = "juan";
        String apellido = "perez";
        // el operador de concatenacion es el simbolo de mas (+) que nos permite unir
        // dos o mas cadenas de texto en una sola cadena de texto
        String nombreCompleto = nombre + " " + apellido;
        System.out.println("el nombre completo es: " + nombreCompleto);

        // Operador de separacion: el operador de separacion nos permite separar una
        // cadena de texto en varias cadenas de texto
        String cadena = "hola mundo y adios mundo.";
        // el operador de separacion es el simbolo de punto y coma (;) que nos permite
        // separar una cadena de texto en varias cadenas de texto
        // el metodo split nos permite separar una cadena de texto en varias cadenas de
        // texto
        // el metodo split recibe como parametro un simbolo que nos permite separar la
        // cadena de texto
        String[] palabras = cadena.split(" ");
        System.out.println("la cadena de texto es: " + cadena);
        System.out.println("la cadena de texto separada es: ");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }

    }

}
