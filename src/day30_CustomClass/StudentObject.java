package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObject {


    public static void main(String[] args) {


        Student student1 = new Student();
        student1.setInfo("Oleksandr", 'M', 27, 2210, 'A');


        Student student2 = new Student();
        student2.setInfo("Katia", 'F', 24, 2211, 'A');


        Student student3 = new Student();
        student3.setInfo("Alina", 'F', 23, 2212, 'C');


        Student student4 = new Student();
        student4.setInfo("Roma", 'M', 30, 2213, 'B');


        Student student5 = new Student();
        student5.setInfo("Oleg", 'M', 24, 2214, 'B');


        Student[] students = {student1, student2, student3, student4, student5};

        for (Student each : students) {
            System.out.println(each);
        }

        System.out.println("--------------------------------------");

        ArrayList<Student> earlyBirds = new ArrayList<>(); //grade A
        ArrayList<Student> angryBirds = new ArrayList<>(); //grade A


        for (Student student : students) {

            if(student.grade == 'A'){
                earlyBirds.add(student);
            }else{
                angryBirds.add(student);
            }

        }

        System.out.println(earlyBirds);
        System.out.println(angryBirds);




    }
}
