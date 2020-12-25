package com.tutorial.androidtutorial.inheritance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.tutorial.androidtutorial.R;
import com.tutorial.androidtutorial.activity.ActivityLifeCyle;
import com.tutorial.androidtutorial.broadcast.BroadcastActivity;
import com.tutorial.androidtutorial.service.B;
import com.tutorial.androidtutorial.service.ServiceActivity;

public class AccessMofiers extends AppCompatActivity {

    ActivityLifeCyle activityLifeCyle;
    BroadcastActivity broadcastActivity;
    ServiceActivity serviceActivity;
    B b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inheritance_demo);
        /*public int accessModifier=4;
        protected int accessModifier2=4;
        int accessModifier3=4;*/

        activityLifeCyle= new ActivityLifeCyle();
        broadcastActivity=new BroadcastActivity();
        serviceActivity= new ServiceActivity();
        b=new B();



      //  int t=   b.accessTest;------------------this cannot be done

      //  b.getProtectedData();
        Log.i("protecteddata", "demodata");
       /* Log.i("protecteddata", String.valueOf(b.getProtectedData()));*/


        int demo=     activityLifeCyle.accessModifier;
      //  int demo2=    activityLifeCyle.accessModifier2;
      //  int demo3=     activityLifeCyle.accessModifier3;


    }
}