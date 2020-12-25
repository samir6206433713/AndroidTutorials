package com.tutorial.androidtutorial.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class HelloService extends Service {

    private Timer mTimer=null;
    public static final long INTERVAL=10000;
    private Handler mHandler=new Handler();
    public String currentTimerData="null";
    int i=0;


    private final IBinder buckeyBinder=new MyLocalBinder();
    public HelloService() {
    }





    /** indicates how to behave if the service is killed */
    int mStartMode;

    /** interface for clients that bind */
    IBinder mBinder;

    /** indicates whether onRebind should be used */
    boolean mAllowRebind;

    /** Called when the service is being created. */
    @Override
    public void onCreate() {
        Log.i("onCreate","onCreate");

    }

    /** The service is starting, due to a call to startService() */
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i("onStartCommand","onStartCommand");

        if(mTimer!=null)
            mTimer.cancel();
        else
            mTimer=new Timer();
        mTimer.scheduleAtFixedRate(new TimeDisplayTimerTask(),0,INTERVAL);
        return mStartMode;
    }

    /** A client is binding to the service with bindService() */
    @Override
    public IBinder onBind(Intent intent) {
        Log.i("onBind","onBind");
        if(mTimer!=null)
            mTimer.cancel();
        else
            mTimer=new Timer();
        mTimer.scheduleAtFixedRate(new TimeDisplayTimerTask(),0,INTERVAL);
        return buckeyBinder;
    }

    /** Called when all clients have unbound with unbindService() */
    @Override
    public boolean onUnbind(Intent intent) {
        Log.i("onUnbind","onUnbind");
        return mAllowRebind;
    }

    /** Called when a client is binding to the service with bindService()*/
    @Override
    public void onRebind(Intent intent) {

        Log.i("onRebind","onRebind");

    }

    /** Called when The service is no longer used and is being destroyed */
    @Override
    public void onDestroy() {
        Log.i("onDestroy","onDestroy");
    }


    public class  MyLocalBinder extends Binder{

        HelloService getService(){
            return HelloService.this;
        }
    }

    public String getCurrentTiime(){
       /* SimpleDateFormat simpleformat = new SimpleDateFormat("dd/MMMM/yyyy hh:mm:s");
        return simpleformat.format(new Date());*/

       return String.valueOf(i);

    }

    private class TimeDisplayTimerTask extends TimerTask {
        @Override
        public void run() {

            mHandler.post(new Runnable() {
                @Override
                public void run() {

                    Log.i("timer",String.valueOf(i));



i++;


currentTimerData= String.valueOf(i);
                }
            });
        }
    }
}