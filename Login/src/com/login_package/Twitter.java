package com.login_package;

/**
 * Created by webonise on 9/8/16.
 */
public class Twitter implements LoginInterface {
    //mode is created and set for each one
    String mode;
    public Twitter(String mode)
    {
        this.mode=mode;
    }
    @Override
    public void login() {
        //it checks whether the mode is twitter
        if (this.mode.equalsIgnoreCase("twitter"))
        {
            TakeInput takeInput=new TakeInput();
            //it takes input for username and password
            takeInput.callForInput();
            //displays messageon successful login
            displayMessageOnLogin();
        }
    }

    public  void displayMessageOnLogin()
    {
        System.out.println("You have successfully logged in as TWITTER user");
    }
}
