package serialaz;

import java.io.*;

public class FileTestSerilas {
    public static void main(String[] args) throws IOException {
        File file = new File("text.txt");
        if (!(file.exists())) {
            file.createNewFile();
            System.out.println("exists");
        }
        FileWriter writer = new FileWriter(file);
        writer.write("srt1\n");
        writer.write("srt2\n");
        writer.flush();
        //   writer.close();
        // System.out.println(writer);

        FileReader fileReader = new FileReader(file);
       /* char[] c = new char[10];
        fileReader.read(c);
        System.out.println(c);*/

        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write("srt4");
        bufferedWriter.newLine();
        bufferedWriter.write("str5");
        bufferedWriter.flush();
        bufferedWriter.close();

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (bufferedReader.ready()) {
            System.out.println(bufferedReader.readLine());
        }
    }
}




/*if (file.isDirectory()) {
        System.out.println("derect " + file.getName());
    }
        if (file.isFile()) {
        System.out.println("file");
    }*/