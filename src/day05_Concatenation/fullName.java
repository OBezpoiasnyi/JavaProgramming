package day05_Concatenation;

public class fullName {

    public static void main(String[] args) {

        String name = "Oleksandr";
        String lastName = "Bezpoiasnyi";
        int age = 27;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;

        String fullName = name + " " + lastName;

        //Full name of the person is ______
        System.out.println("Full name of the person is " + fullName);

        //____ is ____ years old
        System.out.println(fullName + " is " + age + " years old");

        //FullName is Jobtitle, works at CompanyName, and fullName salary is Salary
        System.out.println(fullName + " is " + jobTitle + ", works at " + companyName + ", and " + fullName + " salary is " + salary);

    }

}
