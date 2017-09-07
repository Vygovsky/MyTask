package task1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class ScanDemo {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        getWord(sc2,args[0]);
    }

    public static void getWord(Scanner sc, String arg) {
        FileWriter wf=null;
        try {
            wf = new FileWriter("src\\task1\\Argument2.txt",false);
            String s = sc.nextLine().toLowerCase();
            if (s.contains(arg.toLowerCase())) {
                wf.write(s);
                wf.flush();
            }else {
                System.out.println("Слово не найдено");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                wf.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}