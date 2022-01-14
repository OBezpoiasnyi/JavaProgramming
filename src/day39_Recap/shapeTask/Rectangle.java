package day39_Recap.shapeTask;

public class Rectangle extends Shape{

    public double length, width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }


    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        if(length<=0){
            System.err.println("Invalid length: " + length);
            System.exit(1);
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        if(width<=0){
            System.err.println("Invalid width " + width);
            System.exit(1);
        }
        this.width = width;
    }

}
