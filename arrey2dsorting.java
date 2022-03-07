import java.util.*;

public class arrey2dsorting {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a[][] = new int[3][3];
        int i, j;

        System.out.println("enter the value for sorting  = ");

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();

            }
            System.out.print("\n");
        }

    }

}
