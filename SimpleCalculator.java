import java.util.Scanner;


public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("\n");
        System.out.println("Simple Calculator");
        System.out.println("------------------");

        System.out.print("Enter First Number: ");
        int Fnum = inp.nextInt();

        System.out.print("Enter Second Number: ");
        int Snum = inp.nextInt();

        System.out.println("");
        System.out.print("Choose an operation: \n");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division \n");
        System.out.print("Enter Your Choice: ");
        int yourChoice = inp.nextInt();
        System.out.println("");

        switch (yourChoice) {
            case 1:
                int addition = Fnum + Snum;
                System.out.println("Result: " + Fnum + " + " + Snum + " = " + addition +
                        "\n");
                break;
            case 2:
                int subtraction = Fnum - Snum;
                System.out.println("Result: " + Fnum + " - " + Snum + " = " + subtraction +
                        "\n");
                break;
            case 3:
                int multiplication = Fnum * Snum;
                System.out.println("Result: " + Fnum + " * " + Snum + " = " + multiplication
                        + "\n");
                break;
            case 4:
                int division = Fnum / Snum;
                System.out.println("Result: " + Fnum + " / " + Snum + " = " + division +
                        "\n");
                break;

            default:
                System.out.println("Invalid Input" + "\n");
                break;
        }

        inp.close();

    }
}