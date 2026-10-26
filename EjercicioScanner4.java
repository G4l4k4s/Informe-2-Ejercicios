import java.util.Scanner;

public class EjercicioScanner4 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);  
    String respuesta1= "No";
    String respuesta2= "Si";
    System.out.println("- ¿Quieres un café?");
    System.out.println("* "+ respuesta1);
    if (respuesta1 == "Si") 
        {
        System.out.println("- ¿Vas a comprarlo");
        if (respuesta2 == "Si") 
            {
            System.out.println("* "+ respuesta2);
            System.out.println("- comprar café");
        }
        else{
            System.out.println("* "+ respuesta2);
            System.out.println("- Hacer el café");
        }
        System.out.println("- Beber");
    }
    else
        {
          System.out.println("- Sigue estudiando");
    }

   
     scanner.close();
        
















    }
 }