package task1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class ScanDemo {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        getWord(sc2);
    }

    public static void getWord(Scanner sc) {
        try {
            FileWriter wf = new FileWriter("Argument2.txt",false);
            String s = sc.nextLine();
            if (s.contains("яйц")) {
                wf.write(s);
                wf.flush();
            }else {
                System.out.println("Слово не найдено");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}