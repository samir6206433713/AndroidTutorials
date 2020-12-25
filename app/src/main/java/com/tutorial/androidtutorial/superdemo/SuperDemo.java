package com.tutorial.androidtutorial.superdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tutorial.androidtutorial.R;

public class SuperDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_super_demo);
        Car small = new Car();
        small.display();

        //---------------
        Student s = new Student();

        // calling display() of Student
        s.display();

        Student2 s2 = new Student2();
    }
}