package sample;

public class Car {

    private int speed;

    public void run() throws Exception{
        speed += 10;
        if(speed >=10){
            throw new Exception("スピードの出しすぎです");
        }
    }
    public void run2(String str)throws OverSpeedException{
        speed += 10;
        if(speed >=120){
            throw new OverSpeedException("スピードの出しすぎです");
        }
     
    }
    
}
