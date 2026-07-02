import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class main {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(new File("Hello.txt"));

            while(sc.hasNext()){
                System.out.println(sc.nextLine());
            }
        }
        catch(IOException){

        }
    }
}