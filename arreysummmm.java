import java.util.*;

public class arreysummmm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];
        int sum = 0;

        int i;
        System.out.println("enter the neumber");
        for (i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        for (i = 0; i < 5; i++) {
            sum = sum + a[i];
        }

        System.out.println("your sum is = " + sum);

    }

}
