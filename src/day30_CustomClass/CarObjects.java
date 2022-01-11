package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {

    public static void main(String[] args) {


        Car car1 = new Car();
        car1.setInfo("Toyota", "Camry", "White", 2021,
                30000);
        System.out.println(car1);


        Car car2 = new Car();
        car2.setInfo("BMW", "X5", "Black", 2017,
                35000);
        System.out.println(car2);


        Car car3 = new Car();
        car3.setInfo("Audi", "Q7", "Green", 2011,
                15000);
        System.out.println(car3);


        //Car[] cars = {car1,car2,car3};


        ArrayList<Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(car1,car2,car3));

        for (Car each : carsList) {
            System.out.println(each.brand+ " " + each.price);
        }
        System.out.println("---------------------------------------------------------");

        carsList.removeIf( p -> p.brand.equals("BMW") && p.year >= 2005 && p.year<=2008);
        carsList.removeIf( p -> p.brand.equals("Toyota") && p.year >= 1995 && p.year<=1997);

        System.out.println(carsList);






    }
}
