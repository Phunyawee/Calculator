package projectRework;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Builder extends JFrame {
    JDialog c = new JDialog();
    public Builder(){
        JLabel a = new JLabel();JLabel aa = new JLabel();JLabel aaa = new JLabel();
        Button b = new Button("Exit");
        Font font = new Font("Courier",Font.BOLD,25);
        a.setText("Phunyawee Somabutra");a.setFont(font);
        aa.setText("No.30");aa.setFont(font);
        aaa.setText("Lecture:800 Lab:830");aaa.setFont(font);
        b.setFont(new Font("Courier",Font.BOLD,15));
        b.addActionListener(new exitApp());
        c.setLayout(new FlowLayout());
        c.add(a,SwingConstants.CENTER);c.add(aa);c.add(aaa);c.add(b);
        c.setSize(300,200);
        c.setVisible(true);
        c.setTitle("Info");

    }
    class exitApp implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            c.setVisible(false);
        }
    }
    
}