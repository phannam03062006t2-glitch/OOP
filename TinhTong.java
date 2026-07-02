import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();
        int h = sc.nextInt();

        if (w <= 0 || h <= 0) {
            System.out.println(0);
        } else {
            System.out.println(2 * (w + h) + " " + w * h);
        }
        sc.close();
    }
}