package com.tutorial.androidtutorial.threads;

import android.util.Log;

class MultithreadingDemo extends Thread{

    public void run(){
        Log.i("thread","My thread is in running state.");
        System.out.println("My thread is in running state.");
    }
/*  public void run(){
    System.out.println("My thread is in running state.");  
  }   
  public static void main(String args[]){  
     MultithreadingDemo obj=new MultithreadingDemo();   
     obj.start();  
  }  */

    //------------------------------second one example----------


}