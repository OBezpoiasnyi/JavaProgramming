package day05_Concatenation;

public class shippingAddress {

    public static void main(String[] args) {

        String name = "Oleksandr Bezpoiasnyi";
        int buildingNumber = 444;
        String streetName = "Golf Rd";
        String city = "Glenview";
        String state = "IL";
        int zip = 60025;

        String fullAddress = name + "\n" + buildingNumber + " " + streetName +
                "\n" + city + ", " + state + " " + zip;

        System.out.println(fullAddress);

    }

}
