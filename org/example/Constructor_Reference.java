package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*-----Understanding Constructure Reference-----*/

public class Constructor_Reference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Shivam", "Akash", "Aryan", "Kaustubh");
        List<Students> students = names.stream().map(Students::new).collect(Collectors.toList());

        System.out.println(students);
    }
}
