package com.tvpackage;

/**
 * Created by webonise on 9/8/16.
 */
public class Volume implements VolumeInterface {
    //shows the current volume
    int current_volume;
 // sets the volume
     void setVolume(int current_volume) {
        this.current_volume = current_volume;
    }
// get the current volume
    public int getCurrent_volume() {
        return current_volume;
    }
//increase the vol;ume
    public void increaseVolume(int amt)
    {
        current_volume+=amt;
    }
    //decrease the volume
   public void decreaseVolume(int amt)
    {
        current_volume-=amt;
    }
}
