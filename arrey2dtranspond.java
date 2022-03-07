import java.util.*;

public class arrey2dtranspond {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i, j;

        int a[][] = new int[3][3];

        int trans[][] = new int[3][3];

        System.out.println("enter the value for 2d arrey  =  ");

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(a[i][j]);
            }
            System.out.print("\n");
        }

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                trans[i][j] = a[i][j];
            }
        }

        System.out.print("\n");
        System.out.print("\n");

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(trans[j][i]);
            }
            System.out.print("\n");

        }

    }

}
