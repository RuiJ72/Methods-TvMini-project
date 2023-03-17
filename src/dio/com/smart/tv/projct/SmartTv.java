package dio.com.smart.tv.projct;

public class SmartTv {

    boolean off= true;
    boolean on = false;
    int channel = 1;
    int volume = 25;

    public void changeChannel(int newChannel){
        channel = newChannel;
    }
    public void increaseVolume(){
        volume++;
        System.out.println("Increasing volume to: " + volume);
    }

    public void decreseVolume(){
        volume--;
        System.out.println("Decreasing volume to: " + volume);
    }
    // Methods that manipulate the states
    public void  connect(){
        on = true;

    }

    public void  disconnect(){
        off = false;
    }

    public void increasingChannel(){
        channel++;
    }

    public void decresingChannel(){
        channel--;
    }
}
