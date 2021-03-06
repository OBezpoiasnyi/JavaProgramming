package day43_Abstraction.employeeTask;

public final class Developer extends Employee{


    public Developer(String name, int age, char gender, String jobTitle, int id, double salary) {
        super(name, age, gender, jobTitle, id, salary);
    }


    @Override
    public void work() {
        System.out.println(getName() + " is developing applications");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping 7 hours");
    }

    public void unitTest(){
        System.out.println(getName() + " is unit testing");
    }
}
