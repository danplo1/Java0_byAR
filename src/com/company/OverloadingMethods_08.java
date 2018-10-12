package com.company;

/**
 * Created by Daniel_D'AGE on 12.10.2018.
 *
 * Przeciążanie metod, w przypadku gdy w jednej klasie wystepuje nawet kilka metod o tej samej nazwie
 * jendak mtody te musza się róznić paramtrami/argumentami i i ich kolejnośćią
 */
public class OverloadingMethods_08 {
    public static void main(String[] args) {

        OverloadingMethods_08 overloadingMet = new OverloadingMethods_08();
        overloadingMet.method();
        overloadingMet.method(" z parametrem");
        overloadingMet.method(" z parametrem i z dodatkowym parametrem", 5);
        overloadingMet.method(4, " paramter String ");


    }

    public void method(){
        System.out.println("Test metody ");
    }

    public void method(String word){
        System.out.println("Test metody " +  word);
    }

    public void method(String word, int x){
        System.out.println("Test metody" +  word + " z dodatkowym parametrem " + x);
    }

    public void method(int x, String word){

        System.out.println("Test metody z dodatkowym parametrem " + x + "oraz parametrem " + word);
    }
}
