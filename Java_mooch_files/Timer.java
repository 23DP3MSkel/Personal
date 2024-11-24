package Java_mooch_files;

public class Timer {    

    private ClockHand seconds;
    private ClockHand hundredSeconds;

    public Timer(){
        this.seconds = new ClockHand(60);
        this.hundredSeconds = new ClockHand(100);

    }

    public void advance(){
        this.hundredSeconds.advance();
        if(this.hundredSeconds.value() == 0){
            this.seconds.advance();
        }

    }

    public String toString(){
        return this.seconds + ":" + this.hundredSeconds;

    }    



}
