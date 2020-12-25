package com.tutorial.androidtutorial.abstractpostmortom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tutorial.androidtutorial.R;

public class AbstractActivityPostmortam extends AppCompatActivity implements  PostmortonInterface{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abstract_postmortam);
        PostmortonInterface postmortonInterface= new AbstractActivityPostmortam();
        postmortonInterface.postmortam();
    }

    @Override
    public String postmortam() {
        return "postmartom finished";
    }
}