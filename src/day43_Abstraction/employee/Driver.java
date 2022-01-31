package day43_Abstraction.employee;

public final class Driver extends Employee{


    public Driver(String name, int age, char gender, String jobTitle, int id, double salary) {
        super(name, age, gender, jobTitle, id, salary);
    }


    @Override
    public void work() {
        System.out.println(getName() + " is driving");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping 9 hours");
    }
}
