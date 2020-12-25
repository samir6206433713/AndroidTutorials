package com.tutorial.androidtutorial.staticdemo;

public class JavaExample3 {
    private static String str = "BeginnersBook";

    int a=10;

    //Static class
    static class MyNestedClass{

        //non-static method
        public void disp() {

          //  a=20;----------------cannot access

            /* If you make the str variable of outer class
             * non-static then you will get compilation error
             * because: a nested static class cannot access non-
             * static members of the outer class.
             */
            System.out.println(str);
        }

    }
    public static void main(String args[])
    {
        /* To create instance of nested class we didn't need the outer
         * class instance but for a regular nested class you would need
         * to create an instance of outer class first
         */
        JavaExample3.MyNestedClass obj = new JavaExample3.MyNestedClass();
        obj.disp();
    }

}
