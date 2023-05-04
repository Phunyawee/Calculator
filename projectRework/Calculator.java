package projectRework;
import java.awt.*;
import java.awt.Color;
import javax.swing.*;
import java.util.concurrent.TimeUnit;
import java.awt.event.*;
import java.text.DecimalFormat; 

public class Calculator extends JFrame implements ActionListener
{
    DecimalFormat df1 = new DecimalFormat("0.###"); 
    public JDialog scient;
    public JTextField t, t1;//for input number for calculate
    public JMenu menu,submenu,tools; 
    public JLabel label1,label2;//Result&Selector
    public String forLabel;//setSelector
    public JMenuItem sci;//scientific 
    public String a,a1;//store value from textfield
    public Double backWard;//getAnswer from Calculate but forpow only for Scientific func
    public String[] tarn={"Binary","Decimal","Octal","Hexadecimal"};
    JComboBox comboBox1 = new JComboBox(tarn);//base 
    JComboBox comboBox2 = new JComboBox(tarn);//base 
    public String[] perntee={"Acres(ac)","Ares(a)","Hectares(ha)","SquareCentimeters(cm**2)","SquareFeet(ft**2)","SquareInches(in**2)","SquareMeters(m**2)"};
    JComboBox are1 = new JComboBox(perntee);//area
    JComboBox are2 = new JComboBox(perntee);
    public String[] unapum = {"Celsius","Fahrenheit","Kelvin","Romer"};
    JComboBox temp1 = new JComboBox(unapum);//temperature
    JComboBox temp2 = new JComboBox(unapum);
    public String[] vela = {"Milliseconds","Seconds(s)","Minutes(min)","Hours(h)","Days(d)","Weeks(wk)"};
    JComboBox tim1 = new JComboBox(vela);//time
    JComboBox tim2 = new JComboBox(vela);
    public String[] kamuyau = {"Millimeters(mm)","Centimeters(cm)","Meters(m)","Kilometers(km)","Inches(in)","Feet(ft)","Yards(yd)","Miles(mi)","Nautical miles(NM)","Mils(mil)"};
    JComboBox len1 = new JComboBox(kamuyau);//length
    JComboBox len2 = new JComboBox(kamuyau);
    public Double forpow2;
    //numPad==========================================================================================
    final String first = "1";final String second = "2";
    final String third = "3";final String fourth = "4";
    final String fifth = "5";final String sixth = "6";
    final String seventh = "7";final String eighth = "8";
    final String ninth = "9";final String zero = "0";
    final String dot = ".";
    //=======================================================
    final String aaa = "A";final String bbb = "B";final String ccc = "C";
    final String ddd = "D";final String eee = "E";final String fff = "F";
    //================================================================================================
    public Long dy,hr,min,sec,ms;//time
    public Long millL,secL,minL,hourL,dayL,weekL;
    public String ansTimeStr;
    //temperature
    public String ansTempStr;
    public Double celD,fahD,kelD,romD;
    //public Double ansTempDou;
    //area
    public Double areaDou,ansArea;public String areaStr;//Display area
    //lenght
    public Double lenDou,ansLength;public String lengthStr;//Show
    public String tem1 = "";public String tem2 = "";//tempurature show
    public String timeS1 = "";public String timeS2 = "";//time show
    public String bas1 = "";public String bas2 = "";//base show
    public String areaS1 = "";public String areaS2 = "";//area show
    public String lengthS1 = "";public String lengthS2 = "";//length show
    ButtonGroup checkboxGroup;//for operation
    public JCheckBox check1,check2,check3,check4,check5,checkText1,checkText2,checkText3;//Operation&NumberPad_Select
    public int checkBoxHander=0;public int checkBoxHanderText,checkBoxHanderText2,checkBoxHanderText3;//Operator such as +
    public int ready = 0;//check minus in field 1
    public int ready1 = 0;//check minus in field 2
    public int ready3 = 0;//check minus in Display
    public int colorful = 1;//for color switch
    public int mode = 0;//for convert mode
    public int modeConvert =0;public int modeConvert2 =0;//for base number
    public int sciOpen = 0;
    public int temperature = 0;public int temperature1 = 0;//for convert_temperature
    public int time1 = 0;public int time2 = 0;//time convert
    public int area1 = 0;public int area2 = 0;//area convert
    public int length1 = 0;public int length2 = 0;//length convert
    public int convertOpenNow = 0;//0= off 1=on
    Button btn6,btn8 ;
    public Calculator()
    { super("Calculator");
        Container container = getContentPane();
        JMenuBar menuBar = new JMenuBar();
        //Length=========================================================================================================
        len1.setSelectedItem(0);
        len1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()== len1){
                    JComboBox cb = (JComboBox)e.getSource();
                    String msg = (String)cb.getSelectedItem();
                    switch (msg) {
                        case "Millimeters(mm)": lengthS1 = "";lengthS1="Millimeters";t.setText("Millimeters here");t1.setBackground(null);t1.setEditable(false);
                        mode = 3;length1 = 1;label2.setText("Select: Length("+(lengthS1+" to "+lengthS2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                        check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                            break;
                        case "Centimeters(cm)":lengthS1 = "";lengthS1="Centimeters";t.setText("Centimeters here");t1.setBackground(null);t1.setEditable(false);
                        mode = 3;length1 = 2;label2.setText("Select: Length("+(lengthS1+" to "+lengthS2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                        check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                            break;
                        case "Meters(m)":lengthS1 = "";lengthS1="Meters";t.setText("Meters here");t1.setBackground(null);t1.setEditable(false);
                        mode = 3;length1 = 3;label2.setText("Select: Length("+(lengthS1+" to "+lengthS2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                        check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                            break;
                        case "Kilometers(km)":lengthS1 = "";lengthS1="Kilometers";t.setText("Kilometers here");t1.setBackground(null);t1.setEditable(false);
                        mode = 3;length1 = 4;label2.setText("Select: Length("+(lengthS1+" to "+lengthS2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                        check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                            break;
                        case "Inches(in)":lengthS1 = "";lengthS1="Inches";t.setText("Inches here");t1.setBackground(null);t1.setEditable(false);
                        mode = 3;length1 = 5;label2.setText("Select: Length("+(lengthS1+" to "+lengthS2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                        check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                            break;
                        case "Feet(ft)":lengthS1 = "";areaS1="Feet";t.setText("Feet here");t1.setBackground(null);t1.setEditable(false);
                        mode = 3;length1 = 6;label2.setText("Select: Length("+(lengthS1+" to "+lengthS2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                        check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                            break;
                        case "Yards(yd)":lengthS1 = "";lengthS1="Yards";t.setText("Yards here");t1.setBackground(null);t1.setEditable(false);
                        mode = 3;length1 = 7;label2.setText("Select: Length("+(lengthS1+" to "+lengthS2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                        check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                            break;
                        case "Miles(mi)":lengthS1 = "";lengthS1="Miles";t.setText("Miles here");t1.setBackground(null);t1.setEditable(false);
                        mode = 3;length1 = 8;label2.setText("Select: Length("+(lengthS1+" to "+lengthS2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                        check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                            break;
                        case "Nautical miles(NM)":lengthS1 = "";lengthS1="Nautical miles";t.setText("Nautical miles here");t1.setBackground(null);
                        mode = 3;length1 = 9;label2.setText("Select: Length("+(lengthS1+" to "+lengthS2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                        check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                            break;
                        case "Mils(mil)":lengthS1 = "";lengthS1="Mils";t.setText("Mils here");t1.setBackground(null);t1.setEditable(false);
                        mode = 3;length1 = 10;label2.setText("Select: Length("+(lengthS1+" to "+lengthS2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                        check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                            break; 
                        default:label1.setText("Error");
                    }
                }     
            }
        });
        len2.setSelectedItem(0);
        len2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()== len2){
                    JComboBox cb = (JComboBox)e.getSource();
                    String msg = (String)cb.getSelectedItem();
                    switch (msg) {
                        case "Millimeters(mm)": lengthS2 = "";lengthS2="Millimeters";t1.setBackground(null);t1.setEditable(false);check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                        mode = 3;length2 = 1;label2.setText("Select: Length("+(lengthS1+" to "+lengthS2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                            break;
                        case "Centimeters(cm)":lengthS2 = "";lengthS2="Centimeters";t1.setBackground(null);t1.setEditable(false);check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                        mode = 3;length2 = 2;label2.setText("Select: Length("+(lengthS1+" to "+lengthS2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                            break;
                        case "Meters(m)":lengthS2 = "";lengthS2="Meters";t1.setBackground(null);t1.setEditable(false);check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                        mode = 3;length2 = 3;label2.setText("Select: Length("+(lengthS1+" to "+lengthS2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                            break;
                        case "Kilometers(km)":lengthS2 = "";lengthS2="Kilometers";t1.setBackground(null);t1.setEditable(false);check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                        mode = 3;length2 = 4;label2.setText("Select: Length("+(lengthS1+" to "+lengthS2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                            break;
                        case "Inches(in)":lengthS2 = "";lengthS2="Inches";t1.setBackground(null);t1.setEditable(false);check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                        mode = 3;length2 = 5;label2.setText("Select: Length("+(lengthS1+" to "+lengthS2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                            break;
                        case "Feet(ft)":lengthS2 = "";lengthS2="Feet";t1.setBackground(null);t1.setEditable(false);check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                        mode = 3;length2 = 6;label2.setText("Select: Length("+(lengthS1+" to "+lengthS2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                            break;
                        case "Yards(yd)":lengthS2 = "";lengthS2="Yards";t1.setBackground(null);t1.setEditable(false);check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                        mode = 3;length2 = 7;label2.setText("Select: Length("+(lengthS1+" to "+lengthS2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                            break;
                        case "Miles(mi)":lengthS2 = "";lengthS2="Miles";t1.setBackground(null);t1.setEditable(false);check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                        mode = 3;length2 = 8;label2.setText("Select: Length("+(lengthS1+" to "+lengthS2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                            break;
                        case "Nautical miles(NM)":lengthS2 = "";lengthS2="Nautical miles";t1.setBackground(null);t1.setEditable(false);check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                        mode = 3;length2 = 9;label2.setText("Select: Length("+(lengthS1+" to "+lengthS2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                            break;
                        case "Mils(mil)":lengthS2 = "";lengthS2="Mils";t1.setBackground(null);t1.setEditable(false);check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                        mode = 3;length2 = 10;label2.setText("Select: Length("+(lengthS1+" to "+lengthS2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                            break; 
                        default:label1.setText("Error");
                    }
                }     
            }
        });
        //Area===========================================================================================================
        are1.setSelectedItem(0);
        are1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()== are1){
                    JComboBox cb = (JComboBox)e.getSource();
                    String msg = (String)cb.getSelectedItem();
                    switch (msg) {
                        case "Acres(ac)": areaS1 = "";areaS1="Acres";t.setText("Acres here");t1.setBackground(null);t1.setEditable(false);check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                        mode = 2;area1 = 1;label2.setText("Select: Area("+(areaS1+" to "+areaS2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                            break;
                        case "Ares(a)":areaS1 = "";areaS1="Ares";t.setText("Ares here");t1.setBackground(null);t1.setEditable(false);check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                        mode = 2;area1 = 2;label2.setText("Select: Area("+(areaS1+" to "+areaS2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                            break;
                        case "Hectares(ha)":areaS1 = "";areaS1="Hectares";t.setText("Hectares here");t1.setBackground(null);t1.setEditable(false);check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                        mode = 2;area1 = 3;label2.setText("Select: Area("+(areaS1+" to "+areaS2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                            break;
                        case "SquareCentimeters(cm**2)":areaS1 = "";areaS1="SquareCentimeters";t.setText("SquareCentimeters here");t1.setBackground(null);t1.setEditable(false);check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                        mode = 2;area1 = 4;label2.setText("Select: Area("+(areaS1+" to "+areaS2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                            break;
                        case "SquareFeet(ft**2)":areaS1 = "";areaS1="SquareFeet";t.setText("SquareFeet here");t1.setBackground(null);t1.setEditable(false);check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                        mode = 2;area1 = 5;label2.setText("Select: Area("+(areaS1+" to "+areaS2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                            break;
                        case "SquareInches(in**2)":areaS1 = "";areaS1="SquareInches";t.setText("SquareInches here");t1.setBackground(null);t1.setEditable(false);check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                        mode = 2;area1 = 6;label2.setText("Select: Area("+(areaS1+" to "+areaS2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                            break;
                        case "SquareMeters(m**2)":areaS1 = "";areaS1="SquareMeters";t.setText("SquareMeters here");t1.setBackground(null);t1.setEditable(false);check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                        mode = 2;area1 = 7;label2.setText("Select: Area("+(areaS1+" to "+areaS2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                            break;
                        default:label1.setText("Error");
                    }
                }     
            }
        });
        are2.setSelectedItem(0);
        are2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()== are2){
                    JComboBox cb = (JComboBox)e.getSource();
                    String msg = (String)cb.getSelectedItem();
                    switch (msg) {
                        case "Acres(ac)": areaS2 = "";areaS2="Acres";t1.setBackground(null);t1.setEditable(false);
                        mode = 2;area2 = 1;label2.setText("Select: Area("+(areaS1+" to "+areaS2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                        check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                            break;
                        case "Ares(a)":areaS2 = "";areaS2="Ares";t1.setBackground(null);t1.setEditable(false);
                        mode = 2;area2 = 2;label2.setText("Select: Area("+(areaS1+" to "+areaS2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                        check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                            break;
                        case "Hectares(ha)":areaS2 = "";areaS2="Hectares";t1.setBackground(null);t1.setEditable(false);
                        mode = 2;area2 = 3;label2.setText("Select: Area("+(areaS1+" to "+areaS2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                        check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                            break;
                        case "SquareCentimeters(cm**2)":areaS2 = "";areaS2="SquareCentimeters";t1.setBackground(null);t1.setEditable(false);
                        check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                        mode = 2;area2 = 4;label2.setText("Select: Area("+(areaS1+" to "+areaS2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                            break;
                        case "SquareFeet(ft**2)":areaS2 = "";areaS2="SquareFeet";t1.setBackground(null);t1.setEditable(false);
                        check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                        mode = 2;area2 = 5;label2.setText("Select: Area("+(areaS1+" to "+areaS2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                            break;
                        case "SquareInches(in**2)":areaS2 = "";areaS2="SquareInches";t1.setBackground(null);t1.setEditable(false);
                        check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                        mode = 2;area2 = 6;label2.setText("Select: Area("+(areaS1+" to "+areaS2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                            break;
                        case "SquareMeters(m**2)":areaS2 = "";areaS2="SquareMeters";t1.setBackground(null);t1.setEditable(false);
                        check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                        mode = 2;area2 = 7;label2.setText("Select: Area("+(areaS1+" to "+areaS2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                            break;
                        default:label1.setText("Error");
                    }
                }     
            }
        });
        //Time================================================================================================
        tim1.setSelectedItem(0);
        tim1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()== tim1){
                    JComboBox cb = (JComboBox)e.getSource();
                    String msg = (String)cb.getSelectedItem();
                    switch (msg) {
                        case "Milliseconds": timeS1 = "";timeS1="Milliseconds";t.setText("Milliseconds here");t1.setBackground(null);t1.setEditable(false);
                        mode = 6;time1 = 1;label2.setText("Select: Time("+(timeS1+" to "+timeS2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                        check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                            break;
                        case "Seconds(s)":timeS1 = "";timeS1="Seconds(s)";t.setText("Seconds(s) here");t1.setBackground(null);t1.setEditable(false);
                        mode = 6;time1 = 2;label2.setText("Select: Time("+(timeS1+" to "+timeS2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                        check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                            break;
                        case "Minutes(min)":timeS1 = "";timeS1="Minutes(min)";t.setText("Minutes(min) here");t1.setBackground(null);t1.setEditable(false);
                        mode = 6;time1 = 3;label2.setText("Select: Time("+(timeS1+" to "+timeS2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                        check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                            break;
                        case "Hours(h)":timeS1 = "";timeS1="Hours(h)";t.setText("Hours(h) here");t1.setBackground(null);t1.setEditable(false);
                        mode = 6;time1 = 4;label2.setText("Select: Time("+(timeS1+" to "+timeS2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                        check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                            break;
                        case "Days(d)":timeS1 = "";timeS1="Days(d)";t.setText("Days(d) here");t1.setBackground(null);t1.setEditable(false);
                        mode = 6;time1 = 5;label2.setText("Select: Time("+(timeS1+" to "+timeS2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                        check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                            break;
                        case "Weeks(wk)":timeS1 = "";timeS1="Weeks(wk)";t.setText("Weeks(wk) here");t1.setBackground(null);t1.setEditable(false);
                        mode = 6;time1 = 6;label2.setText("Select: Time("+(timeS1+" to "+timeS2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                        check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                            break;
                        default:label1.setText("Error");
                    }
                }     
            }
        });
        tim2.setSelectedItem(0);
        tim2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()== tim2){
                    JComboBox cb = (JComboBox)e.getSource();
                    String msg = (String)cb.getSelectedItem();
                    switch (msg) {
                        case "Milliseconds": timeS2 = "";timeS2="Milliseconds";t1.setBackground(null);t1.setEditable(false);
                        mode = 6;time2 = 1;label2.setText("Select: Time("+(timeS1+" to "+timeS2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                        check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                            break;
                        case "Seconds(s)":timeS2 = "";timeS2="Seconds(s)"; t1.setBackground(null);t1.setEditable(false);
                        mode = 6;time2 = 2;label2.setText("Select: Time("+(timeS1+" to "+timeS2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                        check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                            break;
                        case "Minutes(min)":timeS2 = "";timeS2="Minutes(min)";t1.setBackground(null);t1.setEditable(false);
                        mode = 6;time2 = 3;label2.setText("Select: Time("+(timeS1+" to "+timeS2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                        check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                            break;
                        case "Hours(h)":timeS2 = "";timeS2="Hours(h)";t1.setBackground(null);t1.setEditable(false);
                        mode = 6;time2 = 4;label2.setText("Select: Time("+(timeS1+" to "+timeS2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                        check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                            break;
                        case "Days(d)":timeS2 = "";timeS2="Days(d)";t1.setBackground(null);t1.setEditable(false);
                        mode = 6;time2 = 5;label2.setText("Select: Time("+(timeS1+" to "+timeS2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                        check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                            break;
                        case "Weeks(wk)":timeS2 = "";timeS2="Weeks(wk)";t1.setBackground(null);t1.setEditable(false);
                        mode = 6;time2 = 6;label2.setText("Select: Time("+(timeS1+" to "+timeS2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                        check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                            break;
                        default:label1.setText("Error");
                    }
                }     
            }
        });
        // temperature====================================================================================
        temp1.setSelectedIndex(0);
        temp1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()== temp1){
                    JComboBox cb = (JComboBox)e.getSource();
                    String msg = (String)cb.getSelectedItem();
                    switch (msg) {
                        case "Celsius": tem1 = "";tem1="Celsius";t.setText("Celsius here");t1.setBackground(null);t1.setEditable(false);check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                        mode = 5;temperature = 1;label2.setText("Select: Temperature("+(tem1+" to "+tem2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                            break;
                        case "Fahrenheit":tem1 = "";tem1="Fahrenheit"; t.setText("Fahrenheit here");t1.setBackground(null);t1.setEditable(false);check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                        mode = 5;temperature = 2;label2.setText("Select: Temperature("+(tem1+" to "+tem2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                            break;
                        case "Kelvin":tem1 = "";tem1="Kelvin"; t.setText("Kelvin here");t1.setBackground(null);t1.setEditable(false);check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                        mode = 5;temperature = 3;label2.setText("Select: Temperature("+(tem1+" to "+tem2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                            break;
                        case "Romer":tem1 = "";tem1="Romer";t.setText("Romer here");t1.setBackground(null);t1.setEditable(false);check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                        mode = 5;temperature = 4;label2.setText("Select: Temperature("+(tem1+" to "+tem2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                            break;
                        default:label1.setText("Error");
                    }
                }     
            }
        });
        temp2.setSelectedIndex(0);
        temp2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()== temp2){
                    JComboBox cb = (JComboBox)e.getSource();
                    String msg = (String)cb.getSelectedItem();
                    switch (msg) {
                        case "Celsius": tem2 = "";tem2="Celsius";t1.setBackground(null);t1.setEditable(false);check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                        mode = 5;temperature1 = 1;label2.setText("Select: Temperature("+(tem1+" to "+tem2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                            break;
                        case "Fahrenheit": tem2 = "";tem2="Fahrenheit";t1.setBackground(null);t1.setEditable(false);check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                        mode = 5;temperature1 = 2;label2.setText("Select: Temperature("+(tem1+" to "+tem2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                            break;
                        case "Kelvin": tem2 = "";tem2="Kelvin";t1.setBackground(null);t1.setEditable(false);check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                        mode = 5;temperature1 = 3;label2.setText("Select: Temperature("+(tem1+" to "+tem2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                            break;
                        case "Romer":tem2 = "";tem2="Romer";t1.setBackground(null);t1.setEditable(false);check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                        mode = 5;temperature1 = 4;label2.setText("Select: Temperature("+(tem1+" to "+tem2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                            break;
                        default:label1.setText("Error");
                    }
                }     
            }
        });
        //ComboBox=======================================================
        /*
        */
        comboBox1.setSelectedIndex(0);
        comboBox1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()== comboBox1){
                    JComboBox cb = (JComboBox)e.getSource();
                    String msg = (String)cb.getSelectedItem();
                    switch (msg) {
                        case "Binary":bas1="";bas1="Binary";t.setText("Binary here");t1.setBackground(null);sciOpen=1;t1.setEditable(false);check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                        mode = 1;modeConvert = 1;label2.setText("Select: BaseNumber("+(bas1+" to "+bas2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                            break;
                        case "Decimal":bas1="";bas1="Decimal";t.setText("Decimal here");t1.setBackground(null);sciOpen=1;t1.setEditable(false);check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                        mode = 1;modeConvert = 2;label2.setText("Select: BaseNumber("+(bas1+" to "+bas2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                            break;
                        case "Octal": bas1="";bas1="Octal";t.setText("Octal here");t1.setBackground(null);sciOpen=1;t1.setEditable(false);check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                        mode = 1;modeConvert = 3;label2.setText("Select: BaseNumber("+(bas1+" to "+bas2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                            break;
                        case "Hexadecimal":bas1="";bas1="Hexadecimal"; t.setText("Hexadecimal here");t1.setBackground(null);sciOpen=1;t1.setEditable(false);check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                        mode = 1;modeConvert = 4;label2.setText("Select: BaseNumber("+(bas1+" to "+bas2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                            break;
                        default:label1.setText("Error");
                    }
                }     
            }
        });
        //ComboBox 1(base2)=================================================================================
        comboBox2.setSelectedIndex(0);
        comboBox2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()== comboBox2){//Change here!!!!
                    JComboBox cb = (JComboBox)e.getSource();
                    String msg = (String)cb.getSelectedItem();
                    switch (msg) {
                        case "Binary":bas2="";bas2="Binary";t1.setBackground(null);sciOpen=1;t1.setEditable(false);check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                        mode = 1;modeConvert2 = 1;label2.setText("Select: BaseNumber("+(bas1+" to "+bas2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                            break;
                        case "Decimal":bas2="";bas2="Decimal";t1.setBackground(null);sciOpen=1;t1.setEditable(false);check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                        mode = 1;modeConvert2 = 2;label2.setText("Select: BaseNumber("+(bas1+" to "+bas2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                            break;
                        case "Octal":bas2="";bas2="Octal";t1.setBackground(null);sciOpen=1; t1.setEditable(false);check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                        mode = 1;modeConvert2 = 3;label2.setText("Select: BaseNumber("+(bas1+" to "+bas2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                            break;
                        case "Hexadecimal":bas2="";bas2="Hexadecimal"; t1.setBackground(null);sciOpen=1;t1.setEditable(false);check1.setEnabled(false);check1.setEnabled(false);check2.setEnabled(false);check3.setEnabled(false);check4.setEnabled(false);check5.setEnabled(false);
                        mode = 1;modeConvert2 = 4;label2.setText("Select: BaseNumber("+(bas1+" to "+bas2)+")");btn6.setBackground(Color.lightGray);convertOpenNow = 1;
                            break;
                        default:label1.setText("Error");
                    }
                }     
            }
        });
        
        //===============================================================================================
        
        //Menu==========================================================================================
        menu = new JMenu("Menu");
        //HELP=========================================================================================
        JMenuItem help = new JMenuItem("User manual");
        help.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Font font = new Font("Courier",Font.BOLD,15);
                Font font1 = new Font("Courier",Font.BOLD,25);
                JPanel panel= new JPanel(); 
                JLabel l2 = new JLabel("USER MANUAL",SwingConstants.CENTER);
                l2.setFont(font1);
                JDialog dialog = new JDialog();
                panel.setLayout(new GridLayout(5,0));
                JButton basic = new JButton("Basics");
                basic.setFont(font);
                basic.setSize(40,40);
                basic.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        new UserManual(1);
                    }
                });
                JButton button = new JButton("Button");
                button.setFont(font);
                button.setSize(40,40);
                button.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        new UserManual(3); 
                    }
                });
                JButton function = new JButton("Function");
                function.setFont(font);
                function.setSize(40,40);
                function.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        new UserManual(2);
                    }
                });
                JButton tools = new JButton("X");
                tools.setFont(font);
                tools.setSize(40,40);
                tools.addActionListener(new ActionListener(){    
                    @Override
                    public void actionPerformed(ActionEvent e){dialog.setVisible(false);}});
                panel.add(l2);panel.add(basic);panel.add(button);panel.add(function);panel.add(tools);
                dialog.setTitle("Help"); 
                dialog.setSize(250,250); 
                dialog.setLocation(300, 300);     
                dialog.getContentPane().add(panel); 
                dialog.setVisible(true); 
            }
        });         
        JMenuItem exit = new JMenuItem("Exit");
        exit.addActionListener(new exitApp());
        //Submenu(tools)===============================================
        tools=new JMenu("Tools");
        JMenuItem up = new JMenuItem("Up");
        up.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(t1.getDocument().getLength()==0){
                    new ErrorDialog(6).showError();         
                }else{t.setText(t1.getText());t1.setText("");}
            }
        });
        JMenuItem down = new JMenuItem("Down");
        down.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(t.getDocument().getLength()==0){
                    new ErrorDialog(6).showError();
                }else{t1.setText(t.getText());t.setText("");}
            }
        });
        JMenuItem swap = new JMenuItem("Swap");
        swap.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(t.getDocument().getLength()==0||t1.getDocument().getLength()==0){
                    new ErrorDialog(6).showError();        
                }else{String a = t.getText();String a1 = t1.getText();t.setText(a1);t1.setText(a);
            }
            }
        });
        JMenuItem back = new JMenuItem("Back");
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(Double.toString(backWard)==""){
                    Font font2 = new Font("Courier",Font.BOLD,35);//for label
                    JDialog notf = new JDialog();
                    notf.setTitle("Warning");
                    JLabel show = new JLabel();
                    show.setText("Warning: only use for using clear button by accidentally");
                    show.setFont(font2);
                    notf.setSize(70,70);
                    notf.setResizable(false);
                    notf.setVisible(true);
                }
                else{t.setText(Double.toString(backWard));}}          
        });
        JMenuItem setLabel = new JMenuItem("setDisplay");
        setLabel.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Font font2 = new Font("Courier",Font.BOLD,15);//for label
                JDialog notf = new JDialog();
                notf.setTitle("Setter");
                notf.setLayout(new FlowLayout());
                JLabel show = new JLabel();
                JLabel tell = new JLabel("Field is mean when you chose.",SwingConstants.CENTER);
                JLabel tell1 = new JLabel("Display will appear value from this field.",SwingConstants.CENTER);
                checkText1 = new JCheckBox("Field1",false);
                checkText2 = new JCheckBox("Field2",false);
                notf.add(checkText1);notf.add(checkText2);
                ButtonGroup checkboxGroup = new ButtonGroup();
                checkboxGroup.add(checkText1);
                checkboxGroup.add(checkText2);
                checkText1.addItemListener(new ItemListener() {
                    public void itemStateChanged(ItemEvent e){
                        if(e.getStateChange()== e.SELECTED){try{
                            backWard = Double.parseDouble(t.getText());
                            forpow2 = backWard;
                            label1.setText(t.getText());
                            notf.setVisible(false);       
                        }catch(NumberFormatException num){
                            new ErrorDialog(2).showError();
                        }}
                        else{
                            checkBoxHanderText = 0;
                    }
                }}
                );
                checkText2.addItemListener(new ItemListener() {
                    public void itemStateChanged(ItemEvent e){
                        if(e.getStateChange()== e.SELECTED){try{
                            backWard = Double.parseDouble(t1.getText());
                            forpow2 = backWard;
                            label1.setText(t1.getText());
                            notf.setVisible(false);      
                        }catch(NumberFormatException num){
                            new ErrorDialog(2).showError();
                        }}
                        else{
                            checkBoxHanderText = 0;
                    }
                }}
                );
                show.setText("Select field:");
                show.setFont(font2);
                notf.add(show);
                notf.add(checkText1);notf.add(checkText2);
                notf.add(tell);notf.add(tell1);
                notf.setResizable(false);notf.setSize(300,200);
                notf.setVisible(true);}
        });
        tools.add(setLabel);
        tools.add(up);tools.add(down);tools.add(swap);tools.add(back);
        //SubMenu=========================================================
        submenu=new JMenu("Constant");
        JMenuItem pi = new JMenuItem("π");
        pi.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                t.setText(Double.toString(Math.PI));
            }
        });
        JMenuItem e = new JMenuItem("e");
        e.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                t.setText(Double.toString(Math.E));
            }
        });
        submenu.add(pi);submenu.add(e);
//Sci====================================================================================================
        sci = new JMenuItem("Scientific");
        sci.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){if(sciOpen==0){
                scient = new JDialog();
                scient.setTitle("Scientific");
                final JPanel func = new JPanel();
                func.setLayout(new GridLayout(4,4));
                Button sin = new Button("Sin");
                Button cos = new Button("Cos");
                Button tan = new Button("Tan");
                Button sinh = new Button("Sinh");
                Button cosh = new Button("Cosh");
                Button tanh = new Button("Tanh");
                Button factorial = new Button("X!");
                Button in = new Button("ln");
                Button log = new Button("log");
                Button reverse = new Button("1/X");
                Button epow = new Button("e**");
                Button pow2 = new Button("pow2");
                Button pow3 = new Button("pow3");
                Button abso = new Button("|x|");
                Button percent = new Button("%");
                Button btnNum11 = new Button("X");
                func.setPreferredSize(new Dimension((int)(30),(int)(30)));
                func.add(sin);func.add(cos);func.add(tan);func.add(in);func.add(sinh);func.add(cosh);func.add(tanh);
                func.add(factorial);func.add(log);func.add(reverse);func.add(epow);func.add(pow2);func.add(pow3);
                func.add(abso);func.add(percent);func.add(btnNum11);
                //event=====================================================================
                
                sin.addActionListener(new ActionListener(){    
                    @Override
                    public void actionPerformed(ActionEvent e){checkboxGroup.clearSelection();
                        try{forpow2 = Double.parseDouble(label1.getText());}catch(NumberFormatException v){new ErrorDialog(1).showError();}
                        label1.setText(Double.toString(Math.sin(forpow2)));
                        forpow2 = Math.sin(forpow2);
                        label2.setText("Select: Sin");
                        }});
                sinh.addActionListener(new ActionListener(){    
                    @Override
                    public void actionPerformed(ActionEvent e){checkboxGroup.clearSelection();
                        try{forpow2 = Double.parseDouble(label1.getText());}catch(NumberFormatException v){new ErrorDialog(1).showError();}
                        label1.setText(Double.toString(Math.sinh(forpow2)));
                        forpow2 = Math.sinh(forpow2);
                        label2.setText("Select: Sinh");
                        }});
                cos.addActionListener(new ActionListener(){    
                    @Override
                    public void actionPerformed(ActionEvent e){checkboxGroup.clearSelection();
                        try{forpow2 = Double.parseDouble(label1.getText());}catch(NumberFormatException v){new ErrorDialog(1).showError();}
                        label1.setText(Double.toString(Math.cos(forpow2)));
                        forpow2 = Math.cos(forpow2);
                        label2.setText("Select: Cos");
                        }});
                cosh.addActionListener(new ActionListener(){    
                    @Override
                    public void actionPerformed(ActionEvent e){checkboxGroup.clearSelection();
                        try{forpow2 = Double.parseDouble(label1.getText());}catch(NumberFormatException v){new ErrorDialog(1).showError();}
                        label1.setText(Double.toString(Math.cosh(forpow2)));
                        forpow2 = Math.cosh(forpow2);
                        label2.setText("Select: Cosh");
                        }});
                tan.addActionListener(new ActionListener(){    
                    @Override
                    public void actionPerformed(ActionEvent e){checkboxGroup.clearSelection();
                        try{forpow2 = Double.parseDouble(label1.getText());}catch(NumberFormatException v){new ErrorDialog(1).showError();}
                        label1.setText(Double.toString(Math.tan(forpow2)));
                        forpow2 = Math.tan(forpow2);
                        label2.setText("Select: Tan");
                        }});
                tanh.addActionListener(new ActionListener(){    
                    @Override
                    public void actionPerformed(ActionEvent e){checkboxGroup.clearSelection();
                        try{forpow2 = Double.parseDouble(label1.getText());}catch(NumberFormatException v){new ErrorDialog(1).showError();}
                        label1.setText(Double.toString(Math.tanh(forpow2)));
                        forpow2 = Math.tanh(forpow2);
                        label2.setText("Select: Tanh");
                        }});
                factorial.addActionListener(new ActionListener(){    
                    @Override
                    public void actionPerformed(ActionEvent e){checkboxGroup.clearSelection();
                        try{forpow2 = Double.parseDouble(label1.getText());}catch(NumberFormatException v){new ErrorDialog(1).showError();}
                        int i;
                        double fact=1;  
                        double number=forpow2;//It is the number to calculate factorial    
                        for(i=1;i<=number;i++){    
                            fact=fact*i;    
                        }
                        label1.setText(Double.toString(fact));
                        forpow2 = fact;
                        label2.setText("Select: Factorial");        
                        }});
                in.addActionListener(new ActionListener(){    
                    @Override
                    public void actionPerformed(ActionEvent e){checkboxGroup.clearSelection();
                        try{forpow2 = Double.parseDouble(label1.getText());}catch(NumberFormatException v){new ErrorDialog(1).showError();}
                        label1.setText(Double.toString(Math.log1p(forpow2)));
                        forpow2 = Math.log1p(forpow2);
                        label2.setText("Select: ln");
                        }});
                log.addActionListener(new ActionListener(){    
                    @Override
                    public void actionPerformed(ActionEvent e){checkboxGroup.clearSelection();
                        try{forpow2 = Double.parseDouble(label1.getText());}catch(NumberFormatException v){new ErrorDialog(1).showError();}
                        label1.setText(Double.toString(Math.log(forpow2)));
                        forpow2 = Math.log(forpow2);
                        label2.setText("Select: log");
                        }});
                reverse.addActionListener(new ActionListener(){    
                    @Override
                    public void actionPerformed(ActionEvent e){checkboxGroup.clearSelection();
                        try{forpow2 = Double.parseDouble(label1.getText());}catch(NumberFormatException v){new ErrorDialog(1).showError();}
                        label1.setText(Double.toString(1/forpow2));
                        forpow2 = 1/forpow2;
                        label2.setText("Select: 1/X");
                        }});
                epow.addActionListener(new ActionListener(){    
                    @Override
                    public void actionPerformed(ActionEvent e){checkboxGroup.clearSelection();
                        try{forpow2 = Double.parseDouble(label1.getText());}catch(NumberFormatException v){new ErrorDialog(1).showError();}
                        label1.setText(Double.toString(Math.pow(Math.E,forpow2)));
                        forpow2 = Math.pow(Math.E,forpow2);
                        label2.setText("Select: e^");
                        }});
                pow2.addActionListener(new ActionListener(){    
                    @Override
                    public void actionPerformed(ActionEvent e){checkboxGroup.clearSelection();
                        try{forpow2 = Double.parseDouble(label1.getText());}catch(NumberFormatException v){new ErrorDialog(1).showError();}
                        label1.setText(Double.toString(Math.pow(forpow2,2)));
                        forpow2 = Math.pow(forpow2,2);
                        label2.setText("Select: Power2");
                        ready3=0;
                        
                        }});
                pow3.addActionListener(new ActionListener(){    
                    @Override
                    public void actionPerformed(ActionEvent e){checkboxGroup.clearSelection();
                        try{forpow2 = Double.parseDouble(label1.getText());     }catch(NumberFormatException v){new ErrorDialog(1).showError();}               
                        label1.setText(Double.toString(Math.pow(forpow2,3)));
                        forpow2 = Math.pow(forpow2,3);
                        label2.setText("Select: Power3");
                        }});
                abso.addActionListener(new ActionListener(){    
                    @Override
                    public void actionPerformed(ActionEvent e){checkboxGroup.clearSelection();
                        try{forpow2 = Double.parseDouble(label1.getText());}catch(NumberFormatException v){new ErrorDialog(1).showError();}
                        label1.setText(Double.toString(Math.abs(forpow2)));
                        forpow2 = Math.abs(forpow2);
                        label2.setText("Select: Abosolute");
                        }});
                percent.addActionListener(new ActionListener(){    
                    @Override
                    public void actionPerformed(ActionEvent e){checkboxGroup.clearSelection();
                        try{forpow2 = Double.parseDouble(label1.getText());}catch(NumberFormatException v){new ErrorDialog(1).showError();}
                        label1.setText(Double.toString(forpow2/100));
                        forpow2 = forpow2/100;
                        label2.setText("Select: Percent");
                        }});
                btnNum11.addActionListener(new ActionListener(){    
                    @Override
                    public void actionPerformed(ActionEvent e){scient.setVisible(false);}});
            
                //==========================================================================
                scient.add(func,BorderLayout.CENTER);
                scient.setSize(350,150);
                scient.setResizable(false);
                scient.setVisible(true);
            }
        else if(sciOpen==1){
            new ErrorDialog(7).showError();//can not open while BaseNumber is working
        }}});
        //NumberPad======================================================================
        JMenuItem pad = new JMenuItem("NumberPad");       
        pad.addActionListener(new ActionListener(){    
            @Override
            public void actionPerformed(ActionEvent e){
                JDialog padnum = new JDialog();
                padnum.setTitle("NumberPad");
                JPanel controls = new JPanel();
                ButtonGroup checkboxGroup1 = new ButtonGroup();
                controls.setLayout(new GridLayout(1,2));
                checkText1 = new JCheckBox("Field1",true);checkBoxHanderText = 1;
                checkText2 = new JCheckBox("Field2",false);
                checkText3 = new JCheckBox("Display",false);
                controls.add(checkText1);controls.add(checkText2);controls.add(checkText3);
               
                checkboxGroup1.add(checkText1);
                checkboxGroup1.add(checkText2);
                checkboxGroup1.add(checkText3);
                //Check box event===================================================
                checkText1.addItemListener(new ItemListener() {
                    public void itemStateChanged(ItemEvent e){
                        if(e.getStateChange()== e.SELECTED){
                            checkBoxHanderText = 1;checkBoxHanderText2 = 0;checkBoxHanderText3 = 0;      
                        }
                        else{
                            checkBoxHanderText = 0;
                    }
                }}
                );
                checkText2.addItemListener(new ItemListener(){
                    public void itemStateChanged(ItemEvent e){
                        if(e.getStateChange()== e.SELECTED){
                            checkBoxHanderText2 = 1;checkBoxHanderText3 = 0;checkBoxHanderText = 0;
                        }
                        else{checkBoxHanderText2 = 0;
                    }
                }}
                );
                checkText3.addItemListener(new ItemListener(){
                    public void itemStateChanged(ItemEvent e){
                        if(e.getStateChange()== e.SELECTED){
                            checkBoxHanderText3 = 1;checkBoxHanderText2 = 0;checkBoxHanderText = 0;
                        }
                        else{checkBoxHanderText3 = 0;
                    }
                }}
                );
                //Button=============================================================
                Button btnNum1 = new Button("1");
                Button btnNum2 = new Button("2");
                Button btnNum3 = new Button("3");
                Button btnNum4 = new Button("4");
                Button btnNum5 = new Button("5");
                Button btnNum6 = new Button("6");
                Button btnNum7 = new Button("7");
                Button btnNum8 = new Button("8");
                Button btnNum9 = new Button("9");
                Button btnNum0 = new Button("0");
                Button btnNum10 = new Button(".");
                Button btnNum11 = new Button("-");
                //BackSpace=========================================================
                Button backSpace = new Button("Backspace");
                //Event===================================================================
                btnNum0.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        if(checkBoxHanderText==1){t.setText(t.getText()+zero);}
                        else if(checkBoxHanderText2==1){t1.setText(t1.getText()+zero);}
                        else if(checkBoxHanderText3==1){label1.setText(label1.getText()+zero);}
                    }});
                btnNum1.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        if(checkBoxHanderText==1){t.setText(t.getText()+first);}
                        else if(checkBoxHanderText2==1){t1.setText(t1.getText()+first);}
                        else if(checkBoxHanderText3==1){label1.setText(label1.getText()+first);}
                    }});
                btnNum2.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        if(checkBoxHanderText==1){t.setText(t.getText()+second);}
                        else if(checkBoxHanderText2==1){t1.setText(t1.getText()+second);}
                        else if(checkBoxHanderText3==1){label1.setText(label1.getText()+second);}
                    }});
                btnNum3.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        if(checkBoxHanderText==1){t.setText(t.getText()+third);}
                        else if(checkBoxHanderText2==1){t1.setText(t1.getText()+third);}
                        else if(checkBoxHanderText3==1){label1.setText(label1.getText()+third);}
                    }});
                btnNum4.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        if(checkBoxHanderText==1){t.setText(t.getText()+fourth);}
                        else if(checkBoxHanderText2==1){t1.setText(t1.getText()+fourth);}
                        else if(checkBoxHanderText3==1){label1.setText(label1.getText()+fourth);}
                    }});
                btnNum5.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        if(checkBoxHanderText==1){t.setText(t.getText()+fifth);}
                        else if(checkBoxHanderText2==1){t1.setText(t1.getText()+fifth);}
                        else if(checkBoxHanderText3==1){label1.setText(label1.getText()+fifth);}
                    }});
                btnNum6.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        if(checkBoxHanderText==1){t.setText(t.getText()+sixth);}
                        else if(checkBoxHanderText2==1){t1.setText(t1.getText()+sixth);}
                        else if(checkBoxHanderText3==1){label1.setText(label1.getText()+sixth);}
                    }});
                btnNum7.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        if(checkBoxHanderText==1){t.setText(t.getText()+seventh);}
                        else if(checkBoxHanderText2==1){t1.setText(t1.getText()+seventh);}
                        else if(checkBoxHanderText3==1){label1.setText(label1.getText()+seventh);}
                    }});
                btnNum8.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        if(checkBoxHanderText==1){t.setText(t.getText()+eighth);}
                        else if(checkBoxHanderText2==1){t1.setText(t1.getText()+eighth);}
                        else if(checkBoxHanderText3==1){label1.setText(label1.getText()+eighth);}
                    }});
                btnNum9.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        if(checkBoxHanderText==1){t.setText(t.getText()+ninth);}
                        else if(checkBoxHanderText2==1){t1.setText(t1.getText()+ninth);}
                        else if(checkBoxHanderText3==1){label1.setText(label1.getText()+ninth);}
                    }});
                btnNum10.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        if(checkBoxHanderText==1){t.setText(t.getText()+dot);}
                        else if(checkBoxHanderText2==1){t1.setText(t1.getText()+dot);}
                        else if(checkBoxHanderText3==1){label1.setText(label1.getText()+dot);}
                    }});
                btnNum11.addActionListener(new ActionListener(){ //-   
                    @Override
                    public void actionPerformed(ActionEvent e){
                         if(checkBoxHanderText==1&&ready==0){t.setText("-"+t.getText());ready=1;//mean minus was appeared
                    }
                        else if(checkBoxHanderText==1&&ready==1){
                            String asa = t.getText();//get text from field 1
                            int gogo = asa.length();//get length
                            String yoru = asa.substring(1, gogo);//remove first char(mean minus symbol)
                            t.setText(yoru);
                            ready=0;//mean minus was not appeared
                    }
                        else if(checkBoxHanderText2==1&&ready1==0){t1.setText("-"+t1.getText());ready1=1;}
                        else if(checkBoxHanderText2==1&&ready1==1){t1.getText();
                            String asa = t1.getText();//get text from field 2
                            int gogo = asa.length();
                            String yoru = asa.substring(1, gogo);
                            t1.setText(yoru);
                            ready1=0;
                    }else if(checkBoxHanderText3==1&&ready3==0){
                        label1.setText("-"+label1.getText());ready3=1;}
                    else if(checkBoxHanderText3==1&&ready3==1){
                        label1.getText();
                        String asa = label1.getText();//get text from Display 
                        if (asa.charAt(0)=='-'&&asa.length()==1||asa.charAt(0)=='0'&&asa.length()==1){label1.setText("0");ready3=0;}
                        
                        else{
                        int gogo = asa.length();
                        String yoru = asa.substring(1, gogo);
                        label1.setText(yoru);
                        ready3=0;}
                    }

                }});
                backSpace.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        if(checkBoxHanderText==1){if(t.getDocument().getLength()!=0){
                            String textTest = new String(t.getText());
                            int textcount = textTest.length();
                            if(textcount==1&&ready==1){
                                t.setText("");ready=0;}else{
                                    String textT = textTest.substring(0, textcount-1);t.setText(textT);}
                            }}
                        else if(checkBoxHanderText2==1)
                        {
                            if(t1.getDocument().getLength()!=0){
                            String textTest1 = new String(t1.getText());
                            int textcount1 = textTest1.length();
                            if(textcount1==1&&ready1==1){
                            t1.setText("");ready1=0;}
                            else{
                                String textT1 = textTest1.substring(0, textcount1-1);t1.setText(textT1);}
                        }}
                        else if(checkBoxHanderText3==1)
                        {
                            if(label1.getText().length()==1){
                                label1.setText("0");
                            }
                            else if(label1.getText().length()!=0){
                            String textTest1 = new String(label1.getText());
                            int textcount1 = textTest1.length();
                            if(textcount1==1&&ready1==1){
                                label1.setText("");ready1=0;}

                            else{
                                String textT1 = textTest1.substring(0, textcount1-1);label1.setText(textT1);}
                            }
                        }
                    }});

//Number for NumberPad===================================================================================
                final JPanel numberEnter = new JPanel();
                numberEnter.setLayout(new GridLayout(4,3));
                numberEnter.setPreferredSize(new Dimension((int)(20),(int)(20)));
                numberEnter.add(btnNum1);
                numberEnter.add(btnNum2);
                numberEnter.add(btnNum3);
                numberEnter.add(btnNum4);
                numberEnter.add(btnNum5);
                numberEnter.add(btnNum6);
                numberEnter.add(btnNum7);
                numberEnter.add(btnNum8);
                numberEnter.add(btnNum9);
                numberEnter.add(btnNum0);
                numberEnter.add(btnNum10);
                numberEnter.add(btnNum11);
                //================================================================
                padnum.add(controls,BorderLayout.NORTH);             
                padnum.add(numberEnter,BorderLayout.CENTER);
                padnum.add(backSpace,BorderLayout.SOUTH);
                padnum.setSize(250,200);
                padnum.setResizable(false);
                padnum.setVisible(true);
            }});
        //Area===================================================================================
        JMenuItem area = new JMenuItem("Area");
        area.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JLabel to = new JLabel("TO");
                JDialog convertc = new JDialog();
                convertc.setTitle("Area");
                JPanel convertp = new JPanel();
                convertp.add(are1);
                convertp.add(to);
                convertp.add(are2);
                convertp.setLayout(new FlowLayout());
                convertc.add(convertp);
                convertc.setSize(200,130);
                convertc.setResizable(false);
                convertc.setVisible(true);
            }
        });
        //Time convertor===========================================================================
        JMenuItem time = new JMenuItem("Time");
        time.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JLabel to = new JLabel("TO");
                JDialog convertc = new JDialog();
                convertc.setTitle("Time");
                JPanel convertp = new JPanel();
                convertp.add(tim1);
                convertp.add(to);
                convertp.add(tim2);
                convertp.setLayout(new FlowLayout());
                convertc.add(convertp);
                convertc.setSize(300,100);
                convertc.setResizable(false);
                convertc.setVisible(true);
            }
        });
        //length===================================================================================
        JMenuItem length = new JMenuItem("Length");
        length.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JLabel to = new JLabel("         TO         ");
                Font font = new Font("Courier",Font.BOLD,15);
                to.setFont(font);
                JDialog convertc = new JDialog();
                convertc.setTitle("Length");
                JPanel convertp = new JPanel();convertp.setLayout(new FlowLayout());
                convertp.add(len1);
                convertp.add(to);
                convertp.add(len2);
                convertc.add(convertp);
                convertc.setSize(200,130);
                convertc.setResizable(false);
                convertc.setVisible(true);
            }
        });
        //convert temperature======================================================================
        JMenuItem tempe = new JMenuItem("Temperature");
        tempe.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JLabel to = new JLabel("TO");
                JDialog convertc = new JDialog();
                convertc.setTitle("Temperature");
                JPanel convertp = new JPanel();
                convertp.add(temp1);
                convertp.add(to);
                convertp.add(temp2);
                convertp.setLayout(new FlowLayout());
                convertc.add(convertp);
                convertc.setSize(300,100);
                convertc.setResizable(false);
                convertc.setVisible(true);
            }
        });
        //Base_number=================================================================
        JMenuItem convertBase = new JMenuItem("BaseNumber");
        convertBase.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JDialog convertc = new JDialog();
                convertc.setTitle("BaseNumber");
                JLabel label = new JLabel("to");
                JPanel convertp = new JPanel();
                sciOpen=1;
                label2.setText("Select: BaseNumber");
                convertp.add(comboBox1);
                convertp.add(label);
                convertp.setLayout(new FlowLayout());
                convertp.add(comboBox2);
                convertc.add(convertp);
                convertc.setSize(300,100);
                convertc.setResizable(false);
                convertc.setVisible(true);
            }
        });
        //==========================================================================
        JMenu convert = new JMenu("Convert");
        convert.add(area);convert.add(convertBase);convert.add(length);convert.add(tempe);convert.add(time);
        //==========================================================================
        JMenuItem builder = new JMenuItem("M");
        builder.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                new Builder();
            }
        });
        //menu===================================================================(add menuBar)
        menu.add(builder);
        menu.add(help);
        menu.add(sci);
        menu.add(convert);
        menu.add(pad); 
        menu.add(tools);    
        menu.add(submenu);
        menu.add(exit);
        menuBar.add(menu);
        //for command==================================
        JPanel p1 = new JPanel();
        p1.setLayout(new BoxLayout(p1,BoxLayout.Y_AXIS));
        //for label and textfield========================================
        JPanel p3 = new JPanel();
        p3.setLayout(new BoxLayout(p3,BoxLayout.Y_AXIS));
        Font font1 = new Font("Courier",Font.BOLD,13);//for button
        Font font2 = new Font("Courier",Font.BOLD,40);//for label
        Font font3 = new Font("Courier",Font.BOLD,20);//for selector
        Font font4 = new Font("Courier",Font.BOLD,25);//for textfield
        //Label===============================================
        label1 = new JLabel("0",SwingConstants.CENTER);
        label1.setFont(font2);
        label2 = new JLabel("Select:",SwingConstants.CENTER);
        label2.setFont(font3);
        //p3.add(label1);
        //===============================text field==============
        t = new JTextField("field1",100);
        t.setFont(font4);
        t.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
               String value = t.getText();
               int l = value.length();
            }
         });    
        p3.add(t);
        t1 = new JTextField("field2",100);
        t1.setFont(font4);
        t1.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
               String value = t1.getText();
               int l = value.length();
               JTextField test = new JTextField();
            }
         });
        p3.add(t1);
        // check boxes==========================================================================
        check1 = new JCheckBox("+",false);
        check2 = new JCheckBox("-",false);
        check3 = new JCheckBox("*",false);
        check4 = new JCheckBox("÷",false);
        check5 = new JCheckBox("^",false);
        p1.add(check1);p1.add(check2);p1.add(check3);p1.add(check4);p1.add(check5);
        checkboxGroup = new ButtonGroup();
        checkboxGroup.add(check1);
        checkboxGroup.add(check2);
        checkboxGroup.add(check3);
        checkboxGroup.add(check4);
        checkboxGroup.add(check5);       
        //check boxes event=======================================================================
        check1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange()== e.SELECTED){
                    checkBoxHander = 1;
                    setStrLabel("Plus");
                    label2.setText("Select: Plus");
                }
                else{
                    checkBoxHander = 0;
                    setStrLabel("");
                    label2.setText("Select:");
            }
        }}
        );
        check2.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange()== e.SELECTED){
                    checkBoxHander = 2;setStrLabel("Minus");
                    label2.setText("Select: Minus");
                }
                else{checkBoxHander = 0;
                    setStrLabel("");
                    label2.setText("Select:");
            }
        }}
        );
        check3.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange()== e.SELECTED){
                    checkBoxHander = 3;setStrLabel("Multiply");
                    label2.setText("Select: Multiplication");
                }
                else{checkBoxHander= 0;
                    setStrLabel("");
                    label2.setText("Select:");
            }
        }}
        );
        check4.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange()== e.SELECTED){
                    checkBoxHander = 4;setStrLabel("Divide");
                    label2.setText("Select: Divide");
                }
                else{checkBoxHander= 0;setStrLabel("");
                    label2.setText("Select:");
            }
        }}
        );
        check5.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange()== e.SELECTED){
                    checkBoxHander = 5;setStrLabel("Pow");
                    label2.setText(label2.getText()+" Pow");
                }
                else{checkBoxHander = 0;setStrLabel("");
                    label2.setText("Select:");
            }
        }}
        );
        //========================================================================================
        //summit button
        //when select button activated value will changed to opposite
        //====================================================================================================
        Button btn2 = new Button("Submit");
        btn2.addActionListener(new ActionListener(){    
            @Override
            public void actionPerformed(ActionEvent e){try{
                if(mode==0){
                a = t.getText();
                a1 = t1.getText();//store value  
                Calculate c = new Calculate(t.getText(), t1.getText(), checkBoxHander);
                if(c.getError()==1){
                    new ErrorDialog(2).showError();
                    t.setText("");
                    t1.setText("");
                }
                else if(t.getDocument().getLength()==0||t1.getDocument().getLength()==0){
                    new ErrorDialog(6).showError();//number not found
                    }
            
                if(checkBoxHander!=0){
                    Calculate n = new Calculate(t.getText(), t1.getText(), checkBoxHander);
                    setForpow2(n.basicOperator());try{
                    label1.setText(n.ansString());
                    t.setText("");
                    t1.setText("");
                }catch(NullPointerException b){}} 
                //Limit of label=======================================================================
                String limit = label1.getText();
                if(limit.length()>=10){limit.substring(0,10);label1.setText(limit);}
                if(checkBoxHander==0){
                    new ErrorDialog(4).showError();//Operator not found
                }}
                //Base====================================================================================
                else if(mode==1){
                    if(modeConvert==0||modeConvert2==0){
                        new ErrorDialog(5).showError();//Condition fail
                    }else if(modeConvert==modeConvert2){try{
                        if(modeConvert==1&&modeConvert2==1){String checkError = (Integer.toString(Integer.parseInt(t.getText(),2),10).toUpperCase());}
                        
                        label1.setText(t.getText());forpow2=Double.parseDouble(Integer.toString(Integer.parseInt(t.getText(),16),10));
                    }catch(NumberFormatException v){new ErrorDialog(1).showError();}
                    }else{
                        BaseNumberConvert ansBase = new BaseNumberConvert(modeConvert, modeConvert2, t.getText());
                        label1.setText(ansBase.ansBaseNumberString());
                        
                    }
                }
                    else if(mode==2){//AreaConvert=================
                    if(area1==0||area2==0){
                        new ErrorDialog(5).showError();
                    }else if(area1==area2){
                        label1.setText(t.getText());forpow2=Double.parseDouble(t.getText());
                    }else{
                        AreaConvert ansArea = new AreaConvert(area1, area2, t.getText());
                        setForpow2(ansArea.areaAnsDouble());
                        label1.setText(ansArea.areaAnsString());
                    }
                }//Length=================================================================================
                else if(mode==3){
                    if(length1==0||length2==0){
                        new ErrorDialog(5).showError();}
                    else if(length1==length2){
                        label1.setText(t.getText());
                    }else{
                        LengthConvert ansLength = new LengthConvert(length1, length2, t.getText());
                        setForpow2(ansLength.lenghtAnsDouble());
                        label1.setText(ansLength.lenghtAnsString());
                    }
                }
                    //temperature=======================================================================
                    else if(mode==5){
                        if(temperature==0||temperature1==0){
                            new ErrorDialog(5).showError();
                        }else if(temperature==temperature1){
                            label1.setText(t.getText());forpow2=Double.parseDouble(t.getText());}
                        else {
                            TemperatureConvert ansTemperature = new TemperatureConvert(temperature, temperature1,t.getText());
                            setForpow2(ansTemperature.temperatureAnsDouple());
                            label1.setText(ansTemperature.temperatureAnsString());
                        } 
                        //time====================================================================================       
                    }else if(mode==6){
                        if(time1==0||time2==0){
                            new ErrorDialog(5).showError();
                        }else if(time1==time2){label1.setText(t.getText());forpow2=Double.parseDouble(t.getText());}
                        else{
                            TimeConvert ansTime = new TimeConvert(time1,time2,t.getText());
                            ansTime.timeAnsLong();//Use method
                            setForpow2(Double.parseDouble(ansTime.timeAnsString()));
                            label1.setText(ansTime.timeAnsString());
                        }   
                } 
                    //=================================================================================
            }catch(NumberFormatException m){
                new ErrorDialog(1).showError();
                }
                }});
        btn2.setFont(font1);
        btn2.setPreferredSize(new Dimension(70,20));
        //clear button======================================================================
        Button btn1 = new Button("Clear");
        btn1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                mode = 0;forpow2 = 0.0;ready3=0;sciOpen=0;convertOpenNow = 0;//set all to default
                t.setText("");
                t1.setText("");
                label1.setText("0");
                label2.setText("Select:");
                t.setBackground(Color.white);
                t1.setBackground(Color.white);
                check1.setEnabled(true);check1.setEnabled(true);check2.setEnabled(true);check3.setEnabled(true);check4.setEnabled(true);check5.setEnabled(true);
                t1.setEditable(true);
                btn6.setBackground(null);
                checkboxGroup.clearSelection();
                
            }
        });
        btn1.setFont(font1);
        btn1.setPreferredSize(new Dimension(70,20));
        //carry button=========================================================================
        Button btn3 = new Button("Carry");
        btn3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{Double.parseDouble(label1.getText());
                t.setText(label1.getText());}catch(NumberFormatException n){
                    new ErrorDialog(8).showError();
                }
                
            }
        });
        btn3.setFont(font1);
        btn3.setPreferredSize(new Dimension(70,20));
        //pi=================================================================================
        Button btn4 = new Button("π");
        btn4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{label1.setText(Double.toString(Double.parseDouble(label1.getText())*Math.PI));
                    forpow2 = (Double.parseDouble(label1.getText())*Math.PI);
                    label2.setText("Select: π");
            }
            catch (NullPointerException w){
                 new ErrorDialog(3).showError();
                }}
        });
        btn4.setFont(font1);
        btn4.setPreferredSize(new Dimension(70,20));
        //e====================================================================================
        btn6 = new Button("Close");
        btn6.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){ 
                mode = 0;//close all mode
                sciOpen=0;
                convertOpenNow = 0;
                check1.setEnabled(true);check1.setEnabled(true);check2.setEnabled(true);check3.setEnabled(true);check4.setEnabled(true);check5.setEnabled(true);
                t1.setEditable(true);
                btn6.setBackground(null);
                t.setText("");
                if(colorful==2){t1.setBackground(Color.red);}
                else if(colorful==3){t1.setBackground(Color.green);}
                else if(colorful==0){t1.setBackground(Color.blue);}
                else if(colorful==1){t1.setBackground(Color.white);}
                if(getStrLable()==null||getStrLable()==""){label2.setText("Select:");}else{label2.setText("Select: "+getStrLable());}
                
        }});
        btn6.setFont(font1);
        btn6.setPreferredSize(new Dimension(70,20));
        //Clean================================================================================
        Button btn5 = new Button("Clean");
        btn5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            if(convertOpenNow == 0){
                btn8.setForeground(Color.red);
                t.setText("");t.setBackground(Color.white);colorful=1;//set default color
                t1.setText("");t1.setBackground(Color.white);
            }else if(convertOpenNow == 1){
                t.setText("");
            }}});
        btn5.setFont(font1);
        btn5.setPreferredSize(new Dimension(70,20));
        //setter===================================================================================
        Button btn7 = new Button("SetDisplay");
        btn7.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
              Font font2 = new Font("Courier",Font.BOLD,15);//for label
                JDialog notf = new JDialog();
                notf.setTitle("Setter");
                notf.setLayout(new FlowLayout());
                JLabel show = new JLabel();
                show.setText("Enter number and press enter");
                JTextField setT = new JTextField(10);
                //event=============================================
                setT.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent event)
                    {try{
                        backWard = Double.parseDouble(setT.getText());
                        setForpow2(backWard);
                        label1.setText(setT.getText());
                    notf.setVisible(false);}catch(NumberFormatException num){
                        new ErrorDialog(2).showError();
                    }}});
                //==================================================
                setT.setFont(font2);
                show.setFont(font2);
                notf.add(show);
                notf.add(setT);
                notf.setResizable(false);notf.setSize(300,200);
                notf.setVisible(true);
            }
        });
        btn7.setFont(font1);
        btn7.setPreferredSize(new Dimension(70,20));
        btn8 = new Button("Color");
        btn8.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            if(convertOpenNow==0){
                if(colorful==1){t.setBackground(Color.red);t1.setBackground(Color.red);colorful=2;btn8.setForeground(Color.green);}
                else if(colorful==2){t.setBackground(Color.green);t1.setBackground(Color.green);colorful=3;btn8.setForeground(Color.blue);}
                else if(colorful==3){t.setBackground(Color.blue);t1.setBackground(Color.blue);colorful=0;btn8.setForeground(Color.white);}
                else if(colorful==0){t.setBackground(Color.white);t1.setBackground(Color.white);colorful=1;btn8.setForeground(Color.red);}
            }else if(convertOpenNow==1){
                if(colorful==1){t.setBackground(Color.red);colorful=2;btn8.setForeground(Color.green);}
                else if(colorful==2){t.setBackground(Color.green);colorful=3;btn8.setForeground(Color.blue);}
                else if(colorful==3){t.setBackground(Color.blue);colorful=0;btn8.setForeground(Color.white);}
                else if(colorful==0){t.setBackground(Color.white);colorful=1;btn8.setForeground(Color.red);}
            }
        }
        });
        btn8.setFont(font1);
        btn8.setForeground(Color.red);
        btn8.setPreferredSize(new Dimension(70,20));
        //for button==================================================================================
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(4,1));
        p2.add(btn3);p2.add(btn2);p2.add(btn5);p2.add(btn1);p2.add(btn6);p2.add(btn4);p2.add(btn7);p2.add(btn8);
        //==============================container=======================================================
        container.add(p1,BorderLayout.WEST);
        container.add(label1,BorderLayout.NORTH);
        container.add(p3,BorderLayout.CENTER);
        container.add(p2,BorderLayout.EAST);
        container.add(label2,BorderLayout.SOUTH);
        //====================================================================================
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setJMenuBar(menuBar);
        setSize(550,260);//size of application
        setLocation(300, 150);
        setResizable(false);
        setVisible(true);
    }
    static class exitApp implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }
    public void setForpow2(Double x){
        this.forpow2 = x;
    }
    public void setStrLabel(String v){//avoid close_btn clear it (accidentally)
        this.forLabel = v;
    }
    public String getStrLable(){
        return this.forLabel;
    }
    public static void main(String[] args) {
        new Calculator();
    }
}
