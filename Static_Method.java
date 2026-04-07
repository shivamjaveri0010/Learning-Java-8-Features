interface A {
    static void sayHello() {
        System.out.println("Hello!");
    }

    default void sayBye() {
        System.out.println("Bye!");
    }
}

public class Static_Method implements A {
    public static void main(String[] args) {
        Static_Method obj = new Static_Method();
        obj.sayBye();
        A.sayHello();
    }
}
