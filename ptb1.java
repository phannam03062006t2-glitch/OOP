import java.util.Scanner;

public class ptb1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();

            if (a == 0 && b == 0) {
                System.out.println("VSN");
            } else if (a == 0 && b != 0) {
                System.out.println("VN");
            } else {
                System.out.printf("%.2f\n", b * -1.0 / a);
            }
        }
    }
}
