package day36_Inheritance.animalTask;

public class Cat extends Animal{ // Dog is an animal
//       child(sub)   parent(super)

    public void meow(){
        System.out.println(name + " is meowing");
    }

    public void scratch(){
        System.out.println(name + " is scratching");
    }


}
/*
    cat:
      6 variables
      8 methods

 */