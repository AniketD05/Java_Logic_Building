
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

        // * its star pyramid

        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= num - i + 1; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(" * ");
            }

            System.out.println();

        }
    }

    public void pattern8(int num) {

        // * its upside down star pyramid

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= (2 * num) - (2 * i - 1); j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public void pattern9(int num) {
        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= num - i + 1; j++) {
                System.out.print("   ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("   ");
            }

            for (int j = 1; j <= 2 * num - (2 * i - 1); j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public void pattern10(int num) {

        /*
         * *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         */
        for (int i = 1; i <= 2 * num - 1; i++) {
            int stars = i;

            if (i > num) {
                stars = 2 * num - i;
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }

    public void pattern11(int num) {

        int pat = 1;

        for (int i = 1; i <= num; i++) {

            if (i % 2 == 0) {
                pat = 0;
            } else {
                pat = 1;
            }

            for (int j = 1; j <= i; j++) {

                System.out.print(pat);
                pat = 1 - pat;
            }
            System.out.println();
        }

    }

    public void pattern12(int num) {

        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            for (int j = 1; j <= 2 * num - (2 * i - 1); j++) {
                System.out.print("  ");
            }

            for (int j = 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
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
        // obj.pattern8(num);
        // obj.pattern9(num);
        // obj.pattern10(num);
        // obj.pattern11(num);
        obj.pattern12(num);
    }
}
