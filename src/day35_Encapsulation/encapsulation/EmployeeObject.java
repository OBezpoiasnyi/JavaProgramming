package day35_Encapsulation.encapsulation;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Oleksandr", 'M', 27, 120000);

        employee1.setSalary(130000);
        System.out.println(employee1);

        Employee employee2 = new Employee("Aygun", 'M', 30, 110000);

        employee2.setSalary(employee2.getSalary()+5000);
        System.out.println(employee2);


    }
}
