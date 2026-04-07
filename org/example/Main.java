package org.example;

/*----------Task-18----------*/
//adding feature of thread

public class Main {
    public static void main(String[] args) {
        Employee obj = () -> "Software Engineer";
        System.out.println(obj.getName());   
        
        Runnable rn = () -> {
            for (int i=1; i<=10; i++) {
                System.out.println("Hello " + i);
            }
        };

        Thread thread = new Thread(rn);
        thread.run();
    }
}
