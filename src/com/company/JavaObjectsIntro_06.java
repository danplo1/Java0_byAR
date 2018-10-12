package com.company;

/**
 * Created by Daniel_D'AGE on 12.10.2018.
 */
public class JavaObjectsIntro_06 {

    public static void main(String[] args) {


        TV_Class tv = new TV_Class();

        //przy uzyciu konstruktora domyślnego

        TV_Class tv3 = new TV_Class("LG", 68);
        //lub
        tv3.setMark("LG");
        tv3.setInch(68);
        System.out.println(tv3.getMark());
        System.out.println(tv3.getInch());

        System.out.println(" ");

        tv.setMark("Sony");
        tv.setInch(55);

        System.out.println(tv.getMark());
        System.out.println(tv.getInch());

        System.out.println(" ");

        //lub lepiej

        String mark = tv.getMark();
        int inch = tv.getInch();
        System.out.println(mark);
        System.out.println(inch);

        System.out.println(" ");

        TV_Class tv1 = new TV_Class();

        tv1.setMark("Samsung");
        tv1.setInch(48);

        System.out.println(tv1.getMark());
        System.out.println(tv1.getInch());


        /*TV_Class tv1 = new TV_Class();
        TV_Class tv2 = new TV_Class();

        tv.volumeUp();
        tv.volumeDown();

        tv.programUp();
        tv.programDown();

        tv.mark = "Samsung";
        tv.inch = 60;

        tv1.mark = "LG";
        tv1.inch = 55;

        tv2.mark = "Sony";
        tv2.inch = 65;

        System.out.println("Marka telewizora: " + tv.mark + ", cale: " + tv.inch);
        System.out.println("Marka telewizora: " + tv1.mark + ", cale: " + tv1.inch);
        System.out.println("Marka telewizora: " + tv2.mark + ", cale: " + tv2.inch);8
        */



    }
}
