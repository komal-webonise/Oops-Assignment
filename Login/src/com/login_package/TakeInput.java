package com.login_package;

/**
 * Created by webonise on 9/8/16.
 */
public class TakeInput {
    //has a member variable as user
    User user;
    public TakeInput()
    {
        user=new User();
    }
    void callForInput()
    {
        // creates the object login
        Login l=new Login();
        //sets username and password for a particular user
        user.setUsername(l.inputUsername());
        user.setPassword(l.inputPassword());


    }
}
