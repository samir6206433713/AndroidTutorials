package com.tutorial.androidtutorial.interfacedemo;

import android.util.Log;

public class Demo implements Inf2{
   /* Even though this class is only implementing the
    * interface Inf2, it has to implement all the methods 
    * of Inf1 as well because the interface Inf2 extends Inf1
    */
   /* public void method1(){
	System.out.println("method1");
    }
    public void method2(){
	System.out.println("method2");
    }*/


    @Override
    public void method2() {

        Log.i("method22","method22");

    }

    @Override
    public void method1() {
        Log.i("method11","method1");
    }
}