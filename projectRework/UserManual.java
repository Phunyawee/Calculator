package projectRework;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class UserManual extends JFrame{
    public int helpvalue = 0;//user manual
    public String[] help={"1","2","3"};
    JComboBox helpBox = new JComboBox(help);
    Icon icon1 = new ImageIcon("\\Cpe\\first\\Term 2\\Program fun2\\Project\\for help\\basic\\11.png");
    Icon icon2 = new ImageIcon("\\Cpe\\first\\Term 2\\Program fun2\\Project\\for help\\basic\\22.png");
    Icon icon3 = new ImageIcon("\\Cpe\\first\\Term 2\\Program fun2\\Project\\for help\\basic\\33.png");
    Icon icon5 = new ImageIcon("\\Cpe\\first\\Term 2\\Program fun2\\Project\\for help\\function\\55.png");
    Icon icon6 = new ImageIcon("\\Cpe\\first\\Term 2\\Program fun2\\Project\\for help\\function\\66.png");
    public UserManual(int a){
        helpBox.setSelectedIndex(0);
        helpBox.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()== helpBox){//help
                    JComboBox cb = (JComboBox)e.getSource();
                    String msg = (String)cb.getSelectedItem();
                    switch (msg) {
                        case "1":helpvalue=1;
                            break;
                        case "2":helpvalue=2; 
                            break;
                        case "3":helpvalue=3;
                            break;
                        default:    
                    }
                }   
            }
        });
        if(a == 1){
        JDialog ka = new JDialog();
        JPanel ha = new JPanel();
        JLabel la = new JLabel("",SwingConstants.CENTER);
        ha.setLayout(new FlowLayout());
        ha.add(helpBox);
        JButton forhelp = new JButton("Select!");
        forhelp.addActionListener(new ActionListener(){    
            @Override
            public void actionPerformed(ActionEvent e){if(helpvalue==1){la.setIcon(icon1);la.setText("");}
        else if(helpvalue==2){la.setIcon(icon2);la.setText("");}
        else if(helpvalue==3){la.setIcon(icon3);la.setText("");}
        else{la.setText("Please select page");la.setIcon(null);}}});
        ha.add(forhelp);
        ha.add(la);
        ka.setTitle("Basic"); 
        ka.setSize(700, 430); 
        ka.setLocation(300, 200); 
        //===================
        ka.add(ha); 
        ka.setVisible(true); }
        else if(a==2){
            JDialog ka = new JDialog();
            JPanel ha = new JPanel();
            JLabel la = new JLabel("",SwingConstants.CENTER);
            ha.setLayout(new FlowLayout());
            ha.add(helpBox);
            JButton forhelp = new JButton("Select!");
            forhelp.addActionListener(new ActionListener(){    
                @Override
                public void actionPerformed(ActionEvent e){if(helpvalue==1){la.setIcon(icon5);la.setText("");}
            else if(helpvalue==2){la.setIcon(icon6);la.setText("");}
            else{la.setText("Page not found!");la.setIcon(null);}}});
            ha.add(forhelp);
            ha.add(la);
            ka.setTitle("Basic"); 
            ka.setSize(650, 400); 
            ka.setLocation(300, 200); 
            //===================
            ka.add(ha); 
            ka.setVisible(true); 
        }else if(a==3){
            JDialog dialog = new JDialog();
            dialog.setTitle("Button"); 
            dialog.setSize(653, 300); 
            dialog.setLocation(300, 200); 
            JPanel panel= new JPanel(); 
            Icon icon1 = new ImageIcon("\\Cpe\\first\\Term 2\\Program fun2\\Project\\for help\\button\\44.png");
            JLabel l2 = new JLabel(icon1,SwingConstants.CENTER);
            panel.add(l2); 
            dialog.getContentPane().add(panel); 
            dialog.setVisible(true);
        }
    }
    
    
}