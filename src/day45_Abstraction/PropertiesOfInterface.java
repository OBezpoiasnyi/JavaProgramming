package day45_Abstraction;

public interface PropertiesOfInterface {

    int a = 100; //by default its static and final
    static int b = 200; //final and static

    /* can not have constructor in interface
    public PropertiesOfInterface(int a) {
        this.a = a;
    }

     */

    /* can not have static block in interface
    static {
        b = 100;
    }
     */

    /* can not have instance method in interface
    public void method1(){
        System.out.println("Instance method");
    }
     */

    public static void method2(){
        System.out.println("Static method");
    }

    public abstract void method3();

    public default void method4(){
        System.out.println("default method");
    }
}
class Test implements PropertiesOfInterface{

    @Override
    public void method3() {

    }

    public static void main(String[] args) {

        new Test().method4();

    }


}