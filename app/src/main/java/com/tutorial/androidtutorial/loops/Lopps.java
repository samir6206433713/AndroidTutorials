package com.tutorial.androidtutorial.loops;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.tutorial.androidtutorial.R;

public class Lopps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lopps);
        for (int j=0; j<=6; j++)
        {
            if (j==4)
            {
                continue;
            }

            Log.i("lopp",j+" ");
            System.out.print(j+" ");
        }
//---------------------BREAK----------------------------------
        int num =0;
        while(num<=100)
        {
            Log.i("BREAK","Value of variable is: "+num);
            System.out.println("Value of variable is: "+num);
            if (num==2)
            {
                break;
            }
            num++;
        }
        Log.i("BREAK","Out of while-loop");
        System.out.println("Out of while-loop");
    }
}