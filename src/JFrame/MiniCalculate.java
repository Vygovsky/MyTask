package JFrame;

import javax.swing.*;

public class MiniCalculate {
    public static void main(String[] args) {
        String numb1 = JOptionPane.showInputDialog("Введи первое число");
        String numb2 = JOptionPane.showInputDialog("Введи второе число");

        int first = Integer.parseInt(numb1);
        int second = Integer.parseInt(numb2);

        int sum = first + second;
        JOptionPane.showMessageDialog(null, "Сумма равна = " + sum,
                "MiniCulculate", JOptionPane.PLAIN_MESSAGE);
    }
}
