
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUI {
    public static void main(String[] args){
JFrame frame=new JFrame("Calculator");
frame.setSize(500,400);
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setLayout(null);







JTextField t2=new JTextField(10);
t2.setBounds(150,10,250,100);

frame.add(t2);



        JButton btn_1=new JButton("1");
        btn_1.setBounds(100,150,100,90);
        btn_1.setBackground(new Color(54, 117, 136));
        frame.add(btn_1);

        JButton btn_2=new JButton("2");
        btn_2.setBounds(220,150,100,90);
        btn_2.setBackground(new Color(54, 117, 136));
        frame.add(btn_2);

        JButton btn_3=new JButton("3");
        btn_3.setBounds(340,150,100,90);
        btn_3.setBackground(new Color(54, 117, 136));
        frame.add(btn_3);

        JButton btn_A=new JButton("×");
        btn_A.setBounds(460,150,100,90);
        btn_A.setBackground(new Color(220, 138, 104));
        frame.add(btn_A);



        JButton btn_4=new JButton("4");
        btn_4.setBounds(100,250,100,90);
        btn_4.setBackground(new Color(54, 117, 136));
        frame.add(btn_4);

        JButton btn_5=new JButton("5");
        btn_5.setBounds(220,250,100,90);
        btn_5.setBackground(new Color(54, 117, 136));
        frame.add(btn_5);

        JButton btn_6=new JButton("6");
        btn_6.setBounds(340,250,100,90);
        btn_6.setBackground(new Color(54, 117, 136));
        frame.add(btn_6);


        JButton btn_B=new JButton("-");
        btn_B.setBounds(460,250,100,90);
        btn_B.setBackground(new Color(220, 138, 104));
        frame.add(btn_B);










        JButton btn_7=new JButton("7");
        btn_7.setBounds(100,350,100,90);
        btn_7.setBackground(new Color(54, 117, 136));
        frame.add(btn_7);

        JButton btn_8=new JButton("8");
        btn_8.setBounds(220,350,100,90);
        btn_8.setBackground(new Color(54, 117, 136));
        frame.add(btn_8);

        JButton btn_9=new JButton("9");
        btn_9.setBounds(340,350,100,90);
        btn_9.setBackground(new Color(54, 117, 136));
        frame.add(btn_9);


        JButton btn_C=new JButton("+");
        btn_C.setBounds(460,350,100,90);
        btn_C.setBackground(new Color(220, 138, 104));
        frame.add(btn_C);





        JLabel result = new JLabel("        ");
        result.setBounds(200,250,120,30);
        result.setForeground(Color.BLUE);
        result.setFont(new Font("Arial",Font.BOLD,25));

/*btn.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent ea) {
        int n1= Integer.parseInt(t1.getText());
        int n2= Integer.parseInt(t2.getText());
        int sum=n1+n2;
        frame.add(result);
        result.setText("Sum: "+sum);
    }
}); */


    }


}
