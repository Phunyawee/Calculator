package projectRework;
class LengthConvert{
    private int length1;
    private int length2;
    private String textField;
    private Double ansLength;
    private Double lenDou;
    public LengthConvert(int length1,int length2,String textField){
        this.length1 = length1;
        this.length2 = length2;
        this.textField = textField;
    }
    public Double lenghtAnsDouble(){
        if(length1==1&&length2==2){//MmToCm
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*0.1;
            }else if(length1==1&&length2==3){//MmToM
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*0.001;
            }else if(length1==1&&length2==4){//MmToKm
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*0.000001;
            }else if(length1==1&&length2==5){//MmToIn
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*0.0393700787;
            }else if(length1==1&&length2==6){//MmToFt
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*0.0032808399;
            }else if(length1==1&&length2==7){//MmToYd
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*0.0010936133;
            }else if(length1==1&&length2==8){//MmToMi
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*0.0000006124;
            }else if(length1==1&&length2==9){//MmToNm
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*0.00000054;
            }else if(length1==1&&length2==10){//MmToMil
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*39.3700787402;
            }else if(length1==2&&length2==1){//CmToMm
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*10;
            }else if(length1==2&&length2==3){//CmToM
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*0.01;
            }else if(length1==2&&length2==4){//CmToKm
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*0.00001;
            }else if(length1==2&&length2==5){//CmToIn
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*0.3937007874;
            }else if(length1==2&&length2==6){//CmToFt
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*0.032808399;
            }else if(length1==2&&length2==7){//CmToYd
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*0.010936133;
            }else if(length1==2&&length2==8){//CmToMi
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*0.0000062137;
            }else if(length1==2&&length2==9){//CmToNm
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*0.0000053996;
            }else if(length1==2&&length2==10){//CmToMil
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*393.7007874016;
            }else if(length1==3&&length2==1){//mToMm
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*1000;
            }else if(length1==3&&length2==2){//mToCm
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*100;
            }else if(length1==3&&length2==4){//mToKm
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*0.001;
            }else if(length1==3&&length2==5){//mToIn
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*39.3700787402;
            }else if(length1==3&&length2==6){//mToFt
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*3.280839895;
            }else if(length1==3&&length2==7){//mToYd
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*1.0936132983;
            }else if(length1==3&&length2==8){//mToMi
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*0.0006213712;
            }else if(length1==3&&length2==9){//mToNm
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*0.0005399568;
            }else if(length1==3&&length2==10){//mToMil
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*39370.078740157;
            }else if(length1==4&&length2==1){//kmToMm
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*1000000;
            }else if(length1==4&&length2==2){//kmToCm
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*100000;
            }else if(length1==4&&length2==3){//KmTom
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*1000;
            }else if(length1==4&&length2==5){//kmToIn
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*39370.078740157;
            }else if(length1==4&&length2==6){//kmToFt
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*3280.8398950131;
            }else if(length1==4&&length2==7){//kmToYd
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*1093.6132983377;
            }else if(length1==4&&length2==8){//kmToMi
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*0.6213711922;
            }else if(length1==4&&length2==9){//kmToNm
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*0.5399568035;
            }else if(length1==4&&length2==10){//kmToMil
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*39370078.740157;
            }else if(length1==5&&length2==1){//InToMm
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*25.4;
            }else if(length1==5&&length2==2){//InToCm
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*2.54;
            }else if(length1==5&&length2==3){//InToM
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*0.0254;
            }else if(length1==5&&length2==4){//InToKm
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*0.0000254;
            }else if(length1==5&&length2==6){//InToFt
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*0.08333333333333333333333333;
            }else if(length1==5&&length2==7){//InToYd
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*0.0277777778;
            }else if(length1==5&&length2==8){//InToMi
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*0.0000157828;
            }else if(length1==5&&length2==9){//InToNm
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*0.0000137149;
            }else if(length1==5&&length2==10){//InToMil
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*1000;
            }else if(length1==6&&length2==1){//ftToMm
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*304.8;
            }else if(length1==6&&length2==2){//ftToCm
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*30.48;
            }else if(length1==6&&length2==3){//ftToM
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*0.3048;
            }else if(length1==6&&length2==4){//ftToKm
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*0.0003048;
            }else if(length1==6&&length2==5){//ftToIn
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*12;
            }else if(length1==6&&length2==7){//ftToYd
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*0.333333333333333333;
            }else if(length1==6&&length2==8){//ftToMi
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*0.0001893939;
            }else if(length1==6&&length2==9){//ftToNm
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*0.0001645788;
            }else if(length1==6&&length2==10){//ftToMil
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*12000;
            
            }else if(length1==7&&length2==1){//ydToMm
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*914.4;
            }else if(length1==7&&length2==2){//ydToCm
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*91.44;
            }else if(length1==7&&length2==3){//ydToM
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*0.9144;
            }else if(length1==7&&length2==4){//ydToKm
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*0.0009144;
            }else if(length1==7&&length2==5){//ydToIn
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*36;
            }else if(length1==7&&length2==6){//ydToFt
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*3;              
            }else if(length1==7&&length2==8){//ydToMi
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*0.0005681818;
            }else if(length1==7&&length2==9){//ydToNm
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*0.0004937365;
            }else if(length1==7&&length2==10){//ydToMil
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*36000;
            }else if(length1==8&&length2==1){//miToMm
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*1609344;
            }else if(length1==8&&length2==2){//miToCm
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*160934.4;
            }else if(length1==8&&length2==3){//miToM
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*1609.344;
            }else if(length1==8&&length2==4){//miToKm
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*1.609344;
            }else if(length1==8&&length2==5){//miToIn
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*63360;
            }else if(length1==8&&length2==6){//miToFt
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*5280;
            }else if(length1==8&&length2==7){//miToYd
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*1760;
            }else if(length1==8&&length2==9){//miToNm
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*0.8689762419;
            }else if(length1==8&&length2==10){//miToMil
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*63360000;

            }else if(length1==9&&length2==1){//nmToMm
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*1852000;
                
            }else if(length1==9&&length2==2){//nmToCm
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*185200;
                
            }else if(length1==9&&length2==3){//nmToM
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*1852;
                
            }else if(length1==9&&length2==4){//nmToKm
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*1.852;
                
            }else if(length1==9&&length2==5){//nmToIn
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*72913.385826771;
                
            }else if(length1==9&&length2==6){//nmToFt
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*6076.1154855643;
            
            }else if(length1==9&&length2==7){//nmToYd
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*2025.3718285214;
                
            }else if(length1==9&&length2==8){//nmToMi
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*1.150779448;
                
            }else if(length1==9&&length2==10){//nmToMil
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*72913385.826771;
                
            }else if(length1==10&&length2==1){//milToMm
                lenDou = Double.parseDouble(this.textField);
                ansLength = lenDou*0.0254;}
    
        return ansLength;}

    
    public String lenghtAnsString(){
        return ansLength.toString();

    }
    
}