package day34_GarbageCollection_AccessModifiers;

public class StaticMembers {

    int a;

     static class class1{ //class can be static only if this class nested, with means class inside another class


    }

        public static int num = 100;

        public static void method() {

        }

        static {

        }


}

    class C{ //outer class

        static class A{ // inner class (nested)

            static class B{ //(inner class) nested

                public static void method1() {

                }

            }

        }

    }

    class D{
        public static void main(String[] args) {
            C.A.B.method1();
        }
    }