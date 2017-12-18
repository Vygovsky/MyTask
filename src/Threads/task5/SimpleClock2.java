package Threads.task5;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Roman_v on 18.12.2017.
 */
public class SimpleClock2 extends JFrame {
    private JLabel clockLabel = new JLabel();

    public SimpleClock2() {
        setTitle("Clock2");
        clockLabel.setHorizontalAlignment(SwingConstants.CENTER);

        Font f = new Font("Default", Font.BOLD + Font.ITALIC, 25);
        clockLabel.setFont(f);
        getContentPane().add(clockLabel);
        setBounds(400, 300, 300, 100);

        Thread t = new MyThread(this);
        t.start();
    }
    public void setTime() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy.HH:mm:ss");
                clockLabel.setText(simpleDateFormat.format(Calendar.getInstance().getTime()));
            }
        });
    }

    public static void main(String[] args) {
        SimpleClock simpleClock = new SimpleClock();
        simpleClock.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        simpleClock.setVisible(true);
    }


    class MyThread extends Thread {
        private SimpleClock2 clock2;

        public MyThread(SimpleClock2 clock2) {
            this.clock2 = clock2;
        }
        @Override
        public void run() {
            while (true) {
                clock2.setTime();
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        }
    }
}


