package com.tutorial.androidtutorial.overloading;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tutorial.androidtutorial.R;

public class OverloadingDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overloading_demo);
       
    }
//--------------this is not valid as method have same name with different return type---------
  /*  int add(int, int)
    float add(int, int)*/
}