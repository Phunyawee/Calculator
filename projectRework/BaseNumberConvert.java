package projectRework;
class BaseNumberConvert{
    private int modeConvert;
    private int modeConvert2;
    private String base;
    private String textField;
    public BaseNumberConvert(int modeConvert,int modeConvert2,String textField){
        this.textField = textField;
        this.modeConvert = modeConvert;
        this.modeConvert2 = modeConvert2;
    }
    public String ansBaseNumberString(){
        if(modeConvert==1&&modeConvert2==2){
            base = (Integer.toString(Integer.parseInt(textField,2),10).toUpperCase());
        }else if(modeConvert==1&&modeConvert2==3){
            base = (Integer.toString(Integer.parseInt(textField,2),8).toUpperCase());
        }else if(modeConvert==1&&modeConvert2==4){
            base = (Integer.toString(Integer.parseInt(textField,2),16).toUpperCase());       
        }else if(modeConvert==2&&modeConvert2==1){
            base = (Integer.toString(Integer.parseInt(textField,10),2).toUpperCase());
        }else if(modeConvert==2&&modeConvert2==3){
            base = (Integer.toString(Integer.parseInt(textField,10),8).toUpperCase());
        }else if(modeConvert==2&&modeConvert2==4){
            base = (Integer.toString(Integer.parseInt(textField,10),16).toUpperCase());
        }else if(modeConvert==3&&modeConvert2==1){
            base = (Integer.toString(Integer.parseInt(textField,8),2).toUpperCase());
        }else if(modeConvert==3&&modeConvert2==2){
            base = (Integer.toString(Integer.parseInt(textField,8),10).toUpperCase());
        }else if(modeConvert==3&&modeConvert2==4){
            base = (Integer.toString(Integer.parseInt(textField,8),16).toUpperCase());
        }else if(modeConvert==4&&modeConvert2==1){
            base = (Integer.toString(Integer.parseInt(textField,16),2).toUpperCase());
        }else if(modeConvert==4&&modeConvert2==2){
            base = (Integer.toString(Integer.parseInt(textField,16),10).toUpperCase());
        }else if(modeConvert==4&&modeConvert2==3){
            base = (Integer.toString(Integer.parseInt(textField,16),8).toUpperCase());
        }
                


        return base;

    }

} 