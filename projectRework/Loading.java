package projectRework;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JWindow;
import javax.swing.SwingConstants;

import projectRework.Calculator;
/* w  w w. j a  v  a  2s .c  o  m*/
public class Loading extends JFrame {
  

  public Loading() {
    Icon icon = new ImageIcon("\\Cpe\\first\\Term 2\\Program fun2\\Project\\projectRework\\loadingShowT.png");
    JLabel la = new JLabel("", SwingConstants.CENTER);
    la.setIcon(icon);
    JWindow window = new JWindow();

    window.getContentPane().add(la);
    window.setBounds(170, 50, 1000, 500);
    window.setVisible(true);
    try {
      Thread.sleep(1200);
    } catch (InterruptedException e) {
    }
    window.setVisible(false);
    new Builder();
    new Calculator();
    window.dispose();
  }
  public static void main(String[] args) {
    new Loading();
  }
}