package day43_Abstraction.employee;

public final class Teacher extends Employee {


    public Teacher(String name, int age, char gender, String jobTitle, int id, double salary) {
        super(name, age, gender, jobTitle, id, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is teaching.");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" is sleeping 8 hours.");
    }



}