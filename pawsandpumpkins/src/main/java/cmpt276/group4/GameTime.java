package cmpt276.group4;

public class GameTime {
    public int time ;
    private int timeCounter=0;

    public void countTime(){
        timeCounter++;
        time=timeCounter/60;
        System.out.println("time:"+time);
    }

}