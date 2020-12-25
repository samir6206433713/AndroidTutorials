package com.tutorial.androidtutorial.threads;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.tutorial.androidtutorial.R;

import java.io.IOException;

public class WorkerToUIthread extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worker_to_u_ithread);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
              /*  try {
                    final String res = Utils.GetRequest("http://www.google.com");
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(WorkerToUIthread.this, res, Toast.LENGTH_SHORT).show();
                        }
                    });
                } catch (IOException e) {
                    e.printStackTrace();
                }*/
            }
        });
        thread.start();
    }
}