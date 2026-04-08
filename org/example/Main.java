package org.example;

/*----------Task-18----------*/
//adding feature of thread

public class Main {
    public static void main(String[] args) {
        // Runnable rn = () -> {
        //     for (int i=1; i<=10; i++) {
        //         System.out.println("Hello " + i);
        //     }
        // };

        // Thread thread = new Thread(rn);
        // thread.run();

        /*-----Understand the anonymous inner class-----*/
        Employee employee = new Employee() {
            @Override
            public String getName() {
                return "Shivam Javeri";
            }

            @Override
            public String getDesignation() {
                return "Software Engineer";
            }

            @Override
            public String getSalary() {
                return "$ 10000";
            }
        };

        System.out.println(employee.getName());
        System.out.println(employee.getDesignation());
        System.out.println(employee.getSalary());
    }
}
