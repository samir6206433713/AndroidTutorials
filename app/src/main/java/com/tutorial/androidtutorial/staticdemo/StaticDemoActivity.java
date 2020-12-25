package com.tutorial.androidtutorial.staticdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tutorial.androidtutorial.R;

public class StaticDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_static_demo);
        JavaExample2 ob1 = new JavaExample2();
        JavaExample2 ob2 = new JavaExample2();

        ob1.var1=88;
        ob1.var2="I'm Object1";
    }
}