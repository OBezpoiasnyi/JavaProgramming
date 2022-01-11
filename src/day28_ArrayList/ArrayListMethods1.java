package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        // add(Data)

        numbers.add(10); //0
        numbers.add(20); //1
        numbers.add(30); //2
        numbers.add(40); //3
        numbers.add(50);
        numbers.add(60);

        numbers.add(3,35);


        System.out.println(numbers);


        int lastIndex = numbers.size()-1;

        System.out.println("lastIndex = " + lastIndex);

        int num = numbers.get(3);

        System.out.println("num = " + num);

        System.out.println("--------------------------------------");

        for (int i = 0; i < numbers.size()-1; i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("------------------------------------");


        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");

        System.out.println(list); //[Java, Python, Java, C#]

        list.set(2,"JavaScript"); //for replace

        System.out.println(list); //[Java, Python, JavaScript, C#]

    }
}
