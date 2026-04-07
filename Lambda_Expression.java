import java.util.function.Consumer;

public class Lambda_Expression {

    //normal method
    // public static void getName() {
    //     System.out.println("Hello Shivam!");
    // }
    public static void main(String[] args) {
        //normal method
        // getName();
        Consumer<String> greet = (String a) -> {
            System.out.println("Hello " + a + "!");
        };
        greet.accept("Shivam");
    }
}
