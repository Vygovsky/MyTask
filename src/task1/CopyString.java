package task1;

public class CopyString {
    public static void main(String[] args) {
        String[] s = {"a", "bb", "ccc"};

        for (String word : s) {
            System.out.println(word);

            System.out.println("-----------------------");

            StringBuilder sb = new StringBuilder(word);
            sb.append("aa");
            sb.append("bbbb");
            sb.append("ccccccccc");

            System.out.println(sb);
        }
    }
}
