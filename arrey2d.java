import java.util.*;

public class arrey2d {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        int i, j;

        System.out.println("enter the value in arrey");

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();

            }
            System.out.print("\n");
        }

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(a[i][j]);

            }
            System.out.print("\n");
        }

    }

}
