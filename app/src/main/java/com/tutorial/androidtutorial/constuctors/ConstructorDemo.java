package com.tutorial.androidtutorial.constuctors;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tutorial.androidtutorial.R;

public class ConstructorDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constructor_demo);

            new MyChildClass();
//-------------------------Copy Constructor---------------
        JavaExample obj1 = new JavaExample("BeginnersBook");

        /* Passing the object as an argument to the constructor
         * This will invoke the copy constructor
         */
        JavaExample obj2 = new JavaExample(obj1);
        obj1.disp();
        obj2.disp();
        //-------------------------------------------------------------

    }
}