package com.webonise.mobilepackage;

import java.util.Scanner;

/**
 * Created by webonise on 9/8/16.
 */
public class Main {
    public static void main(String args[])
    { //display the menu
        Scanner scanner=new Scanner(System.in);
        while (true) {
            System.out.println("1.Lock the phone");
            System.out.println("2.Unlock the phone");
            System.out.println("3.Make a call");
            System.out.println("4.Message");
            System.out.println("5.Open the camera");
            System.out.println("6.Browse");


            System.out.println("Enter choice");
            int input=scanner.nextInt();
            switch (input)
            {
                case 1:
                { //lock the mobile
                    Lock lock=new Lock();
                    lock.lock();
                    System.out.println("Phone is on "+lock.getLockState()+" lock state");
                    break;
                }
                case 2:
                {
                    //unlock the mobile
                    Lock lock=new Lock();
                    lock.unLock();
                    System.out.println("Phone is on "+lock.getLockState()+" lock state");
                    break;
                }
                case 3: {
                    //make a call, returns true if call is not engaged else false
                    MakeCall makeCall = new MakeCall();
                    if (makeCall.callup()) {
                        System.out.println("Call done");
                    } else {
                        System.out.println("Call  not done");
                    }
                    break;
                }
                case 4:
                {
                    //to send the text message
                    Message message=new Message();
                    System.out.println("Enter the message");
                    message.setText(scanner.next());
                    System.out.println("The message entered is "+message.getText());
                    break;

                }
                case 5:
                {
                    //take a photo and retrieve it
                    CAmera cAmera=new CAmera();
                    System.out.println("Enter the photo");
                    cAmera.setPhoto(scanner.next());
                    System.out.println("Photo taken  is "+cAmera.getPhoto());
                    break;
                }
                case 6:
                { // browse and return the results
                    Browse browse=new Browse();
                    System.out.print("Enter the text you want to browse");
                    browse.setQuery(scanner.next());
                    System.out.println(" hey you have browsed "+browse.displayResult());


                }

            }


        }
    }
}
