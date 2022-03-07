import java.util.*;

public class arreysorting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int i, j, n, temp = 0;
        int a[] = new int[50];

        System.out.println("how many element you want to insert :");
        n = sc.nextInt();

        System.out.println("enter element ");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (i = 0; i < n - i; i++) {
            for (j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
            }
        }

        System.out.println("ascending list");

        for (i = 0; i < n; i++) {
            System.out.println(a[i]);

        }

        for (i = 0; i < n - i; i++) {
            for (j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("descending list");

        for (i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

    }

}
// int a[][]=new int[3][3];
// a[i][j]=sc.nextInt();