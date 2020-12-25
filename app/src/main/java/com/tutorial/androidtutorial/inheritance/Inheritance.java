package com.tutorial.androidtutorial.inheritance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tutorial.androidtutorial.R;

public class Inheritance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inheritance);

        int a = 20, b = 10;
        My_Calculation demo = new My_Calculation();
        demo.addition(a, b);
        demo.Subtraction(a, b);
        demo.multiplication(a, b);

       // My_Calculation demo2=new Calculation();//incompatible types: Calculation cannot be converted to My_Calculation
        //        My_Calculation demo2=new Calculation();

        Calculation demo2=new My_Calculation();

        int test=1;
        long test2;
        test2=test;
        //test=test2; ---error: incompatible types: possible lossy conversion from long to int
        //        test=test2;




    }
}