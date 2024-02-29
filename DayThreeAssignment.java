import java.util.Scanner;

public class DayThreeAssignment {

    public static void main(String[] args) {

        /*
         * Q.1
         * int i = 10;
         * 
         * while (i < 5)
         * i++;
         * System.out.println(i);
         * }
         * OUTPUT --> "Blank/No output"
         */

        /*
         * Q.2
         * int result = 50;
         * 
         * if (result > 40) {
         * System.out.println("Passed!");
         * } else {
         * System.out.println("Failed");
         * }
         */

        /*
         * Q.3
         * for (int i = 0; i < 10; i++) {
         * System.out.println("!" + " at index " + i);
         * }
         * --> It will print 10 times '!'
         */

        /*
         * Q.4
         * int number = 10;
         * 
         * while (number < 15) {
         * System.out.println(" * ");
         * number++;
         * }
         * 
         * Answer -->
         * 
         * for (int number = 10; number < 15; number++) {
         * System.out.println(" * ");
         * }
         */

        /*
         * Q.5
         * 
         * int i = 5; // getnumber();
         * while (i < 10) {
         * 
         * i++;
         * 
         * int j = 5; // getnumber();
         * 
         * if (j == 0) {
         * break;
         * } else if (j == 1) {
         * continue;
         * }
         * System.out.println(i);
         * }
         * System.out.println("Finished");
         * 
         * if user enters "5" then getnumber(); will be assigned to int j and int i,
         * after that
         * i will get icremented till the condition is met and if user enters "0" then
         * loop will break and output would be "finished".
         * 
         */

        /*
         * Q.6
         * 
         * int i = 10;
         * 
         * switch (i) {
         * 
         * case 10:
         * System.out.println("Congratulations you have full marks");
         * break;
         * case 9:
         * System.out.println("Congratulations you have almost full marks");
         * break;
         * case 8:
         * System.out.println("Congratulations you have done very well");
         * break;
         * case 7:
         * System.out.println("Congratulations you have done well");
         * break;
         * case 6:
         * System.out.println("You are doing alright but could study more");
         * break;
         * case 5:
         * System.out.println("You only got half marks, you need to do more");
         * break;
         * case 4:
         * System.out.println("You got less than half marks, you need to do more");
         * break;
         * case 3:
         * System.out.println("You have got low marks, see a teacher");
         * break;
         * case 2:
         * System.out.println("You have got very low marks, see a teacher");
         * break;
         * case 1:
         * System.out.println("You only got 1 mark, see a teacher");
         * break;
         * default:
         * System.out.println("You have failed abysmally");
         * break;
         * }
         */

        /*
         * Q.7
         * do {
         * int i = 10; // getnumber();
         * System.out.println(i);
         * } while (i != 0);
         * 
         * -->> Output: int i is initialised inside do-while loop
         * where "i" is not recognised in while condition.
         */

        /*
         * Q.8
         * String name = "Mumbai";
         * 
         * System.out.println("Hello " + name);
         * 
         * --> Output: Hello Mumbai
         */

        /*
         * Q.9
         * for (int i = 10; i >= 10 && i <= 20; i++) {
         * System.out.println(i);
         * }
         */

        /*
         * Q.10
         * if(i = 10){
         * System.out.println("Success!");
         * }
         * 
         * -->> Output: 1. "i" is not initialised.
         * 2. "=" is not allowed, one should use "=="
         */

        /*
         * Q.11
         * int number = 10;
         * 
         * while (number < 20) {
         * 
         * number++;
         * 
         * System.out.println(number);
         * 
         * if (number == 0) {
         * 
         * break;
         * }
         * 
         * }
         * // using for loop --->>>
         * 
         * int num = 10;
         * for (int i = num; i < 20; i++) {
         * 
         * System.out.println(num);
         * 
         * if (i == 0) {
         * break;
         * }
         * }
         */

        /*
         * Q.12
         * int i = 9;
         * if (i < 10 || i == 15) {
         * i++;
         * System.out.println(i);
         * }
         * 
         * -->>> if condition is met then program increments the int i value and prints.
         */

        /*
         * Q.13
         * Scanner inp = new Scanner(System.in);
         * 
         * System.out.println("Enter Number: ");
         * int num = inp.nextInt();
         * 
         * int multiplicationTable;
         * 
         * System.out.println("Multiplication Table " + "of number " + num +
         * " is as follow: ");
         * 
         * for (int i = 1; i <= 10; i++) {
         * 
         * multiplicationTable = i * num;
         * 
         * System.out.println(i + " * " + num + " = " + multiplicationTable);
         * }
         * 
         * inp.close();
         */

        /*
         * Q.17
         * Scanner inp = new Scanner(System.in);
         * 
         * System.out.println("Enter Month (1-12): ");
         * int month = inp.nextInt();
         * 
         * switch (month) {
         * 
         * case 1:
         * System.out.println("JANUARY");
         * break;
         * case 2:
         * System.out.println("FEBRUARY");
         * break;
         * case 3:
         * System.out.println("MARCH");
         * break;
         * case 4:
         * System.out.println("APRIL");
         * break;
         * case 5:
         * System.out.println("MAY");
         * break;
         * case 6:
         * System.out.println("JUNE");
         * break;
         * case 7:
         * System.out.println("JULY");
         * break;
         * case 8:
         * System.out.println("AUGUST");
         * break;
         * case 9:
         * System.out.println("SEPTEMBER");
         * break;
         * case 10:
         * System.out.println("OCTOBER");
         * break;
         * case 11:
         * System.out.println("NOVEMBER");
         * break;
         * case 12:
         * System.out.println("DECEMBER");
         * break;
         * 
         * default:
         * System.out.println("NOT AVAILABLE");
         * break;
         * }
         * 
         * inp.close();
         */

        /*
         * Q.18
         * 
         * Scanner inp = new Scanner(System.in);
         * 
         * System.out.println("\n");
         * System.out.println("Simple Calculator");
         * System.out.println("------------------");
         * 
         * System.out.print("Enter First Number: ");
         * int Fnum = inp.nextInt();
         * 
         * System.out.print("Enter Second Number: ");
         * int Snum = inp.nextInt();
         * 
         * System.out.println("");
         * System.out.print("Choose an operation: \n");
         * System.out.println("1. Addition");
         * System.out.println("2. Subtraction");
         * System.out.println("3. Multiplication");
         * System.out.println("4. Division \n");
         * System.out.print("Enter Your Choice: ");
         * int yourChoice = inp.nextInt();
         * System.out.println("");
         * 
         * switch (yourChoice) {
         * case 1:
         * int addition = Fnum + Snum;
         * System.out.println("Result: " + Fnum + " + " + Snum + " = " + addition +
         * "\n");
         * break;
         * case 2:
         * int subtraction = Fnum - Snum;
         * System.out.println("Result: " + Fnum + " - " + Snum + " = " + subtraction +
         * "\n");
         * break;
         * case 3:
         * int multiplication = Fnum * Snum;
         * System.out.println("Result: " + Fnum + " * " + Snum + " = " + multiplication
         * + "\n");
         * break;
         * case 4:
         * int division = Fnum / Snum;
         * System.out.println("Result: " + Fnum + " / " + Snum + " = " + division +
         * "\n");
         * break;
         * 
         * default:
         * System.out.println("Invalid Input" + "\n");
         * break;
         * }
         * 
         * inp.close();
         */

         


        




    }

}
