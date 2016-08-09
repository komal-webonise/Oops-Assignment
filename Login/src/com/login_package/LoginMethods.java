package com.login_package;

import java.util.ArrayList;

/**
 * Created by webonise on 9/8/16.
 */
public class LoginMethods {
    // input is passed
    void passInput(String input)
    {

        ArrayList<LoginInterface> allMethods=new ArrayList<LoginInterface>();
        //Object of every method is created and input is passed to it
        allMethods.add(new Facebook(input));
        allMethods.add(new ProprieatorLogin(input));
        allMethods.add(new Twitter(input));
        //login method is called for all the objects in the arraylist logininterface
        for (LoginInterface i:allMethods)
        {
            i.login();
        }
    }
}
