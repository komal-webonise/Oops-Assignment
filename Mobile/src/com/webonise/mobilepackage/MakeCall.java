package com.webonise.mobilepackage;

/**
 * Created by webonise on 9/8/16.
 */
public class MakeCall implements MakeCallInterface {
    //mention whether user is engaged
    boolean engagedState;

    public MakeCall()
    {
        engagedState=false;
    }
    //check whether user is engaged
    public boolean callup(){
        if(engagedState==false)
        {
            return  true;
        }
        return false;
    }
}
