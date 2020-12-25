package com.tutorial.androidtutorial.singletonclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tutorial.androidtutorial.R;

public class SingletonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton);

        SingleTonClass myobject2= SingleTonClass.objectCreationMethod();
        SingleTonClass myobject3= SingleTonClass.objectCreationMethod();
    }
}