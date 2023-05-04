package projectRework;
import java.util.concurrent.TimeUnit;
class TimeConvert{
    private int time1;
    private int time2;
    private String textField;
    private String labelShow;
    private Long dy;
    public TimeConvert(int time1,int time2,String textField){
        this.time1 = time1;
        this.time2 = time2;
        this.textField = textField;

    }
    public Long timeAnsLong(){
        if(this.time1==1&&this.time2==2){
            
            this.dy= (TimeUnit.MILLISECONDS.toSeconds( Long.parseLong(this.textField)));    
        }else if(this.time1==1&&this.time2==3){
            
            this.dy= TimeUnit.MILLISECONDS.toMinutes( Long.parseLong(this.textField));
        }else if(this.time1==1&&this.time2==4){
            
            this.dy= TimeUnit.MILLISECONDS.toHours(Long.parseLong(this.textField));
        }else if(this.time1==1&&this.time2==5){
            
            this.dy = TimeUnit.MILLISECONDS.toDays(Long.parseLong(this.textField));   
        }else if(this.time1==1&&this.time2==6){ 
           
            this.dy = (TimeUnit.MILLISECONDS.toDays(Long.parseLong(this.textField)))/7;
        }//sec
        else if(this.time1==2&&this.time2==1){
            
            this.dy= TimeUnit.SECONDS.toMillis(Long.parseLong(this.textField));
                        
        }else if(this.time1==2&&this.time2==3){
            
            this.dy= TimeUnit.SECONDS.toMinutes(Long.parseLong(this.textField));
            
        }else if(this.time1==2&&this.time2==4){
            
            this.dy= TimeUnit.SECONDS.toHours(Long.parseLong(this.textField));
            
        }else if(this.time1==2&&this.time2==5){
        
            this.dy = TimeUnit.SECONDS.toDays(Long.parseLong(this.textField));
            
        }else if(this.time1==2&&this.time2==6){ 
            
            this.dy = (TimeUnit.SECONDS.toDays(Long.parseLong(this.textField)))/7;
            
        }//min
        else if(this.time1==3&&this.time2==1){
        
            this.dy= TimeUnit.MINUTES.toMillis(Long.parseLong(this.textField));
            
        }else if(this.time1==3&&this.time2==2){
            this.dy= TimeUnit.MINUTES.toSeconds(Long.parseLong(this.textField));
            
        }else if(this.time1==3&&this.time2==4){
            this.dy= TimeUnit.MINUTES.toHours(Long.parseLong(this.textField));
            
        }else if(this.time1==3&&this.time2==5){
            this.dy = TimeUnit.MINUTES.toDays(Long.parseLong(this.textField));
            
        }else if(this.time1==3&&this.time2==6){ 

            this.dy= (TimeUnit.MINUTES.toDays(Long.parseLong(this.textField)))/7;
            
        }//hour
        else if(this.time1==4&&this.time2==1){
            
            this.dy= TimeUnit.HOURS.toMillis(Long.parseLong(this.textField));
        }else if(this.time1==4&&this.time2==2){
            this.dy= TimeUnit.HOURS.toSeconds(Long.parseLong(this.textField));
            
        }else if(this.time1==4&&this.time2==3){
            this.dy= TimeUnit.HOURS.toMinutes(Long.parseLong(this.textField));
            
        }else if(this.time1==4&&this.time2==5){
            
            this.dy = TimeUnit.HOURS.toDays(Long.parseLong(this.textField));
            
        }else if(this.time1==4&&this.time2==6){ 
            
            this.dy = (TimeUnit.HOURS.toDays(Long.parseLong(this.textField)))/7;
            
        }//days
        else if(this.time1==5&&this.time2==1){
        
            this.dy= TimeUnit.DAYS.toMillis(Long.parseLong(this.textField));
        }else if(this.time1==5&&this.time2==2){
            
            this.dy= TimeUnit.DAYS.toSeconds(Long.parseLong(this.textField));
            
        }else if(this.time1==5&&this.time2==3){
        
            this.dy= TimeUnit.DAYS.toMinutes(Long.parseLong(this.textField));
        
        }else if(this.time1==5&&this.time2==4){
            
            this.dy = TimeUnit.DAYS.toHours(Long.parseLong(this.textField));
            
        }else if(this.time1==5&&this.time2==6){ 
        
            this.dy = (TimeUnit.DAYS.toDays(Long.parseLong(this.textField)))/7;
            
        }//weeks
        else if(this.time1==6&&this.time2==1){//toMill
        
            this.dy= TimeUnit.DAYS.toMillis((TimeUnit.DAYS.toDays(Long.parseLong(this.textField)))*7);    
            
        }else if(this.time1==6&&this.time2==2){//toSec
        
            this.dy= TimeUnit.DAYS.toSeconds((TimeUnit.DAYS.toDays(Long.parseLong(this.textField)))*7);
            
        }else if(this.time1==6&&this.time2==3){//toMin
            
            this.dy= TimeUnit.DAYS.toMinutes((TimeUnit.DAYS.toDays(Long.parseLong(this.textField)))*7);
            
        }else if(this.time1==6&&this.time2==4){//toHr
            
            this.dy = TimeUnit.DAYS.toDays(Long.parseLong(this.textField))*168;//day=24*7=1week
            
        }else if(this.time1==6&&this.time2==5){//toDay
            this.dy = (TimeUnit.DAYS.toDays(Long.parseLong(this.textField)))*7;
            
        }


        return this.dy;
    }
    public String timeAnsString(){
        this.labelShow =this.dy.toString();
        return this.labelShow;

    }
    
}