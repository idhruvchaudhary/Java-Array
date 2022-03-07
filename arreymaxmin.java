import java.util.*;

public class arreymaxmin {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        int i, b, min = 0, max = 0;

        System.out.println("how many number you insert = ");
        b = sc.nextInt();

        System.out.println("enter the value  =  ");

        for (i = 0; i < b; i++) {
            a[i] = sc.nextInt();
        }
        min = a[0];

        a[b] = max;
        for (i = 0; i < b; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        a[b] = min;
        for (i = 0; i < b; i++) {
            if (a[i] < min)

            {
                min = a[i];
            }
        }

        System.out.println("maximum number =  " + max);
        System.out.println("minimum number  = " + min);

    }

}
