package com.tutorial.androidtutorial.abstractclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.tutorial.androidtutorial.R;

public class AbstractDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abstract_demo);
        Animal obj = new Dog();
        /*Dog obj = new Dog();*/  //this also works
        obj.sound();
       ;
        Log.i("samirdata", obj.samir());
    }
}