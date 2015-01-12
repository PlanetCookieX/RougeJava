package com.cookkyle.rougejava;

import android.util.Log;

/**
 * Created by CookieMonster on 1/11/2015.
 */
public class nameSetter {
    public static void nameSetter(){
        Log.i("asdf", "Name Set Ran");
        MainActivity.charName = MainActivity.input.substring(11, MainActivity.input.length());
        //11 is the length of "Enter Name: "
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
            MainActivity.outputTV.append(">Hello " +  MainActivity.charName + "type \"start\" to start the game. \n");
        }
    }
}
