package com.tvpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by webonise on 9/8/16.
 */
public class Main {

public static  void main(String args[])
{
    while(true) {
        System.out.println("Enter your choice");

        System.out.println("Operations:\n1.Change Channel to a specified channel no\n2.Up channel\n3.Down Channel\n4.Increase Volume\n5.Decrease Volume\n6.On the tv\n7.Off the tv");

        Scanner scanner = new Scanner(System.in);
        //Take your current input
        int input = scanner.nextInt();
        switch(input)
        {
            case 1: {
                Channel channel = new Channel();
                //displays the dummy data of channel list
                channel.displayDummyData();
                System.out.println("Enter the channel no u wish to go to");
                //input the channel you want to switch to
                int channel_no = scanner.nextInt();
                boolean result = channel.goToChannel(channel_no);
                if (result) {
                    //Channel switched
                    System.out.println("Switched to channel " + channel_no);
                } else
                    //Channel not available
                    System.out.println("Channel NOT available");
                break;
            }

            case 2: {
                Channel channel = new Channel();
                //move to next channel in the list
                boolean result = channel.upChannel();
                if (result) {
                    //channel moved
                    System.out.println("Moved to next channel: Channel "+channel.getCurrent_channel());
                } else {
                    //channel not moved
                    System.out.println("Last Channel dude!");
                }
                break;
            }
            case 3: {
                Channel channel = new Channel();
                //move to prior channel in the list
                boolean result = channel.downChannel();
                if (result) {
                    //channel moved
                    System.out.println("Moved to prior channel");
                } else {
                    //channel moved
                    System.out.println("First Channel dude!");
                }
                break;
            }
            case 4:
            { // increases the volume by specific amount
                System.out.println("Enter the current volume");
                Volume volume=new Volume();
                volume.setVolume(scanner.nextInt());
                System.out.println("Increase the volume  by");
                volume.increaseVolume(scanner.nextInt());
                System.out.println("Volume has increased to "+volume.getCurrent_volume());
                break;

            }
            case 5:
            {// decreases the volume by specific amount
                System.out.println("Enter the current volume");
                Volume volume=new Volume();
                volume.setVolume(scanner.nextInt());
                System.out.println("Decrease the volume  by");
                volume.decreaseVolume(scanner.nextInt());
                System.out.println("Volume has decreased to "+volume.getCurrent_volume());
                break;

            }
            case 6:
            { // puts tv on on mode
                Tv tv=new Tv();
                tv.setMode(true);
                System.out.println("TV is on ON mode now...");
                break;
            }
            case 7:
            {
                // puts tv on off mode
                Tv tv=new Tv();
                tv.setMode(false);
                System.out.println("TV is on OFF mode now...");
                break;
            }
           

        }

    }
}
}
