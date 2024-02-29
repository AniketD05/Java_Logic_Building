import java.util.Scanner;

public class FactorialOfNumber {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a number you wish to calculate its factorial: ");
        int num = inp.nextInt();

        if (num < 0) {
            System.out.println("Factorial of negative numbers cannot be determined.");
        } else {

            int fact = 1;
            int i = 1;
            while (i <= num) {
                fact *= i;
                i++;
            }
            System.out.println("Factorial of " + num + " is: " + fact + "\n");
        }

        inp.close();
    }

}
