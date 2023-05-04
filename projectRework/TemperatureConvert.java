package projectRework;
class TemperatureConvert{
    private int temp1;
    private int temp2;
    private String textField;
    private String labelShow;
    private Double ansTempDou;
    /*12=CtoF 13=CtoK 14=CtoR


    */
    public TemperatureConvert(int temp1,int temp2,String textField){
        this.temp1 = temp1;
        this.temp2 = temp2;
        this.textField = textField;
    }

    public Double temperatureAnsDouple(){
        if(this.temp1==1&&this.temp2==2){
            this.ansTempDou = Double.parseDouble(this.textField);
            this.ansTempDou = this.ansTempDou *1.8+32;
        }else if(this.temp1==1&&this.temp2==3){
            this.ansTempDou = Double.parseDouble(this.textField);
            ansTempDou = ansTempDou+273.15;//toK
        }else if(this.temp1==1&&this.temp2==4){
            this.ansTempDou = Double.parseDouble(this.textField);
            ansTempDou = ansTempDou*21/40+7.5;//toR
        }else if(this.temp1==2&&this.temp2==1){//f
            this.ansTempDou = Double.parseDouble(this.textField);
            ansTempDou = (ansTempDou-32)/1.8;//toC
        }else if(this.temp1==2&&this.temp2==3){
            this.ansTempDou = Double.parseDouble(this.textField);
            ansTempDou = ((ansTempDou-32)/1.8)+273.15;//toK
        }else if(this.temp1==2&&this.temp2==4){
            this.ansTempDou = Double.parseDouble(this.textField);
            ansTempDou = ((ansTempDou-32)*7/24)+7.5;//toR   
        }else if(this.temp1==3&&this.temp2==1){//k
            this.ansTempDou = Double.parseDouble(this.textField);
            ansTempDou = ansTempDou-273.15;//toC
        }else if(this.temp1==3&&this.temp2==2){
            this.ansTempDou = Double.parseDouble(this.textField);
            ansTempDou = (((ansTempDou-273.15)/5)*9)+32;//toF
        }else if(this.temp1==3&&this.temp2==4){
            this.ansTempDou = Double.parseDouble(this.textField);
            ansTempDou = ((ansTempDou-273.15)*21/40+7.5);//toR
        }else if(this.temp1==4&&this.temp2==1){//r
            this.ansTempDou = Double.parseDouble(this.textField);
            ansTempDou = (ansTempDou-7.5)*40/21;//toC 
        }else if(this.temp1==4&&this.temp2==2){
            this.ansTempDou = Double.parseDouble(this.textField);
            ansTempDou = ((ansTempDou-7.5)*24/7+32);//toF
        }else if(this.temp1==4&&this.temp2==3){
            this.ansTempDou = Double.parseDouble(this.textField);
            ansTempDou = ((ansTempDou-7.5)*40/21)+273.15;//tok   
        }
    return this.ansTempDou;
    }
    public String temperatureAnsString(){
        this.labelShow=ansTempDou.toString();
        return this.labelShow;
    }
    
}