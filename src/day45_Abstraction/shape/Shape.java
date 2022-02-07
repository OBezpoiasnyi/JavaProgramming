package day45_Abstraction.shape;

public abstract class Shape implements Volume{

    private final String name;


    public Shape(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public abstract double area();

    public abstract double perimeter();

    @Override
    public double volume() {
        return 0;
    }


    public String toString() {
        return
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
