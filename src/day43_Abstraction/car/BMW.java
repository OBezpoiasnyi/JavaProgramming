package day43_Abstraction.car;

public final class BMW extends Car{

    double miles;

    public BMW( String model, int year, double price, String color,  double miles) {
        super("BMW", model, color, year, price);
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
        System.out.println("To start "+getBrand()+" "+getModel()+" push start button");
    }


}