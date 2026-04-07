public class Functional_Interface {

    @FunctionalInterface
    interface InnerFunctionalInterface {
        //single abstract method
        public void sayHello();

        default void sayBye() {
            System.out.println("Bye!");
        };

        public static void sayOk() {
            System.out.println("OK!!!");
        };
    }
    public static void main(String[] args) {
        InnerFunctionalInterface obj = () -> {
            System.out.println("Hello Shivam!");
        };

        obj.sayHello();

        obj.sayBye();

        InnerFunctionalInterface.sayOk();
    }
}
