package com.company.polymorphism_10;

/**
 * Created by Daniel_D'AGE on 15.10.2018.
 * Polimorfizm pozwala nam tworzyć różnego rodzaju obiekty i nastepnie nimi operować, w zależności od tego co potrzebujemy
 * z nimi zrobić.
 * Niezależnie od tego jakie obiekty przekujemy do naszej metody, a dziedziczą one po klasie bazowej, to bez problemu zostana
 * one obsłuzone przez ta metodę i nie musimy jej modyfikować
 */
public class Polymorphism_10 {
    public static void main(String[] args) {

        StudentService studentService = new StudentService();

        StudentOnLine studentOnLine = new StudentOnLine();
        DayStudent dayStudent = new DayStudent();
        DayStudentDifferent dayStudentDifferent = new DayStudentDifferent();


        studentService.service(studentOnLine);
        studentService.service(dayStudent);
        studentService.service(dayStudentDifferent);

    }
}

//Student student = new Student();
//Student student1 = new DayStudent();


       /* Student[] studentTable = new Student[4];

        studentTable [0] = new DayStudent();
        studentTable [1] = new FullTimeStudent();
        studentTable [2] = new DayStudentDifferent();
        studentTable [3] = new StudentOnLine();

        for (int i = 0; i < studentTable.length; i++) {
            studentTable[i].presence();

        }

        Student student = new StudentOnLine();
        getStudent(student);

    }
    public static  void  getStudent (Student student){
        student.presence();*/


class StudentService {
    public void service(Student student) {
        student.presence();
    }
}


