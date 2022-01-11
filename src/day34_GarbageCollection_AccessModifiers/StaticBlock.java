package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {

    public static void main(String[] args) {
        System.out.println("Main Method");
    }

    static{ // run first before anything. And only runs one time
        System.out.println("Static Block");
    }

    static{ // run first before anything. And only runs one time
        System.out.println("Static Block2");
    }

    static{ // run first before anything. And only runs one time
        System.out.println("Static Block3");
    }
}
