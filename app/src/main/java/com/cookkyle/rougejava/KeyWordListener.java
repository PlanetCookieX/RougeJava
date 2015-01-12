package com.cookkyle.rougejava;

import android.util.Log;

/**
 * Created by CookieMonster on 1/11/2015.
 */
    public class KeyWordListener extends Thread{
    public void run() {
        //super.run();      What is this

       while(true){

           if(MainActivity.input.trim().toLowerCase().equals("start") && !(MainActivity.charName.equals(""))){
               Log.i("asdf", "Start Listener Triggered");
            Story.Story();
           }


           else if(MainActivity.input.trim().toLowerCase().equals("menu")){
               Log.i("asdf", "Menu Listener Triggered");

           }


           else if(MainActivity.input.trim().toLowerCase().equals("rules")){
               Log.i("asdf", "Rukes Listener Triggered");

           }



           else if(MainActivity.input.trim().toLowerCase().equals("hint")){
               Log.i("asdf", "Hint Listener Triggered");

           }

           else if(MainActivity.input.trim().toLowerCase().equals("inventory")){
               Log.i("asdf", "Inventory Listener Triggered");

           }


       }
    }
}
