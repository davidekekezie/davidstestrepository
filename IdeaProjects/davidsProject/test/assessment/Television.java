package assessment;

public class Television {


    public int volume;

    public int channel;

    public int brightness;
    public void volumeUp(){

        volume ++;

    }
    public void volumeDown(){

        if(volume>0) volume = volume - 1 ;


    }

    public void isOn(){
        boolean isOn = false;
        isOn =! isOn ;

    }

    public void channelUp(){
        channel ++;
    }

    public void channelDown(){
        if (channel>0) channel = channel - 1;


    }

    public void brightnessUp(){
        brightness++;

    }

    public void brightnessDown(){
        if(brightness>0)brightness = brightness -1;

    }

}
