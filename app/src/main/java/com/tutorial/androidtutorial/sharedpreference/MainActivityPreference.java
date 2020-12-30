package com.tutorial.androidtutorial.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tutorial.androidtutorial.R;

public class MainActivityPreference extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_preference);
        Preferences.getInstance(getApplicationContext()).update(Preferences.ID_TOKEN,"abc");
        Preferences.getInstance(getApplicationContext()).getdata("adddddd");
    }
}