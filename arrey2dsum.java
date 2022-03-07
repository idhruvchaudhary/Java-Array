import java.util.*;

public class arrey2dsum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];

        int i, j;

        System.out.println("enter the first 2d arrey1 = ");

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the first 2d arrey2 = ");

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                b[i][j] = sc.nextInt();
            }

        }

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("  " + c[i][j]);

            }
            System.out.print("\n");
        }

    }

}
