import java.util.Scanner;

public class PatternPractice {
    public static void main(String args[]) {

        // Pattern-1
        // *
        // * *
        // * * *
        // * * * * *

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter Number of Rows: ");
        int num = inp.nextInt();
        for (int i = 1; i <= num; i++){
        for (int j = 1; j <= i; j++) {
        System.out.print(" * ");
        }
        System.out.println();
        }
        inp.close();

        // Pattern-2

        // Enter Number of Rows: 5
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *

        // Scanner inp = new Scanner(System.in);
 
        // System.out.print("Enter Number of Rows: ");
        // int num = inp.nextInt();
 
        // for (int i = 1; i <= num; i++) {
 
        //     for (int j = 1; j <= num; j++) {
 
        //         System.out.print(" * ");
 
        //     }
        //     System.out.println(" ");
        // }
        // inp.close();

    }
}
