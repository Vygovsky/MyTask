package Threads.task5;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Roman_v on 14.12.2017.
 */
public class SimpleClock extends JFrame {
    private JLabel clockLabel = new JLabel();

    public SimpleClock() {
        setTitle("Clock");
        clockLabel.setHorizontalAlignment(SwingConstants.CENTER);

        Font f = new Font("Default", Font.BOLD + Font.ITALIC, 25);
        clockLabel.setFont(f);
        getContentPane().add(clockLabel);
        setBounds(400, 300, 300, 100);

        Thread t = new MyThread(this);
        t.start();
    }

    public void setTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy.HH:mm:ss");
        clockLabel.setText(simpleDateFormat.format(Calendar.getInstance().getTime()));
    }

    public static void main(String[] args) {
        SimpleClock simpleClock = new SimpleClock();
        simpleClock.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        simpleClock.setVisible(true);
    }

    class MyThread extends Thread {
        private SimpleClock clock;

        public MyThread(SimpleClock clock) {
            this.clock = clock;
        }

        @Override
        public void run() {
            while (true) {
                clock.setTime();
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        }
    }
}
