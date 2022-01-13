package day38_Inheritence.carTask;

public class Car {

    String brand, model;
    int year;
    double price;
    String color;
    double miles;


    public Car(String brand, String model, int year, double price, String color, double miles) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.miles = miles;
    }



}
/*
carTask:
    Create a class called Car
        instance variables:
            brand, model, year, price, color, miles

            add a constructor to set all the fields

        instance methods:
            start(), drive(),toString()

    Create the following sub classes of Car:
        1. Toyota:
                extra methods:
                    reliable()

        2. BMW:
                extra methods:
                    breaksDown()
                    racing()

        3. Tesla:
                extra methods:
                    autoPilot();
 */