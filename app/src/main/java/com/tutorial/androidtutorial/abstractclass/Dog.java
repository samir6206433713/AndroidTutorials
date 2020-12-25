package com.tutorial.androidtutorial.abstractclass;


import android.util.Log;

//Dog class extends Animal class
public class Dog extends Animal{

   public void sound(){
       Log.i("soundis","Woof");
	System.out.println("Woof");
   }
   /*public static void main(String args[]){
	Animal obj = new Dog();
	obj.sound();
   }*/
}