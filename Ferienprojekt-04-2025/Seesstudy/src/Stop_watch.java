import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.util.ArrayList;

public class Stop_watch extends JFrame implements ActionListener {
    private JLabel timeLabel;
    private JButton startButton, stopButton, resetButton;
    private Timer timer;
    private int elapsedTime;
    private UserPage up;

    private String Passwort;
    private String Benutzername;
    public Stop_watch() {

    }

    // Die clockWork-Methode erwartet nun userName und password als Parameter
    public void clockWork(String userNamee, String Password) throws NullPointerException {
        timeLabel = new JLabel("00:00:00", JLabel.CENTER);
        timeLabel.setFont(new Font("Arial", Font.PLAIN, 50));
        timeLabel.setForeground(Color.red);
        timeLabel.setForeground(new Color( 203, 16, 16));
        // Timer wird gestartet
        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                elapsedTime += 1000;
                updateTimeLabel();
                String password=Password;
                String userName=userNamee;
                setBenutzername(userName);
                setPasswort(password);


            }
        });


        stopButton = new JButton("Stop");
        stopButton.setForeground(new Color( 203, 16, 16));
        stopButton.addActionListener(this);
        stopButton.setBounds(0,60,20,30);
        resetButton = new JButton("Reset");
        resetButton.setForeground(new Color( 203, 16, 16));
        resetButton.addActionListener(this);
        startButton = new JButton("Start");
        startButton.setForeground(new Color( 203, 16, 16));
        startButton.addActionListener(this);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 3));

        buttonPanel.add(stopButton);
        buttonPanel.add(resetButton);
buttonPanel.add(startButton);
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(timeLabel, BorderLayout.CENTER);
        contentPane.add(buttonPanel, BorderLayout.SOUTH);
        contentPane.setBackground(new Color(255, 241, 225));
    }

    LocalTime time = LocalTime.now();

    // In actionPerformed werden die Parameter userName und password genutzt
    public void actionPerformed(ActionEvent e) {
        JFrame frame = new JFrame("Text Input Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        if (e.getSource() == stopButton) {
            LocalTime endTime = LocalTime.now();
            Studytimer st = new Studytimer();
            int myTime = st.getMyTime(time, endTime);
            Timetable tt = new Timetable();
            tt.insertuser(getBenutzername(),getPasswort(), myTime);
            JOptionPane.showMessageDialog(frame, "You studied: " + myTime + " minutes:)");



            timer.stop();
            this.dispose();

        } else if (e.getSource() == resetButton) {
            timer.stop();
            elapsedTime = 0;
            updateTimeLabel();
            LocalTime endTime = LocalTime.now();
            Studytimer st = new Studytimer();
            int myTime = st.getMyTime(time, endTime);
            Timetable tt = new Timetable();
            tt.insertuser(getBenutzername(),getPasswort(), myTime);
        } else if (e.getSource()==startButton) {
            timer.start();
        }


    }

    private void updateTimeLabel() {
        int hours = elapsedTime / 3600000;
        int minutes = (elapsedTime % 3600000) / 60000;
        int seconds = (elapsedTime % 60000) / 1000;
        String time = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        timeLabel.setText(time);
    }

    public String getBenutzername() {
        return Benutzername;
    }

    public void setBenutzername(String benutzername) {
        Benutzername = benutzername;
    }

    public String getPasswort() {
        return Passwort;
    }

    public void setPasswort(String passwort) {
        Passwort = passwort;
    }
}
