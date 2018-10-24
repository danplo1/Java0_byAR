package com.company.ModiefiersAndScope.main;


import com.company.ModiefiersAndScope.package2.Class3;
import com.company.ModiefiersAndScope.package2.Class4;

/**
 * Created by Daniel_D'AGE on 23.10.2018.
 * Modyfikatory i zasięg zmiennych
 * Modyfikatory: public, protected, tzw. default, private
 * <p>
 * . * Part II on 24.10.2018
 */
public class ModifiersAndScope_13 {

    String stringGlobal = "Zmienna globalna!";

    public static String string ="ABC";

    public static void main(String[] args) {

        Class3 class3= new Class3();
        class3.show();


        /*String string = "String lokalny";
        System.out.println(string);

        ModifiersAndScope_13 mod = new ModifiersAndScope_13();
        System.out.println(mod.stringGlobal + " \n");
        mod.method2();*/

    }

     /*  public void method2() {
     ModifiersAndScope_13 mod = new ModifiersAndScope_13();
        System.out.println(mod.stringGlobal + "z metody method2.");*/


    }
