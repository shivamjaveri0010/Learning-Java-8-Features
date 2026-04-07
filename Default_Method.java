public class Default_Method {

    interface A {
        default void sayHello() {
            System.out.println("A is saying Hello.");
        }
    }

    interface B {
        default void sayHello() {
            System.out.println("B is saying Hello.");
        }
    }

    static class Child implements A, B {
        @Override
        public void sayHello() {
            // A.super.sayHello();
            // B.super.sayHello();

            System.out.println("My own implementations.");
        }
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.sayHello();
    }
}