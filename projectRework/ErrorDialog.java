package projectRework;
import javax.swing.*;
import java.awt.*;

class ErrorDialog{
    private int type;//type of error
    Font font1 = new Font("Courier",Font.BOLD,15);
    public ErrorDialog(){
        this.type = 0;
    }
    public ErrorDialog(int type){
        this.type = type;
    }
    public void showError(){
        if(this.type==1){
            JDialog dialog = new JDialog();
            dialog.setTitle("Error"); 
            dialog.setSize(300, 100); 
            dialog.setLocation(300, 200); 
            JPanel panel= new JPanel(); 
            JLabel l2 = new JLabel("Error : Invalid format");
            l2.setFont(font1);
            panel.add(l2); 
            dialog.getContentPane().add(panel); 
            dialog.setVisible(true);
        }else if(this.type==2){
            JDialog dialog = new JDialog();
            dialog.setTitle("Error"); 
            dialog.setSize(300, 100); 
            dialog.setLocation(300, 200); 
            JPanel panel= new JPanel(); 
            JLabel l2 = new JLabel("Enter only number");
            panel.add(l2); 
            dialog.getContentPane().add(panel); 
            dialog.setVisible(true);

        }else if(this.type==3){
            JDialog dialog = new JDialog();
            dialog.setTitle("Error"); 
            dialog.setSize(300, 100); 
            dialog.setLocation(300, 200); 
            JPanel panel= new JPanel(); 
            JLabel l2 = new JLabel("Only using after use operation");
            panel.add(l2); 
            dialog.getContentPane().add(panel); 
            dialog.setVisible(true);
            
        }else if(this.type==4){
            JDialog dialog = new JDialog();
            dialog.setTitle("Operator not found"); 
            dialog.setSize(300, 100); 
            dialog.setLocation(300, 200); 
            JPanel panel= new JPanel(); 
            JLabel l2 = new JLabel("Please select operator");
            panel.add(l2); 
            dialog.getContentPane().add(panel); 
            dialog.setVisible(true);
        }else if(this.type==5){
            JDialog dialog = new JDialog();
            dialog.setTitle("Error"); 
            dialog.setSize(300, 100); 
            dialog.setLocation(300, 200); 
            JPanel panel= new JPanel(); 
            JLabel l2 = new JLabel("Error : Condition fail");
            l2.setFont(font1);
            panel.add(l2); 
            dialog.getContentPane().add(panel); 
            dialog.setVisible(true);
        }else if(this.type==6){
            JDialog dialog = new JDialog();
            dialog.setTitle("Error"); 
            dialog.setSize(300, 100); 
            dialog.setLocation(300, 200); 
            JPanel panel= new JPanel(); 
            JLabel l2 = new JLabel("Please enter number");
            panel.add(l2); 
            dialog.getContentPane().add(panel); 
            dialog.setVisible(true);
        }else if(this.type==7){
            JDialog dialog = new JDialog();
            dialog.setTitle("Error"); 
            dialog.setSize(300, 100); 
            dialog.setLocation(300, 200); 
            JPanel panel= new JPanel(); 
            JLabel l2 = new JLabel("Can't open while using BaseNumber");
            panel.add(l2); 
            dialog.getContentPane().add(panel); 
            dialog.setVisible(true);
        }else if(this.type==8){
            JDialog dialog = new JDialog();
            dialog.setTitle("Error"); 
            dialog.setSize(300, 100); 
            dialog.setLocation(300, 200); 
            JPanel panel= new JPanel(); 
            JLabel l2 = new JLabel("Detected character, Can't use.");
            panel.add(l2); 
            dialog.getContentPane().add(panel); 
            dialog.setVisible(true);
        }

    }
}