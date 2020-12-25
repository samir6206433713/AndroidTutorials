package com.tutorial.androidtutorial.inheritance;

import android.util.Log;

public class Calculation {

    protected int accessTest=50;
    int z;

    public void addition(int x, int y) {
        z = x + y;
        System.out.println("The sum of the given numbers:"+z);
        Log.i("addition_data","The sum of the given numbers:"+z);
    }

    public void Subtraction(int x, int y) {
        z = x - y;
        Log.i("Subtraction_data","The difference between the given numbers:"+z);
        System.out.println("The difference between the given numbers:"+z);
    }

}
