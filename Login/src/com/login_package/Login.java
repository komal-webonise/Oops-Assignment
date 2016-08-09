package com.login_package;


import java.util.Scanner;

public class Login implements inputUsername,inputPassword {
//it takes input for username and returns it
    public  String inputUsername()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter username");
        String username=scanner.next();
        return username;
    }
    //it takes input for password and returns it
    public  String inputPassword()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Password");
        String password=scanner.next();
        return password;
    }
}
