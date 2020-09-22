package com.calebcurryYoutube;

import java.util.Scanner;

public class MySweetProgram {

    //void is a return type that means NOTHING.Meaning at end of execution nothing will be returned.
    //static mean we don't have to create a method to invoke those methods
    public static void  main(String [] args){ //what is in the parenthesis is called parameters

        //input is called identifier
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();

        System.out.println(name);

    }
}
