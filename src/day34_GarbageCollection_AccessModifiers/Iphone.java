package day34_GarbageCollection_AccessModifiers;

public class Iphone {

    public static String brand;
    public String model, size, color;
    public double price;
    public static String OS;
    public static boolean isSmartPhone;
    public static String madeIn, designedIn;

    public Iphone(String model, String size, String color, double price) {
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }


    static {

        brand = "Apple";
        OS = "iOS";
        isSmartPhone = true;
        madeIn = "China";
        designedIn = "California";

    }

    public static void printOperatingSystem() {
        System.out.println("Operating system of the Iphone: " + OS);
    }

    public void call(long phoneNumber) {
        System.out.println("The Iphone is calling to: " + phoneNumber);
    }

    public void text(long phoneNumber) {
        System.out.println("The Iphone is texting to: " + phoneNumber);
    }

    public void FaceTime(long phoneNumber) {
        System.out.println("The Iphone is calling by FaceTime to: " + phoneNumber);
    }

    public void FaceTime(String email) {
        System.out.println("The Iphone is dialing FaceTime by the email to: " + email);
    }


    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                "brand='" + brand + '\'' +
                "OS='" + OS + '\'' +
                "isSmart='" + isSmartPhone + '\'' +
                "made in ='" + madeIn + '\'' +
                "designed in='" + designedIn + '\'' +

                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

}


/*
1. Create a class named Iphone
            variables:
                brand, model, size, color, price, OS, isSmartPhone, madeIn, designedIn

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                printOperatingSystem(): displays the operating system of the iphone
                call(long phoneNumber)
                text(long phoneNumber)
                faceTime(long phoneNumber)
                faceTime(String email)
                toString()
 */