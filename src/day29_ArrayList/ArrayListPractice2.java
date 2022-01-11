package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {

    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>();

        employees.addAll(Arrays.asList("Ali", "David", "Ahmed", "Daniel", "Aaron", "Ahmed", "David"));

        employees.retainAll( Arrays.asList("Ahmed", "David") );

        System.out.println(employees);

        System.out.println("----------------------------------------");

        String[] names = {"Ali", "David", "Ahmed", "Daniel", "Aaron", "Ahmed", "David"};

        ArrayList<String> list = new ArrayList<>( Arrays.asList(names) );

        list.removeIf( p -> p.charAt(0)== 'A' );

        System.out.println(list);

        names = list.toArray(new String[0]);

        System.out.println(Arrays.toString(names));


    }
}
