package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<Integer>   list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list); //10, 20, 30, 40, 50]

        for (int i = 0; i < list.size(); i++) {

            list.set( i , list.get(i) * 2);

        }

        System.out.println(list); //[20, 40, 60, 80, 100]

        System.out.println("----------------------------------------------");

        ArrayList<String> employees = new ArrayList<>();

        employees.add("Suat");
        employees.add("Oleksandr");
        employees.add("Sasha");
        employees.add("Katia");

        System.out.println(employees); //[Suat, Oleksandr, Sasha, Katia]

        employees.remove(1);

        System.out.println(employees); //[Suat, Sasha, Katia]

        employees.remove("Suat");

        System.out.println(employees); //[Sasha, Katia]

    }
}
