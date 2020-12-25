package com.tutorial.androidtutorial.abstractpostmortom;


import com.tutorial.androidtutorial.abstractclass.Dog;

public class DogPostmortam extends AbstractPostmortam {



    public static void main(String args[]) {
        AbstractPostmortam obj = new DogPostmortam();
        obj.animalSound();

        System.out.println(obj.animalhorn());
    }


    @Override
    public void animalSound() {
        System.out.println("hanuman");

    }
}