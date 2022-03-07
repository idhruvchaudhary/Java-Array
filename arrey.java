import java.util.Scanner;

public class arrey {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int i, sum = 0;
        int a[] = new int[5];
        System.out.println("enter the value :");

        for (i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }
        System.out.println("sum =" + sum);
        System.out.println("average value =" + (sum / 5));

    }

}
