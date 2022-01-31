package day43_Abstraction.employee;

public class Tester extends Employee{


    public Tester(String name, int age, char gender, String jobTitle, int id, double salary) {
        super(name, age, gender, jobTitle, id, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is working in company as a " + getJobTitle());
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " sleeps 8 hours");
    }

    public void bugReport(){
        System.out.println(getName() + " is creating bug reports");
    }
}
