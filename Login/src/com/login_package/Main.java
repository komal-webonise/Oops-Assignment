package com.login_package;

import java.util.Scanner;

/**
 * Created by webonise on 9/8/16.
 */
public class Main {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        // ask the user to input login method
        System.out.println("Proprieator Login\nFacebook\nTwitter");
        // Take the input
        String input=scanner.next();
        // Create object of login method
        LoginMethods loginMethods= new LoginMethods();
        loginMethods.passInput(input);



    }
}
