package com.tutorial.androidtutorial.final_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.tutorial.androidtutorial.R;

public class DemoFinal extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_final);
        final StringBuilder sb = new StringBuilder("Geeks");




        // changing internal state of object
        // reference by final reference variable sb
        sb.append("ForGeeks");
        Log.i("FinalVarialb", String.valueOf(sb));


//---------------------------------------------
        int arr[] = {1, 2, 3};

        // final with for-each statement
        // legal statement
        for (final int i : arr)
            System.out.print(i + " ");
        //--------------------------------------------

    }
}