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

        scan.close();
    }
}