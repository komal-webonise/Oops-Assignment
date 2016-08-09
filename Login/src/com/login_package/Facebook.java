package com.login_package;

/**
 * Created by webonise on 9/8/16.
 */
public class Facebook implements LoginInterface {
    //mode is created and set for each one
    String mode;
    public Facebook(String mode)
    {
        this.mode=mode;
    }

    @Override
    public void login() {
        //it checks whether the mode is facebook
        if (this.mode.equalsIgnoreCase("facebook"))
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
        System.out.println("You have successfully logged in as FACEBOOK user");
    }
}
