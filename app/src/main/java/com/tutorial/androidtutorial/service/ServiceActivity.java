package com.tutorial.androidtutorial.service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.TextView;

import com.tutorial.androidtutorial.R;

public class ServiceActivity extends AppCompatActivity {
   public int accessModifier=4;
    protected int accessModifier2=4;
     int accessModifier3=4;
    HelloService helloService;
    boolean isBound=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bound_service);

        Intent intent= new Intent(this,HelloService.class);
        bindService(intent,serviceConnection, Context.BIND_AUTO_CREATE);
    }


    private ServiceConnection serviceConnection= new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            HelloService.MyLocalBinder binder= (HelloService.MyLocalBinder)service;
            helloService= binder.getService();
            isBound=true;
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            isBound=false;
        }
    };

    public void showTime(View view) {

      String time=  helloService.getCurrentTiime();

        TextView textView =findViewById(R.id.textView);

        textView.setText(time);
    }





  /*  public void startService(View view) {
        startService(new Intent(getBaseContext(), HelloService.class));
    }

    // Method to stop the service
    public void stopService(View view) {
        stopService(new Intent(getBaseContext(), HelloService.class));
    }*/
}