package Threads.task6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class StartStopClock extends JFrame implements ActionListener {
    private JLabel clockLabel = new JLabel();
    private static final String START = "START";
    private static final String STOP = "STOP";
    private ClockThread clockThread = null;


    public StartStopClock() {

        setTitle("Clock2");
        clockLabel.setHorizontalAlignment(SwingConstants.CENTER);

        Font f = new Font("Default", Font.BOLD + Font.ITALIC, 25);
        clockLabel.setFont(f);
        add(clockLabel);

        setBounds(400, 300, 300, 200);

        JButton start = new JButton(START);
        start.setActionCommand(START);
        start.addActionListener(this);
        add(start, BorderLayout.NORTH);

        JButton stop = new JButton(STOP);
        stop.setActionCommand(STOP);
        stop.addActionListener(this);
        add(stop, BorderLayout.SOUTH);
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
        StartStopClock ssc = new StartStopClock();
        ssc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ssc.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (START.equals(e.getActionCommand())) {
            if (clockThread == null) {
                clockThread = new ClockThread(this);
                clockThread.start();
            }
        }
        if (STOP.equals(e.getActionCommand())) {
            if (clockThread != null) {
                clockThread.stopClock();
                clockThread = null;
            }
        }
    }
}

class ClockThread extends Thread {
    private StartStopClock clock;
    private volatile boolean isRunning = true;

    public ClockThread(StartStopClock startStopClock) {
        this.clock = startStopClock;
    }

    public void stopClock() {
        isRunning = false;
    }

    @Override
    public void run() {
        while (isRunning) {
            clock.setTime();
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }
    }
}





