package com.tutorial.androidtutorial.inheritance;

import android.util.Log;

public class My_Calculation extends Calculation {
    public void multiplication(int x, int y) {
        z = x * y;

        Log.i("Data","The product of the given numbers:" + z);


        //System.out.println("The product of the given numbers:" + z);
    }


}