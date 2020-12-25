package com.tutorial.androidtutorial.threads;

import android.util.Log;

class Count extends Thread
{
    Count()
    {
        super("my extending thread");//this is creating a thread
        System.out.println("my thread created" + this);
        start();//this starts executing thread it calls run method
    }
    public void run()
    {
        try
        {
            for (int i=0 ;i<10;i++)
            {
                System.out.println("Printing the count " + i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("my thread interrupted");
        }
        System.out.println("My thread run is over" );
    }
}
class ExtendingExample
{
    public static void main(String args[])
    {
        Count cnt = new Count();
        try
        {
            while(cnt.isAlive())
            {
                System.out.println("Main thread will be alive till the child thread is live");
                Thread.sleep(1500);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread's run is over" );
    }
}