package com.cookkyle.rougejava;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    /*public static String a = "THIS IS SHARED between objects of MainActivity";
    public String b = "THIS IS NOT SHARED";

    static {
        MainActivity x = new MainActivity();
        MainActivity y = new MainActivity();

        x.a = "TEST";
        x.b = "TEST2";

        System.out.println(y.a); //prints "TEST"                the value is changed for all objects of MainActivity (they share one value)
        System.out.println(y.b); //prints "THIS IS NOT SHARED"  the value is different for all the objects (they can have different values)

        //Also, if it's static, since it's shared between all instances of a class, you can access it without even having an instance of the class.
        System.out.println(MainActivity.a); //A is static
        System.out.println(MainActivity.b); //B is not static
    }
*/
    public static String charName = "";
    public static EditText inputET = null;
    //ET = edit text
    public static TextView outputTV = null;
    //TV = text view
    public static ScrollView sv = null;
    public static String input = "";
    //public static boolean setName = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sv = (ScrollView)findViewById(R.id.scrl);
        inputET = (EditText) findViewById(R.id.inputText);
        outputTV = (TextView) findViewById(R.id.outputText);
        inputET.setMovementMethod(new ScrollingMovementMethod());
        outputTV.append(">Welcome to RougeJava... \n");
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        outputTV.append(">To begin first type in your name... \n");
        inputET.setText("Enter name: ");
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread keyWord = new Thread();
        keyWord.start();
}
    public void input (View v) {
        input = (inputET.getText()).toString();
        inputET.setText("");
        //sets user text to string
        outputTV.append(">" +input +"\n");
        sv.scrollTo(0, sv.getBottom());
        //sets user text to content of output
        Log.i("asdf", input);
    }
}
