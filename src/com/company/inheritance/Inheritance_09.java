package com.company.inheritance;

/**
 * Created by Daniel_D'AGE on 15.10.2018.
 * Dziedziczenie
 */
public class Inheritance_09 {
    public static void main(String[] args) {

        DayStudent ds = new DayStudent();
        ds.name = "Tomasz";
        ds.surname = "Tomaszowski";
        ds.presence();

        FullTimeStudent fs = new FullTimeStudent();
        fs.name = "Anna";
        fs.surname = "Annowska";
        fs.presence();

        StudentOnLine on = new StudentOnLine();
        on.name = "Maciek";
        on.surname = "Maćkowski";
        on.presence();

        DayStudentDifferent sd =  new DayStudentDifferent();
        sd.name = "Ola";
        sd.surname = "Aleksandrowska";
        sd.presence();
        sd.statement();


    }
}
