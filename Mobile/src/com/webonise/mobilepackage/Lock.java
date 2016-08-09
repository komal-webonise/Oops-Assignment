package com.webonise.mobilepackage;

/**
 * Created by webonise on 9/8/16.
 */
public class Lock implements LockInterface{
    //lock state is given
    boolean lockState;
//set the lockstate
     void setLockState(boolean lockState) {
        this.lockState = lockState;
    }
    //get the lockstate
    boolean getLockState()
    {
        return lockState;
    }
//sets the phone as locked
    public void lock()
    {
        setLockState(true);
    }
    //sets the phone as unlocked
    public void unLock()
    {
        setLockState(false);
    }
}
