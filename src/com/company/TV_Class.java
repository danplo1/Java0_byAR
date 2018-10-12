package com.company;

/**
 * Created by Daniel_D'AGE on 12.10.2018.
 * obiekty są tworzone na podstawie klas, które są matrycami
 * do JavaObjectsIntro_06_
 */
public class TV_Class {

    private String mark;
    private int inch;

    //konstruktor bezargumentowy
    public TV_Class(){

    }

    //konstruktor
    public TV_Class(String mark, int inch) {
        this.mark = mark;
        this.inch = inch;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }

    /*public void volumeUp() {
        System.out.println("Volume up");
    }

    public void volumeDown() {
        System.out.println("Volume down");

    }

    public void programUp() {
        System.out.println("Program up");
    }

    public void programDown() {
        System.out.println("Program down");
    }
    */


}


