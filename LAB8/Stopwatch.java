import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class Stopwatch extends JFrame implements ActionListener {
    private JLabel timeLabel;
    private JButton startButton, stopButton, resetButton;
    private volatile boolean running = false;
    private int seconds = 0;
    private Thread timerThread;

    public Stopwatch() {
        setTitle("Stopwatch");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        timeLabel = new JLabel("Time: 0 s");
        timeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(timeLabel);
        
        startButton = new JButton("Start");
        stopButton = new JButton("Stop");
        resetButton = new JButton("Reset");
        
        startButton.addActionListener(this);
        stopButton.addActionListener(this);
        resetButton.addActionListener(this);
        
        add(startButton);
        add(stopButton);
        add(resetButton);
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            if (!running) {
                running = true;
                timerThread = new Thread(() -> {
                    while (running) {
                        try {
                            Thread.sleep(1000);
                            seconds++;
                            SwingUtilities.invokeLater(() -> timeLabel.setText("Time: " + seconds + " s"));
                        } catch (InterruptedException ex) {
                            Thread.currentThread().interrupt();
                        }
                    }
                });
                timerThread.start();
            }
        } else if (e.getSource() == stopButton) {
            running = false;
        } else if (e.getSource() == resetButton) {
            running = false;
            seconds = 0;
            timeLabel.setText("Time: 0 s");
        }
    }

    public static void main(String[] args) {
        new Stopwatch();
    }
}