
public class MustDoPatterns {

    public void pattern1(int num) {

        /*
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         */

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public void pattern2(int num) {

        /*
         * 
         * *
         * * *
         * * * *
         * * * * *
         */

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public void pattern3(int num) {

        /*
         * 1
         * 1 2
         * 1 2 3
         * 1 2 3 4
         * 1 2 3 4 5
         */

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void pattern4(int num) {

        /*
         * 1
         * 2 2
         * 3 3 3
         * 4 4 4 4
         * 5 5 5 5 5
         */

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public void pattern5(int num) {

        /*
         * * * * *
         * * * *
         * * *
         * *
         *
         */

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i + 1; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public void pattern6(int num) {

        /*
         * 1 2 3 4 5
         * 1 2 3 4
         * 1 2 3
         * 1 2
         * 1
         */

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void pattern7(int num) {

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(j);
                if (j == 5) {
                    System.out.println();
                }
            }
            System.out.println("* ");
            System.out.println();
        }
    }

    public static void main(String[] args) {

        MustDoPatterns obj = new MustDoPatterns();

        int num = 5;

        // obj.pattern1(num);
        // obj.pattern2(num);
        // obj.pattern3(num);
        // obj.pattern4(num);
        // obj.pattern5(num);
        // obj.pattern6(num);
        // obj.pattern7(num);
    }
}
