package com.login_package;

/**
 * Created by webonise on 9/8/16.
 */
public class ProprieatorLogin implements LoginInterface{
    //mode is created and set for each one
    String mode;
    public ProprieatorLogin(String mode)
    {
        this.mode=mode;
    }

    @Override
    public void login() {
        //it checks whether the mode is proprieator
        if (this.mode.equalsIgnoreCase("proprieator login"))
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
        System.out.println("You have successfully logged in as proprieator user");
    }
}
