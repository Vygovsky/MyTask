package task2;

public class StringSwitch {
    public static void main(String[] args) {
        String[][] s = new String[3][6];
        for (int i = 0; i < s.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < s[0].length; j++) {
                System.out.println(" ");
                switch (i) {
                    case 0:
                        System.out.print("a" + (j + 1));
                        break;
                    case 1:
                        System.out.print("b" + (j + 1));
                        break;
                    case 2:
                        System.out.print("c" + (j + 1));
                        break;
                }
            }
        }
    }
}
