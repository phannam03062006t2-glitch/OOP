import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextInt();
            System.out.println((n + 1) * n / 2);
        }
        sc.close();
    }
}