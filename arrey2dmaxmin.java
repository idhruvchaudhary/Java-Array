import java.util.*;

public class arrey2dmaxmin {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a[][] = new int[3][3];
        int i, j = 0, min = 0, max = 0;

        System.out.println("enter the value for 2d arrey = ");

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();

            }
            System.out.print("\n");
        }

        min = a[0][0];

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (a[i][j] < min) {
                    a[i][j] = min;
                }
            }
        }

        System.out.println("min value is = " + min);

        max = a[0][0];

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }

        System.out.println("max number is " + max);

    }

}
