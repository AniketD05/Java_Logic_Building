import java.util.Scanner;

public class ArrayPracticeLect {

    public static void main(String[] args) {

        // int a[] = { 1, 2, 3, 4, 5, 6 };

        // System.out.println(a[1]);

        // for (int i = 0; i < a.length; i++) {
        // System.out.println("Number: " + a[i] + " is present in given Array at Index:
        // " + i);

        // }
        // int c[] = { 12, 34, 56, 78, 'a' };
        // for (int i = 0; i < c.length; i++)
        // System.out.println("Number: " + c[i] + " is present in given Array at Index:
        // " + i);
        // }

        // for (int i : a) {
        // System.out.println(i);
        // }

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = inp.nextLine();

        System.out.println(name);

        inp.close();

    }

}
