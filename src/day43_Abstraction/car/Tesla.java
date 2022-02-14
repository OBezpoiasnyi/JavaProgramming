package day43_Abstraction.car;

public final class Tesla extends Car {

    double miles;

    public Tesla( String model,  int year, double price, String color, double miles) {
        super("Tesla", model, color, year, price);
        this.miles = miles;
    }

    public void start() {
        System.out.println("Say \"start\"");
    }



    public void autoPilot(){
        System.out.println(getBrand()+" "+getModel()+" has auto pilot feature");
    }




}