package com.tutorial.androidtutorial.threads;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tutorial.androidtutorial.R;

public class TreadDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tread_demo);
        MultithreadingDemo obj=new MultithreadingDemo();
        obj.start();
    }
}