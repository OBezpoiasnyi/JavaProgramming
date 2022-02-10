package day43_Abstraction.employeeTask;

public abstract class Employee extends Person{


    private String jobTitle;
    private final int id;
    private double salary;


    public Employee(String name, int age, char gender, String jobTitle, int id, double salary) {
        super(name, age, gender);
        setJobTitle(jobTitle);
        if(id<=0){
            throw new RuntimeException("Invalid ID: " + id);
        }
        this.id = id;
        setSalary(salary);
    }


    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        if(jobTitle.isEmpty()||jobTitle.isBlank()){
            throw new RuntimeException("Invalid Job Title: " + jobTitle);
        }
        this.jobTitle = jobTitle;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if (salary<=0){
            throw new RuntimeException("Invalid salary: " + salary);
        }
        this.salary = salary;
    }

    public abstract void work();


    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\''+
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
