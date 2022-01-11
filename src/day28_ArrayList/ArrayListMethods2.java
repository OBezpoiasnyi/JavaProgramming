package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list); //[100, 200, 200, 200, 300, 400, 500]

       /*
        int num = 1;
        list.remove(num);
        System.out.println(list); //[100, 200, 200, 300, 400, 500]
        */

        Integer num = 200;
        boolean r = list.remove(num); //if this number was removed, boolean return you true
        System.out.println(list); //[100, 200, 200, 300, 400, 500]
        System.out.println(r);

        System.out.println("------------------------------------");

        list.clear(); //clear all list

        System.out.println(list); //[]

        System.out.println("------------------------------------");

        ArrayList<Character>characters = new ArrayList<>();

        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int i = characters.indexOf('A'); //0
        int b = characters.lastIndexOf('A'); //4

        System.out.println(i);
        System.out.println(b);

        System.out.println("------------------------------------");

        boolean r2 = characters.contains('A'); //true
        boolean r3 = characters.contains('Z'); //false

        System.out.println(r2 + ", " + r3);

        System.out.println("------------------------------------------");







    }
}
