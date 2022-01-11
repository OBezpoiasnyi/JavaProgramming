package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {

    public static void main(String[] args) {


        Dog dog1 = new Dog();
        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.color = "White";

        System.out.println(dog1);

        Dog dog2 = new Dog();
        dog2.name = "ACE";
        dog2.breed = "Husky";
        dog2.age = 5;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.color = "White and Black";


        System.out.println(dog2);

        Dog dog3 = new Dog();
        dog3.setInfo("Jack", "Shepard", 4, 'M', "Midium", "Gray");
        System.out.println(dog3);

        dog1.eat();

        dog2.bark();



        Dog dog4 = new Dog();
        dog4.setInfo("Tuzik", "Pit-Bull", 4, 'M', "Midium", "Gray");


        Dog dog5 = new Dog();
        dog5.setInfo("Sanny", "Bulldog", 2, 'F', "Midium", "Gray");

        Dog[] dogs = {dog1,dog2,dog3,dog4,dog5};

        ArrayList<Dog> femaleDogs = new ArrayList<>();
        femaleDogs.addAll(Arrays.asList(dogs));
        femaleDogs.removeIf( p -> p.gender !='F');
        System.out.println(femaleDogs);

        ArrayList<Dog> maleDogs = new ArrayList<>();
        maleDogs.addAll(Arrays.asList(dogs));
        maleDogs.removeIf( p -> p.gender !='M');
        System.out.println(maleDogs);



    }
}
