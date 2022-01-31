package day43_Abstraction.car;

public class CarShop {

    public static void main(String[] args) {


       // Car car1 = new Car("Cydeo", "25", "Blue", 2022, 100000);
            // we can not create object from the abstract class!!!

        Honda honda = new Honda("Accord", "Black", 2019, 30000);

        Audi audi = new Audi("Q7", "White", 2020, 45000);

        Tesla tesla = new Tesla("Model 3", "Blue", 2021, 60000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);


        honda.setColor("Red");
        audi.setColor("Pink");
        tesla.setColor("Green");


        honda.setPrice(33333);
        audi.setPrice(44444);
        tesla.setPrice(55555);


        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);
    }
}
