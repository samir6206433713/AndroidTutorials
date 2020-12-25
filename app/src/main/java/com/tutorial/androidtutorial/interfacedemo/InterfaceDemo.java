package com.tutorial.androidtutorial.interfacedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.tutorial.androidtutorial.R;

public class InterfaceDemo extends AppCompatActivity implements MyInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface_demo);
        MyInterface obj = new InterfaceDemo();
        obj.method1();


        //---------------------
        Inf2 obj2 = new Demo();
        obj2.method2();
    }

    @Override
    public void method1() {
        Log.i("method1","implementation of method1");
    }

    @Override
    public void method2() {
        Log.i("method2","implementation of method2");
    }
}