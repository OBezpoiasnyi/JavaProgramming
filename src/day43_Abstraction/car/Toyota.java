package day43_Abstraction.car;

public final class Toyota extends Car{

    double miles;

    public Toyota( String model,double price, int year, String color,  double miles) {
        super("Toyota", model, color, year, price);
        this.miles = miles;
    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }

    @Override
    public void start() {
        System.out.println("To start "+getBrand()+" "+getModel()+" twist the key or push start button");
    }


}