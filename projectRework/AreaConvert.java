package projectRework;
class AreaConvert{
    private int area1;
    private int area2;
    private Double areaDou;
    private Double ansArea;
    private String textField;
    public AreaConvert(int area1,int area2,String textField){
        this.area1 = area1;
        this.area2 = area2;
        this.textField = textField;
    }
    public Double areaAnsDouble(){if(area1==1&&area2==2){//acreToares
        areaDou = Double.parseDouble(this.textField);
        ansArea = areaDou*40.469;
    }else if(area1==1&&area2==3){//acreToHectare
        areaDou = Double.parseDouble(this.textField);
        ansArea = areaDou*0.4046856422;
    }else if(area1==1&&area2==4){//acreToCm2
        areaDou = Double.parseDouble(this.textField);
        ansArea = areaDou*40468564.224;
    }else if(area1==1&&area2==5){//acreToFt2
        areaDou = Double.parseDouble(this.textField);
        ansArea = areaDou*43560;    
    }else if(area1==1&&area2==6){//acreToIn2
        areaDou = Double.parseDouble(this.textField);
        ansArea = areaDou*6272640;
    }else if(area1==1&&area2==7){//acreTom2
        areaDou = Double.parseDouble(this.textField);
        ansArea = areaDou*4046.8564224;     
    }else if(area1==2&&area2==1){//aresToAcre
        areaDou = Double.parseDouble(this.textField);
        ansArea = areaDou*0.0247105381;
    }else if(area1==2&&area2==3){//aresToHectare
        areaDou = Double.parseDouble(this.textField);
        ansArea = areaDou*0.01;
    }else if(area1==2&&area2==4){//aresToCm**2
        areaDou = Double.parseDouble(this.textField);
        ansArea = areaDou*1000000;
    }else if(area1==2&&area2==5){//aresToFt**2
        areaDou = Double.parseDouble(this.textField);
        ansArea = areaDou*1076.391041671;
    }else if(area1==2&&area2==6){//aresToIn**2
        areaDou = Double.parseDouble(this.textField);
        ansArea = areaDou*155000.31000062;
    }else if(area1==2&&area2==7){//aresToM**2
        areaDou = Double.parseDouble(this.textField);
        ansArea = areaDou*100;
    }else if(area1==3&&area2==1){//hectareToAcre
        areaDou = Double.parseDouble(this.textField);
        ansArea = areaDou*2.4710538147;
    }else if(area1==3&&area2==2){//hectareToAres
        areaDou = Double.parseDouble(this.textField);
        ansArea = areaDou*100;
    }else if(area1==3&&area2==4){//hectareToCm2
        areaDou = Double.parseDouble(this.textField);
        ansArea = areaDou*100000000;
    }else if(area1==3&&area2==5){//hectareToFt2
        areaDou = Double.parseDouble(this.textField);
        ansArea = areaDou*107639.10416709;
    }else if(area1==3&&area2==6){//hectareToIn2
        areaDou = Double.parseDouble(this.textField);
        ansArea = areaDou*15500031.000062;
    }else if(area1==4&&area2==1){//Cm2ToAcre
        areaDou = Double.parseDouble(this.textField);
        ansArea = areaDou*2.471*Math.pow(10,-8);
    }else if(area1==4&&area2==2){//Cm2ToAres
        areaDou = Double.parseDouble(this.textField);
        ansArea = areaDou*0.000001;
        
    }else if(area1==4&&area2==3){//Cm2ToHa
        areaDou = Double.parseDouble(this.textField);
        ansArea = areaDou*0.00000001;
    }else if(area1==4&&area2==5){//Cm2ToFt
        areaDou = Double.parseDouble(this.textField);
        ansArea = areaDou*0.001076391;
    }else if(area1==4&&area2==6){//Cm2ToIn
        areaDou = Double.parseDouble(this.textField);
        ansArea = areaDou*0.15500031;
    }else if(area1==4&&area2==7){//Cm2ToM2
        areaDou = Double.parseDouble(this.textField);
        ansArea = areaDou*0.0001;
    }else if(area1==5&&area2==1){//ftToAc
        areaDou = Double.parseDouble(this.textField);
        ansArea = areaDou*0.0000229568;
    }else if(area1==5&&area2==2){//ftToA
        areaDou = Double.parseDouble(this.textField);
        ansArea = areaDou*0.0009290304;
    }else if(area1==5&&area2==3){//ftToHa
        areaDou = Double.parseDouble(this.textField);
        ansArea = areaDou*0.000009290304;
    }else if(area1==5&&area2==4){//ftToCm2
        areaDou = Double.parseDouble(this.textField);
        ansArea = areaDou*929.0304;
    }else if(area1==5&&area2==6){//ftToIn2
        areaDou = Double.parseDouble(this.textField);
        ansArea = areaDou*144;
    }else if(area1==5&&area2==7){//ftToM2
        areaDou = Double.parseDouble(this.textField);
        ansArea = areaDou*0.09290304;
    }else if(area1==6&&area2==7){//inToM2
        areaDou = Double.parseDouble(this.textField);
        ansArea = areaDou*0.00064516;
    }else if(area1==6&&area2==1){//inToAc
        areaDou = Double.parseDouble(this.textField);
        ansArea = areaDou*1.594*Math.pow(10,-7);
    }else if(area1==6&&area2==2){//inToA
        areaDou = Double.parseDouble(this.textField);
        ansArea = areaDou*0.0000064516;
    }else if(area1==6&&area2==3){//inToHa
        areaDou = Double.parseDouble(this.textField);
        ansArea = areaDou*0.0000000645;
    }else if(area1==6&&area2==4){//inToCm2
        areaDou = Double.parseDouble(this.textField);
        ansArea = areaDou*6.4516;
    }else if(area1==6&&area2==5){//inToFt
        areaDou = Double.parseDouble(this.textField);
        ansArea = areaDou*0.0069444444;
    }else if(area1==7&&area2==6){//m2ToIn2
        areaDou = Double.parseDouble(this.textField);
        ansArea = areaDou*1550.0031000062;
    }else if(area1==7&&area2==1){//m2ToAc
        areaDou = Double.parseDouble(this.textField);
        ansArea = areaDou*0.0002471054;
    }else if(area1==7&&area2==2){//m2ToA
        areaDou = Double.parseDouble(this.textField);
        ansArea = areaDou*0.01;
    }else if(area1==7&&area2==3){//m2ToHa
        areaDou = Double.parseDouble(this.textField);
        ansArea = areaDou*0.0001;
    }else if(area1==7&&area2==4){//m2ToCm2
        areaDou = Double.parseDouble(this.textField);
        ansArea = areaDou*10000;
    }else if(area1==7&&area2==5){//m2ToFt2
        areaDou = Double.parseDouble(this.textField);
        ansArea = areaDou*10.7639104167;
    }

        return ansArea;
    }
    public String areaAnsString(){
        return ansArea.toString();
    }
    
}