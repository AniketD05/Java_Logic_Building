import java.util.Scanner;

public class SumOfDigit {

    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = inp.nextInt();

        int originalNumber = number;
        int sumOfDigits = 0;

        do {

            int lastDigit = number % 10;

            sumOfDigits += lastDigit;

            number /= 10;

        } while (number != 0);

        System.out.println("Sum of digits of " + originalNumber + " is " + sumOfDigits);

        inp.close();
    }
}
