import java.util.*;

public class areyoddeven {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];
        int i;

        System.out.println("enter the values");

        for (i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("odd number = ");
        for (i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                System.out.print(a[i] + ",");
            }
        }

        System.out.print("\neven number = ");
        for (i = 0; i < 5; i++) {
            if (i % 2 == 1) {
                System.out.print(a[i] + ",");
            }
        }
    }

}
