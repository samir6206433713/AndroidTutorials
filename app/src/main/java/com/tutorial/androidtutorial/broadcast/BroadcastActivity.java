package com.tutorial.androidtutorial.broadcast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;

import com.tutorial.androidtutorial.R;

public class BroadcastActivity extends AppCompatActivity {

    public int accessModifier=4;
    protected int accessModifier2=4;
    int accessModifier3=4;

    BootCompleteReceiver bootCompleteReceiver=new BootCompleteReceiver();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast);
    }
    public void broadcastIntent(View view){
        Intent intent = new Intent();
        intent.setAction("com.tutorialspoint.CUSTOM_INTENT"); sendBroadcast(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();

        IntentFilter intentFilter= new IntentFilter();
        intentFilter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED);

        this.registerReceiver(bootCompleteReceiver, intentFilter);
    }

    @Override
    protected void onStop() {
        super.onStop();
        this.unregisterReceiver(bootCompleteReceiver);
    }
}