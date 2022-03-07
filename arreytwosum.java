import java.util.*;

public class arreytwosum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[10];
        int b[] = new int[10];
        int c[] = new int[10];

        int i, z;

        System.out.println("how many number add you for sum");
        z = sc.nextInt();

        System.out.println("enter the values for arrey 1");

        for (i = 0; i < z; i++) {
            a[i] = sc.nextInt();

        }

        System.out.println("enter the values for arrey2");

        for (i = 0; i < z; i++) {
            b[i] = sc.nextInt();

        }

        for (i = 0; i < z; i++) {
            c[i] = a[i] + b[i];

        }

        System.out.println("here is the sum of two arrey");

        for (i = 0; i < z; i++) {
            System.out.println(c[i]);

        }
    }

}
