package day30_CustomClass;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("Oleksandr", 'M', 27,1111, "SDET",
                200000, true);

        Employee employee2 = new Employee();
        employee2.setInfo("Kateryna", 'F', 24, 1112,
                "WebDesigner", 300000, false );


        Employee[] employees = {employee1, employee2};

        int countFullTime = 0;
        int countPartTime = 0;
        double max = employees[0].salary;
        double min = employees[0].salary;

        for (Employee employee : employees) {

            if(employee.isFullTime) {
                countFullTime++;
            }else{
                countPartTime++;
            }

            if(employee.salary > max){
                max = employee.salary;
            }

            if(employee.salary < min){
                min = employee.salary;
            }

        }

        employee1.work();

        System.out.println("countPartTime = " + countPartTime);
        System.out.println("countFullTime = " + countFullTime);
        System.out.println("max = " + max);
        System.out.println("min = " + min);


    }
}
