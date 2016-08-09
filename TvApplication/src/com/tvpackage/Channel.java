package com.tvpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by webonise on 9/8/16.
 */
public class Channel implements ChannelInterface{
    //it has hashlist which is holding channel ids and channel names
    HashMap<Integer, String> channel_list;
    //current channel
    int current_channel;

    public Channel() {
        channel_list = new HashMap<Integer, String>();

    }
// used to display dummy data
    void displayDummyData() {
        current_channel = 1;
        channel_list.put(1, "Sony");
        channel_list.put(7, "Set max");
        channel_list.put(19, "Sports");
        channel_list.put(78, "Zee Music");
        channel_list.put(58, "Gold Star");
        channel_list.put(63, "Mi Marathi");
        for (Map.Entry channel : channel_list.entrySet()) {
            System.out.println("Channel id:" + channel.getKey() + "Channel name:" + channel.getValue());
        }
        System.out.println("Current channel is" + current_channel);
    }
// return the current channel id
    public int getCurrent_channel() {
        return current_channel;
    }

    //go to particular channel
    boolean goToChannel(int channel_id) {
        for (Map.Entry channel : channel_list.entrySet()) {

            if (channel.getKey() == channel_id) {
                current_channel = channel_id;
                return true;
            }

        }
        return false;
    }

    //go to the channel which is occuring next in the current list
    public boolean upChannel() {
        Iterator iterator = channel_list.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry channel = (Map.Entry) iterator.next();
            //System.out.println(pair.getKey() + " = " + pair.getValue());
            if (channel.getKey() == current_channel && iterator.hasNext() == true) {
                Map.Entry next_channel = (Map.Entry) iterator.next();

                current_channel = (int) next_channel.getKey();
                return true;
            }


        }
        return false;
    }
    // go to the channel which is occuring before the current channel in the hashmap
    public boolean downChannel() {
        for (Map.Entry channel : channel_list.entrySet()) {

            if (channel.getKey() == current_channel) {

                return false;
            }

        }
        return true;
    }
}
