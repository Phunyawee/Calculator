package projectRework;

class Calculate{
    private Double textField1;
    private Double textField2;
    private int check;
    private Double ansBasic;
    private int error = 0;
    public Calculate(String textField1,String textField2,int check){
        try{
        this.textField1 = Double.parseDouble(textField1) ;
        this.textField2 = Double.parseDouble(textField2) ;
        this.check = check;}catch(NumberFormatException e){
            this.error = 1;
        }
    }
    public int getError(){
        return error;
    }
    public Double basicOperator(){
        if(check==1){
            ansBasic = textField1+textField2;

        }else if(check==2){ansBasic = textField1-textField2;

        }else if(check==3){ansBasic = textField1*textField2;
            
        }else if(check==4){ansBasic = textField1/textField2;
            
        }else if(check==5){ansBasic = Math.pow(textField1,textField2);
            
        }

        return ansBasic;

    }
    public String ansString(){
        return ansBasic.toString();
    }

}